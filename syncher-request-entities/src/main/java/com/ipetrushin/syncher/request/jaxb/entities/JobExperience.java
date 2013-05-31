
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for job-experience complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="job-experience">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="to-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="industry-area" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company-location" type="{com/ipetrushin/syncher/request/jaxb/entities}location"/>
 *         &lt;element name="responsibilities" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "job-experience", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {

})
public class JobExperience
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(name = "company-name", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String companyName;
    @XmlElement(name = "from-date", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "to-date", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "industry-area", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String industryArea;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String position;
    @XmlElement(name = "company-location", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected Location companyLocation;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String responsibilities;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected String link;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the industryArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryArea() {
        return industryArea;
    }

    /**
     * Sets the value of the industryArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryArea(String value) {
        this.industryArea = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the companyLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getCompanyLocation() {
        return companyLocation;
    }

    /**
     * Sets the value of the companyLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setCompanyLocation(Location value) {
        this.companyLocation = value;
    }

    /**
     * Gets the value of the responsibilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilities() {
        return responsibilities;
    }

    /**
     * Sets the value of the responsibilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilities(String value) {
        this.responsibilities = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

}
