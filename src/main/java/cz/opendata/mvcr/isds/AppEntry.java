package cz.opendata.mvcr.isds;


import cz.czechpoint.isds.v20.*;
import cz.opendata.mvcr.isds.model.Attachment;
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
import java.io.*;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;

public class AppEntry {

    private static final Logger LOG = LoggerFactory.getLogger(AppEntry.class);

    static {
        SLF4JBridgeHandler.install();
    }

    private Configuration configuration;

    private SecurityManager security;

    public static void main(String[] args) throws Exception {
        AppEntry instance = new AppEntry();
        instance.main();
    }

    private void main() throws Exception {
        this.configuration = new Configuration();
        LOG.info("Creating security manager ...");
        this.security = new SecurityManager(
                this.configuration.getLogin(),
                this.configuration.getPassword(),
                this.configuration.getCertificatesDirectory());
        LOG.info("Creating output directories ...");
        (new File(configuration.getOutputMessages())).mkdirs();
        (new File(configuration.getOutputAttachments())).mkdirs();
        LOG.info("Downloading messages ...");
        downloadMessages();
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
            } catch (Exception ex) {
                LOG.info("Can't save message: {} ", message.getId(), ex);
            }
        }
    }

    private DmInfoPortType createInfoPort() {
        DmInfoWebService service = new DmInfoWebService();
        DmInfoPortType port = service.getDmInfoPortType();
        this.security.bindService(
                (BindingProvider) port, configuration.getUrl() + "dx");
        return port;
    }

    private List<TRecord> getReceivedMessages(DmInfoPortType port)
            throws Exception {
        DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();

        Calendar from = Calendar.getInstance();
        from.add(Calendar.DATE, -1);

        XMLGregorianCalendar dmFromTime =
                dataTypeFactory.newXMLGregorianCalendar(
                        from.get(Calendar.YEAR),
                        from.get(Calendar.MONTH) + 1,
                        from.get(Calendar.DAY_OF_MONTH),
                        0, 0, 0, 0,
                        from.get(Calendar.ZONE_OFFSET) / 3600000);

        Calendar to = Calendar.getInstance();
        to.add(Calendar.DAY_OF_MONTH, 1);
        XMLGregorianCalendar dmToTime =
                dataTypeFactory.newXMLGregorianCalendar(
                        to.get(Calendar.YEAR),
                        to.get(Calendar.MONTH) + 1,
                        to.get(Calendar.DAY_OF_MONTH),
                        0, 0, 0, 0,
                        to.get(Calendar.ZONE_OFFSET) / 3600000);

        BigInteger dmRecipientOrgUnitNum = null;
        String dmStatusFilter = null;
        BigInteger dmOffset = BigInteger.valueOf(1);
        BigInteger dmLimit = BigInteger.valueOf(100000);
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

        List<TRecord> messages = dmRecords.value.getDmRecord();
        return messages;
    }

    private DmOperationsPortType createOperationsPort() {
        DmOperationsWebService service = new DmOperationsWebService();
        DmOperationsPortType port = service.getDmOperationsPortType();
        this.security.bindService(
                (BindingProvider) port,
                configuration.getUrl() + "dz");
        return port;
    }

    private TReturnedMessage downloadMessage(
            DmOperationsPortType port, TRecord record) {
        Holder<TReturnedMessage> dmMessage = new Holder<>();
        Holder<TStatus> dmStatus = new Holder<>();
        port.messageDownload(record.getDmID(), dmMessage, dmStatus);
        if (dmStatus.value.getDmStatusCode().compareTo("0000") != 0) {
            throw new RuntimeException(
                    "Invalid status: " + dmStatus.value.getDmStatusCode());
        }
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
                configuration.getOutputMessages(),
                message.getId() + ".ttl");
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriterWithEncoding(output, "UTF-8"))) {
            writer.write("@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n");
            writer.write("@prefix nkod: <https://data.gov.cz/slovník/nkod/> .\n");
            writer.write("@prefix ds: <https://data.gov.cz/zdroj/datové-schránky/> .\n");
            writer.write("\n");
            writer.write("<https://data.gov.cz/zdroj/nkod/přijaté-záznamy/" + message.getId() + ">\n");
            writer.write("    a nkod:PřijatýZáznam ;\n");
            writer.write("    nkod:id-datové-zprávy \"" + message.getId() + "\" ;\n");
            writer.write("    nkod:datová-schránka-poskytovatele ds:" + message.getSender() + " ;\n");
            writer.write("    nkod:datová-zpráva-přijata \"" + message.getDeliveryTime() + "\"^^xsd:dateTime ;\n");
            for (Attachment attachment : message.getAttachments()) {
                writer.write("    nkod:jméno-souboru \"" + getAttachmentName(message, attachment) + "\" ;\n");
            }
            writer.write(".\n");
            writer.flush();
        }
    }

    private String getAttachmentName(Message message, Attachment attachment) {
        return message.getId() + "-" + attachment.getDescription();
    }

    private void saveAttachment(Message message, Attachment attachment)
            throws IOException {
        File outputFile = new File(
                configuration.getOutputMessages(),
                getAttachmentName(message, attachment));
        try (OutputStream stream = new FileOutputStream(outputFile)) {
            stream.write(attachment.getContent());
        }
    }

    private void printMessageInfo(Message message) {
        System.out.println("Message:" +
                "\n\tid: " + message.getId() +
                "\n\tstatus: " + message.getStatus() +
                "\n\tsender: " + message.getSender() +
                "\n\trecipient: " + message.getRecipient() +
                "\n\tannotation: " + message.getAnnotation() +
                "\n\taccepted: " + message.getAcceptanceTime() +
                "\n\tdelivery: " + message.getDeliveryTime() +
                "\n\tfiles: ");
        for (Attachment attachment : message.getAttachments()) {
            System.out.println("\t\t" + attachment.getType() +
                    "\t" + attachment.getMimeType() +
                    "\t" + attachment.getDescription());
        }
    }

}
