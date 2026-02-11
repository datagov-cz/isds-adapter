
package cz.czechpoint.isds.v20;

import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMimeType;
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
 *         &lt;element name="dmFile"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dmEncodedContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="dmMimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="dmFileDescr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "dmFile"
})
@XmlRootElement(name = "UploadAttachment")
public class UploadAttachment {

    @XmlElement(required = true)
    protected UploadAttachment.DmFile dmFile;

    /**
     * Gets the value of the dmFile property.
     *
     * @return
     *     possible object is
     *     {@link UploadAttachment.DmFile }
     *
     */
    public UploadAttachment.DmFile getDmFile() {
        return dmFile;
    }

    /**
     * Sets the value of the dmFile property.
     *
     * @param value
     *     allowed object is
     *     {@link UploadAttachment.DmFile }
     *
     */
    public void setDmFile(UploadAttachment.DmFile value) {
        this.dmFile = value;
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
     *         &lt;element name="dmEncodedContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="dmMimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="dmFileDescr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dmEncodedContent"
    })
    public static class DmFile {

        @XmlElement(required = true)
        @XmlMimeType("application/octet-stream")
        protected DataHandler dmEncodedContent;
        @XmlAttribute(name = "dmMimeType", required = true)
        protected String dmMimeType;
        @XmlAttribute(name = "dmFileDescr", required = true)
        protected String dmFileDescr;

        /**
         * Gets the value of the dmEncodedContent property.
         *
         * @return
         *     possible object is
         *     {@link DataHandler }
         *
         */
        public DataHandler getDmEncodedContent() {
            return dmEncodedContent;
        }

        /**
         * Sets the value of the dmEncodedContent property.
         *
         * @param value
         *     allowed object is
         *     {@link DataHandler }
         *
         */
        public void setDmEncodedContent(DataHandler value) {
            this.dmEncodedContent = value;
        }

        /**
         * Gets the value of the dmMimeType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDmMimeType() {
            return dmMimeType;
        }

        /**
         * Sets the value of the dmMimeType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDmMimeType(String value) {
            this.dmMimeType = value;
        }

        /**
         * Gets the value of the dmFileDescr property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDmFileDescr() {
            return dmFileDescr;
        }

        /**
         * Sets the value of the dmFileDescr property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDmFileDescr(String value) {
            this.dmFileDescr = value;
        }

    }

}