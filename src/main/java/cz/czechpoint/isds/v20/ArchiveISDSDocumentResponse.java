
package cz.czechpoint.isds.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmResultDoc" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="nextStampTo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
@XmlType(name = "", propOrder = {
    "dmResultDoc",
    "nextStampTo",
    "dmStatus"
})
@XmlRootElement(name = "ArchiveISDSDocumentResponse")
public class ArchiveISDSDocumentResponse {

    @XmlElement(required = true, nillable = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler dmResultDoc;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextStampTo;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmResultDoc property.
     *
     * @return
     *     possible object is
     *     {@link DataHandler }
     *
     */
    public DataHandler getDmResultDoc() {
        return dmResultDoc;
    }

    /**
     * Sets the value of the dmResultDoc property.
     *
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *
     */
    public void setDmResultDoc(DataHandler value) {
        this.dmResultDoc = value;
    }

    /**
     * Gets the value of the nextStampTo property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getNextStampTo() {
        return nextStampTo;
    }

    /**
     * Sets the value of the nextStampTo property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setNextStampTo(XMLGregorianCalendar value) {
        this.nextStampTo = value;
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