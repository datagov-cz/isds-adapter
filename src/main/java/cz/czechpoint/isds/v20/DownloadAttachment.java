
package cz.czechpoint.isds.v20;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dmID",
    "attNum"
})
@XmlRootElement(name = "DownloadAttachment")
public class DownloadAttachment {

    @XmlElement(required = true)
    protected String dmID;
    @XmlElement(required = true)
    protected BigInteger attNum;

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

    /**
     * Gets the value of the attNum property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getAttNum() {
        return attNum;
    }

    /**
     * Sets the value of the attNum property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setAttNum(BigInteger value) {
        this.attNum = value;
    }

}