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
import mzcr.cz.ns.dasta.ds4.ds_type.AnyType;
import mzcr.cz.ns.dasta.ds4.ds_type.PrilohaType;


/**
 * <p>Java class for textType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cz-mzcr:ns:dasta:ds4:ds_ip}ptext"/>
 *         &lt;choice>
 *           &lt;element name="ktext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="priloha" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}prilohaType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="textAny" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="autor" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str35" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textType", propOrder = {
    "ptext",
    "ktext",
    "priloha",
    "textAny"
})
public class TextType {

    @XmlElement(required = true)
    protected Ptext ptext;
    protected String ktext;
    protected PrilohaType priloha;
    protected AnyType textAny;
    @XmlAttribute
    protected String autor;

    /**
     * Gets the value of the ptext property.
     * 
     * @return
     *     possible object is
     *     {@link Ptext }
     *     
     */
    public Ptext getPtext() {
        return ptext;
    }

    /**
     * Sets the value of the ptext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ptext }
     *     
     */
    public void setPtext(Ptext value) {
        this.ptext = value;
    }

    /**
     * Gets the value of the ktext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtext() {
        return ktext;
    }

    /**
     * Sets the value of the ktext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtext(String value) {
        this.ktext = value;
    }

    /**
     * Gets the value of the priloha property.
     * 
     * @return
     *     possible object is
     *     {@link PrilohaType }
     *     
     */
    public PrilohaType getPriloha() {
        return priloha;
    }

    /**
     * Sets the value of the priloha property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrilohaType }
     *     
     */
    public void setPriloha(PrilohaType value) {
        this.priloha = value;
    }

    /**
     * Gets the value of the textAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getTextAny() {
        return textAny;
    }

    /**
     * Sets the value of the textAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setTextAny(AnyType value) {
        this.textAny = value;
    }

    /**
     * Gets the value of the autor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Sets the value of the autor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutor(String value) {
        this.autor = value;
    }

}
