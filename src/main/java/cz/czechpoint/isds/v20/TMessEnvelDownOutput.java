
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMessEnvelDownOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessEnvelDownOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmReturnedMessageEnvelope" type="{http://isds.czechpoint.cz/v20}tReturnedMessageEnvelope" minOccurs="0"/&gt;
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
@XmlType(name = "tMessEnvelDownOutput", propOrder = {
    "dmReturnedMessageEnvelope",
    "dmStatus"
})
public class TMessEnvelDownOutput {

    @XmlElementRef(name = "dmReturnedMessageEnvelope", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<TReturnedMessageEnvelope> dmReturnedMessageEnvelope;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmReturnedMessageEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TReturnedMessageEnvelope }{@code >}
     *     
     */
    public JAXBElement<TReturnedMessageEnvelope> getDmReturnedMessageEnvelope() {
        return dmReturnedMessageEnvelope;
    }

    /**
     * Sets the value of the dmReturnedMessageEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TReturnedMessageEnvelope }{@code >}
     *     
     */
    public void setDmReturnedMessageEnvelope(JAXBElement<TReturnedMessageEnvelope> value) {
        this.dmReturnedMessageEnvelope = value;
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
