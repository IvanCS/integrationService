
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resumeProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resumeProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="resumeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personalInfo" type="{com/ipetrushin/syncher/request/jaxb/entities/}personalInfoType"/>
 *         &lt;element name="contactInfo" type="{com/ipetrushin/syncher/request/jaxb/entities/}contactInfoType"/>
 *         &lt;element name="educationInfo" type="{com/ipetrushin/syncher/request/jaxb/entities/}educationInfoType"/>
 *         &lt;element name="jobExperienceInfo" type="{com/ipetrushin/syncher/request/jaxb/entities/}jobExperienceInfoType"/>
 *         &lt;element name="extraInfo" type="{com/ipetrushin/syncher/request/jaxb/entities/}extraInfoType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resumeProfileType", propOrder = {

})
public class ResumeProfileType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(required = true)
    protected String resumeId;
    @XmlElement(required = true)
    protected PersonalInfoType personalInfo;
    @XmlElement(required = true)
    protected ContactInfoType contactInfo;
    @XmlElement(required = true)
    protected EducationInfoType educationInfo;
    @XmlElement(required = true)
    protected JobExperienceInfoType jobExperienceInfo;
    @XmlElement(required = true)
    protected ExtraInfoType extraInfo;

    /**
     * Gets the value of the resumeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumeId() {
        return resumeId;
    }

    /**
     * Sets the value of the resumeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumeId(String value) {
        this.resumeId = value;
    }

    /**
     * Gets the value of the personalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInfoType }
     *     
     */
    public PersonalInfoType getPersonalInfo() {
        return personalInfo;
    }

    /**
     * Sets the value of the personalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInfoType }
     *     
     */
    public void setPersonalInfo(PersonalInfoType value) {
        this.personalInfo = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the educationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EducationInfoType }
     *     
     */
    public EducationInfoType getEducationInfo() {
        return educationInfo;
    }

    /**
     * Sets the value of the educationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationInfoType }
     *     
     */
    public void setEducationInfo(EducationInfoType value) {
        this.educationInfo = value;
    }

    /**
     * Gets the value of the jobExperienceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobExperienceInfoType }
     *     
     */
    public JobExperienceInfoType getJobExperienceInfo() {
        return jobExperienceInfo;
    }

    /**
     * Sets the value of the jobExperienceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobExperienceInfoType }
     *     
     */
    public void setJobExperienceInfo(JobExperienceInfoType value) {
        this.jobExperienceInfo = value;
    }

    /**
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraInfoType }
     *     
     */
    public ExtraInfoType getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraInfoType }
     *     
     */
    public void setExtraInfo(ExtraInfoType value) {
        this.extraInfo = value;
    }

}
