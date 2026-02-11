
package cz.czechpoint.isds.v20;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tBigMessageInput complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tBigMessageInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmEnvelope" type="{http://isds.czechpoint.cz/v20}tBigMessEnvelope"/&gt;
 *         &lt;element name="dmFiles"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dmExtFile" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="dmFileMetaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmAttID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmAttHash1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmAttHash1Alg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmAttHash2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmAttHash2Alg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="dmFile" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="dmEncodedContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="dmFileMetaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmFileDescr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmMimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "tBigMessageInput", propOrder = {
    "dmEnvelope",
    "dmFiles"
})
public class TBigMessageInput {

    @XmlElement(required = true)
    protected TBigMessEnvelope dmEnvelope;
    @XmlElement(required = true)
    protected TBigMessageInput.DmFiles dmFiles;

    /**
     * Gets the value of the dmEnvelope property.
     *
     * @return
     *     possible object is
     *     {@link TBigMessEnvelope }
     *
     */
    public TBigMessEnvelope getDmEnvelope() {
        return dmEnvelope;
    }

    /**
     * Sets the value of the dmEnvelope property.
     *
     * @param value
     *     allowed object is
     *     {@link TBigMessEnvelope }
     *
     */
    public void setDmEnvelope(TBigMessEnvelope value) {
        this.dmEnvelope = value;
    }

    /**
     * Gets the value of the dmFiles property.
     *
     * @return
     *     possible object is
     *     {@link TBigMessageInput.DmFiles }
     *
     */
    public TBigMessageInput.DmFiles getDmFiles() {
        return dmFiles;
    }

    /**
     * Sets the value of the dmFiles property.
     *
     * @param value
     *     allowed object is
     *     {@link TBigMessageInput.DmFiles }
     *
     */
    public void setDmFiles(TBigMessageInput.DmFiles value) {
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="dmExtFile" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="dmFileMetaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmAttID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmAttHash1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmAttHash1Alg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmAttHash2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmAttHash2Alg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="dmFile" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="dmEncodedContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="dmFileMetaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmFileDescr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmMimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        "dmExtFile",
        "dmFile"
    })
    public static class DmFiles {

        @XmlElement(required = true)
        protected List<TBigMessageInput.DmFiles.DmExtFile> dmExtFile;
        protected List<TBigMessageInput.DmFiles.DmFile> dmFile;

        /**
         * Gets the value of the dmExtFile property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the dmExtFile property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDmExtFile().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TBigMessageInput.DmFiles.DmExtFile }
         *
         *
         */
        public List<TBigMessageInput.DmFiles.DmExtFile> getDmExtFile() {
            if (dmExtFile == null) {
                dmExtFile = new ArrayList<TBigMessageInput.DmFiles.DmExtFile>();
            }
            return this.dmExtFile;
        }

        /**
         * Gets the value of the dmFile property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the dmFile property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDmFile().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TBigMessageInput.DmFiles.DmFile }
         *
         *
         */
        public List<TBigMessageInput.DmFiles.DmFile> getDmFile() {
            if (dmFile == null) {
                dmFile = new ArrayList<TBigMessageInput.DmFiles.DmFile>();
            }
            return this.dmFile;
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
         *       &lt;attribute name="dmFileMetaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmAttID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmAttHash1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmAttHash1Alg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmAttHash2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmAttHash2Alg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DmExtFile {

            @XmlAttribute(name = "dmFileMetaType", required = true)
            protected String dmFileMetaType;
            @XmlAttribute(name = "dmAttID", required = true)
            protected String dmAttID;
            @XmlAttribute(name = "dmAttHash1", required = true)
            protected String dmAttHash1;
            @XmlAttribute(name = "dmAttHash1Alg", required = true)
            protected String dmAttHash1Alg;
            @XmlAttribute(name = "dmAttHash2", required = true)
            protected String dmAttHash2;
            @XmlAttribute(name = "dmAttHash2Alg", required = true)
            protected String dmAttHash2Alg;
            @XmlAttribute(name = "dmFileGuid")
            protected String dmFileGuid;
            @XmlAttribute(name = "dmUpFileGuid")
            protected String dmUpFileGuid;

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
             * Gets the value of the dmAttID property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDmAttID() {
                return dmAttID;
            }

            /**
             * Sets the value of the dmAttID property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDmAttID(String value) {
                this.dmAttID = value;
            }

            /**
             * Gets the value of the dmAttHash1 property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDmAttHash1() {
                return dmAttHash1;
            }

            /**
             * Sets the value of the dmAttHash1 property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDmAttHash1(String value) {
                this.dmAttHash1 = value;
            }

            /**
             * Gets the value of the dmAttHash1Alg property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDmAttHash1Alg() {
                return dmAttHash1Alg;
            }

            /**
             * Sets the value of the dmAttHash1Alg property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDmAttHash1Alg(String value) {
                this.dmAttHash1Alg = value;
            }

            /**
             * Gets the value of the dmAttHash2 property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDmAttHash2() {
                return dmAttHash2;
            }

            /**
             * Sets the value of the dmAttHash2 property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDmAttHash2(String value) {
                this.dmAttHash2 = value;
            }

            /**
             * Gets the value of the dmAttHash2Alg property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDmAttHash2Alg() {
                return dmAttHash2Alg;
            }

            /**
             * Sets the value of the dmAttHash2Alg property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDmAttHash2Alg(String value) {
                this.dmAttHash2Alg = value;
            }

            /**
             * Gets the value of the dmFileGuid property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDmFileGuid() {
                return dmFileGuid;
            }

            /**
             * Sets the value of the dmFileGuid property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDmFileGuid(String value) {
                this.dmFileGuid = value;
            }

            /**
             * Gets the value of the dmUpFileGuid property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDmUpFileGuid() {
                return dmUpFileGuid;
            }

            /**
             * Sets the value of the dmUpFileGuid property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDmUpFileGuid(String value) {
                this.dmUpFileGuid = value;
            }

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
         *       &lt;attribute name="dmFileMetaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmFileDescr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmMimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            protected byte[] dmEncodedContent;
            @XmlAttribute(name = "dmFileMetaType", required = true)
            protected String dmFileMetaType;
            @XmlAttribute(name = "dmFileDescr", required = true)
            protected String dmFileDescr;
            @XmlAttribute(name = "dmMimeType", required = true)
            protected String dmMimeType;
            @XmlAttribute(name = "dmFileGuid")
            protected String dmFileGuid;
            @XmlAttribute(name = "dmUpFileGuid")
            protected String dmUpFileGuid;

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
             * Gets the value of the dmFileGuid property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDmFileGuid() {
                return dmFileGuid;
            }

            /**
             * Sets the value of the dmFileGuid property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDmFileGuid(String value) {
                this.dmFileGuid = value;
            }

            /**
             * Gets the value of the dmUpFileGuid property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDmUpFileGuid() {
                return dmUpFileGuid;
            }

            /**
             * Sets the value of the dmUpFileGuid property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDmUpFileGuid(String value) {
                this.dmUpFileGuid = value;
            }

        }

    }

}