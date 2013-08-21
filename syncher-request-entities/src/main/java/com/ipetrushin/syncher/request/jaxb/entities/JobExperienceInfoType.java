
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobExperienceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobExperienceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobExperience" type="{com/ipetrushin/syncher/request/jaxb/entities/}jobExperienceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobExperienceInfoType", propOrder = {
    "jobExperience"
})
public class JobExperienceInfoType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    protected JobExperienceType jobExperience;

    /**
     * Gets the value of the jobExperience property.
     * 
     * @return
     *     possible object is
     *     {@link JobExperienceType }
     *     
     */
    public JobExperienceType getJobExperience() {
        return jobExperience;
    }

    /**
     * Sets the value of the jobExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobExperienceType }
     *     
     */
    public void setJobExperience(JobExperienceType value) {
        this.jobExperience = value;
    }

}
