
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tAuthenticateMessageOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAuthenticateMessageOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmAuthResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "tAuthenticateMessageOutput", propOrder = {
    "dmAuthResult",
    "dmStatus"
})
public class TAuthenticateMessageOutput {

    @XmlElementRef(name = "dmAuthResult", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dmAuthResult;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmAuthResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDmAuthResult() {
        return dmAuthResult;
    }

    /**
     * Sets the value of the dmAuthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDmAuthResult(JAXBElement<Boolean> value) {
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
