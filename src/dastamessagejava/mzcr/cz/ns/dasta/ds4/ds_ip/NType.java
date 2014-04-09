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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import mzcr.cz.ns.dasta.ds4.ds_type.AnyType;


/**
 * <p>Java class for nType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nAny" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="zam_text" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str40" />
 *       &lt;attribute name="klas_zam" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number1d" />
 *       &lt;attribute name="rod_stav" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number0-5" />
 *       &lt;attribute name="staobc" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number1-2" />
 *       &lt;attribute name="narodnost" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number1d" />
 *       &lt;attribute name="vzdelani" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}number1-9" />
 *       &lt;attribute name="dat_ab" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nType", propOrder = {
    "nAny"
})
public class NType {

    protected AnyType nAny;
    @XmlAttribute(name = "zam_text")
    protected String zamText;
    @XmlAttribute(name = "klas_zam", required = true)
    protected BigInteger klasZam;
    @XmlAttribute(name = "rod_stav", required = true)
    protected String rodStav;
    @XmlAttribute(required = true)
    protected String staobc;
    @XmlAttribute(required = true)
    protected BigInteger narodnost;
    @XmlAttribute(required = true)
    protected String vzdelani;
    @XmlAttribute(name = "dat_ab")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datAb;

    /**
     * Gets the value of the nAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getNAny() {
        return nAny;
    }

    /**
     * Sets the value of the nAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setNAny(AnyType value) {
        this.nAny = value;
    }

    /**
     * Gets the value of the zamText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZamText() {
        return zamText;
    }

    /**
     * Sets the value of the zamText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZamText(String value) {
        this.zamText = value;
    }

    /**
     * Gets the value of the klasZam property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKlasZam() {
        return klasZam;
    }

    /**
     * Sets the value of the klasZam property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKlasZam(BigInteger value) {
        this.klasZam = value;
    }

    /**
     * Gets the value of the rodStav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodStav() {
        return rodStav;
    }

    /**
     * Sets the value of the rodStav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodStav(String value) {
        this.rodStav = value;
    }

    /**
     * Gets the value of the staobc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaobc() {
        return staobc;
    }

    /**
     * Sets the value of the staobc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaobc(String value) {
        this.staobc = value;
    }

    /**
     * Gets the value of the narodnost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNarodnost() {
        return narodnost;
    }

    /**
     * Sets the value of the narodnost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNarodnost(BigInteger value) {
        this.narodnost = value;
    }

    /**
     * Gets the value of the vzdelani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVzdelani() {
        return vzdelani;
    }

    /**
     * Sets the value of the vzdelani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVzdelani(String value) {
        this.vzdelani = value;
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