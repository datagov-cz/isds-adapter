
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tNtfRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tNtfRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ntfType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dmID" type="{http://isds.czechpoint.cz/v20}tIdDm"/&gt;
 *         &lt;element name="dmPersonalDelivery" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dmDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="dbIDRecipient" type="{http://isds.czechpoint.cz/v20}tIdDb"/&gt;
 *         &lt;element name="dmAnnotation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dbIDSender" type="{http://isds.czechpoint.cz/v20}tIdDb"/&gt;
 *         &lt;element name="dmSender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tNtfRecord", propOrder = {
    "ntfType",
    "dmID",
    "dmPersonalDelivery",
    "dmDeliveryTime",
    "dbIDRecipient",
    "dmAnnotation",
    "dbIDSender",
    "dmSender"
})
public class TNtfRecord {

    @XmlElement(required = true)
    protected BigInteger ntfType;
    @XmlElement(required = true)
    protected String dmID;
    @XmlElement(required = true)
    protected BigInteger dmPersonalDelivery;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmDeliveryTime;
    @XmlElement(required = true)
    protected String dbIDRecipient;
    @XmlElement(required = true)
    protected String dmAnnotation;
    @XmlElement(required = true)
    protected String dbIDSender;
    @XmlElement(required = true)
    protected String dmSender;

    /**
     * Gets the value of the ntfType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNtfType() {
        return ntfType;
    }

    /**
     * Sets the value of the ntfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNtfType(BigInteger value) {
        this.ntfType = value;
    }

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
     * Gets the value of the dmPersonalDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDmPersonalDelivery() {
        return dmPersonalDelivery;
    }

    /**
     * Sets the value of the dmPersonalDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDmPersonalDelivery(BigInteger value) {
        this.dmPersonalDelivery = value;
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

}
