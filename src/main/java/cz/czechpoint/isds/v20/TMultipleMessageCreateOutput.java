
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMultipleMessageCreateOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMultipleMessageCreateOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmMultipleStatus" type="{http://isds.czechpoint.cz/v20}tMultipleStatus" minOccurs="0"/&gt;
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
@XmlType(name = "tMultipleMessageCreateOutput", propOrder = {
    "dmMultipleStatus",
    "dmStatus"
})
public class TMultipleMessageCreateOutput {

    @XmlElementRef(name = "dmMultipleStatus", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<TMultipleStatus> dmMultipleStatus;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmMultipleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TMultipleStatus }{@code >}
     *     
     */
    public JAXBElement<TMultipleStatus> getDmMultipleStatus() {
        return dmMultipleStatus;
    }

    /**
     * Sets the value of the dmMultipleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TMultipleStatus }{@code >}
     *     
     */
    public void setDmMultipleStatus(JAXBElement<TMultipleStatus> value) {
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
