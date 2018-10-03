
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tAuthenticateMessageInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAuthenticateMessageInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmMessage" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
        this.dmMessage = ((byte[]) value);
    }

}
