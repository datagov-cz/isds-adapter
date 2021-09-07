
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMultipleMessageCreateInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMultipleMessageCreateInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmRecipients" type="{http://isds.czechpoint.cz/v20}tMultipleMessageRecipients"/&gt;
 *         &lt;element name="dmEnvelope"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://isds.czechpoint.cz/v20}tMultipleMessageEnvelopeSub"&gt;
 *                 &lt;attribute name="dmType" type="{http://isds.czechpoint.cz/v20}tDmType" /&gt;
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
@XmlType(name = "tMultipleMessageCreateInput", propOrder = {
    "dmRecipients",
    "dmEnvelope",
    "dmFiles"
})
public class TMultipleMessageCreateInput {

    @XmlElement(required = true)
    protected TMultipleMessageRecipients dmRecipients;
    @XmlElement(required = true)
    protected TMultipleMessageCreateInput.DmEnvelope dmEnvelope;
    @XmlElement(required = true)
    protected TFilesArray dmFiles;

    /**
     * Gets the value of the dmRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link TMultipleMessageRecipients }
     *     
     */
    public TMultipleMessageRecipients getDmRecipients() {
        return dmRecipients;
    }

    /**
     * Sets the value of the dmRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMultipleMessageRecipients }
     *     
     */
    public void setDmRecipients(TMultipleMessageRecipients value) {
        this.dmRecipients = value;
    }

    /**
     * Gets the value of the dmEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link TMultipleMessageCreateInput.DmEnvelope }
     *     
     */
    public TMultipleMessageCreateInput.DmEnvelope getDmEnvelope() {
        return dmEnvelope;
    }

    /**
     * Sets the value of the dmEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMultipleMessageCreateInput.DmEnvelope }
     *     
     */
    public void setDmEnvelope(TMultipleMessageCreateInput.DmEnvelope value) {
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
     *     &lt;extension base="{http://isds.czechpoint.cz/v20}tMultipleMessageEnvelopeSub"&gt;
     *       &lt;attribute name="dmType" type="{http://isds.czechpoint.cz/v20}tDmType" /&gt;
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
        extends TMultipleMessageEnvelopeSub
    {

        @XmlAttribute(name = "dmType")
        protected String dmType;

        /**
         * Gets the value of the dmType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmType() {
            return dmType;
        }

        /**
         * Sets the value of the dmType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmType(String value) {
            this.dmType = value;
        }

    }

}
