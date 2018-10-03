
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tAuthenticateMessageOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAuthenticateMessageOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmAuthResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "tAuthenticateMessageOutput", propOrder = {
    "dmAuthResult",
    "dmStatus"
})
public class TAuthenticateMessageOutput {

    @XmlElement(nillable = true)
    protected Boolean dmAuthResult;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmAuthResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmAuthResult() {
        return dmAuthResult;
    }

    /**
     * Sets the value of the dmAuthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDmAuthResult(Boolean value) {
        this.dmAuthResult = value;
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
