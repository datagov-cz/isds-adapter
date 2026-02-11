
package cz.czechpoint.isds.v20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="dmID" type="{http://isds.czechpoint.cz/v20}tIdDm"/&gt;
 *         &lt;element name="repName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allowComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "dmID",
    "repName",
    "repMail",
    "repTel",
    "allowComplete",
    "note"
})
@XmlRootElement(name = "SuspMessageReport")
public class SuspMessageReport {

    @XmlElement(required = true)
    protected String dmID;
    protected String repName;
    protected String repMail;
    protected String repTel;
    protected boolean allowComplete;
    protected String note;

    /**
     * Gets the value of the dmID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDmID() {
        return dmID;
    }

    /**
     * Sets the value of the dmID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDmID(String value) {
        this.dmID = value;
    }

    /**
     * Gets the value of the repName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepName() {
        return repName;
    }

    /**
     * Sets the value of the repName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepName(String value) {
        this.repName = value;
    }

    /**
     * Gets the value of the repMail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepMail() {
        return repMail;
    }

    /**
     * Sets the value of the repMail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepMail(String value) {
        this.repMail = value;
    }

    /**
     * Gets the value of the repTel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepTel() {
        return repTel;
    }

    /**
     * Sets the value of the repTel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepTel(String value) {
        this.repTel = value;
    }

    /**
     * Gets the value of the allowComplete property.
     *
     */
    public boolean isAllowComplete() {
        return allowComplete;
    }

    /**
     * Sets the value of the allowComplete property.
     *
     */
    public void setAllowComplete(boolean value) {
        this.allowComplete = value;
    }

    /**
     * Gets the value of the note property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNote(String value) {
        this.note = value;
    }

}