//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.30 at 07:50:19 odp. CEST 
//


package mzcr.cz.ns.dasta.ds4.ds_type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import mzcr.cz.ns.dasta.ds4.ds_cistype.LVTZDCUN;


/**
 * <p>Java class for dat_duType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dat_duType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cz-mzcr:ns:dasta:ds4:ds_type>dateFormatMultiType">
 *       &lt;attribute name="format" type="{urn:cz-mzcr:ns:dasta:ds4:ds_type}str3" default="D" />
 *       &lt;attribute name="typ" use="required" type="{urn:cz-mzcr:ns:dasta:ds4:ds_cistype}LVTZDCUN" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dat_duType", propOrder = {
    "value"
})
public class DatDuType {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected String format;
    @XmlAttribute(required = true)
    protected LVTZDCUN typ;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        if (format == null) {
            return "D";
        } else {
            return format;
        }
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link LVTZDCUN }
     *     
     */
    public LVTZDCUN getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link LVTZDCUN }
     *     
     */
    public void setTyp(LVTZDCUN value) {
        this.typ = value;
    }

}
