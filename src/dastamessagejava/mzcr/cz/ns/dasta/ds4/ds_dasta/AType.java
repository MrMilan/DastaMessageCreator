//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.30 at 07:50:19 odp. CEST 
//


package mzcr.cz.ns.dasta.ds4.ds_dasta;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mzcr.cz.ns.dasta.ds4.ds_type.AnyType;


/**
 * <p>Java class for aType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jmeno" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str255"/>
 *         &lt;element name="adr" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str35" minOccurs="0"/>
 *         &lt;element name="dop1" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str35" minOccurs="0"/>
 *         &lt;element name="dop2" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str35" minOccurs="0"/>
 *         &lt;element name="psc" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number9d" minOccurs="0"/>
 *         &lt;element name="mesto" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str48" minOccurs="0"/>
 *         &lt;element name="stat" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number3de" minOccurs="0"/>
 *         &lt;element name="vztah" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str35" minOccurs="0"/>
 *         &lt;element name="icl" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number8d" minOccurs="0"/>
 *         &lt;element name="as" type="{urn:cz-mzcr:ns:dasta:ds4:ds_dasta}asType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aAny" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="typ" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}typAdresyType" />
 *       &lt;attribute name="ind_kont" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}ind_kontType" />
 *       &lt;attribute name="sr_typ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="L"/>
 *             &lt;enumeration value="O"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sr_pois" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str4" />
 *       &lt;attribute name="sr_kod" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str9" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aType", propOrder = {
    "jmeno",
    "adr",
    "dop1",
    "dop2",
    "psc",
    "mesto",
    "stat",
    "vztah",
    "icl",
    "as",
    "aAny"
})
public class AType {

    @XmlElement(required = true)
    protected String jmeno;
    protected String adr;
    protected String dop1;
    protected String dop2;
    protected BigInteger psc;
    protected String mesto;
    protected String stat;
    protected String vztah;
    protected BigInteger icl;
    protected List<AsType> as;
    protected AnyType aAny;
    @XmlAttribute(required = true)
    protected String typ;
    @XmlAttribute(name = "ind_kont")
    protected String indKont;
    @XmlAttribute(name = "sr_typ")
    protected String srTyp;
    @XmlAttribute(name = "sr_pois")
    protected String srPois;
    @XmlAttribute(name = "sr_kod")
    protected String srKod;

    /**
     * Gets the value of the jmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Sets the value of the jmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmeno(String value) {
        this.jmeno = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdr(String value) {
        this.adr = value;
    }

    /**
     * Gets the value of the dop1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDop1() {
        return dop1;
    }

    /**
     * Sets the value of the dop1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDop1(String value) {
        this.dop1 = value;
    }

    /**
     * Gets the value of the dop2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDop2() {
        return dop2;
    }

    /**
     * Sets the value of the dop2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDop2(String value) {
        this.dop2 = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPsc() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPsc(BigInteger value) {
        this.psc = value;
    }

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesto(String value) {
        this.mesto = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the vztah property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVztah() {
        return vztah;
    }

    /**
     * Sets the value of the vztah property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVztah(String value) {
        this.vztah = value;
    }

    /**
     * Gets the value of the icl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIcl() {
        return icl;
    }

    /**
     * Sets the value of the icl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIcl(BigInteger value) {
        this.icl = value;
    }

    /**
     * Gets the value of the as property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the as property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsType }
     * 
     * 
     */
    public List<AsType> getAs() {
        if (as == null) {
            as = new ArrayList<AsType>();
        }
        return this.as;
    }

    /**
     * Gets the value of the aAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getAAny() {
        return aAny;
    }

    /**
     * Sets the value of the aAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setAAny(AnyType value) {
        this.aAny = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the indKont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndKont() {
        return indKont;
    }

    /**
     * Sets the value of the indKont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndKont(String value) {
        this.indKont = value;
    }

    /**
     * Gets the value of the srTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrTyp() {
        return srTyp;
    }

    /**
     * Sets the value of the srTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrTyp(String value) {
        this.srTyp = value;
    }

    /**
     * Gets the value of the srPois property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrPois() {
        return srPois;
    }

    /**
     * Sets the value of the srPois property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrPois(String value) {
        this.srPois = value;
    }

    /**
     * Gets the value of the srKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrKod() {
        return srKod;
    }

    /**
     * Sets the value of the srKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrKod(String value) {
        this.srKod = value;
    }

}
