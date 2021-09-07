
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


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
    private final static QName _AuthenticateMessage_QNAME = new QName("http://isds.czechpoint.cz/v20", "AuthenticateMessage");
    private final static QName _AuthenticateMessageResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "AuthenticateMessageResponse");
    private final static QName _GetMessageStateChanges_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetMessageStateChanges");
    private final static QName _GetMessageStateChangesResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetMessageStateChangesResponse");
    private final static QName _DummyOperation_QNAME = new QName("http://isds.czechpoint.cz/v20", "DummyOperation");
    private final static QName _GetMessageAuthor_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetMessageAuthor");
    private final static QName _GetMessageAuthorResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetMessageAuthorResponse");
    private final static QName _EraseMessage_QNAME = new QName("http://isds.czechpoint.cz/v20", "EraseMessage");
    private final static QName _EraseMessageResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "EraseMessageResponse");
    private final static QName _ReSignISDSDocument_QNAME = new QName("http://isds.czechpoint.cz/v20", "Re-signISDSDocument");
    private final static QName _ReSignISDSDocumentResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "Re-signISDSDocumentResponse");
    private final static QName _GetListOfErasedMessages_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetListOfErasedMessages");
    private final static QName _GetListOfErasedMessagesResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetListOfErasedMessagesResponse");
    private final static QName _PickUpAsyncResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "PickUpAsyncResponse");
    private final static QName _PickUpAsyncResponseResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "PickUpAsyncResponseResponse");
    private final static QName _GetListForNotifications_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetListForNotifications");
    private final static QName _GetListForNotificationsResponse_QNAME = new QName("http://isds.czechpoint.cz/v20", "GetListForNotificationsResponse");
    private final static QName _TRecordDbIDSender_QNAME = new QName("http://isds.czechpoint.cz/v20", "dbIDSender");
    private final static QName _TRecordDmSender_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmSender");
    private final static QName _TRecordDmSenderAddress_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmSenderAddress");
    private final static QName _TRecordDmRecipient_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmRecipient");
    private final static QName _TRecordDmRecipientAddress_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmRecipientAddress");
    private final static QName _TRecordDmAmbiguousRecipient_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmAmbiguousRecipient");
    private final static QName _TRecordDmSenderOrgUnit_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmSenderOrgUnit");
    private final static QName _TRecordDmSenderOrgUnitNum_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmSenderOrgUnitNum");
    private final static QName _TRecordDbIDRecipient_QNAME = new QName("http://isds.czechpoint.cz/v20", "dbIDRecipient");
    private final static QName _TRecordDmRecipientOrgUnit_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmRecipientOrgUnit");
    private final static QName _TRecordDmRecipientOrgUnitNum_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmRecipientOrgUnitNum");
    private final static QName _TRecordDmToHands_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmToHands");
    private final static QName _TRecordDmAnnotation_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmAnnotation");
    private final static QName _TRecordDmRecipientRefNumber_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmRecipientRefNumber");
    private final static QName _TRecordDmSenderRefNumber_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmSenderRefNumber");
    private final static QName _TRecordDmRecipientIdent_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmRecipientIdent");
    private final static QName _TRecordDmSenderIdent_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmSenderIdent");
    private final static QName _TRecordDmLegalTitleLaw_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmLegalTitleLaw");
    private final static QName _TRecordDmLegalTitleYear_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmLegalTitleYear");
    private final static QName _TRecordDmLegalTitleSect_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmLegalTitleSect");
    private final static QName _TRecordDmLegalTitlePar_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmLegalTitlePar");
    private final static QName _TRecordDmLegalTitlePoint_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmLegalTitlePoint");
    private final static QName _TRecordDmPersonalDelivery_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmPersonalDelivery");
    private final static QName _TRecordDmAllowSubstDelivery_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmAllowSubstDelivery");
    private final static QName _TRecordDmAttachmentSize_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmAttachmentSize");
    private final static QName _TRecordDmDeliveryTime_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmDeliveryTime");
    private final static QName _TRecordDmAcceptanceTime_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmAcceptanceTime");
    private final static QName _TMessageEnvelopeSubDmOVM_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmOVM");
    private final static QName _TMessageEnvelopeSubDmPublishOwnID_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmPublishOwnID");
    private final static QName _TListForNotifOutputNtfRecords_QNAME = new QName("http://isds.czechpoint.cz/v20", "ntfRecords");
    private final static QName _TGetAuthorOutputUserType_QNAME = new QName("http://isds.czechpoint.cz/v20", "userType");
    private final static QName _TGetAuthorOutputAuthorName_QNAME = new QName("http://isds.czechpoint.cz/v20", "authorName");
    private final static QName _TGetStateChangesOutputDmRecords_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmRecords");
    private final static QName _TAuthenticateMessageOutputDmAuthResult_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmAuthResult");
    private final static QName _TMessEnvelDownOutputDmReturnedMessageEnvelope_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmReturnedMessageEnvelope");
    private final static QName _TMessDownOutputDmReturnedMessage_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmReturnedMessage");
    private final static QName _TDeliveryMessageOutputDmDelivery_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmDelivery");
    private final static QName _TMultipleMessageCreateOutputDmMultipleStatus_QNAME = new QName("http://isds.czechpoint.cz/v20", "dmMultipleStatus");

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
     * Create an instance of {@link TEraseMessageIntput }
     * 
     */
    public TEraseMessageIntput createTEraseMessageIntput() {
        return new TEraseMessageIntput();
    }

    /**
     * Create an instance of {@link TEraseMessageOutput }
     * 
     */
    public TEraseMessageOutput createTEraseMessageOutput() {
        return new TEraseMessageOutput();
    }

    /**
     * Create an instance of {@link TResignDocInput }
     * 
     */
    public TResignDocInput createTResignDocInput() {
        return new TResignDocInput();
    }

    /**
     * Create an instance of {@link TResignDocOutput }
     * 
     */
    public TResignDocOutput createTResignDocOutput() {
        return new TResignDocOutput();
    }

    /**
     * Create an instance of {@link TGetListOfErasedInput }
     * 
     */
    public TGetListOfErasedInput createTGetListOfErasedInput() {
        return new TGetListOfErasedInput();
    }

    /**
     * Create an instance of {@link TGetListOfErasedOutput }
     * 
     */
    public TGetListOfErasedOutput createTGetListOfErasedOutput() {
        return new TGetListOfErasedOutput();
    }

    /**
     * Create an instance of {@link TPickUpAsyncInput }
     * 
     */
    public TPickUpAsyncInput createTPickUpAsyncInput() {
        return new TPickUpAsyncInput();
    }

    /**
     * Create an instance of {@link TPickUpAsyncOutput }
     * 
     */
    public TPickUpAsyncOutput createTPickUpAsyncOutput() {
        return new TPickUpAsyncOutput();
    }

    /**
     * Create an instance of {@link TListForNotifInput }
     * 
     */
    public TListForNotifInput createTListForNotifInput() {
        return new TListForNotifInput();
    }

    /**
     * Create an instance of {@link TListForNotifOutput }
     * 
     */
    public TListForNotifOutput createTListForNotifOutput() {
        return new TListForNotifOutput();
    }

    /**
     * Create an instance of {@link RegisterForNotifications }
     * 
     */
    public RegisterForNotifications createRegisterForNotifications() {
        return new RegisterForNotifications();
    }

    /**
     * Create an instance of {@link RegisterForNotificationsResponse }
     * 
     */
    public RegisterForNotificationsResponse createRegisterForNotificationsResponse() {
        return new RegisterForNotificationsResponse();
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
     * Create an instance of {@link TNtfRecordsArray }
     * 
     */
    public TNtfRecordsArray createTNtfRecordsArray() {
        return new TNtfRecordsArray();
    }

    /**
     * Create an instance of {@link TNtfRecord }
     * 
     */
    public TNtfRecord createTNtfRecord() {
        return new TNtfRecord();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmStatus")
    public JAXBElement<TStatus> createDmStatus(TStatus value) {
        return new JAXBElement<TStatus>(_DmStatus_QNAME, TStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMultipleMessageCreateInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMultipleMessageCreateInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "CreateMultipleMessage")
    public JAXBElement<TMultipleMessageCreateInput> createCreateMultipleMessage(TMultipleMessageCreateInput value) {
        return new JAXBElement<TMultipleMessageCreateInput>(_CreateMultipleMessage_QNAME, TMultipleMessageCreateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMultipleMessageCreateOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMultipleMessageCreateOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "CreateMultipleMessageResponse")
    public JAXBElement<TMultipleMessageCreateOutput> createCreateMultipleMessageResponse(TMultipleMessageCreateOutput value) {
        return new JAXBElement<TMultipleMessageCreateOutput>(_CreateMultipleMessageResponse_QNAME, TMultipleMessageCreateOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessageCreateInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMessageCreateInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "CreateMessage")
    public JAXBElement<TMessageCreateInput> createCreateMessage(TMessageCreateInput value) {
        return new JAXBElement<TMessageCreateInput>(_CreateMessage_QNAME, TMessageCreateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessageCreateOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMessageCreateOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "CreateMessageResponse")
    public JAXBElement<TMessageCreateOutput> createCreateMessageResponse(TMessageCreateOutput value) {
        return new JAXBElement<TMessageCreateOutput>(_CreateMessageResponse_QNAME, TMessageCreateOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "VerifyMessage")
    public JAXBElement<TIDMessInput> createVerifyMessage(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_VerifyMessage_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessageVerifyOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMessageVerifyOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "VerifyMessageResponse")
    public JAXBElement<TMessageVerifyOutput> createVerifyMessageResponse(TMessageVerifyOutput value) {
        return new JAXBElement<TMessageVerifyOutput>(_VerifyMessageResponse_QNAME, TMessageVerifyOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetDeliveryInfo")
    public JAXBElement<TIDMessInput> createGetDeliveryInfo(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_GetDeliveryInfo_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDeliveryMessageOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDeliveryMessageOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetDeliveryInfoResponse")
    public JAXBElement<TDeliveryMessageOutput> createGetDeliveryInfoResponse(TDeliveryMessageOutput value) {
        return new JAXBElement<TDeliveryMessageOutput>(_GetDeliveryInfoResponse_QNAME, TDeliveryMessageOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetSignedDeliveryInfo")
    public JAXBElement<TIDMessInput> createGetSignedDeliveryInfo(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_GetSignedDeliveryInfo_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSignDelivMessOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSignDelivMessOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetSignedDeliveryInfoResponse")
    public JAXBElement<TSignDelivMessOutput> createGetSignedDeliveryInfoResponse(TSignDelivMessOutput value) {
        return new JAXBElement<TSignDelivMessOutput>(_GetSignedDeliveryInfoResponse_QNAME, TSignDelivMessOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListOfSentInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TListOfSentInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfSentMessages")
    public JAXBElement<TListOfSentInput> createGetListOfSentMessages(TListOfSentInput value) {
        return new JAXBElement<TListOfSentInput>(_GetListOfSentMessages_QNAME, TListOfSentInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListOfMessOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TListOfMessOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfSentMessagesResponse")
    public JAXBElement<TListOfMessOutput> createGetListOfSentMessagesResponse(TListOfMessOutput value) {
        return new JAXBElement<TListOfMessOutput>(_GetListOfSentMessagesResponse_QNAME, TListOfMessOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListOfFReceivedInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TListOfFReceivedInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfReceivedMessages")
    public JAXBElement<TListOfFReceivedInput> createGetListOfReceivedMessages(TListOfFReceivedInput value) {
        return new JAXBElement<TListOfFReceivedInput>(_GetListOfReceivedMessages_QNAME, TListOfFReceivedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListOfMessOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TListOfMessOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfReceivedMessagesResponse")
    public JAXBElement<TListOfMessOutput> createGetListOfReceivedMessagesResponse(TListOfMessOutput value) {
        return new JAXBElement<TListOfMessOutput>(_GetListOfReceivedMessagesResponse_QNAME, TListOfMessOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MessageDownload")
    public JAXBElement<TIDMessInput> createMessageDownload(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_MessageDownload_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessDownOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMessDownOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MessageDownloadResponse")
    public JAXBElement<TMessDownOutput> createMessageDownloadResponse(TMessDownOutput value) {
        return new JAXBElement<TMessDownOutput>(_MessageDownloadResponse_QNAME, TMessDownOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MessageEnvelopeDownload")
    public JAXBElement<TIDMessInput> createMessageEnvelopeDownload(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_MessageEnvelopeDownload_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMessEnvelDownOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMessEnvelDownOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MessageEnvelopeDownloadResponse")
    public JAXBElement<TMessEnvelDownOutput> createMessageEnvelopeDownloadResponse(TMessEnvelDownOutput value) {
        return new JAXBElement<TMessEnvelDownOutput>(_MessageEnvelopeDownloadResponse_QNAME, TMessEnvelDownOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "SignedMessageDownload")
    public JAXBElement<TIDMessInput> createSignedMessageDownload(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_SignedMessageDownload_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSignedMessDownOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSignedMessDownOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "SignedMessageDownloadResponse")
    public JAXBElement<TSignedMessDownOutput> createSignedMessageDownloadResponse(TSignedMessDownOutput value) {
        return new JAXBElement<TSignedMessDownOutput>(_SignedMessageDownloadResponse_QNAME, TSignedMessDownOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MarkMessageAsDownloaded")
    public JAXBElement<TIDMessInput> createMarkMessageAsDownloaded(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_MarkMessageAsDownloaded_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMarkMessOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMarkMessOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "MarkMessageAsDownloadedResponse")
    public JAXBElement<TMarkMessOutput> createMarkMessageAsDownloadedResponse(TMarkMessOutput value) {
        return new JAXBElement<TMarkMessOutput>(_MarkMessageAsDownloadedResponse_QNAME, TMarkMessOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIDMessInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "SignedSentMessageDownload")
    public JAXBElement<TIDMessInput> createSignedSentMessageDownload(TIDMessInput value) {
        return new JAXBElement<TIDMessInput>(_SignedSentMessageDownload_QNAME, TIDMessInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSignedMessDownOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TSignedMessDownOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "SignedSentMessageDownloadResponse")
    public JAXBElement<TSignedMessDownOutput> createSignedSentMessageDownloadResponse(TSignedMessDownOutput value) {
        return new JAXBElement<TSignedMessDownOutput>(_SignedSentMessageDownloadResponse_QNAME, TSignedMessDownOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAuthenticateMessageInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TAuthenticateMessageInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "AuthenticateMessage")
    public JAXBElement<TAuthenticateMessageInput> createAuthenticateMessage(TAuthenticateMessageInput value) {
        return new JAXBElement<TAuthenticateMessageInput>(_AuthenticateMessage_QNAME, TAuthenticateMessageInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAuthenticateMessageOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TAuthenticateMessageOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "AuthenticateMessageResponse")
    public JAXBElement<TAuthenticateMessageOutput> createAuthenticateMessageResponse(TAuthenticateMessageOutput value) {
        return new JAXBElement<TAuthenticateMessageOutput>(_AuthenticateMessageResponse_QNAME, TAuthenticateMessageOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetStateChangesInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGetStateChangesInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetMessageStateChanges")
    public JAXBElement<TGetStateChangesInput> createGetMessageStateChanges(TGetStateChangesInput value) {
        return new JAXBElement<TGetStateChangesInput>(_GetMessageStateChanges_QNAME, TGetStateChangesInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetStateChangesOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGetStateChangesOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetMessageStateChangesResponse")
    public JAXBElement<TGetStateChangesOutput> createGetMessageStateChangesResponse(TGetStateChangesOutput value) {
        return new JAXBElement<TGetStateChangesOutput>(_GetMessageStateChangesResponse_QNAME, TGetStateChangesOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "DummyOperation")
    public JAXBElement<String> createDummyOperation(String value) {
        return new JAXBElement<String>(_DummyOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetAuthorInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGetAuthorInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetMessageAuthor")
    public JAXBElement<TGetAuthorInput> createGetMessageAuthor(TGetAuthorInput value) {
        return new JAXBElement<TGetAuthorInput>(_GetMessageAuthor_QNAME, TGetAuthorInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetAuthorOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGetAuthorOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetMessageAuthorResponse")
    public JAXBElement<TGetAuthorOutput> createGetMessageAuthorResponse(TGetAuthorOutput value) {
        return new JAXBElement<TGetAuthorOutput>(_GetMessageAuthorResponse_QNAME, TGetAuthorOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEraseMessageIntput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEraseMessageIntput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "EraseMessage")
    public JAXBElement<TEraseMessageIntput> createEraseMessage(TEraseMessageIntput value) {
        return new JAXBElement<TEraseMessageIntput>(_EraseMessage_QNAME, TEraseMessageIntput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEraseMessageOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEraseMessageOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "EraseMessageResponse")
    public JAXBElement<TEraseMessageOutput> createEraseMessageResponse(TEraseMessageOutput value) {
        return new JAXBElement<TEraseMessageOutput>(_EraseMessageResponse_QNAME, TEraseMessageOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TResignDocInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TResignDocInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "Re-signISDSDocument")
    public JAXBElement<TResignDocInput> createReSignISDSDocument(TResignDocInput value) {
        return new JAXBElement<TResignDocInput>(_ReSignISDSDocument_QNAME, TResignDocInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TResignDocOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TResignDocOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "Re-signISDSDocumentResponse")
    public JAXBElement<TResignDocOutput> createReSignISDSDocumentResponse(TResignDocOutput value) {
        return new JAXBElement<TResignDocOutput>(_ReSignISDSDocumentResponse_QNAME, TResignDocOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetListOfErasedInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGetListOfErasedInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfErasedMessages")
    public JAXBElement<TGetListOfErasedInput> createGetListOfErasedMessages(TGetListOfErasedInput value) {
        return new JAXBElement<TGetListOfErasedInput>(_GetListOfErasedMessages_QNAME, TGetListOfErasedInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGetListOfErasedOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TGetListOfErasedOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListOfErasedMessagesResponse")
    public JAXBElement<TGetListOfErasedOutput> createGetListOfErasedMessagesResponse(TGetListOfErasedOutput value) {
        return new JAXBElement<TGetListOfErasedOutput>(_GetListOfErasedMessagesResponse_QNAME, TGetListOfErasedOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPickUpAsyncInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TPickUpAsyncInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "PickUpAsyncResponse")
    public JAXBElement<TPickUpAsyncInput> createPickUpAsyncResponse(TPickUpAsyncInput value) {
        return new JAXBElement<TPickUpAsyncInput>(_PickUpAsyncResponse_QNAME, TPickUpAsyncInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPickUpAsyncOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TPickUpAsyncOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "PickUpAsyncResponseResponse")
    public JAXBElement<TPickUpAsyncOutput> createPickUpAsyncResponseResponse(TPickUpAsyncOutput value) {
        return new JAXBElement<TPickUpAsyncOutput>(_PickUpAsyncResponseResponse_QNAME, TPickUpAsyncOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListForNotifInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TListForNotifInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListForNotifications")
    public JAXBElement<TListForNotifInput> createGetListForNotifications(TListForNotifInput value) {
        return new JAXBElement<TListForNotifInput>(_GetListForNotifications_QNAME, TListForNotifInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListForNotifOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TListForNotifOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "GetListForNotificationsResponse")
    public JAXBElement<TListForNotifOutput> createGetListForNotificationsResponse(TListForNotifOutput value) {
        return new JAXBElement<TListForNotifOutput>(_GetListForNotificationsResponse_QNAME, TListForNotifOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dbIDSender", scope = TRecord.class)
    public JAXBElement<String> createTRecordDbIDSender(String value) {
        return new JAXBElement<String>(_TRecordDbIDSender_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmSender", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmSender(String value) {
        return new JAXBElement<String>(_TRecordDmSender_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmSenderAddress", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmSenderAddress(String value) {
        return new JAXBElement<String>(_TRecordDmSenderAddress_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecipient", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmRecipient(String value) {
        return new JAXBElement<String>(_TRecordDmRecipient_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecipientAddress", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmRecipientAddress(String value) {
        return new JAXBElement<String>(_TRecordDmRecipientAddress_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmAmbiguousRecipient", scope = TRecord.class)
    public JAXBElement<Boolean> createTRecordDmAmbiguousRecipient(Boolean value) {
        return new JAXBElement<Boolean>(_TRecordDmAmbiguousRecipient_QNAME, Boolean.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmSenderOrgUnit", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmSenderOrgUnit(String value) {
        return new JAXBElement<String>(_TRecordDmSenderOrgUnit_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmSenderOrgUnitNum", scope = TRecord.class)
    public JAXBElement<BigInteger> createTRecordDmSenderOrgUnitNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_TRecordDmSenderOrgUnitNum_QNAME, BigInteger.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dbIDRecipient", scope = TRecord.class)
    public JAXBElement<String> createTRecordDbIDRecipient(String value) {
        return new JAXBElement<String>(_TRecordDbIDRecipient_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecipientOrgUnit", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmRecipientOrgUnit(String value) {
        return new JAXBElement<String>(_TRecordDmRecipientOrgUnit_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecipientOrgUnitNum", scope = TRecord.class)
    public JAXBElement<BigInteger> createTRecordDmRecipientOrgUnitNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_TRecordDmRecipientOrgUnitNum_QNAME, BigInteger.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmToHands", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmToHands(String value) {
        return new JAXBElement<String>(_TRecordDmToHands_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmAnnotation", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmAnnotation(String value) {
        return new JAXBElement<String>(_TRecordDmAnnotation_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecipientRefNumber", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmRecipientRefNumber(String value) {
        return new JAXBElement<String>(_TRecordDmRecipientRefNumber_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmSenderRefNumber", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmSenderRefNumber(String value) {
        return new JAXBElement<String>(_TRecordDmSenderRefNumber_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecipientIdent", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmRecipientIdent(String value) {
        return new JAXBElement<String>(_TRecordDmRecipientIdent_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmSenderIdent", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmSenderIdent(String value) {
        return new JAXBElement<String>(_TRecordDmSenderIdent_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmLegalTitleLaw", scope = TRecord.class)
    public JAXBElement<BigInteger> createTRecordDmLegalTitleLaw(BigInteger value) {
        return new JAXBElement<BigInteger>(_TRecordDmLegalTitleLaw_QNAME, BigInteger.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmLegalTitleYear", scope = TRecord.class)
    public JAXBElement<BigInteger> createTRecordDmLegalTitleYear(BigInteger value) {
        return new JAXBElement<BigInteger>(_TRecordDmLegalTitleYear_QNAME, BigInteger.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmLegalTitleSect", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmLegalTitleSect(String value) {
        return new JAXBElement<String>(_TRecordDmLegalTitleSect_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmLegalTitlePar", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmLegalTitlePar(String value) {
        return new JAXBElement<String>(_TRecordDmLegalTitlePar_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmLegalTitlePoint", scope = TRecord.class)
    public JAXBElement<String> createTRecordDmLegalTitlePoint(String value) {
        return new JAXBElement<String>(_TRecordDmLegalTitlePoint_QNAME, String.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmPersonalDelivery", scope = TRecord.class)
    public JAXBElement<Boolean> createTRecordDmPersonalDelivery(Boolean value) {
        return new JAXBElement<Boolean>(_TRecordDmPersonalDelivery_QNAME, Boolean.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmAllowSubstDelivery", scope = TRecord.class)
    public JAXBElement<Boolean> createTRecordDmAllowSubstDelivery(Boolean value) {
        return new JAXBElement<Boolean>(_TRecordDmAllowSubstDelivery_QNAME, Boolean.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmAttachmentSize", scope = TRecord.class)
    public JAXBElement<BigInteger> createTRecordDmAttachmentSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_TRecordDmAttachmentSize_QNAME, BigInteger.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmDeliveryTime", scope = TRecord.class)
    public JAXBElement<XMLGregorianCalendar> createTRecordDmDeliveryTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TRecordDmDeliveryTime_QNAME, XMLGregorianCalendar.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmAcceptanceTime", scope = TRecord.class)
    public JAXBElement<XMLGregorianCalendar> createTRecordDmAcceptanceTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TRecordDmAcceptanceTime_QNAME, XMLGregorianCalendar.class, TRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmAmbiguousRecipient", scope = TDelivery.DmDm.class)
    public JAXBElement<Boolean> createTDeliveryDmDmDmAmbiguousRecipient(Boolean value) {
        return new JAXBElement<Boolean>(_TRecordDmAmbiguousRecipient_QNAME, Boolean.class, TDelivery.DmDm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmOVM", scope = TMessageEnvelopeSub.class)
    public JAXBElement<Boolean> createTMessageEnvelopeSubDmOVM(Boolean value) {
        return new JAXBElement<Boolean>(_TMessageEnvelopeSubDmOVM_QNAME, Boolean.class, TMessageEnvelopeSub.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmPublishOwnID", scope = TMessageEnvelopeSub.class)
    public JAXBElement<Boolean> createTMessageEnvelopeSubDmPublishOwnID(Boolean value) {
        return new JAXBElement<Boolean>(_TMessageEnvelopeSubDmPublishOwnID_QNAME, Boolean.class, TMessageEnvelopeSub.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmAmbiguousRecipient", scope = TReturnedMessageEnvelope.DmDm.class)
    public JAXBElement<Boolean> createTReturnedMessageEnvelopeDmDmDmAmbiguousRecipient(Boolean value) {
        return new JAXBElement<Boolean>(_TRecordDmAmbiguousRecipient_QNAME, Boolean.class, TReturnedMessageEnvelope.DmDm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmAmbiguousRecipient", scope = TReturnedMessage.DmDm.class)
    public JAXBElement<Boolean> createTReturnedMessageDmDmDmAmbiguousRecipient(Boolean value) {
        return new JAXBElement<Boolean>(_TRecordDmAmbiguousRecipient_QNAME, Boolean.class, TReturnedMessage.DmDm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmOVM", scope = TMultipleMessageEnvelopeSub.class)
    public JAXBElement<Boolean> createTMultipleMessageEnvelopeSubDmOVM(Boolean value) {
        return new JAXBElement<Boolean>(_TMessageEnvelopeSubDmOVM_QNAME, Boolean.class, TMultipleMessageEnvelopeSub.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmPublishOwnID", scope = TMultipleMessageEnvelopeSub.class)
    public JAXBElement<Boolean> createTMultipleMessageEnvelopeSubDmPublishOwnID(Boolean value) {
        return new JAXBElement<Boolean>(_TMessageEnvelopeSubDmPublishOwnID_QNAME, Boolean.class, TMultipleMessageEnvelopeSub.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecipientOrgUnit", scope = TRecipients.class)
    public JAXBElement<String> createTRecipientsDmRecipientOrgUnit(String value) {
        return new JAXBElement<String>(_TRecordDmRecipientOrgUnit_QNAME, String.class, TRecipients.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecipientOrgUnitNum", scope = TRecipients.class)
    public JAXBElement<BigInteger> createTRecipientsDmRecipientOrgUnitNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_TRecordDmRecipientOrgUnitNum_QNAME, BigInteger.class, TRecipients.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TNtfRecordsArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TNtfRecordsArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "ntfRecords", scope = TListForNotifOutput.class)
    public JAXBElement<TNtfRecordsArray> createTListForNotifOutputNtfRecords(TNtfRecordsArray value) {
        return new JAXBElement<TNtfRecordsArray>(_TListForNotifOutputNtfRecords_QNAME, TNtfRecordsArray.class, TListForNotifOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "userType", scope = TGetAuthorOutput.class)
    public JAXBElement<String> createTGetAuthorOutputUserType(String value) {
        return new JAXBElement<String>(_TGetAuthorOutputUserType_QNAME, String.class, TGetAuthorOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "authorName", scope = TGetAuthorOutput.class)
    public JAXBElement<String> createTGetAuthorOutputAuthorName(String value) {
        return new JAXBElement<String>(_TGetAuthorOutputAuthorName_QNAME, String.class, TGetAuthorOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TStateChangesArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TStateChangesArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecords", scope = TGetStateChangesOutput.class)
    public JAXBElement<TStateChangesArray> createTGetStateChangesOutputDmRecords(TStateChangesArray value) {
        return new JAXBElement<TStateChangesArray>(_TGetStateChangesOutputDmRecords_QNAME, TStateChangesArray.class, TGetStateChangesOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmAuthResult", scope = TAuthenticateMessageOutput.class)
    public JAXBElement<Boolean> createTAuthenticateMessageOutputDmAuthResult(Boolean value) {
        return new JAXBElement<Boolean>(_TAuthenticateMessageOutputDmAuthResult_QNAME, Boolean.class, TAuthenticateMessageOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TReturnedMessageEnvelope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TReturnedMessageEnvelope }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmReturnedMessageEnvelope", scope = TMessEnvelDownOutput.class)
    public JAXBElement<TReturnedMessageEnvelope> createTMessEnvelDownOutputDmReturnedMessageEnvelope(TReturnedMessageEnvelope value) {
        return new JAXBElement<TReturnedMessageEnvelope>(_TMessEnvelDownOutputDmReturnedMessageEnvelope_QNAME, TReturnedMessageEnvelope.class, TMessEnvelDownOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TReturnedMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TReturnedMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmReturnedMessage", scope = TMessDownOutput.class)
    public JAXBElement<TReturnedMessage> createTMessDownOutputDmReturnedMessage(TReturnedMessage value) {
        return new JAXBElement<TReturnedMessage>(_TMessDownOutputDmReturnedMessage_QNAME, TReturnedMessage.class, TMessDownOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRecordsArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TRecordsArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmRecords", scope = TListOfMessOutput.class)
    public JAXBElement<TRecordsArray> createTListOfMessOutputDmRecords(TRecordsArray value) {
        return new JAXBElement<TRecordsArray>(_TGetStateChangesOutputDmRecords_QNAME, TRecordsArray.class, TListOfMessOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDelivery }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDelivery }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmDelivery", scope = TDeliveryMessageOutput.class)
    public JAXBElement<TDelivery> createTDeliveryMessageOutputDmDelivery(TDelivery value) {
        return new JAXBElement<TDelivery>(_TDeliveryMessageOutputDmDelivery_QNAME, TDelivery.class, TDeliveryMessageOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMultipleStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMultipleStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://isds.czechpoint.cz/v20", name = "dmMultipleStatus", scope = TMultipleMessageCreateOutput.class)
    public JAXBElement<TMultipleStatus> createTMultipleMessageCreateOutputDmMultipleStatus(TMultipleStatus value) {
        return new JAXBElement<TMultipleStatus>(_TMultipleMessageCreateOutputDmMultipleStatus_QNAME, TMultipleStatus.class, TMultipleMessageCreateOutput.class, value);
    }

}
