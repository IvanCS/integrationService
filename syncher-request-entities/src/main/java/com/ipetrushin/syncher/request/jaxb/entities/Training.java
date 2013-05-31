
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for training complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="training">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="training-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organisation-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="obtained-qualification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="graduation-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "training", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {

})
public class Training
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(name = "training-name", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String trainingName;
    @XmlElement(name = "organisation-name", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String organisationName;
    @XmlElement(name = "obtained-qualification", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String obtainedQualification;
    @XmlElement(name = "graduation-date", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar graduationDate;

    /**
     * Gets the value of the trainingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainingName() {
        return trainingName;
    }

    /**
     * Sets the value of the trainingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainingName(String value) {
        this.trainingName = value;
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationName(String value) {
        this.organisationName = value;
    }

    /**
     * Gets the value of the obtainedQualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObtainedQualification() {
        return obtainedQualification;
    }

    /**
     * Sets the value of the obtainedQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObtainedQualification(String value) {
        this.obtainedQualification = value;
    }

    /**
     * Gets the value of the graduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraduationDate() {
        return graduationDate;
    }

    /**
     * Sets the value of the graduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraduationDate(XMLGregorianCalendar value) {
        this.graduationDate = value;
    }

}
