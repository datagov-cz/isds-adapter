
package cz.czechpoint.isds.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tListForNotifInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tListForNotifInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ntfFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ntfScope" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tListForNotifInput", propOrder = {
    "ntfFromTime",
    "ntfScope"
})
public class TListForNotifInput {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ntfFromTime;
    @XmlElement(required = true)
    protected String ntfScope;

    /**
     * Gets the value of the ntfFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNtfFromTime() {
        return ntfFromTime;
    }

    /**
     * Sets the value of the ntfFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNtfFromTime(XMLGregorianCalendar value) {
        this.ntfFromTime = value;
    }

    /**
     * Gets the value of the ntfScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfScope() {
        return ntfScope;
    }

    /**
     * Sets the value of the ntfScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtfScope(String value) {
        this.ntfScope = value;
    }

}
