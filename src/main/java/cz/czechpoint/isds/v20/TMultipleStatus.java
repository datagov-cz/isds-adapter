
package cz.czechpoint.isds.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMultipleStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMultipleStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmSingleStatus" type="{http://isds.czechpoint.cz/v20}tMStatus" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMultipleStatus", propOrder = {
    "dmSingleStatus"
})
public class TMultipleStatus {

    @XmlElement(required = true, nillable = true)
    protected List<TMStatus> dmSingleStatus;

    /**
     * Gets the value of the dmSingleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmSingleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmSingleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMStatus }
     * 
     * 
     */
    public List<TMStatus> getDmSingleStatus() {
        if (dmSingleStatus == null) {
            dmSingleStatus = new ArrayList<TMStatus>();
        }
        return this.dmSingleStatus;
    }

}
