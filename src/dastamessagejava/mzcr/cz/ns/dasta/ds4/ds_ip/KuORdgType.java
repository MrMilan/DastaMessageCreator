//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.30 at 07:50:19 odp. CEST 
//


package mzcr.cz.ns.dasta.ds4.ds_ip;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mzcr.cz.ns.dasta.ds4.ds_type.AnyType;


/**
 * <p>Java class for ku_o_rdgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ku_o_rdgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ku_o_rdg_lokal" type="{urn:cz-mzcr:ns:dasta:ds4:ds_ip}rdg_lokalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kuordgAny" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modalita" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str16" />
 *       &lt;attribute name="kontrast" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ku_o_rdgType", propOrder = {
    "kuORdgLokal",
    "kuordgAny"
})
public class KuORdgType {

    @XmlElement(name = "ku_o_rdg_lokal")
    protected List<RdgLokalType> kuORdgLokal;
    protected AnyType kuordgAny;
    @XmlAttribute
    protected String modalita;
    @XmlAttribute
    protected String kontrast;

    /**
     * Gets the value of the kuORdgLokal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kuORdgLokal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKuORdgLokal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RdgLokalType }
     * 
     * 
     */
    public List<RdgLokalType> getKuORdgLokal() {
        if (kuORdgLokal == null) {
            kuORdgLokal = new ArrayList<RdgLokalType>();
        }
        return this.kuORdgLokal;
    }

    /**
     * Gets the value of the kuordgAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getKuordgAny() {
        return kuordgAny;
    }

    /**
     * Sets the value of the kuordgAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setKuordgAny(AnyType value) {
        this.kuordgAny = value;
    }

    /**
     * Gets the value of the modalita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalita() {
        return modalita;
    }

    /**
     * Sets the value of the modalita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalita(String value) {
        this.modalita = value;
    }

    /**
     * Gets the value of the kontrast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontrast() {
        return kontrast;
    }

    /**
     * Sets the value of the kontrast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontrast(String value) {
        this.kontrast = value;
    }

}