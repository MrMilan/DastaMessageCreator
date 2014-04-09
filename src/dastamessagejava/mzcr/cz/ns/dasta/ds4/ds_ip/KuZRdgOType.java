//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.30 at 07:50:19 odp. CEST 
//


package mzcr.cz.ns.dasta.ds4.ds_ip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mzcr.cz.ns.dasta.ds4.ds_type.AnyType;
import mzcr.cz.ns.dasta.ds4.ds_type.PrilohaType;


/**
 * <p>Java class for ku_z_rdg_oType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ku_z_rdg_oType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_image" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str64" minOccurs="0"/>
 *         &lt;element name="id_serie" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str64" minOccurs="0"/>
 *         &lt;element name="ku_o_rdg_lokal" type="{urn:cz-mzcr:ns:dasta:ds4:ds_ip}rdg_lokalType" minOccurs="0"/>
 *         &lt;element name="text" type="{urn:cz-mzcr:ns:dasta:ds4:ds_ip}textType" minOccurs="0"/>
 *         &lt;element name="priloha" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}prilohaType" minOccurs="0"/>
 *         &lt;element name="kuzrdgoAny" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ku_z_rdg_oType", propOrder = {
    "idImage",
    "idSerie",
    "kuORdgLokal",
    "text",
    "priloha",
    "kuzrdgoAny"
})
public class KuZRdgOType {

    @XmlElement(name = "id_image")
    protected String idImage;
    @XmlElement(name = "id_serie")
    protected String idSerie;
    @XmlElement(name = "ku_o_rdg_lokal")
    protected RdgLokalType kuORdgLokal;
    protected TextType text;
    protected PrilohaType priloha;
    protected AnyType kuzrdgoAny;

    /**
     * Gets the value of the idImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdImage() {
        return idImage;
    }

    /**
     * Sets the value of the idImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdImage(String value) {
        this.idImage = value;
    }

    /**
     * Gets the value of the idSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSerie() {
        return idSerie;
    }

    /**
     * Sets the value of the idSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSerie(String value) {
        this.idSerie = value;
    }

    /**
     * Gets the value of the kuORdgLokal property.
     * 
     * @return
     *     possible object is
     *     {@link RdgLokalType }
     *     
     */
    public RdgLokalType getKuORdgLokal() {
        return kuORdgLokal;
    }

    /**
     * Sets the value of the kuORdgLokal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RdgLokalType }
     *     
     */
    public void setKuORdgLokal(RdgLokalType value) {
        this.kuORdgLokal = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setText(TextType value) {
        this.text = value;
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
     * Gets the value of the kuzrdgoAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getKuzrdgoAny() {
        return kuzrdgoAny;
    }

    /**
     * Sets the value of the kuzrdgoAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setKuzrdgoAny(AnyType value) {
        this.kuzrdgoAny = value;
    }

}