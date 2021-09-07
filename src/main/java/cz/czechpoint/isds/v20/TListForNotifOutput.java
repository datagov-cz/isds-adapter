
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tListForNotifOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tListForNotifOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ntfRecords" type="{http://isds.czechpoint.cz/v20}tNtfRecordsArray" minOccurs="0"/&gt;
 *         &lt;element name="ntfListContinues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "tListForNotifOutput", propOrder = {
    "ntfRecords",
    "ntfListContinues",
    "dmStatus"
})
public class TListForNotifOutput {

    @XmlElementRef(name = "ntfRecords", namespace = "http://isds.czechpoint.cz/v20", type = JAXBElement.class, required = false)
    protected JAXBElement<TNtfRecordsArray> ntfRecords;
    protected Boolean ntfListContinues;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the ntfRecords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TNtfRecordsArray }{@code >}
     *     
     */
    public JAXBElement<TNtfRecordsArray> getNtfRecords() {
        return ntfRecords;
    }

    /**
     * Sets the value of the ntfRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TNtfRecordsArray }{@code >}
     *     
     */
    public void setNtfRecords(JAXBElement<TNtfRecordsArray> value) {
        this.ntfRecords = value;
    }

    /**
     * Gets the value of the ntfListContinues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtfListContinues() {
        return ntfListContinues;
    }

    /**
     * Sets the value of the ntfListContinues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNtfListContinues(Boolean value) {
        this.ntfListContinues = value;
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
