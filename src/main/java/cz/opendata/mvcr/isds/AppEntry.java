package cz.opendata.mvcr.isds;

import cz.czechpoint.isds.v20.DmInfoPortType;
import cz.czechpoint.isds.v20.DmInfoWebService;
import cz.czechpoint.isds.v20.DmOperationsPortType;
import cz.czechpoint.isds.v20.DmOperationsWebService;
import cz.czechpoint.isds.v20.TRecord;
import cz.czechpoint.isds.v20.TRecordsArray;
import cz.czechpoint.isds.v20.TReturnedMessage;
import cz.czechpoint.isds.v20.TStatus;
import cz.opendata.mvcr.isds.model.Attachment;
import cz.opendata.mvcr.isds.model.EnvelopStatus;
import cz.opendata.mvcr.isds.model.Message;
import cz.opendata.mvcr.isds.model.MessageBuilder;
import org.apache.commons.io.output.FileWriterWithEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.List;


public class AppEntry {

    private static final Logger LOG = LoggerFactory.getLogger(AppEntry.class);

    private static final int MINUTE_AS_MS = 3600000;

    private static final int MAX_RETRIEVE_COUNT = 100000;

    static {
        SLF4JBridgeHandler.install();
    }

    private Configuration configuration;

    private SecurityManager security;

    public static void main(String[] args) throws Exception {
        AppEntry instance = new AppEntry();
        instance.main();
    }

    private void main()  {
        try {
            this.configuration = new Configuration();
        } catch (IOException ex) {
            LOG.error("Can't load configuration.", ex);
        }
        LOG.info("Creating security manager ...");
        try {
            this.security = new SecurityManager(
                    this.configuration.getLogin(),
                    this.configuration.getPassword(),
                    this.configuration.getCertificatesDirectory());
        } catch (Exception ex) {
            LOG.error("Can't create security manager.", ex);
        }
        LOG.info("Creating output directories ...");
        (new File(configuration.getOutputMessages())).mkdirs();
        (new File(configuration.getOutputAttachments())).mkdirs();
        LOG.info("Downloading messages ...");
        try {
            downloadMessages();
        } catch (Exception ex) {
            LOG.error("Can't download messages.", ex);
        }
        LOG.info("Done");
    }

    private void downloadMessages() throws Exception {
        DmInfoPortType infoPort = createInfoPort();
        DmOperationsPortType operationsPort = createOperationsPort();
        List<TRecord> messages = getReceivedMessages(infoPort);
        MessageBuilder builder = new MessageBuilder();
        for (TRecord record : messages) {
            TReturnedMessage returnedMessage =
                    downloadMessage(operationsPort, record);
            Message message = builder.build(record, returnedMessage);
            try {
                saveMessage(message);
                logMessageInfo(message);
                markAsRead(infoPort, message);
            } catch (Exception ex) {
                LOG.info("Can't save message: {} ", message.getId(), ex);
            }
        }
    }

    private DmInfoPortType createInfoPort() {
        DmInfoWebService service = new DmInfoWebService();
        DmInfoPortType port = service.getDmInfoPortType();
        this.security.bindService(
                (BindingProvider) port,
                this.configuration.getUrl() + "dx");
        return port;
    }

    private List<TRecord> getReceivedMessages(DmInfoPortType port)
            throws Exception {
        DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();

        Calendar from = Calendar.getInstance();
        from.add(Calendar.MONTH, -1);

        XMLGregorianCalendar dmFromTime =
                dataTypeFactory.newXMLGregorianCalendar(
                        from.get(Calendar.YEAR),
                        from.get(Calendar.MONTH) + 1,
                        from.get(Calendar.DAY_OF_MONTH),
                        0, 0, 0, 0,
                        from.get(Calendar.ZONE_OFFSET) / MINUTE_AS_MS);

        Calendar to = Calendar.getInstance();
        to.add(Calendar.DAY_OF_MONTH, 1);
        XMLGregorianCalendar dmToTime =
                dataTypeFactory.newXMLGregorianCalendar(
                        to.get(Calendar.YEAR),
                        to.get(Calendar.MONTH) + 1,
                        to.get(Calendar.DAY_OF_MONTH),
                        0, 0, 0, 0,
                        to.get(Calendar.ZONE_OFFSET) / MINUTE_AS_MS);

        BigInteger dmRecipientOrgUnitNum = null;
        // Aby bylo možno došlou zprávu stáhnout, musí být ve stavu 5,6,7 nebo
        // 10. Stažením netrezorové zprávy se obvykle mění její stav na 7
        // (v ESS ne automaticky, ale explicitním voláním WS MarkAsDownloaded).
        String dmStatusFilter = String.valueOf(EnvelopStatus.toInt(EnumSet.of(
                EnvelopStatus.IN_INBOX,
                EnvelopStatus.DELIVERED_BY_FICTION,
                EnvelopStatus.DELIVERED_BY_LOGIN)));
        BigInteger dmOffset = BigInteger.valueOf(1);
        BigInteger dmLimit = BigInteger.valueOf(MAX_RETRIEVE_COUNT);
        Holder<TRecordsArray> dmRecords = new Holder<>();
        Holder<TStatus> dmStatus = new Holder<>();

        port.getListOfReceivedMessages(
                dmFromTime,
                dmToTime,
                dmRecipientOrgUnitNum,
                dmStatusFilter,
                dmOffset,
                dmLimit,
                dmRecords,
                dmStatus);

        checkStatus(dmStatus.value);
        return dmRecords.value.getDmRecord();
    }

    private void checkStatus(TStatus status) {
        if (status.getDmStatusCode().compareTo("0000") != 0) {
            throw new RuntimeException(
                    "Invalid status: " + status.getDmStatusCode());
        }
    }

    private DmOperationsPortType createOperationsPort() {
        DmOperationsWebService service = new DmOperationsWebService();
        DmOperationsPortType port = service.getDmOperationsPortType();
        this.security.bindService(
                (BindingProvider) port,
                this.configuration.getUrl() + "dz");
        return port;
    }

    private TReturnedMessage downloadMessage(
            DmOperationsPortType port, TRecord record) {
        Holder<TReturnedMessage> dmMessage = new Holder<>();
        Holder<TStatus> dmStatus = new Holder<>();
        port.messageDownload(record.getDmID(), dmMessage, dmStatus);
        checkStatus(dmStatus.value);
        return dmMessage.value;
    }

    private void saveMessage(Message message) throws IOException {
        saveMessageTtl(message);
        for (Attachment attachment : message.getAttachments()) {
            saveAttachment(message, attachment);
        }
    }

    private void saveMessageTtl(Message message) throws IOException {
        File output = new File(
                this.configuration.getOutputMessages(),
                message.getId() + ".ttl");
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriterWithEncoding(output, "UTF-8"))) {
            writer.write(MessageTrigBuilder.build(message));
            writer.flush();
        }
    }

    private void saveAttachment(Message message, Attachment attachment)
            throws IOException {
        File outputFile = new File(
                this.configuration.getOutputAttachments(),
                message.getAttachmentName(attachment));
        try (OutputStream stream = new FileOutputStream(outputFile)) {
            stream.write(attachment.getContent());
        }
    }

    private void logMessageInfo(Message message) {
        StringBuilder messageInfo = new StringBuilder();
        messageInfo.append("Message:");
        messageInfo.append("\n\tid: " + message.getId());
        messageInfo.append("\n\tstatus: " + message.getStatus());
        messageInfo.append("\n\tsender: " + message.getSender());
        messageInfo.append("\n\trecipient: " + message.getRecipient());
        messageInfo.append("\n\tannotation: " + message.getAnnotation());
        messageInfo.append("\n\taccepted: " + message.getAcceptanceTime());
        messageInfo.append("\n\tdelivery: " + message.getDeliveryTime());
        messageInfo.append("\n\tfiles: ");
        for (Attachment attachment : message.getAttachments()) {
            messageInfo.append("\n\t\t" + attachment.getType());
            messageInfo.append("\t" + attachment.getMimeType());
            messageInfo.append("\t" + attachment.getDescription());
        }
        LOG.info(messageInfo.toString());
    }

    private void markAsRead(DmInfoPortType port, Message message) {
        port.markMessageAsDownloaded(message.getId());
    }

}
