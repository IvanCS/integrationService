
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for educationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="educationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="educationExperience" type="{com/ipetrushin/syncher/request/jaxb/entities/}mainEducationType" minOccurs="0"/>
 *         &lt;element name="trainingExperience" type="{com/ipetrushin/syncher/request/jaxb/entities/}trainingType" minOccurs="0"/>
 *         &lt;element name="certificate" type="{com/ipetrushin/syncher/request/jaxb/entities/}certificateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "educationInfoType", propOrder = {
    "educationExperience",
    "trainingExperience",
    "certificate"
})
public class EducationInfoType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    protected MainEducationType educationExperience;
    protected TrainingType trainingExperience;
    protected CertificateType certificate;

    /**
     * Gets the value of the educationExperience property.
     * 
     * @return
     *     possible object is
     *     {@link MainEducationType }
     *     
     */
    public MainEducationType getEducationExperience() {
        return educationExperience;
    }

    /**
     * Sets the value of the educationExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainEducationType }
     *     
     */
    public void setEducationExperience(MainEducationType value) {
        this.educationExperience = value;
    }

    /**
     * Gets the value of the trainingExperience property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingType }
     *     
     */
    public TrainingType getTrainingExperience() {
        return trainingExperience;
    }

    /**
     * Sets the value of the trainingExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingType }
     *     
     */
    public void setTrainingExperience(TrainingType value) {
        this.trainingExperience = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateType }
     *     
     */
    public CertificateType getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType }
     *     
     */
    public void setCertificate(CertificateType value) {
        this.certificate = value;
    }

}
