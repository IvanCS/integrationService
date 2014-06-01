
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for synchronizeResumeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="synchronizeResumeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accounts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account" type="{com/ipetrushin/syncher/request/jaxb/entities/}accountType" maxOccurs="5"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="resumeProfile" type="{com/ipetrushin/syncher/request/jaxb/entities/}resumeProfileType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "synchronizeResumeRequestType", namespace = "com/ipetrushin/syncher/request/jaxb/entities/", propOrder = {
    "accounts",
    "resumeProfile"
})
public class SynchronizeResumeRequestType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(required = true)
    protected SynchronizeResumeRequestType.Accounts accounts;
    @XmlElement(required = true)
    protected ResumeProfileType resumeProfile;

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizeResumeRequestType.Accounts }
     *     
     */
    public SynchronizeResumeRequestType.Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizeResumeRequestType.Accounts }
     *     
     */
    public void setAccounts(SynchronizeResumeRequestType.Accounts value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the resumeProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ResumeProfileType }
     *     
     */
    public ResumeProfileType getResumeProfile() {
        return resumeProfile;
    }

    /**
     * Sets the value of the resumeProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResumeProfileType }
     *     
     */
    public void setResumeProfile(ResumeProfileType value) {
        this.resumeProfile = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="account" type="{com/ipetrushin/syncher/request/jaxb/entities/}accountType" maxOccurs="5"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "account"
    })
    public static class Accounts
        implements Serializable
    {

        private final static long serialVersionUID = 123L;
        @XmlElement(required = true)
        protected List<AccountType> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountType }
         * 
         * 
         */
        public List<AccountType> getAccount() {
            if (account == null) {
                account = new ArrayList<AccountType>();
            }
            return this.account;
        }

    }

}
