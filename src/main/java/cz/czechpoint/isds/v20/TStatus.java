
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dmStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStatus", propOrder = {
    "dmStatusCode",
    "dmStatusMessage"
})
public class TStatus {

    @XmlElement(required = true)
    protected String dmStatusCode;
    @XmlElement(required = true)
    protected String dmStatusMessage;

    /**
     * Gets the value of the dmStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmStatusCode() {
        return dmStatusCode;
    }

    /**
     * Sets the value of the dmStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmStatusCode(String value) {
        this.dmStatusCode = value;
    }

    /**
     * Gets the value of the dmStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmStatusMessage() {
        return dmStatusMessage;
    }

    /**
     * Sets the value of the dmStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmStatusMessage(String value) {
        this.dmStatusMessage = value;
    }

}
