
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * typ pro WS CreateMessage na vstupu
 * 
 * <p>Java class for tMessageEnvelopeSub complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessageEnvelopeSub"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://isds.czechpoint.cz/v20}gMessageEnvelopeSub"/&gt;
 *         &lt;element name="dmOVM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dmPublishOwnID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dmType" type="{http://isds.czechpoint.cz/v20}tDmType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMessageEnvelopeSub", propOrder = {
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
@XmlSeeAlso({
    cz.czechpoint.isds.v20.TMessageCreateInput.DmEnvelope.class
})
public class TMessageEnvelopeSub {

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
    @XmlElementRef(name = "dmOVM", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dmOVM;
    @XmlElementRef(name = "dmPublishOwnID", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dmPublishOwnID;
    @XmlAttribute(name = "dmType")
    protected String dmType;

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
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDmPublishOwnID() {
        return dmPublishOwnID;
    }

    /**
     * Sets the value of the dmPublishOwnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDmPublishOwnID(JAXBElement<Boolean> value) {
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

}
