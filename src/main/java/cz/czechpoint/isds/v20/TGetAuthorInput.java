
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tGetAuthorInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tGetAuthorInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmID" type="{http://isds.czechpoint.cz/v20}tIdDm"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGetAuthorInput", propOrder = {
    "dmID"
})
public class TGetAuthorInput {

    @XmlElement(required = true)
    protected String dmID;

    /**
     * Gets the value of the dmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmID() {
        return dmID;
    }

    /**
     * Sets the value of the dmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmID(String value) {
        this.dmID = value;
    }

}
