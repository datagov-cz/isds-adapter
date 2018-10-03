
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDeliveryMessageOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDeliveryMessageOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmDelivery" type="{http://isds.czechpoint.cz/v20}tDelivery" minOccurs="0"/>
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
@XmlType(name = "tDeliveryMessageOutput", propOrder = {
    "dmDelivery",
    "dmStatus"
})
public class TDeliveryMessageOutput {

    @XmlElement(nillable = true)
    protected TDelivery dmDelivery;
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link TDelivery }
     *     
     */
    public TDelivery getDmDelivery() {
        return dmDelivery;
    }

    /**
     * Sets the value of the dmDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDelivery }
     *     
     */
    public void setDmDelivery(TDelivery value) {
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
