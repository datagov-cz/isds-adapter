
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDeliveryMessageOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDeliveryMessageOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmDelivery" type="{http://isds.czechpoint.cz/v20}tDelivery" minOccurs="0"/&gt;
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
@XmlType(name = "tDeliveryMessageOutput", propOrder = {
    "dmDelivery",
    "dmStatus"
})
public class TDeliveryMessageOutput {

    @XmlElementRef(name = "dmDelivery", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<TDelivery> dmDelivery;
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TDelivery }{@code >}
     *     
     */
    public JAXBElement<TDelivery> getDmDelivery() {
        return dmDelivery;
    }

    /**
     * Sets the value of the dmDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TDelivery }{@code >}
     *     
     */
    public void setDmDelivery(JAXBElement<TDelivery> value) {
        this.dmDelivery = value;
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
