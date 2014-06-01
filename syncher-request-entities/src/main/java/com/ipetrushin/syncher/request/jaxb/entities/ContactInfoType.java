
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currentLocation" type="{com/ipetrushin/syncher/request/jaxb/entities/}locationType"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extraPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webSite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="facebook" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vkontakte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="skype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="icq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="twitter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactInfoType", namespace = "com/ipetrushin/syncher/request/jaxb/entities/", propOrder = {

})
public class ContactInfoType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected LocationType currentLocation;
    @XmlElement(required = true)
    protected String mobilePhone;
    @XmlElement(required = true)
    protected String extraPhone;
    @XmlElement(required = true)
    protected String webSite;
    @XmlElement(required = true)
    protected String facebook;
    @XmlElement(required = true)
    protected String vkontakte;
    @XmlElement(required = true)
    protected String skype;
    @XmlElement(required = true)
    protected String icq;
    @XmlElement(required = true)
    protected String twitter;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the currentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the value of the currentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setCurrentLocation(LocationType value) {
        this.currentLocation = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the extraPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraPhone() {
        return extraPhone;
    }

    /**
     * Sets the value of the extraPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraPhone(String value) {
        this.extraPhone = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the facebook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * Sets the value of the facebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebook(String value) {
        this.facebook = value;
    }

    /**
     * Gets the value of the vkontakte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVkontakte() {
        return vkontakte;
    }

    /**
     * Sets the value of the vkontakte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVkontakte(String value) {
        this.vkontakte = value;
    }

    /**
     * Gets the value of the skype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkype() {
        return skype;
    }

    /**
     * Sets the value of the skype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkype(String value) {
        this.skype = value;
    }

    /**
     * Gets the value of the icq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcq() {
        return icq;
    }

    /**
     * Sets the value of the icq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcq(String value) {
        this.icq = value;
    }

    /**
     * Gets the value of the twitter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * Sets the value of the twitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitter(String value) {
        this.twitter = value;
    }

}
