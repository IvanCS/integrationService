
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syncherMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncherMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="synchronizeResumeRequest" type="{com/ipetrushin/syncher/request/jaxb/entities/}synchronizeResumeRequestType"/>
 *         &lt;element name="synchronizeResumeResponse" type="{com/ipetrushin/syncher/request/jaxb/entities/}synchronizeResumeResponseType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncherMessageType", propOrder = {
    "synchronizeResumeRequest",
    "synchronizeResumeResponse"
})
public class SyncherMessageType
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    protected SynchronizeResumeRequestType synchronizeResumeRequest;
    protected SynchronizeResumeResponseType synchronizeResumeResponse;

    /**
     * Gets the value of the synchronizeResumeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizeResumeRequestType }
     *     
     */
    public SynchronizeResumeRequestType getSynchronizeResumeRequest() {
        return synchronizeResumeRequest;
    }

    /**
     * Sets the value of the synchronizeResumeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizeResumeRequestType }
     *     
     */
    public void setSynchronizeResumeRequest(SynchronizeResumeRequestType value) {
        this.synchronizeResumeRequest = value;
    }

    /**
     * Gets the value of the synchronizeResumeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizeResumeResponseType }
     *     
     */
    public SynchronizeResumeResponseType getSynchronizeResumeResponse() {
        return synchronizeResumeResponse;
    }

    /**
     * Sets the value of the synchronizeResumeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizeResumeResponseType }
     *     
     */
    public void setSynchronizeResumeResponse(SynchronizeResumeResponseType value) {
        this.synchronizeResumeResponse = value;
    }

}
