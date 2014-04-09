//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.30 at 07:50:19 odp. CEST 
//


package mzcr.cz.ns.dasta.ds4.ds_ip;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import mzcr.cz.ns.dasta.ds4.ds_dasta.AType;
import mzcr.cz.ns.dasta.ds4.ds_type.AnyType;
import mzcr.cz.ns.dasta.ds4.ds_type.DatXxType;


/**
 * <p>Java class for pType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cispoj" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}cisloPojistenceType"/>
 *         &lt;element name="kodpoj" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number4d"/>
 *         &lt;element name="typpoj" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str2" minOccurs="0"/>
 *         &lt;element name="dat_od" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}dat_xxType" minOccurs="0"/>
 *         &lt;element name="dat_do" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}dat_xxType" minOccurs="0"/>
 *         &lt;element ref="{urn:cz-mzcr:ns:dasta:ds4:ds_dasta}a" minOccurs="0"/>
 *         &lt;element name="pAny" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ind_oprav_sd" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}indOprSdType" />
 *       &lt;attribute name="dat_ab" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pType", propOrder = {
    "cispoj",
    "kodpoj",
    "typpoj",
    "datOd",
    "datDo",
    "a",
    "pAny"
})
public class PType {

    @XmlElement(required = true)
    protected String cispoj;
    @XmlElement(required = true)
    protected BigInteger kodpoj;
    protected String typpoj;
    @XmlElement(name = "dat_od")
    protected DatXxType datOd;
    @XmlElement(name = "dat_do")
    protected DatXxType datDo;
    @XmlElement(namespace = "urn:cz-mzcr:ns:dasta:ds4:ds_dasta")
    protected AType a;
    protected AnyType pAny;
    @XmlAttribute(name = "ind_oprav_sd", required = true)
    protected String indOpravSd;
    @XmlAttribute(name = "dat_ab")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datAb;

    /**
     * Gets the value of the cispoj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCispoj() {
        return cispoj;
    }

    /**
     * Sets the value of the cispoj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCispoj(String value) {
        this.cispoj = value;
    }

    /**
     * Gets the value of the kodpoj property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKodpoj() {
        return kodpoj;
    }

    /**
     * Sets the value of the kodpoj property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKodpoj(BigInteger value) {
        this.kodpoj = value;
    }

    /**
     * Gets the value of the typpoj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyppoj() {
        return typpoj;
    }

    /**
     * Sets the value of the typpoj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyppoj(String value) {
        this.typpoj = value;
    }

    /**
     * Gets the value of the datOd property.
     * 
     * @return
     *     possible object is
     *     {@link DatXxType }
     *     
     */
    public DatXxType getDatOd() {
        return datOd;
    }

    /**
     * Sets the value of the datOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatXxType }
     *     
     */
    public void setDatOd(DatXxType value) {
        this.datOd = value;
    }

    /**
     * Gets the value of the datDo property.
     * 
     * @return
     *     possible object is
     *     {@link DatXxType }
     *     
     */
    public DatXxType getDatDo() {
        return datDo;
    }

    /**
     * Sets the value of the datDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatXxType }
     *     
     */
    public void setDatDo(DatXxType value) {
        this.datDo = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link AType }
     *     
     */
    public AType getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link AType }
     *     
     */
    public void setA(AType value) {
        this.a = value;
    }

    /**
     * Gets the value of the pAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getPAny() {
        return pAny;
    }

    /**
     * Sets the value of the pAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setPAny(AnyType value) {
        this.pAny = value;
    }

    /**
     * Gets the value of the indOpravSd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndOpravSd() {
        return indOpravSd;
    }

    /**
     * Sets the value of the indOpravSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndOpravSd(String value) {
        this.indOpravSd = value;
    }

    /**
     * Gets the value of the datAb property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatAb() {
        return datAb;
    }

    /**
     * Sets the value of the datAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatAb(XMLGregorianCalendar value) {
        this.datAb = value;
    }

}
