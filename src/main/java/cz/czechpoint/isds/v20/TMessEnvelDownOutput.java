
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMessEnvelDownOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessEnvelDownOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmReturnedMessageEnvelope" type="{http://isds.czechpoint.cz/v20}tReturnedMessageEnvelope" minOccurs="0"/>
 *         &lt;element name="dmStatus" type="{http://isds.czechpoint.cz/v20}tStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(nillable = true)
    protected TReturnedMessageEnvelope dmReturnedMessageEnvelope;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmReturnedMessageEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link TReturnedMessageEnvelope }
     *     
     */
    public TReturnedMessageEnvelope getDmReturnedMessageEnvelope() {
        return dmReturnedMessageEnvelope;
    }

    /**
     * Sets the value of the dmReturnedMessageEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link TReturnedMessageEnvelope }
     *     
     */
    public void setDmReturnedMessageEnvelope(TReturnedMessageEnvelope value) {
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
