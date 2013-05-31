
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for job-experience-info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="job-experience-info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="job-experience" type="{com/ipetrushin/syncher/request/jaxb/entities}job-experience" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "job-experience-info", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {
    "jobExperience"
})
public class JobExperienceInfo
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(name = "job-experience", namespace = "com/ipetrushin/syncher/request/jaxb/entities")
    protected JobExperience jobExperience;

    /**
     * Gets the value of the jobExperience property.
     * 
     * @return
     *     possible object is
     *     {@link JobExperience }
     *     
     */
    public JobExperience getJobExperience() {
        return jobExperience;
    }

    /**
     * Sets the value of the jobExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobExperience }
     *     
     */
    public void setJobExperience(JobExperience value) {
        this.jobExperience = value;
    }

}
