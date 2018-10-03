
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tRecipients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRecipients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbIDRecipient" type="{http://isds.czechpoint.cz/v20}tIdDb"/>
 *         &lt;element name="dmRecipientOrgUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dmRecipientOrgUnitNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dmToHands" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    @XmlElement(nillable = true)
    protected String dmRecipientOrgUnit;
    @XmlElement(nillable = true)
    protected BigInteger dmRecipientOrgUnitNum;
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

}
