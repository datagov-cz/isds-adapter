
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMessageCreateInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessageCreateInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmEnvelope"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://isds.czechpoint.cz/v20}tMessageEnvelopeSub"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmFiles" type="{http://isds.czechpoint.cz/v20}tFilesArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMessageCreateInput", propOrder = {
    "dmEnvelope",
    "dmFiles"
})
public class TMessageCreateInput {

    @XmlElement(required = true)
    protected TMessageCreateInput.DmEnvelope dmEnvelope;
    @XmlElement(required = true)
    protected TFilesArray dmFiles;

    /**
     * Gets the value of the dmEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link TMessageCreateInput.DmEnvelope }
     *     
     */
    public TMessageCreateInput.DmEnvelope getDmEnvelope() {
        return dmEnvelope;
    }

    /**
     * Sets the value of the dmEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMessageCreateInput.DmEnvelope }
     *     
     */
    public void setDmEnvelope(TMessageCreateInput.DmEnvelope value) {
        this.dmEnvelope = value;
    }

    /**
     * Gets the value of the dmFiles property.
     * 
     * @return
     *     possible object is
     *     {@link TFilesArray }
     *     
     */
    public TFilesArray getDmFiles() {
        return dmFiles;
    }

    /**
     * Sets the value of the dmFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFilesArray }
     *     
     */
    public void setDmFiles(TFilesArray value) {
        this.dmFiles = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://isds.czechpoint.cz/v20}tMessageEnvelopeSub"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DmEnvelope
        extends TMessageEnvelopeSub
    {


    }

}
