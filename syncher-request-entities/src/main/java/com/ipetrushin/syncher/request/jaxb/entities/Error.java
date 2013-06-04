
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for error complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="error">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="exception-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exception-message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exception-staketrace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="job-experience-info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {

})
public class Error
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(name = "exception-class", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String exceptionClass;
    @XmlElement(name = "exception-message", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String exceptionMessage;
    @XmlElement(name = "exception-staketrace", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String exceptionStaketrace;
    @XmlElement(name = "job-experience-info", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String jobExperienceInfo;

    /**
     * Gets the value of the exceptionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionClass() {
        return exceptionClass;
    }

    /**
     * Sets the value of the exceptionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionClass(String value) {
        this.exceptionClass = value;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

    /**
     * Gets the value of the exceptionStaketrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionStaketrace() {
        return exceptionStaketrace;
    }

    /**
     * Sets the value of the exceptionStaketrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionStaketrace(String value) {
        this.exceptionStaketrace = value;
    }

    /**
     * Gets the value of the jobExperienceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobExperienceInfo() {
        return jobExperienceInfo;
    }

    /**
     * Sets the value of the jobExperienceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobExperienceInfo(String value) {
        this.jobExperienceInfo = value;
    }

}
