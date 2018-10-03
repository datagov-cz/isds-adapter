
package cz.czechpoint.isds.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tFilesArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tFilesArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmFile" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://isds.czechpoint.cz/v20}tFile">
 *                 &lt;attribute name="dmMimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dmFileMetaType" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="main"/>
 *                       &lt;enumeration value="enclosure"/>
 *                       &lt;enumeration value="signature"/>
 *                       &lt;enumeration value="meta"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dmFileDescr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dmFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * returned list will be present inside the JAXB object.
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://isds.czechpoint.cz/v20}tFile">
     *       &lt;attribute name="dmMimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dmFileMetaType" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="main"/>
     *             &lt;enumeration value="enclosure"/>
     *             &lt;enumeration value="signature"/>
     *             &lt;enumeration value="meta"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="dmFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dmUpFileGuid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dmFileDescr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dmFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DmFile
        extends TFile
    {

        @XmlAttribute(required = true)
        protected String dmMimeType;
        @XmlAttribute(required = true)
        protected String dmFileMetaType;
        @XmlAttribute
        protected String dmFileGuid;
        @XmlAttribute
        protected String dmUpFileGuid;
        @XmlAttribute(required = true)
        protected String dmFileDescr;
        @XmlAttribute
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
