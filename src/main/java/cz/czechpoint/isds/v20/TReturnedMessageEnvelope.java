
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * typ pro staženou obálku DZ (bez písemností, hash neplatí)
 * 
 * <p>Java class for tReturnedMessageEnvelope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tReturnedMessageEnvelope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmDm">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://isds.czechpoint.cz/v20}gMessageEnvelope"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dmHash" type="{http://isds.czechpoint.cz/v20}tHash"/>
 *         &lt;element name="dmQTimestamp" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="dmDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dmAcceptanceTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dmMessageStatus" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dmAttachmentSize" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dmType" type="{http://isds.czechpoint.cz/v20}tDmType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tReturnedMessageEnvelope", propOrder = {
    "dmDm",
    "dmHash",
    "dmQTimestamp",
    "dmDeliveryTime",
    "dmAcceptanceTime",
    "dmMessageStatus",
    "dmAttachmentSize"
})
public class TReturnedMessageEnvelope {

    @XmlElement(required = true)
    protected TReturnedMessageEnvelope.DmDm dmDm;
    @XmlElement(required = true)
    protected THash dmHash;
    @XmlElement(required = true)
    protected byte[] dmQTimestamp;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmDeliveryTime;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmAcceptanceTime;
    @XmlElement(required = true)
    protected BigInteger dmMessageStatus;
    @XmlElement(required = true, nillable = true)
    protected BigInteger dmAttachmentSize;
    @XmlAttribute
    protected String dmType;

    /**
     * Gets the value of the dmDm property.
     * 
     * @return
     *     possible object is
     *     {@link TReturnedMessageEnvelope.DmDm }
     *     
     */
    public TReturnedMessageEnvelope.DmDm getDmDm() {
        return dmDm;
    }

    /**
     * Sets the value of the dmDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TReturnedMessageEnvelope.DmDm }
     *     
     */
    public void setDmDm(TReturnedMessageEnvelope.DmDm value) {
        this.dmDm = value;
    }

    /**
     * Gets the value of the dmHash property.
     * 
     * @return
     *     possible object is
     *     {@link THash }
     *     
     */
    public THash getDmHash() {
        return dmHash;
    }

    /**
     * Sets the value of the dmHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link THash }
     *     
     */
    public void setDmHash(THash value) {
        this.dmHash = value;
    }

    /**
     * Gets the value of the dmQTimestamp property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDmQTimestamp() {
        return dmQTimestamp;
    }

    /**
     * Sets the value of the dmQTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDmQTimestamp(byte[] value) {
        this.dmQTimestamp = ((byte[]) value);
    }

    /**
     * Gets the value of the dmDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDmDeliveryTime() {
        return dmDeliveryTime;
    }

    /**
     * Sets the value of the dmDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDmDeliveryTime(XMLGregorianCalendar value) {
        this.dmDeliveryTime = value;
    }

    /**
     * Gets the value of the dmAcceptanceTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDmAcceptanceTime() {
        return dmAcceptanceTime;
    }

    /**
     * Sets the value of the dmAcceptanceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDmAcceptanceTime(XMLGregorianCalendar value) {
        this.dmAcceptanceTime = value;
    }

    /**
     * Gets the value of the dmMessageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDmMessageStatus() {
        return dmMessageStatus;
    }

    /**
     * Sets the value of the dmMessageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDmMessageStatus(BigInteger value) {
        this.dmMessageStatus = value;
    }

    /**
     * Gets the value of the dmAttachmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDmAttachmentSize() {
        return dmAttachmentSize;
    }

    /**
     * Sets the value of the dmAttachmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDmAttachmentSize(BigInteger value) {
        this.dmAttachmentSize = value;
    }

    /**
     * Gets the value of the dmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmType() {
        return dmType;
    }

    /**
     * Sets the value of the dmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmType(String value) {
        this.dmType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://isds.czechpoint.cz/v20}gMessageEnvelope"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dmID",
        "dbIDSender",
        "dmSender",
        "dmSenderAddress",
        "dmSenderType",
        "dmRecipient",
        "dmRecipientAddress",
        "dmAmbiguousRecipient",
        "dmSenderOrgUnit",
        "dmSenderOrgUnitNum",
        "dbIDRecipient",
        "dmRecipientOrgUnit",
        "dmRecipientOrgUnitNum",
        "dmToHands",
        "dmAnnotation",
        "dmRecipientRefNumber",
        "dmSenderRefNumber",
        "dmRecipientIdent",
        "dmSenderIdent",
        "dmLegalTitleLaw",
        "dmLegalTitleYear",
        "dmLegalTitleSect",
        "dmLegalTitlePar",
        "dmLegalTitlePoint",
        "dmPersonalDelivery",
        "dmAllowSubstDelivery"
    })
    public static class DmDm {

        @XmlElement(required = true)
        protected String dmID;
        @XmlElement(required = true, nillable = true)
        protected String dbIDSender;
        @XmlElement(required = true, nillable = true)
        protected String dmSender;
        @XmlElement(required = true, nillable = true)
        protected String dmSenderAddress;
        protected int dmSenderType;
        @XmlElement(required = true, nillable = true)
        protected String dmRecipient;
        @XmlElement(required = true, nillable = true)
        protected String dmRecipientAddress;
        @XmlElement(nillable = true)
        protected Boolean dmAmbiguousRecipient;
        @XmlElement(required = true, nillable = true)
        protected String dmSenderOrgUnit;
        @XmlElement(required = true, nillable = true)
        protected BigInteger dmSenderOrgUnitNum;
        @XmlElement(required = true, nillable = true)
        protected String dbIDRecipient;
        @XmlElement(required = true, nillable = true)
        protected String dmRecipientOrgUnit;
        @XmlElement(required = true, nillable = true)
        protected BigInteger dmRecipientOrgUnitNum;
        @XmlElement(required = true, nillable = true)
        protected String dmToHands;
        @XmlElement(required = true, nillable = true)
        protected String dmAnnotation;
        @XmlElement(required = true, nillable = true)
        protected String dmRecipientRefNumber;
        @XmlElement(required = true, nillable = true)
        protected String dmSenderRefNumber;
        @XmlElement(required = true, nillable = true)
        protected String dmRecipientIdent;
        @XmlElement(required = true, nillable = true)
        protected String dmSenderIdent;
        @XmlElement(required = true, nillable = true)
        protected BigInteger dmLegalTitleLaw;
        @XmlElement(required = true, nillable = true)
        protected BigInteger dmLegalTitleYear;
        @XmlElement(required = true, nillable = true)
        protected String dmLegalTitleSect;
        @XmlElement(required = true, nillable = true)
        protected String dmLegalTitlePar;
        @XmlElement(required = true, nillable = true)
        protected String dmLegalTitlePoint;
        @XmlElement(required = true, type = Boolean.class, nillable = true)
        protected Boolean dmPersonalDelivery;
        @XmlElement(required = true, type = Boolean.class, nillable = true)
        protected Boolean dmAllowSubstDelivery;

        /**
         * Gets the value of the dmID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmID() {
            return dmID;
        }

        /**
         * Sets the value of the dmID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmID(String value) {
            this.dmID = value;
        }

        /**
         * Gets the value of the dbIDSender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbIDSender() {
            return dbIDSender;
        }

        /**
         * Sets the value of the dbIDSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbIDSender(String value) {
            this.dbIDSender = value;
        }

        /**
         * Gets the value of the dmSender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmSender() {
            return dmSender;
        }

        /**
         * Sets the value of the dmSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmSender(String value) {
            this.dmSender = value;
        }

        /**
         * Gets the value of the dmSenderAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmSenderAddress() {
            return dmSenderAddress;
        }

        /**
         * Sets the value of the dmSenderAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmSenderAddress(String value) {
            this.dmSenderAddress = value;
        }

        /**
         * Gets the value of the dmSenderType property.
         * 
         */
        public int getDmSenderType() {
            return dmSenderType;
        }

        /**
         * Sets the value of the dmSenderType property.
         * 
         */
        public void setDmSenderType(int value) {
            this.dmSenderType = value;
        }

        /**
         * Gets the value of the dmRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmRecipient() {
            return dmRecipient;
        }

        /**
         * Sets the value of the dmRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmRecipient(String value) {
            this.dmRecipient = value;
        }

        /**
         * Gets the value of the dmRecipientAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmRecipientAddress() {
            return dmRecipientAddress;
        }

        /**
         * Sets the value of the dmRecipientAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmRecipientAddress(String value) {
            this.dmRecipientAddress = value;
        }

        /**
         * Gets the value of the dmAmbiguousRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDmAmbiguousRecipient() {
            return dmAmbiguousRecipient;
        }

        /**
         * Sets the value of the dmAmbiguousRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDmAmbiguousRecipient(Boolean value) {
            this.dmAmbiguousRecipient = value;
        }

        /**
         * Gets the value of the dmSenderOrgUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmSenderOrgUnit() {
            return dmSenderOrgUnit;
        }

        /**
         * Sets the value of the dmSenderOrgUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmSenderOrgUnit(String value) {
            this.dmSenderOrgUnit = value;
        }

        /**
         * Gets the value of the dmSenderOrgUnitNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDmSenderOrgUnitNum() {
            return dmSenderOrgUnitNum;
        }

        /**
         * Sets the value of the dmSenderOrgUnitNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDmSenderOrgUnitNum(BigInteger value) {
            this.dmSenderOrgUnitNum = value;
        }

        /**
         * Gets the value of the dbIDRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbIDRecipient() {
            return dbIDRecipient;
        }

        /**
         * Sets the value of the dbIDRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbIDRecipient(String value) {
            this.dbIDRecipient = value;
        }

        /**
         * Gets the value of the dmRecipientOrgUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmRecipientOrgUnit() {
            return dmRecipientOrgUnit;
        }

        /**
         * Sets the value of the dmRecipientOrgUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmRecipientOrgUnit(String value) {
            this.dmRecipientOrgUnit = value;
        }

        /**
         * Gets the value of the dmRecipientOrgUnitNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDmRecipientOrgUnitNum() {
            return dmRecipientOrgUnitNum;
        }

        /**
         * Sets the value of the dmRecipientOrgUnitNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDmRecipientOrgUnitNum(BigInteger value) {
            this.dmRecipientOrgUnitNum = value;
        }

        /**
         * Gets the value of the dmToHands property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmToHands() {
            return dmToHands;
        }

        /**
         * Sets the value of the dmToHands property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmToHands(String value) {
            this.dmToHands = value;
        }

        /**
         * Gets the value of the dmAnnotation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmAnnotation() {
            return dmAnnotation;
        }

        /**
         * Sets the value of the dmAnnotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmAnnotation(String value) {
            this.dmAnnotation = value;
        }

        /**
         * Gets the value of the dmRecipientRefNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmRecipientRefNumber() {
            return dmRecipientRefNumber;
        }

        /**
         * Sets the value of the dmRecipientRefNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmRecipientRefNumber(String value) {
            this.dmRecipientRefNumber = value;
        }

        /**
         * Gets the value of the dmSenderRefNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmSenderRefNumber() {
            return dmSenderRefNumber;
        }

        /**
         * Sets the value of the dmSenderRefNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmSenderRefNumber(String value) {
            this.dmSenderRefNumber = value;
        }

        /**
         * Gets the value of the dmRecipientIdent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmRecipientIdent() {
            return dmRecipientIdent;
        }

        /**
         * Sets the value of the dmRecipientIdent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmRecipientIdent(String value) {
            this.dmRecipientIdent = value;
        }

        /**
         * Gets the value of the dmSenderIdent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmSenderIdent() {
            return dmSenderIdent;
        }

        /**
         * Sets the value of the dmSenderIdent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmSenderIdent(String value) {
            this.dmSenderIdent = value;
        }

        /**
         * Gets the value of the dmLegalTitleLaw property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDmLegalTitleLaw() {
            return dmLegalTitleLaw;
        }

        /**
         * Sets the value of the dmLegalTitleLaw property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDmLegalTitleLaw(BigInteger value) {
            this.dmLegalTitleLaw = value;
        }

        /**
         * Gets the value of the dmLegalTitleYear property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDmLegalTitleYear() {
            return dmLegalTitleYear;
        }

        /**
         * Sets the value of the dmLegalTitleYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDmLegalTitleYear(BigInteger value) {
            this.dmLegalTitleYear = value;
        }

        /**
         * Gets the value of the dmLegalTitleSect property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmLegalTitleSect() {
            return dmLegalTitleSect;
        }

        /**
         * Sets the value of the dmLegalTitleSect property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmLegalTitleSect(String value) {
            this.dmLegalTitleSect = value;
        }

        /**
         * Gets the value of the dmLegalTitlePar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmLegalTitlePar() {
            return dmLegalTitlePar;
        }

        /**
         * Sets the value of the dmLegalTitlePar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmLegalTitlePar(String value) {
            this.dmLegalTitlePar = value;
        }

        /**
         * Gets the value of the dmLegalTitlePoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmLegalTitlePoint() {
            return dmLegalTitlePoint;
        }

        /**
         * Sets the value of the dmLegalTitlePoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmLegalTitlePoint(String value) {
            this.dmLegalTitlePoint = value;
        }

        /**
         * Gets the value of the dmPersonalDelivery property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDmPersonalDelivery() {
            return dmPersonalDelivery;
        }

        /**
         * Sets the value of the dmPersonalDelivery property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDmPersonalDelivery(Boolean value) {
            this.dmPersonalDelivery = value;
        }

        /**
         * Gets the value of the dmAllowSubstDelivery property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDmAllowSubstDelivery() {
            return dmAllowSubstDelivery;
        }

        /**
         * Sets the value of the dmAllowSubstDelivery property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDmAllowSubstDelivery(Boolean value) {
            this.dmAllowSubstDelivery = value;
        }

    }

}
