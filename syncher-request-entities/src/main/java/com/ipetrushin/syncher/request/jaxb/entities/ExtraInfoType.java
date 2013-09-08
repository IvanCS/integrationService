
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extraInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extraInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="relocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessTripReadiness" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workTicket" type="{com/ipetrushin/syncher/request/jaxb/entities/}countryType"/>
 *         &lt;element name="travelTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extraInfoType", propOrder = {

})
public class ExtraInfoType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(required = true)
    protected String relocation;
    @XmlElement(required = true)
    protected String businessTripReadiness;
    @XmlElement(required = true)
    protected CountryType workTicket;
    @XmlElement(required = true)
    protected String travelTime;

    /**
     * Gets the value of the relocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelocation() {
        return relocation;
    }

    /**
     * Sets the value of the relocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelocation(String value) {
        this.relocation = value;
    }

    /**
     * Gets the value of the businessTripReadiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTripReadiness() {
        return businessTripReadiness;
    }

    /**
     * Sets the value of the businessTripReadiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTripReadiness(String value) {
        this.businessTripReadiness = value;
    }

    /**
     * Gets the value of the workTicket property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getWorkTicket() {
        return workTicket;
    }

    /**
     * Sets the value of the workTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setWorkTicket(CountryType value) {
        this.workTicket = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelTime(String value) {
        this.travelTime = value;
    }

}
