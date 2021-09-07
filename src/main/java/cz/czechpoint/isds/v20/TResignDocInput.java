
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tResignDocInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tResignDocInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmDoc" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResignDocInput", propOrder = {
    "dmDoc"
})
public class TResignDocInput {

    @XmlElement(required = true)
    protected byte[] dmDoc;

    /**
     * Gets the value of the dmDoc property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDmDoc() {
        return dmDoc;
    }

    /**
     * Sets the value of the dmDoc property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDmDoc(byte[] value) {
        this.dmDoc = value;
    }

}
