
package cz.czechpoint.isds.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * typ pro vrácený seznam DZ
 * 
 * <p>Java class for tRecordsArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRecordsArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="dmRecord" type="{http://isds.czechpoint.cz/v20}tRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRecordsArray", propOrder = {
    "dmRecord"
})
public class TRecordsArray {

    protected List<TRecord> dmRecord;

    /**
     * Gets the value of the dmRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRecord }
     * 
     * 
     */
    public List<TRecord> getDmRecord() {
        if (dmRecord == null) {
            dmRecord = new ArrayList<TRecord>();
        }
        return this.dmRecord;
    }

}
