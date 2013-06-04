
package com.ipetrushin.syncher.request.jaxb.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for synchronize-resume-response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="synchronize-resume-response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{com/ipetrushin/syncher/request/jaxb/entities}error"/>
 *         &lt;element name="isComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "synchronize-resume-response", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {
    "error",
    "isComplete"
})
public class SynchronizeResumeResponse
    implements Serializable
{

    private final static long serialVersionUID = 123L;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities", required = true)
    protected Error error;
    @XmlElement(namespace = "com/ipetrushin/syncher/request/jaxb/entities")
    protected boolean isComplete;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the isComplete property.
     * 
     */
    public boolean isIsComplete() {
        return isComplete;
    }

    /**
     * Sets the value of the isComplete property.
     * 
     */
    public void setIsComplete(boolean value) {
        this.isComplete = value;
    }

}
