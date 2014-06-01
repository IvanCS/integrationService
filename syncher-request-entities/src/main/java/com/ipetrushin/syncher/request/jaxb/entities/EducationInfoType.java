
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="educationExperience" type="{com/ipetrushin/syncher/request/jaxb/entities/}mainEducationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trainingExperience" type="{com/ipetrushin/syncher/request/jaxb/entities/}trainingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="certificate" type="{com/ipetrushin/syncher/request/jaxb/entities/}certificateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "educationInfoType", namespace = "com/ipetrushin/syncher/request/jaxb/entities/", propOrder = {
    "educationExperience",
    "trainingExperience",
    "certificate"
})
public class EducationInfoType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    protected List<MainEducationType> educationExperience;
    protected List<TrainingType> trainingExperience;
    protected List<CertificateType> certificate;

    /**
     * Gets the value of the educationExperience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationExperience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MainEducationType }
     * 
     * 
     */
    public List<MainEducationType> getEducationExperience() {
        if (educationExperience == null) {
            educationExperience = new ArrayList<MainEducationType>();
        }
        return this.educationExperience;
    }

    /**
     * Gets the value of the trainingExperience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainingExperience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainingExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainingType }
     * 
     * 
     */
    public List<TrainingType> getTrainingExperience() {
        if (trainingExperience == null) {
            trainingExperience = new ArrayList<TrainingType>();
        }
        return this.trainingExperience;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateType }
     * 
     * 
     */
    public List<CertificateType> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<CertificateType>();
        }
        return this.certificate;
    }

}
