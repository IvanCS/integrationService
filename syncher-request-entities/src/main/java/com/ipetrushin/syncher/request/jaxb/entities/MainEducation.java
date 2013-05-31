
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for main-education complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="main-education">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="level" type="{com/ipetrushin/syncher/request/jaxb/entities}level"/>
 *         &lt;element name="institution-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="department-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profession-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inception-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="graduation-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="location" type="{com/ipetrushin/syncher/request/jaxb/entities}location"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "main-education", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {

})
public class MainEducation
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected Level level;
    @XmlElement(name = "institution-name", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String institutionName;
    @XmlElement(name = "department-name", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String departmentName;
    @XmlElement(name = "profession-name", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String professionName;
    @XmlElement(name = "inception-date", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inceptionDate;
    @XmlElement(name = "graduation-date", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar graduationDate;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected Location location;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

    /**
     * Gets the value of the institutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Sets the value of the institutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionName(String value) {
        this.institutionName = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the professionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionName() {
        return professionName;
    }

    /**
     * Sets the value of the professionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionName(String value) {
        this.professionName = value;
    }

    /**
     * Gets the value of the inceptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInceptionDate() {
        return inceptionDate;
    }

    /**
     * Sets the value of the inceptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInceptionDate(XMLGregorianCalendar value) {
        this.inceptionDate = value;
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

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

}
