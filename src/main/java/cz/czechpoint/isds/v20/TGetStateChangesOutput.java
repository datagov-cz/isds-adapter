
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tGetStateChangesOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tGetStateChangesOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmRecords" type="{http://isds.czechpoint.cz/v20}tStateChangesArray" minOccurs="0"/>
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
@XmlType(name = "tGetStateChangesOutput", propOrder = {
    "dmRecords",
    "dmStatus"
})
public class TGetStateChangesOutput {

    @XmlElement(nillable = true)
    protected TStateChangesArray dmRecords;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmRecords property.
     * 
     * @return
     *     possible object is
     *     {@link TStateChangesArray }
     *     
     */
    public TStateChangesArray getDmRecords() {
        return dmRecords;
    }

    /**
     * Sets the value of the dmRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStateChangesArray }
     *     
     */
    public void setDmRecords(TStateChangesArray value) {
        this.dmRecords = value;
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
