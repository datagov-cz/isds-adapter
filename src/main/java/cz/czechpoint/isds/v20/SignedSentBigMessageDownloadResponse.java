
package cz.czechpoint.isds.v20;

import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="dmSignature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "dmSignature",
    "dmStatus"
})
@XmlRootElement(name = "SignedSentBigMessageDownloadResponse")
public class SignedSentBigMessageDownloadResponse {

    @XmlMimeType("application/octet-stream")
    protected DataHandler dmSignature;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmSignature property.
     *
     * @return
     *     possible object is
     *     {@link DataHandler }
     *
     */
    public DataHandler getDmSignature() {
        return dmSignature;
    }

    /**
     * Sets the value of the dmSignature property.
     *
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *
     */
    public void setDmSignature(DataHandler value) {
        this.dmSignature = value;
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