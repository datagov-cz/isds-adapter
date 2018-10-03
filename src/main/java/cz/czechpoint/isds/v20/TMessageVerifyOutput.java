
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMessageVerifyOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessageVerifyOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmHash" type="{http://isds.czechpoint.cz/v20}tHash" minOccurs="0"/>
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
@XmlType(name = "tMessageVerifyOutput", propOrder = {
    "dmHash",
    "dmStatus"
})
public class TMessageVerifyOutput {

    protected THash dmHash;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmHash property.
     * 
     * @return
     *     possible object is
     *     {@link THash }
     *     
     */
    public THash getDmHash() {
        return dmHash;
    }

    /**
     * Sets the value of the dmHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link THash }
     *     
     */
    public void setDmHash(THash value) {
        this.dmHash = value;
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
