
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for tBigMessEnvelope complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tBigMessEnvelope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmSenderOrgUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dmSenderOrgUnitNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dbIDRecipient" type="{http://isds.czechpoint.cz/v20}tIdDb"/&gt;
 *         &lt;element name="dmRecipientOrgUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dmRecipientOrgUnitNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dmToHands" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dmAnnotation"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmRecipientRefNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmSenderRefNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmRecipientIdent" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmSenderIdent" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmLegalTitleLaw" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dmLegalTitleYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dmLegalTitleSect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dmLegalTitlePar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dmLegalTitlePoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dmPersonalDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dmAllowSubstDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dmOVM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dmPublishOwnID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
 *                 &lt;attribute name="IdLevel" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dmType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBigMessEnvelope", propOrder = {
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
    "dmAllowSubstDelivery",
    "dmOVM",
    "dmPublishOwnID"
})
public class TBigMessEnvelope {

    @XmlElementRef(name = "dmSenderOrgUnit", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmSenderOrgUnit;
    @XmlElementRef(name = "dmSenderOrgUnitNum", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> dmSenderOrgUnitNum;
    @XmlElement(required = true, nillable = true)
    protected String dbIDRecipient;
    @XmlElementRef(name = "dmRecipientOrgUnit", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmRecipientOrgUnit;
    @XmlElementRef(name = "dmRecipientOrgUnitNum", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> dmRecipientOrgUnitNum;
    @XmlElementRef(name = "dmToHands", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmToHands;
    @XmlElement(required = true, nillable = true)
    protected String dmAnnotation;
    @XmlElementRef(name = "dmRecipientRefNumber", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmRecipientRefNumber;
    @XmlElementRef(name = "dmSenderRefNumber", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmSenderRefNumber;
    @XmlElementRef(name = "dmRecipientIdent", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmRecipientIdent;
    @XmlElementRef(name = "dmSenderIdent", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmSenderIdent;
    @XmlElementRef(name = "dmLegalTitleLaw", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> dmLegalTitleLaw;
    @XmlElementRef(name = "dmLegalTitleYear", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> dmLegalTitleYear;
    @XmlElementRef(name = "dmLegalTitleSect", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmLegalTitleSect;
    @XmlElementRef(name = "dmLegalTitlePar", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmLegalTitlePar;
    @XmlElementRef(name = "dmLegalTitlePoint", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmLegalTitlePoint;
    @XmlElementRef(name = "dmPersonalDelivery", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dmPersonalDelivery;
    @XmlElementRef(name = "dmAllowSubstDelivery", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dmAllowSubstDelivery;
    @XmlElementRef(name = "dmOVM", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dmOVM;
    @XmlElementRef(name = "dmPublishOwnID", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<TBigMessEnvelope.DmPublishOwnID> dmPublishOwnID;
    @XmlAttribute(name = "dmType")
    protected String dmType;

    /**
     * Gets the value of the dmSenderOrgUnit property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmSenderOrgUnit() {
        return dmSenderOrgUnit;
    }

    /**
     * Sets the value of the dmSenderOrgUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmSenderOrgUnit(JAXBElement<String> value) {
        this.dmSenderOrgUnit = value;
    }

    /**
     * Gets the value of the dmSenderOrgUnitNum property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     */
    public JAXBElement<BigInteger> getDmSenderOrgUnitNum() {
        return dmSenderOrgUnitNum;
    }

    /**
     * Sets the value of the dmSenderOrgUnitNum property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     */
    public void setDmSenderOrgUnitNum(JAXBElement<BigInteger> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmRecipientOrgUnit() {
        return dmRecipientOrgUnit;
    }

    /**
     * Sets the value of the dmRecipientOrgUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmRecipientOrgUnit(JAXBElement<String> value) {
        this.dmRecipientOrgUnit = value;
    }

    /**
     * Gets the value of the dmRecipientOrgUnitNum property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     */
    public JAXBElement<BigInteger> getDmRecipientOrgUnitNum() {
        return dmRecipientOrgUnitNum;
    }

    /**
     * Sets the value of the dmRecipientOrgUnitNum property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     */
    public void setDmRecipientOrgUnitNum(JAXBElement<BigInteger> value) {
        this.dmRecipientOrgUnitNum = value;
    }

    /**
     * Gets the value of the dmToHands property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmToHands() {
        return dmToHands;
    }

    /**
     * Sets the value of the dmToHands property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmToHands(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmRecipientRefNumber() {
        return dmRecipientRefNumber;
    }

    /**
     * Sets the value of the dmRecipientRefNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmRecipientRefNumber(JAXBElement<String> value) {
        this.dmRecipientRefNumber = value;
    }

    /**
     * Gets the value of the dmSenderRefNumber property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmSenderRefNumber() {
        return dmSenderRefNumber;
    }

    /**
     * Sets the value of the dmSenderRefNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmSenderRefNumber(JAXBElement<String> value) {
        this.dmSenderRefNumber = value;
    }

    /**
     * Gets the value of the dmRecipientIdent property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmRecipientIdent() {
        return dmRecipientIdent;
    }

    /**
     * Sets the value of the dmRecipientIdent property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmRecipientIdent(JAXBElement<String> value) {
        this.dmRecipientIdent = value;
    }

    /**
     * Gets the value of the dmSenderIdent property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmSenderIdent() {
        return dmSenderIdent;
    }

    /**
     * Sets the value of the dmSenderIdent property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmSenderIdent(JAXBElement<String> value) {
        this.dmSenderIdent = value;
    }

    /**
     * Gets the value of the dmLegalTitleLaw property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     */
    public JAXBElement<BigInteger> getDmLegalTitleLaw() {
        return dmLegalTitleLaw;
    }

    /**
     * Sets the value of the dmLegalTitleLaw property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     */
    public void setDmLegalTitleLaw(JAXBElement<BigInteger> value) {
        this.dmLegalTitleLaw = value;
    }

    /**
     * Gets the value of the dmLegalTitleYear property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     */
    public JAXBElement<BigInteger> getDmLegalTitleYear() {
        return dmLegalTitleYear;
    }

    /**
     * Sets the value of the dmLegalTitleYear property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     */
    public void setDmLegalTitleYear(JAXBElement<BigInteger> value) {
        this.dmLegalTitleYear = value;
    }

    /**
     * Gets the value of the dmLegalTitleSect property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmLegalTitleSect() {
        return dmLegalTitleSect;
    }

    /**
     * Sets the value of the dmLegalTitleSect property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmLegalTitleSect(JAXBElement<String> value) {
        this.dmLegalTitleSect = value;
    }

    /**
     * Gets the value of the dmLegalTitlePar property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmLegalTitlePar() {
        return dmLegalTitlePar;
    }

    /**
     * Sets the value of the dmLegalTitlePar property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmLegalTitlePar(JAXBElement<String> value) {
        this.dmLegalTitlePar = value;
    }

    /**
     * Gets the value of the dmLegalTitlePoint property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDmLegalTitlePoint() {
        return dmLegalTitlePoint;
    }

    /**
     * Sets the value of the dmLegalTitlePoint property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDmLegalTitlePoint(JAXBElement<String> value) {
        this.dmLegalTitlePoint = value;
    }

    /**
     * Gets the value of the dmPersonalDelivery property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getDmPersonalDelivery() {
        return dmPersonalDelivery;
    }

    /**
     * Sets the value of the dmPersonalDelivery property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setDmPersonalDelivery(JAXBElement<Boolean> value) {
        this.dmPersonalDelivery = value;
    }

    /**
     * Gets the value of the dmAllowSubstDelivery property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getDmAllowSubstDelivery() {
        return dmAllowSubstDelivery;
    }

    /**
     * Sets the value of the dmAllowSubstDelivery property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setDmAllowSubstDelivery(JAXBElement<Boolean> value) {
        this.dmAllowSubstDelivery = value;
    }

    /**
     * Gets the value of the dmOVM property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getDmOVM() {
        return dmOVM;
    }

    /**
     * Sets the value of the dmOVM property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setDmOVM(JAXBElement<Boolean> value) {
        this.dmOVM = value;
    }

    /**
     * Gets the value of the dmPublishOwnID property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TBigMessEnvelope.DmPublishOwnID }{@code >}
     *
     */
    public JAXBElement<TBigMessEnvelope.DmPublishOwnID> getDmPublishOwnID() {
        return dmPublishOwnID;
    }

    /**
     * Sets the value of the dmPublishOwnID property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TBigMessEnvelope.DmPublishOwnID }{@code >}
     *
     */
    public void setDmPublishOwnID(JAXBElement<TBigMessEnvelope.DmPublishOwnID> value) {
        this.dmPublishOwnID = value;
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
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
     *       &lt;attribute name="IdLevel" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DmPublishOwnID {

        @XmlValue
        protected boolean value;
        @XmlAttribute(name = "IdLevel")
        protected BigInteger idLevel;

        /**
         * Gets the value of the value property.
         *
         */
        public boolean isValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         */
        public void setValue(boolean value) {
            this.value = value;
        }

        /**
         * Gets the value of the idLevel property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getIdLevel() {
            return idLevel;
        }

        /**
         * Sets the value of the idLevel property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setIdLevel(BigInteger value) {
            this.idLevel = value;
        }

    }

}