
package cz.czechpoint.isds.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tResignDocOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tResignDocOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmResultDoc" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="dmValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dmStatus" type="{http://isds.czechpoint.cz/v20}tStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResignDocOutput", propOrder = {
    "dmResultDoc",
    "dmValidTo",
    "dmStatus"
})
public class TResignDocOutput {

    @XmlElement(required = true, nillable = true)
    protected byte[] dmResultDoc;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dmValidTo;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmResultDoc property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDmResultDoc() {
        return dmResultDoc;
    }

    /**
     * Sets the value of the dmResultDoc property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDmResultDoc(byte[] value) {
        this.dmResultDoc = value;
    }

    /**
     * Gets the value of the dmValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDmValidTo() {
        return dmValidTo;
    }

    /**
     * Sets the value of the dmValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDmValidTo(XMLGregorianCalendar value) {
        this.dmValidTo = value;
    }

    /**
     * Gets the value of the dmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TStatus }
     *     
     */
    public TStatus getDmStatus() {
        return dmStatus;
    }

    /**
     * Sets the value of the dmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStatus }
     *     
     */
    public void setDmStatus(TStatus value) {
        this.dmStatus = value;
    }

}
