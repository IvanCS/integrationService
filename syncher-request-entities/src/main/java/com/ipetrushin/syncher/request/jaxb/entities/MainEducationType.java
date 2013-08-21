
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mainEducationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mainEducationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="level" type="{com/ipetrushin/syncher/request/jaxb/entities/}levelType"/>
 *         &lt;element name="institutionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departmentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="professionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inceptionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="graduationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="location" type="{com/ipetrushin/syncher/request/jaxb/entities/}locationType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mainEducationType", propOrder = {

})
public class MainEducationType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(required = true)
    protected LevelType level;
    @XmlElement(required = true)
    protected String institutionName;
    @XmlElement(required = true)
    protected String departmentName;
    @XmlElement(required = true)
    protected String professionName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inceptionDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar graduationDate;
    @XmlElement(required = true)
    protected LocationType location;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setLevel(LevelType value) {
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
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

}
