
package cz.czechpoint.isds.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="dmEncodedContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="dmXMLContent">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
        this.dmEncodedContent = ((byte[]) value);
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class DmXMLContent {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
