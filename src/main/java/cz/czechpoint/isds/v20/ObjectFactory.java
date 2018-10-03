
package cz.czechpoint.isds.v20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.czechpoint.isds.v20 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DmStatus_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmStatus");
    private final static QName _CreateMultipleMessage_QNAME = new QName("http://isds.czechpoint.cz/v20", "CreateMultipleMessage");
    private final static QName _CreateMultipleMessageResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "CreateMultipleMessageResponse");
    private final static QName _CreateMessage_QNAME = new QName("http://isds.czechpoint.cz/v20", "CreateMessage");
    private final static QName _CreateMessageResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "CreateMessageResponse");
    private final static QName _VerifyMessage_QNAME = new QName("http://isds.czechpoint.cz/v20", "VerifyMessage");
    private final static QName _VerifyMessageResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "VerifyMessageResponse");
    private final static QName _GetDeliveryInfo_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetDeliveryInfo");
    private final static QName _GetDeliveryInfoResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetDeliveryInfoResponse");
    private final static QName _GetSignedDeliveryInfo_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetSignedDeliveryInfo");
    private final static QName _GetSignedDeliveryInfoResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetSignedDeliveryInfoResponse");
    private final static QName _GetListOfSentMessages_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetListOfSentMessages");
    private final static QName _GetListOfSentMessagesResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetListOfSentMessagesResponse");
    private final static QName _GetListOfReceivedMessages_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetListOfReceivedMessages");
    private final static QName _GetListOfReceivedMessagesResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetListOfReceivedMessagesResponse");
    private final static QName _MessageDownload_QNAME = new QName("http://isds.czechpoint.cz/v20", "MessageDownload");
    private final static QName _MessageDownloadResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "MessageDownloadResponse");
    private final static QName _MessageEnvelopeDownload_QNAME = new QName("http://isds.czechpoint.cz/v20", "MessageEnvelopeDownload");
    private final static QName _MessageEnvelopeDownloadResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "MessageEnvelopeDownloadResponse");
    private final static QName _SignedMessageDownload_QNAME = new QName("http://isds.czechpoint.cz/v20", "SignedMessageDownload");
    private final static QName _SignedMessageDownloadResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "SignedMessageDownloadResponse");
    private final static QName _MarkMessageAsDownloaded_QNAME = new QName("http://isds.czechpoint.cz/v20", "MarkMessageAsDownloaded");
    private final static QName _MarkMessageAsDownloadedResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "MarkMessageAsDownloadedResponse");
    private final static QName _SignedSentMessageDownload_QNAME = new QName("http://isds.czechpoint.cz/v20", "SignedSentMessageDownload");
    private final static QName _SignedSentMessageDownloadResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "SignedSentMessageDownloadResponse");
    private final static QName _ConfirmDelivery_QNAME = new QName("http://isds.czechpoint.cz/v20", "ConfirmDelivery");
    private final static QName _ConfirmDeliveryResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "ConfirmDeliveryResponse");
    private final static QName _AuthenticateMessage_QNAME = new QName("http://isds.czechpoint.cz/v20", "AuthenticateMessage");
    private final static QName _AuthenticateMessageResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "AuthenticateMessageResponse");
    private final static QName _GetMessageStateChanges_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetMessageStateChanges");
    private final static QName _GetMessageStateChangesResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetMessageStateChangesResponse");
    private final static QName _DummyOperation_QNAME = new QName("http://isds.czechpoint.cz/v20", "DummyOperation");
    private final static QName _GetMessageAuthor_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetMessageAuthor");
    private final static QName _GetMessageAuthorResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetMessageAuthorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.czechpoint.isds.v20
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TDelivery }
     * 
     */
    public TDelivery createTDelivery() {
        return new TDelivery();
    }

    /**
     * Create an instance of {@link TReturnedMessageEnvelope }
     * 
     */
    public TReturnedMessageEnvelope createTReturnedMessageEnvelope() {
        return new TReturnedMessageEnvelope();
    }

    /**
     * Create an instance of {@link TReturnedMessage }
     * 
     */
    public TReturnedMessage createTReturnedMessage() {
        return new TReturnedMessage();
    }

    /**
     * Create an instance of {@link TFilesArray }
     * 
     */
    public TFilesArray createTFilesArray() {
        return new TFilesArray();
    }

    /**
     * Create an instance of {@link TFile }
     * 
     */
    public TFile createTFile() {
        return new TFile();
    }

    /**
     * Create an instance of {@link TMessageCreateInput }
     * 
     */
    public TMessageCreateInput createTMessageCreateInput() {
        return new TMessageCreateInput();
    }

    /**
     * Create an instance of {@link TMultipleMessageCreateInput }
     * 
     */
    public TMultipleMessageCreateInput createTMultipleMessageCreateInput() {
        return new TMultipleMessageCreateInput();
    }

    /**
     * Create an instance of {@link TStatus }
     * 
     */
    public TStatus createTStatus() {
        return new TStatus();
    }

    /**
     * Create an instance of {@link TMultipleMessageCreateOutput }
     * 
     */
    public TMultipleMessageCreateOutput createTMultipleMessageCreateOutput() {
        return new TMultipleMessageCreateOutput();
    }

    /**
     * Create an instance of {@link TMessageCreateOutput }
     * 
     */
    public TMessageCreateOutput createTMessageCreateOutput() {
        return new TMessageCreateOutput();
    }

    /**
     * Create an instance of {@link TIDMessInput }
     * 
     */
    public TIDMessInput createTIDMessInput() {
        return new TIDMessInput();
    }

    /**
     * Create an instance of {@link TMessageVerifyOutput }
     * 
     */
    public TMessageVerifyOutput createTMessageVerifyOutput() {
        return new TMessageVerifyOutput();
    }

    /**
     * Create an instance of {@link TDeliveryMessageOutput }
     * 
     */
    public TDeliveryMessageOutput createTDeliveryMessageOutput() {
        return new TDeliveryMessageOutput();
    }

    /**
     * Create an instance of {@link TSignDelivMessOutput }
     * 
     */
    public TSignDelivMessOutput createTSignDelivMessOutput() {
        return new TSignDelivMessOutput();
    }

    /**
     * Create an instance of {@link TListOfSentInput }
     * 
     */
    public TListOfSentInput createTListOfSentInput() {
        return new TListOfSentInput();
    }

    /**
     * Create an instance of {@link TListOfMessOutput }
     * 
     */
    public TListOfMessOutput createTListOfMessOutput() {
        return new TListOfMessOutput();
    }

    /**
     * Create an instance of {@link TListOfFReceivedInput }
     * 
     */
    public TListOfFReceivedInput createTListOfFReceivedInput() {
        return new TListOfFReceivedInput();
    }

    /**
     * Create an instance of {@link TMessDownOutput }
     * 
     */
    public TMessDownOutput createTMessDownOutput() {
        return new TMessDownOutput();
    }

    /**
     * Create an instance of {@link TMessEnvelDownOutput }
     * 
     */
    public TMessEnvelDownOutput createTMessEnvelDownOutput() {
        return new TMessEnvelDownOutput();
    }

    /**
     * Create an instance of {@link TSignedMessDownOutput }
     * 
     */
    public TSignedMessDownOutput createTSignedMessDownOutput() {
        return new TSignedMessDownOutput();
    }

    /**
     * Create an instance of {@link TMarkMessOutput }
     * 
     */
    public TMarkMessOutput createTMarkMessOutput() {
        return new TMarkMessOutput();
    }

    /**
     * Create an instance of {@link TConfirmDeliveryOutput }
     * 
     */
    public TConfirmDeliveryOutput createTConfirmDeliveryOutput() {
        return new TConfirmDeliveryOutput();
    }

    /**
     * Create an instance of {@link TAuthenticateMessageInput }
     * 
     */
    public TAuthenticateMessageInput createTAuthenticateMessageInput() {
        return new TAuthenticateMessageInput();
    }

    /**
     * Create an instance of {@link TAuthenticateMessageOutput }
     * 
     */
    public TAuthenticateMessageOutput createTAuthenticateMessageOutput() {
        return new TAuthenticateMessageOutput();
    }

    /**
     * Create an instance of {@link TGetStateChangesInput }
     * 
     */
    public TGetStateChangesInput createTGetStateChangesInput() {
        return new TGetStateChangesInput();
    }

    /**
     * Create an instance of {@link TGetStateChangesOutput }
     * 
     */
    public TGetStateChangesOutput createTGetStateChangesOutput() {
        return new TGetStateChangesOutput();
    }

    /**
     * Create an instance of {@link TGetAuthorInput }
     * 
     */
    public TGetAuthorInput createTGetAuthorInput() {
        return new TGetAuthorInput();
    }

    /**
     * Create an instance of {@link TGetAuthorOutput }
     * 
     */
    public TGetAuthorOutput createTGetAuthorOutput() {
        return new TGetAuthorOutput();
    }

    /**
     * Create an instance of {@link THash }
     * 
     */
    public THash createTHash() {
        return new THash();
    }

    /**
     * Create an instance of {@link TEvent }
     * 
     */
    public TEvent createTEvent() {
        return new TEvent();
    }

    /**
     * Create an instance of {@link TEventsArray }
     * 
     */
    public TEventsArray createTEventsArray() {
        return new TEventsArray();
    }

    /**
     * Create an instance of {@link TRecipients }
     * 
     */
    public TRecipients createTRecipients() {
        return new TRecipients();
    }

    /**
     * Create an instance of {@link TMultipleMessageEnvelopeSub }
     * 
     */
    public TMultipleMessageEnvelopeSub createTMultipleMessageEnvelopeSub() {
        return new TMultipleMessageEnvelopeSub();
    }

    /**
     * Create an instance of {@link TMultipleMessageRecipients }
     * 
     */
    public TMultipleMessageRecipients createTMultipleMessageRecipients() {
        return new TMultipleMessageRecipients();
    }

    /**
     * Create an instance of {@link TMultipleStatus }
     * 
     */
    public TMultipleStatus createTMultipleStatus() {
        return new TMultipleStatus();
    }

    /**
     * Create an instance of {@link TMStatus }
     * 
     */
    public TMStatus createTMStatus() {
        return new TMStatus();
    }

    /**
     * Create an instance of {@link TMessageEnvelopeSub }
     * 
     */
    public TMessageEnvelopeSub createTMessageEnvelopeSub() {
        return new TMessageEnvelopeSub();
    }

    /**
     * Create an instance of {@link TRecord }
     * 
     */
    public TRecord createTRecord() {
        return new TRecord();
    }

    /**
     * Create an instance of {@link TRecordsArray }
     * 
     */
    public TRecordsArray createTRecordsArray() {
        return new TRecordsArray();
    }

    /**
     * Create an instance of {@link TStateChangesRecord }
     * 
     */
    public TStateChangesRecord createTStateChangesRecord() {
        return new TStateChangesRecord();
    }

    /**
     * Create an instance of {@link TStateChangesArray }
     * 
     */
    public TStateChangesArray createTStateChangesArray() {
        return new TStateChangesArray();
    }

    /**
     * Create an instance of {@link TDelivery.DmDm }
     * 
     */
    public TDelivery.DmDm createTDeliveryDmDm() {
        return new TDelivery.DmDm();
    }

    /**
     * Create an instance of {@link TReturnedMessageEnvelope.DmDm }
     * 
     */
    public TReturnedMessageEnvelope.DmDm createTReturnedMessageEnvelopeDmDm() {
        return new TReturnedMessageEnvelope.DmDm();
    }

    /**
     * Create an instance of {@link TReturnedMessage.DmDm }
     * 
     */
    public TReturnedMessage.DmDm createTReturnedMessageDmDm() {
        return new TReturnedMessage.DmDm();
    }

    /**
     * Create an instance of {@link TFilesArray.DmFile }
     * 
     */
    public TFilesArray.DmFile createTFilesArrayDmFile() {
        return new TFilesArray.DmFile();
    }

    /**
     * Create an instance of {@link TFile.DmXMLContent }
     * 
     */
    public TFile.DmXMLContent createTFileDmXMLContent() {
        return new TFile.DmXMLContent();
    }

    /**
     * Create an instance of {@link TMessageCreateInput.DmEnvelope }
     * 
     */
    public TMessageCreateInput.DmEnvelope createTMessageCreateInputDmEnvelope() {
        return new TMessageCreateInput.DmEnvelope();
    }

    /**
     * Create an instance of {@link TMultipleMessageCreateInput.DmEnvelope }
     * 
     */
    public TMultipleMessageCreateInput.DmEnvelope createTMultipleMessageCreateInputDmEnvelope() {
        return new TMultipleMessageCreateInput.DmEnvelope();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmStatus")
    public JAXBElement<TStatus> createDmStatus(TStatus value) {
        return new JAXBElement<TStatus>(_DmStatus_QNAME, TStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMultipleMessageCreateInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "CreateMultipleMessage")
    public JAXBElement<TMultipleMessageCreateInput> createCreateMultipleMessage(TMultipleMessageCreateInput value) {
        return new JAXBElement<TMultipleMessageCreateInput>(_CreateMultipleMessage_QNAME, TMultipleMessageCreateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMultipleMessageCreateOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "CreateMultipleMessageResponse")
    public JAXBElement<TMultipleMessageCreateOutput> createCreateMultipleMessageResponse(TMultipleMessageCreateOutput value) {
        return new JAXBElement<TMultipleMessageCreateOutput>(_CreateMultipleMessageResponse_QNAME, TMultipleMessageCreateOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessageCreateInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "CreateMessage")
    public JAXBElement<TMessageCreateInput> createCreateMessage(TMessageCreateInput value) {
        return new JAXBElement<TMessageCreateInput>(_CreateMessage_QNAME, TMessageCreateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessageCreateOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "CreateMessageResponse")
    public JAXBElement<TMessageCreateOutput> createCreateMessageResponse(TMessageCreateOutput value) {
        return new JAXBElement<TMessageCreateOutput>(_CreateMessageResponse_QNAME, TMessageCreateOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "VerifyMessage")
    public JAXBElement<TIDMessInput> createVerifyMessage(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_VerifyMessage_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessageVerifyOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "VerifyMessageResponse")
    public JAXBElement<TMessageVerifyOutput> createVerifyMessageResponse(TMessageVerifyOutput value) {
        return new JAXBElement<TMessageVerifyOutput>(_VerifyMessageResponse_QNAME, TMessageVerifyOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetDeliveryInfo")
    public JAXBElement<TIDMessInput> createGetDeliveryInfo(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_GetDeliveryInfo_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDeliveryMessageOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetDeliveryInfoResponse")
    public JAXBElement<TDeliveryMessageOutput> createGetDeliveryInfoResponse(TDeliveryMessageOutput value) {
        return new JAXBElement<TDeliveryMessageOutput>(_GetDeliveryInfoResponse_QNAME, TDeliveryMessageOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetSignedDeliveryInfo")
    public JAXBElement<TIDMessInput> createGetSignedDeliveryInfo(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_GetSignedDeliveryInfo_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSignDelivMessOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetSignedDeliveryInfoResponse")
    public JAXBElement<TSignDelivMessOutput> createGetSignedDeliveryInfoResponse(TSignDelivMessOutput value) {
        return new JAXBElement<TSignDelivMessOutput>(_GetSignedDeliveryInfoResponse_QNAME, TSignDelivMessOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListOfSentInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfSentMessages")
    public JAXBElement<TListOfSentInput> createGetListOfSentMessages(TListOfSentInput value) {
        return new JAXBElement<TListOfSentInput>(_GetListOfSentMessages_QNAME, TListOfSentInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListOfMessOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfSentMessagesResponse")
    public JAXBElement<TListOfMessOutput> createGetListOfSentMessagesResponse(TListOfMessOutput value) {
        return new JAXBElement<TListOfMessOutput>(_GetListOfSentMessagesResponse_QNAME, TListOfMessOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListOfFReceivedInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfReceivedMessages")
    public JAXBElement<TListOfFReceivedInput> createGetListOfReceivedMessages(TListOfFReceivedInput value) {
        return new JAXBElement<TListOfFReceivedInput>(_GetListOfReceivedMessages_QNAME, TListOfFReceivedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListOfMessOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfReceivedMessagesResponse")
    public JAXBElement<TListOfMessOutput> createGetListOfReceivedMessagesResponse(TListOfMessOutput value) {
        return new JAXBElement<TListOfMessOutput>(_GetListOfReceivedMessagesResponse_QNAME, TListOfMessOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MessageDownload")
    public JAXBElement<TIDMessInput> createMessageDownload(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_MessageDownload_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessDownOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MessageDownloadResponse")
    public JAXBElement<TMessDownOutput> createMessageDownloadResponse(TMessDownOutput value) {
        return new JAXBElement<TMessDownOutput>(_MessageDownloadResponse_QNAME, TMessDownOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MessageEnvelopeDownload")
    public JAXBElement<TIDMessInput> createMessageEnvelopeDownload(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_MessageEnvelopeDownload_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessEnvelDownOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MessageEnvelopeDownloadResponse")
    public JAXBElement<TMessEnvelDownOutput> createMessageEnvelopeDownloadResponse(TMessEnvelDownOutput value) {
        return new JAXBElement<TMessEnvelDownOutput>(_MessageEnvelopeDownloadResponse_QNAME, TMessEnvelDownOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "SignedMessageDownload")
    public JAXBElement<TIDMessInput> createSignedMessageDownload(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_SignedMessageDownload_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSignedMessDownOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "SignedMessageDownloadResponse")
    public JAXBElement<TSignedMessDownOutput> createSignedMessageDownloadResponse(TSignedMessDownOutput value) {
        return new JAXBElement<TSignedMessDownOutput>(_SignedMessageDownloadResponse_QNAME, TSignedMessDownOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MarkMessageAsDownloaded")
    public JAXBElement<TIDMessInput> createMarkMessageAsDownloaded(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_MarkMessageAsDownloaded_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMarkMessOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MarkMessageAsDownloadedResponse")
    public JAXBElement<TMarkMessOutput> createMarkMessageAsDownloadedResponse(TMarkMessOutput value) {
        return new JAXBElement<TMarkMessOutput>(_MarkMessageAsDownloadedResponse_QNAME, TMarkMessOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "SignedSentMessageDownload")
    public JAXBElement<TIDMessInput> createSignedSentMessageDownload(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_SignedSentMessageDownload_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSignedMessDownOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "SignedSentMessageDownloadResponse")
    public JAXBElement<TSignedMessDownOutput> createSignedSentMessageDownloadResponse(TSignedMessDownOutput value) {
        return new JAXBElement<TSignedMessDownOutput>(_SignedSentMessageDownloadResponse_QNAME, TSignedMessDownOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "ConfirmDelivery")
    public JAXBElement<TIDMessInput> createConfirmDelivery(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_ConfirmDelivery_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TConfirmDeliveryOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "ConfirmDeliveryResponse")
    public JAXBElement<TConfirmDeliveryOutput> createConfirmDeliveryResponse(TConfirmDeliveryOutput value) {
        return new JAXBElement<TConfirmDeliveryOutput>(_ConfirmDeliveryResponse_QNAME, TConfirmDeliveryOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAuthenticateMessageInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "AuthenticateMessage")
    public JAXBElement<TAuthenticateMessageInput> createAuthenticateMessage(TAuthenticateMessageInput value) {
        return new JAXBElement<TAuthenticateMessageInput>(_AuthenticateMessage_QNAME, TAuthenticateMessageInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAuthenticateMessageOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "AuthenticateMessageResponse")
    public JAXBElement<TAuthenticateMessageOutput> createAuthenticateMessageResponse(TAuthenticateMessageOutput value) {
        return new JAXBElement<TAuthenticateMessageOutput>(_AuthenticateMessageResponse_QNAME, TAuthenticateMessageOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetStateChangesInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetMessageStateChanges")
    public JAXBElement<TGetStateChangesInput> createGetMessageStateChanges(TGetStateChangesInput value) {
        return new JAXBElement<TGetStateChangesInput>(_GetMessageStateChanges_QNAME, TGetStateChangesInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetStateChangesOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetMessageStateChangesResponse")
    public JAXBElement<TGetStateChangesOutput> createGetMessageStateChangesResponse(TGetStateChangesOutput value) {
        return new JAXBElement<TGetStateChangesOutput>(_GetMessageStateChangesResponse_QNAME, TGetStateChangesOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "DummyOperation")
    public JAXBElement<String> createDummyOperation(String value) {
        return new JAXBElement<String>(_DummyOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetAuthorInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetMessageAuthor")
    public JAXBElement<TGetAuthorInput> createGetMessageAuthor(TGetAuthorInput value) {
        return new JAXBElement<TGetAuthorInput>(_GetMessageAuthor_QNAME, TGetAuthorInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetAuthorOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetMessageAuthorResponse")
    public JAXBElement<TGetAuthorOutput> createGetMessageAuthorResponse(TGetAuthorOutput value) {
        return new JAXBElement<TGetAuthorOutput>(_GetMessageAuthorResponse_QNAME, TGetAuthorOutput.class, null, value);
    }

}
