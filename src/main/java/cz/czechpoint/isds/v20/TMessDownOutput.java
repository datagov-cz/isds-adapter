
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMessDownOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessDownOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmReturnedMessage" type="{http://isds.czechpoint.cz/v20}tReturnedMessage" minOccurs="0"/>
 *         &lt;element name="dmStatus" type="{http://isds.czechpoint.cz/v20}tStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMessDownOutput", propOrder = {
    "dmReturnedMessage",
    "dmStatus"
})
public class TMessDownOutput {

    @XmlElement(nillable = true)
    protected TReturnedMessage dmReturnedMessage;
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmReturnedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link TReturnedMessage }
     *     
     */
    public TReturnedMessage getDmReturnedMessage() {
        return dmReturnedMessage;
    }

    /**
     * Sets the value of the dmReturnedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TReturnedMessage }
     *     
     */
    public void setDmReturnedMessage(TReturnedMessage value) {
        this.dmReturnedMessage = value;
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
