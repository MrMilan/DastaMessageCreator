//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.30 at 07:50:19 odp. CEST 
//


package mzcr.cz.ns.dasta.ds4.ds_cistype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LODO.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LODO">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="UO"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="V"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LODO", namespace = "urn:cz-mzcr:ns:dasta:ds4:ds_cistype")
@XmlEnum
public enum LODO {

    B,
    P,
    S,
    E,
    UZ,
    UP,
    UO,
    D,
    V;

    public String value() {
        return name();
    }

    public static LODO fromValue(String v) {
        return valueOf(v);
    }

}
