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
 * <p>Java class for ku_z_rdgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ku_z_rdgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_study" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str64" minOccurs="0"/>
 *         &lt;element name="ozareni_celkem" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}realNumber8" minOccurs="0"/>
 *         &lt;element name="ku_z_rdg_e" type="{urn:cz-mzcr:ns:dasta:ds4:ds_ip}ku_z_rdg_eType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ku_z_rdg_o" type="{urn:cz-mzcr:ns:dasta:ds4:ds_ip}ku_z_rdg_oType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kuzrdgAny" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modalita" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str16" />
 *       &lt;attribute name="stanice" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str16" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ku_z_rdgType", propOrder = {
    "idStudy",
    "ozareniCelkem",
    "kuZRdgE",
    "kuZRdgO",
    "kuzrdgAny"
})
public class KuZRdgType {

    @XmlElement(name = "id_study")
    protected String idStudy;
    @XmlElement(name = "ozareni_celkem")
    protected Float ozareniCelkem;
    @XmlElement(name = "ku_z_rdg_e")
    protected List<KuZRdgEType> kuZRdgE;
    @XmlElement(name = "ku_z_rdg_o")
    protected List<KuZRdgOType> kuZRdgO;
    protected AnyType kuzrdgAny;
    @XmlAttribute
    protected String modalita;
    @XmlAttribute
    protected String stanice;

    /**
     * Gets the value of the idStudy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdStudy() {
        return idStudy;
    }

    /**
     * Sets the value of the idStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdStudy(String value) {
        this.idStudy = value;
    }

    /**
     * Gets the value of the ozareniCelkem property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOzareniCelkem() {
        return ozareniCelkem;
    }

    /**
     * Sets the value of the ozareniCelkem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOzareniCelkem(Float value) {
        this.ozareniCelkem = value;
    }

    /**
     * Gets the value of the kuZRdgE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kuZRdgE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKuZRdgE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KuZRdgEType }
     * 
     * 
     */
    public List<KuZRdgEType> getKuZRdgE() {
        if (kuZRdgE == null) {
            kuZRdgE = new ArrayList<KuZRdgEType>();
        }
        return this.kuZRdgE;
    }

    /**
     * Gets the value of the kuZRdgO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kuZRdgO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKuZRdgO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KuZRdgOType }
     * 
     * 
     */
    public List<KuZRdgOType> getKuZRdgO() {
        if (kuZRdgO == null) {
            kuZRdgO = new ArrayList<KuZRdgOType>();
        }
        return this.kuZRdgO;
    }

    /**
     * Gets the value of the kuzrdgAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getKuzrdgAny() {
        return kuzrdgAny;
    }

    /**
     * Sets the value of the kuzrdgAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setKuzrdgAny(AnyType value) {
        this.kuzrdgAny = value;
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
     * Gets the value of the stanice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStanice() {
        return stanice;
    }

    /**
     * Sets the value of the stanice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStanice(String value) {
        this.stanice = value;
    }

}
