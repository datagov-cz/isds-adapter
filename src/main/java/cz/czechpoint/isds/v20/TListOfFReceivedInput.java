
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tListOfFReceivedInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tListOfFReceivedInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dmToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dmRecipientOrgUnitNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dmStatusFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dmOffset" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dmLimit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tListOfFReceivedInput", propOrder = {
    "dmFromTime",
    "dmToTime",
    "dmRecipientOrgUnitNum",
    "dmStatusFilter",
    "dmOffset",
    "dmLimit"
})
public class TListOfFReceivedInput {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmFromTime;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmToTime;
    @XmlElement(required = true, nillable = true)
    protected BigInteger dmRecipientOrgUnitNum;
    @XmlElement(required = true)
    protected String dmStatusFilter;
    @XmlElement(required = true, nillable = true)
    protected BigInteger dmOffset;
    @XmlElement(required = true, nillable = true)
    protected BigInteger dmLimit;

    /**
     * Gets the value of the dmFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDmFromTime() {
        return dmFromTime;
    }

    /**
     * Sets the value of the dmFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDmFromTime(XMLGregorianCalendar value) {
        this.dmFromTime = value;
    }

    /**
     * Gets the value of the dmToTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDmToTime() {
        return dmToTime;
    }

    /**
     * Sets the value of the dmToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDmToTime(XMLGregorianCalendar value) {
        this.dmToTime = value;
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
     * Gets the value of the dmStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmStatusFilter() {
        return dmStatusFilter;
    }

    /**
     * Sets the value of the dmStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmStatusFilter(String value) {
        this.dmStatusFilter = value;
    }

    /**
     * Gets the value of the dmOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDmOffset() {
        return dmOffset;
    }

    /**
     * Sets the value of the dmOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDmOffset(BigInteger value) {
        this.dmOffset = value;
    }

    /**
     * Gets the value of the dmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDmLimit() {
        return dmLimit;
    }

    /**
     * Sets the value of the dmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDmLimit(BigInteger value) {
        this.dmLimit = value;
    }

}
