
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
 *         &lt;element name="education-info" type="{com/ipetrushin/syncher/request/jaxb/entities}education-info"/>
 *         &lt;element name="job-experience-info" type="{com/ipetrushin/syncher/request/jaxb/entities}job-experience-info"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resume-profile", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {

})
public class ResumeProfile
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(name = "personal-info", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected PersonalInfo personalInfo;
    @XmlElement(name = "contact-info", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected ContactInfo contactInfo;
    @XmlElement(name = "education-info", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected EducationInfo educationInfo;
    @XmlElement(name = "job-experience-info", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected JobExperienceInfo jobExperienceInfo;

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

    /**
     * Gets the value of the educationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EducationInfo }
     *     
     */
    public EducationInfo getEducationInfo() {
        return educationInfo;
    }

    /**
     * Sets the value of the educationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationInfo }
     *     
     */
    public void setEducationInfo(EducationInfo value) {
        this.educationInfo = value;
    }

    /**
     * Gets the value of the jobExperienceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobExperienceInfo }
     *     
     */
    public JobExperienceInfo getJobExperienceInfo() {
        return jobExperienceInfo;
    }

    /**
     * Sets the value of the jobExperienceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobExperienceInfo }
     *     
     */
    public void setJobExperienceInfo(JobExperienceInfo value) {
        this.jobExperienceInfo = value;
    }

}
