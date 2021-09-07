
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tRecipients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRecipients"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dbIDRecipient" type="{http://isds.czechpoint.cz/v20}tIdDb"/&gt;
 *         &lt;element name="dmRecipientOrgUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dmRecipientOrgUnitNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dmToHands" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRecipients", propOrder = {
    "dbIDRecipient",
    "dmRecipientOrgUnit",
    "dmRecipientOrgUnitNum",
    "dmToHands"
})
public class TRecipients {

    @XmlElement(required = true)
    protected String dbIDRecipient;
    @XmlElementRef(name = "dmRecipientOrgUnit", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmRecipientOrgUnit;
    @XmlElementRef(name = "dmRecipientOrgUnitNum", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> dmRecipientOrgUnitNum;
    @XmlElement(required = true, nillable = true)
    protected String dmToHands;

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

}
