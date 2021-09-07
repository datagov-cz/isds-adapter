
package cz.czechpoint.isds.v20;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tFilesArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tFilesArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmFile" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://isds.czechpoint.cz/v20}tFile"&gt;
 *                 &lt;attribute name="dmMimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="dmFileMetaType" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="main"/&gt;
 *                       &lt;enumeration value="enclosure"/&gt;
 *                       &lt;enumeration value="signature"/&gt;
 *                       &lt;enumeration value="meta"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="dmFileDescr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="dmFormat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "tFilesArray", propOrder = {
    "dmFile"
})
public class TFilesArray {

    @XmlElement(required = true)
    protected List<TFilesArray.DmFile> dmFile;

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
     * {@link TFilesArray.DmFile }
     * 
     * 
     */
    public List<TFilesArray.DmFile> getDmFile() {
        if (dmFile == null) {
            dmFile = new ArrayList<TFilesArray.DmFile>();
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
     *     &lt;extension base="{http://isds.czechpoint.cz/v20}tFile"&gt;
     *       &lt;attribute name="dmMimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="dmFileMetaType" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="main"/&gt;
     *             &lt;enumeration value="enclosure"/&gt;
     *             &lt;enumeration value="signature"/&gt;
     *             &lt;enumeration value="meta"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="dmFileDescr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="dmFormat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DmFile
        extends TFile
    {

        @XmlAttribute(name = "dmMimeType", required = true)
        protected String dmMimeType;
        @XmlAttribute(name = "dmFileMetaType", required = true)
        protected String dmFileMetaType;
        @XmlAttribute(name = "dmFileGuid")
        protected String dmFileGuid;
        @XmlAttribute(name = "dmUpFileGuid")
        protected String dmUpFileGuid;
        @XmlAttribute(name = "dmFileDescr", required = true)
        protected String dmFileDescr;
        @XmlAttribute(name = "dmFormat")
        protected String dmFormat;

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
         * Gets the value of the dmFormat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDmFormat() {
            return dmFormat;
        }

        /**
         * Sets the value of the dmFormat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDmFormat(String value) {
            this.dmFormat = value;
        }

    }

}
