
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for tFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="dmEncodedContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="dmXMLContent"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='skip'/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFile", propOrder = {
    "dmEncodedContent",
    "dmXMLContent"
})
@XmlSeeAlso({
    cz.czechpoint.isds.v20.TFilesArray.DmFile.class
})
public class TFile {

    protected byte[] dmEncodedContent;
    protected TFile.DmXMLContent dmXMLContent;

    /**
     * Gets the value of the dmEncodedContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDmEncodedContent() {
        return dmEncodedContent;
    }

    /**
     * Sets the value of the dmEncodedContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDmEncodedContent(byte[] value) {
        this.dmEncodedContent = value;
    }

    /**
     * Gets the value of the dmXMLContent property.
     * 
     * @return
     *     possible object is
     *     {@link TFile.DmXMLContent }
     *     
     */
    public TFile.DmXMLContent getDmXMLContent() {
        return dmXMLContent;
    }

    /**
     * Sets the value of the dmXMLContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFile.DmXMLContent }
     *     
     */
    public void setDmXMLContent(TFile.DmXMLContent value) {
        this.dmXMLContent = value;
    }


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
     *         &lt;any processContents='skip'/&gt;
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
        "any"
    })
    public static class DmXMLContent {

        @XmlAnyElement
        protected Element any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }

}
