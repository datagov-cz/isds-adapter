
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMultipleMessageCreateOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMultipleMessageCreateOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmMultipleStatus" type="{http://isds.czechpoint.cz/v20}tMultipleStatus" minOccurs="0"/>
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
@XmlType(name = "tMultipleMessageCreateOutput", propOrder = {
    "dmMultipleStatus",
    "dmStatus"
})
public class TMultipleMessageCreateOutput {

    @XmlElement(nillable = true)
    protected TMultipleStatus dmMultipleStatus;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmMultipleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TMultipleStatus }
     *     
     */
    public TMultipleStatus getDmMultipleStatus() {
        return dmMultipleStatus;
    }

    /**
     * Sets the value of the dmMultipleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMultipleStatus }
     *     
     */
    public void setDmMultipleStatus(TMultipleStatus value) {
        this.dmMultipleStatus = value;
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
