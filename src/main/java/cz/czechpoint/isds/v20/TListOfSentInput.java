
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tListOfSentInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tListOfSentInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="dmToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="dmSenderOrgUnitNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dmStatusFilter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dmOffset" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dmLimit" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tListOfSentInput", propOrder = {
    "dmFromTime",
    "dmToTime",
    "dmSenderOrgUnitNum",
    "dmStatusFilter",
    "dmOffset",
    "dmLimit"
})
public class TListOfSentInput {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmFromTime;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmToTime;
    @XmlElement(required = true, nillable = true)
    protected BigInteger dmSenderOrgUnitNum;
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
