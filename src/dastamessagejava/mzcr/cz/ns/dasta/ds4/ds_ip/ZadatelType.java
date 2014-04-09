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
import javax.xml.bind.annotation.XmlType;
import mzcr.cz.ns.dasta.ds4.ds_type.AnyType;
import mzcr.cz.ns.dasta.ds4.ds_type.DatXxType;


/**
 * <p>Java class for zadatelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zadatelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:cz-mzcr:ns:dasta:ds4:ds_ip}zadatelElemGroup"/>
 *         &lt;element name="zadatelAny" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="icz" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number8d" />
 *       &lt;attribute name="icp" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number8d" />
 *       &lt;attribute name="odb" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number3d" />
 *       &lt;attribute name="icl" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number8d" />
 *       &lt;attribute name="ns" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number8d" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zadatelType", propOrder = {
    "jmeno",
    "pozn",
    "datZa",
    "zadatelAny"
})
public class ZadatelType {

    protected String jmeno;
    protected String pozn;
    @XmlElement(name = "dat_za")
    protected DatXxType datZa;
    protected AnyType zadatelAny;
    @XmlAttribute
    protected BigInteger icz;
    @XmlAttribute(required = true)
    protected BigInteger icp;
    @XmlAttribute(required = true)
    protected BigInteger odb;
    @XmlAttribute
    protected BigInteger icl;
    @XmlAttribute
    protected BigInteger ns;

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
     * Gets the value of the pozn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozn() {
        return pozn;
    }

    /**
     * Sets the value of the pozn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozn(String value) {
        this.pozn = value;
    }

    /**
     * Gets the value of the datZa property.
     * 
     * @return
     *     possible object is
     *     {@link DatXxType }
     *     
     */
    public DatXxType getDatZa() {
        return datZa;
    }

    /**
     * Sets the value of the datZa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatXxType }
     *     
     */
    public void setDatZa(DatXxType value) {
        this.datZa = value;
    }

    /**
     * Gets the value of the zadatelAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getZadatelAny() {
        return zadatelAny;
    }

    /**
     * Sets the value of the zadatelAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setZadatelAny(AnyType value) {
        this.zadatelAny = value;
    }

    /**
     * Gets the value of the icz property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIcz() {
        return icz;
    }

    /**
     * Sets the value of the icz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIcz(BigInteger value) {
        this.icz = value;
    }

    /**
     * Gets the value of the icp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIcp() {
        return icp;
    }

    /**
     * Sets the value of the icp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIcp(BigInteger value) {
        this.icp = value;
    }

    /**
     * Gets the value of the odb property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOdb() {
        return odb;
    }

    /**
     * Sets the value of the odb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOdb(BigInteger value) {
        this.odb = value;
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
     * Gets the value of the ns property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNs() {
        return ns;
    }

    /**
     * Sets the value of the ns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNs(BigInteger value) {
        this.ns = value;
    }

}
