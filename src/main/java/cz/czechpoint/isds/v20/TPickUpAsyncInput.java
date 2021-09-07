
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPickUpAsyncInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPickUpAsyncInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asyncID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asyncReqType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPickUpAsyncInput", propOrder = {
    "asyncID",
    "asyncReqType"
})
public class TPickUpAsyncInput {

    @XmlElement(required = true)
    protected String asyncID;
    @XmlElement(required = true)
    protected String asyncReqType;

    /**
     * Gets the value of the asyncID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncID() {
        return asyncID;
    }

    /**
     * Sets the value of the asyncID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncID(String value) {
        this.asyncID = value;
    }

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

}
