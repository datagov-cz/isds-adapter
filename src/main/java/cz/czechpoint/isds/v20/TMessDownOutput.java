
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMessDownOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessDownOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmReturnedMessage" type="{http://isds.czechpoint.cz/v20}tReturnedMessage" minOccurs="0"/&gt;
 *         &lt;element name="dmStatus" type="{http://isds.czechpoint.cz/v20}tStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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

    @XmlElementRef(name = "dmReturnedMessage", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<TReturnedMessage> dmReturnedMessage;
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmReturnedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TReturnedMessage }{@code >}
     *     
     */
    public JAXBElement<TReturnedMessage> getDmReturnedMessage() {
        return dmReturnedMessage;
    }

    /**
     * Sets the value of the dmReturnedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TReturnedMessage }{@code >}
     *     
     */
    public void setDmReturnedMessage(JAXBElement<TReturnedMessage> value) {
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
