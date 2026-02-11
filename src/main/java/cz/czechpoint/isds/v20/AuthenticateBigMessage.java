
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
 *         &lt;element name="dmMessage" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
    "dmMessage"
})
@XmlRootElement(name = "AuthenticateBigMessage")
public class AuthenticateBigMessage {

    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler dmMessage;

    /**
     * Gets the value of the dmMessage property.
     *
     * @return
     *     possible object is
     *     {@link DataHandler }
     *
     */
    public DataHandler getDmMessage() {
        return dmMessage;
    }

    /**
     * Sets the value of the dmMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *
     */
    public void setDmMessage(DataHandler value) {
        this.dmMessage = value;
    }

}