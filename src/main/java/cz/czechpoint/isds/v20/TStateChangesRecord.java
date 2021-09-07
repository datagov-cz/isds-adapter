
package cz.czechpoint.isds.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tStateChangesRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tStateChangesRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmID" type="{http://isds.czechpoint.cz/v20}tIdDm"/&gt;
 *         &lt;element name="dmEventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="dmMessageStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStateChangesRecord", propOrder = {
    "dmID",
    "dmEventTime",
    "dmMessageStatus"
})
public class TStateChangesRecord {

    @XmlElement(required = true)
    protected String dmID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmEventTime;
    protected int dmMessageStatus;

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
     * Gets the value of the dmMessageStatus property.
     * 
     */
    public int getDmMessageStatus() {
        return dmMessageStatus;
    }

    /**
     * Sets the value of the dmMessageStatus property.
     * 
     */
    public void setDmMessageStatus(int value) {
        this.dmMessageStatus = value;
    }

}
