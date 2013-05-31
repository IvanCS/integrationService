
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for syncher-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncher-request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accounts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account" type="{com/ipetrushin/syncher/request/jaxb/entities}account" maxOccurs="5"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="resume-profile" type="{com/ipetrushin/syncher/request/jaxb/entities}resume-profile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncher-request", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {
    "accounts",
    "resumeProfile"
})
public class SyncherRequest
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected SyncherRequest.Accounts accounts;
    @XmlElement(name = "resume-profile", namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected ResumeProfile resumeProfile;

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link SyncherRequest.Accounts }
     *     
     */
    public SyncherRequest.Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncherRequest.Accounts }
     *     
     */
    public void setAccounts(SyncherRequest.Accounts value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the resumeProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ResumeProfile }
     *     
     */
    public ResumeProfile getResumeProfile() {
        return resumeProfile;
    }

    /**
     * Sets the value of the resumeProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResumeProfile }
     *     
     */
    public void setResumeProfile(ResumeProfile value) {
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
     *         &lt;element name="account" type="{com/ipetrushin/syncher/request/jaxb/entities}account" maxOccurs="5"/>
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
        @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
        protected List<Account> account;

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
         * {@link Account }
         * 
         * 
         */
        public List<Account> getAccount() {
            if (account == null) {
                account = new ArrayList<Account>();
            }
            return this.account;
        }

    }

}
