
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tGetListOfErasedInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tGetListOfErasedInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="dmFromDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *             &lt;element name="dmToDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="dmYear" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *             &lt;element name="dmMonth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="dmMessageType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SENT"/&gt;
 *               &lt;enumeration value="RECEIVED"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmOutFormat"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="XML"/&gt;
 *               &lt;enumeration value="CSV"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGetListOfErasedInput", propOrder = {
    "dmFromDate",
    "dmToDate",
    "dmYear",
    "dmMonth",
    "dmMessageType",
    "dmOutFormat"
})
public class TGetListOfErasedInput {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dmFromDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dmToDate;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dmYear;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dmMonth;
    @XmlElement(required = true)
    protected String dmMessageType;
    @XmlElement(required = true)
    protected String dmOutFormat;

    /**
     * Gets the value of the dmFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDmFromDate() {
        return dmFromDate;
    }

    /**
     * Sets the value of the dmFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDmFromDate(XMLGregorianCalendar value) {
        this.dmFromDate = value;
    }

    /**
     * Gets the value of the dmToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDmToDate() {
        return dmToDate;
    }

    /**
     * Sets the value of the dmToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDmToDate(XMLGregorianCalendar value) {
        this.dmToDate = value;
    }

    /**
     * Gets the value of the dmYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDmYear() {
        return dmYear;
    }

    /**
     * Sets the value of the dmYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDmYear(BigInteger value) {
        this.dmYear = value;
    }

    /**
     * Gets the value of the dmMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDmMonth() {
        return dmMonth;
    }

    /**
     * Sets the value of the dmMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDmMonth(BigInteger value) {
        this.dmMonth = value;
    }

    /**
     * Gets the value of the dmMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmMessageType() {
        return dmMessageType;
    }

    /**
     * Sets the value of the dmMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmMessageType(String value) {
        this.dmMessageType = value;
    }

    /**
     * Gets the value of the dmOutFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmOutFormat() {
        return dmOutFormat;
    }

    /**
     * Sets the value of the dmOutFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmOutFormat(String value) {
        this.dmOutFormat = value;
    }

}
