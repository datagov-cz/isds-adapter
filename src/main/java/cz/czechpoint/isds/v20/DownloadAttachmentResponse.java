
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
 *         &lt;element name="dmFile" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dmEncodedContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="dmFileMetaType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="dmMimeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="dmFileDescr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmStatus" type="{http://isds.czechpoint.cz/v20}tStatus"/&gt;
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
    "dmFile",
    "dmStatus"
})
@XmlRootElement(name = "DownloadAttachmentResponse")
public class DownloadAttachmentResponse {

    protected DownloadAttachmentResponse.DmFile dmFile;
    @XmlElement(required = true)
    protected TStatus dmStatus;

    /**
     * Gets the value of the dmFile property.
     *
     * @return
     *     possible object is
     *     {@link DownloadAttachmentResponse.DmFile }
     *
     */
    public DownloadAttachmentResponse.DmFile getDmFile() {
        return dmFile;
    }

    /**
     * Sets the value of the dmFile property.
     *
     * @param value
     *     allowed object is
     *     {@link DownloadAttachmentResponse.DmFile }
     *
     */
    public void setDmFile(DownloadAttachmentResponse.DmFile value) {
        this.dmFile = value;
    }

    /**
     * Gets the value of the dmStatus property.
     *
     * @return
     *     possible object is
     *     {@link TStatus }
     *
     */
    public TStatus getDmStatus() {
        return dmStatus;
    }

    /**
     * Sets the value of the dmStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link TStatus }
     *
     */
    public void setDmStatus(TStatus value) {
        this.dmStatus = value;
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
     *       &lt;attribute name="dmFileMetaType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="dmMimeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="dmFileDescr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        @XmlAttribute(name = "dmFileMetaType")
        protected String dmFileMetaType;
        @XmlAttribute(name = "dmMimeType")
        protected String dmMimeType;
        @XmlAttribute(name = "dmFileDescr")
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
         * Gets the value of the dmFileMetaType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDmFileMetaType() {
            return dmFileMetaType;
        }

        /**
         * Sets the value of the dmFileMetaType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDmFileMetaType(String value) {
            this.dmFileMetaType = value;
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