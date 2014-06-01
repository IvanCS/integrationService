
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="jobExperience" type="{com/ipetrushin/syncher/request/jaxb/entities/}jobExperienceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobExperienceInfoType", namespace = "com/ipetrushin/syncher/request/jaxb/entities/", propOrder = {
    "jobExperience"
})
public class JobExperienceInfoType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    protected List<JobExperienceType> jobExperience;

    /**
     * Gets the value of the jobExperience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobExperience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobExperienceType }
     * 
     * 
     */
    public List<JobExperienceType> getJobExperience() {
        if (jobExperience == null) {
            jobExperience = new ArrayList<JobExperienceType>();
        }
        return this.jobExperience;
    }

}
