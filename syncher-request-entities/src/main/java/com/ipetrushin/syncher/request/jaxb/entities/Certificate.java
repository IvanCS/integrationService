
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for certificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="certificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="certificate-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="obtaining-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificate", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {

})
public class Certificate
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(name = "certificate-name", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String certificateName;
    @XmlElement(name = "obtaining-date", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar obtainingDate;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String link;

    /**
     * Gets the value of the certificateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * Sets the value of the certificateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateName(String value) {
        this.certificateName = value;
    }

    /**
     * Gets the value of the obtainingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObtainingDate() {
        return obtainingDate;
    }

    /**
     * Sets the value of the obtainingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObtainingDate(XMLGregorianCalendar value) {
        this.obtainingDate = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

}
