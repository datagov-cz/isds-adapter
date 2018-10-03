
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://isds.czechpoint.cz/v20}dmEvent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEvent", propOrder = {
    "dmEventTime",
    "dmEventDescr"
})
public class TEvent {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmEventTime;
    @XmlElement(required = true, nillable = true)
    protected String dmEventDescr;

    /**
     * Gets the value of the dmEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDmEventTime() {
        return dmEventTime;
    }

    /**
     * Sets the value of the dmEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDmEventTime(XMLGregorianCalendar value) {
        this.dmEventTime = value;
    }

    /**
     * Gets the value of the dmEventDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmEventDescr() {
        return dmEventDescr;
    }

    /**
     * Sets the value of the dmEventDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmEventDescr(String value) {
        this.dmEventDescr = value;
    }

}
