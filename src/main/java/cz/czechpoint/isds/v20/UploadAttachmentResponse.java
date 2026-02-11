
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="dmAttID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dmAttHash1" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="AttHashAlg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmAttHash2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="AttHashAlg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
    "dmAttID",
    "dmAttHash1",
    "dmAttHash2",
    "dmStatus"
})
@XmlRootElement(name = "UploadAttachmentResponse")
public class UploadAttachmentResponse {

    protected String dmAttID;
    protected UploadAttachmentResponse.DmAttHash1 dmAttHash1;
    protected UploadAttachmentResponse.DmAttHash2 dmAttHash2;
    @XmlElement(required = true)
    protected TStatus dmStatus;

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
     *     {@link UploadAttachmentResponse.DmAttHash1 }
     *
     */
    public UploadAttachmentResponse.DmAttHash1 getDmAttHash1() {
        return dmAttHash1;
    }

    /**
     * Sets the value of the dmAttHash1 property.
     *
     * @param value
     *     allowed object is
     *     {@link UploadAttachmentResponse.DmAttHash1 }
     *
     */
    public void setDmAttHash1(UploadAttachmentResponse.DmAttHash1 value) {
        this.dmAttHash1 = value;
    }

    /**
     * Gets the value of the dmAttHash2 property.
     *
     * @return
     *     possible object is
     *     {@link UploadAttachmentResponse.DmAttHash2 }
     *
     */
    public UploadAttachmentResponse.DmAttHash2 getDmAttHash2() {
        return dmAttHash2;
    }

    /**
     * Sets the value of the dmAttHash2 property.
     *
     * @param value
     *     allowed object is
     *     {@link UploadAttachmentResponse.DmAttHash2 }
     *
     */
    public void setDmAttHash2(UploadAttachmentResponse.DmAttHash2 value) {
        this.dmAttHash2 = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="AttHashAlg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DmAttHash1 {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "AttHashAlg")
        protected String attHashAlg;

        /**
         * Gets the value of the value property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the attHashAlg property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAttHashAlg() {
            return attHashAlg;
        }

        /**
         * Sets the value of the attHashAlg property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAttHashAlg(String value) {
            this.attHashAlg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="AttHashAlg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DmAttHash2 {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "AttHashAlg")
        protected String attHashAlg;

        /**
         * Gets the value of the value property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the attHashAlg property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAttHashAlg() {
            return attHashAlg;
        }

        /**
         * Sets the value of the attHashAlg property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAttHashAlg(String value) {
            this.attHashAlg = value;
        }

    }

}