//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.30 at 07:50:19 odp. CEST 
//


package mzcr.cz.ns.dasta.ds4.ds_ip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hspType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hspType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dath_od" type="{urn:cz-mzcr:ns:dasta:ds4:ds_ip}dath_xxType" minOccurs="0"/>
 *         &lt;element name="dath_do" type="{urn:cz-mzcr:ns:dasta:ds4:ds_ip}dath_xxType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ind_hsp_zm">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str1">
 *             &lt;enumeration value="A"/>
 *             &lt;enumeration value="N"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hspType", propOrder = {
    "dathOd",
    "dathDo"
})
public class HspType {

    @XmlElement(name = "dath_od")
    protected DathXxType dathOd;
    @XmlElement(name = "dath_do")
    protected DathXxType dathDo;
    @XmlAttribute(name = "ind_hsp_zm")
    protected String indHspZm;

    /**
     * Gets the value of the dathOd property.
     * 
     * @return
     *     possible object is
     *     {@link DathXxType }
     *     
     */
    public DathXxType getDathOd() {
        return dathOd;
    }

    /**
     * Sets the value of the dathOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DathXxType }
     *     
     */
    public void setDathOd(DathXxType value) {
        this.dathOd = value;
    }

    /**
     * Gets the value of the dathDo property.
     * 
     * @return
     *     possible object is
     *     {@link DathXxType }
     *     
     */
    public DathXxType getDathDo() {
        return dathDo;
    }

    /**
     * Sets the value of the dathDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DathXxType }
     *     
     */
    public void setDathDo(DathXxType value) {
        this.dathDo = value;
    }

    /**
     * Gets the value of the indHspZm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndHspZm() {
        return indHspZm;
    }

    /**
     * Sets the value of the indHspZm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndHspZm(String value) {
        this.indHspZm = value;
    }

}