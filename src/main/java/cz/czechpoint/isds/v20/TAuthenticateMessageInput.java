
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tAuthenticateMessageInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAuthenticateMessageInput"&gt;
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
@XmlType(name = "tAuthenticateMessageInput", propOrder = {
    "dmMessage"
})
public class TAuthenticateMessageInput {

    @XmlElement(required = true)
    protected byte[] dmMessage;

    /**
     * Gets the value of the dmMessage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDmMessage() {
        return dmMessage;
    }

    /**
     * Sets the value of the dmMessage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDmMessage(byte[] value) {
        this.dmMessage = value;
    }

}
