
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for education-info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="education-info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="education-experience" type="{com/ipetrushin/syncher/request/jaxb/entities}main-education" minOccurs="0"/>
 *         &lt;element name="training-experience" type="{com/ipetrushin/syncher/request/jaxb/entities}training" minOccurs="0"/>
 *         &lt;element name="certificate" type="{com/ipetrushin/syncher/request/jaxb/entities}certificate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "education-info", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {
    "educationExperience",
    "trainingExperience",
    "certificate"
})
public class EducationInfo
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(name = "education-experience", namespace = "com/ipetrushin/syncher/request/jaxb/entities")
    protected MainEducation educationExperience;
    @XmlElement(name = "training-experience", namespace = "com/ipetrushin/syncher/request/jaxb/entities")
    protected Training trainingExperience;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities")
    protected Certificate certificate;

    /**
     * Gets the value of the educationExperience property.
     * 
     * @return
     *     possible object is
     *     {@link MainEducation }
     *     
     */
    public MainEducation getEducationExperience() {
        return educationExperience;
    }

    /**
     * Sets the value of the educationExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainEducation }
     *     
     */
    public void setEducationExperience(MainEducation value) {
        this.educationExperience = value;
    }

    /**
     * Gets the value of the trainingExperience property.
     * 
     * @return
     *     possible object is
     *     {@link Training }
     *     
     */
    public Training getTrainingExperience() {
        return trainingExperience;
    }

    /**
     * Sets the value of the trainingExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Training }
     *     
     */
    public void setTrainingExperience(Training value) {
        this.trainingExperience = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     */
    public void setCertificate(Certificate value) {
        this.certificate = value;
    }

}
