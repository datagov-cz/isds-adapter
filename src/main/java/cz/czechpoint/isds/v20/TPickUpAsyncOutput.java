
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPickUpAsyncOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPickUpAsyncOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asyncReqType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="asyncResponse" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
@XmlType(name = "tPickUpAsyncOutput", propOrder = {
    "asyncReqType",
    "asyncResponse",
    "dmStatus"
})
public class TPickUpAsyncOutput {

    protected String asyncReqType;
    protected byte[] asyncResponse;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the asyncReqType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncReqType() {
        return asyncReqType;
    }

    /**
     * Sets the value of the asyncReqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncReqType(String value) {
        this.asyncReqType = value;
    }

    /**
     * Gets the value of the asyncResponse property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAsyncResponse() {
        return asyncResponse;
    }

    /**
     * Sets the value of the asyncResponse property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAsyncResponse(byte[] value) {
        this.asyncResponse = value;
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
