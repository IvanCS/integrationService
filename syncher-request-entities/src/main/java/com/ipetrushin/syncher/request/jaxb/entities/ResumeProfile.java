//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.27 at 08:21:30 PM MSK 
//


package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resume-profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resume-profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="personal-info" type="{com/ipetrushin/syncher/request/jaxb/entities}personal-info"/>
 *         &lt;element name="contact-info" type="{com/ipetrushin/syncher/request/jaxb/entities}contact-info"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resume-profile", propOrder = {

})
public class ResumeProfile
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(name = "personal-info", required = true)
    protected PersonalInfo personalInfo;
    @XmlElement(name = "contact-info", required = true)
    protected ContactInfo contactInfo;

    /**
     * Gets the value of the personalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInfo }
     *     
     */
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    /**
     * Sets the value of the personalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInfo }
     *     
     */
    public void setPersonalInfo(PersonalInfo value) {
        this.personalInfo = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

}
