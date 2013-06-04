
package com.ipetrushin.syncher.request.jaxb.entities;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for syncher-message complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="syncher-message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="request-synchronize-resume" type="{com/ipetrushin/syncher/request/jaxb/entities}synchronize-resume-request"/>
 *         &lt;element name="request-synchronize-response" type="{com/ipetrushin/syncher/request/jaxb/entities}synchronize-resume-response"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncher-message", namespace = "com/ipetrushin/syncher/request/jaxb/entities", propOrder = {
        "requestSynchronizeResume",
        "requestSynchronizeResponse"
})
public class SyncherMessage
        implements Serializable {

    private final static long serialVersionUID = 123L;
    @XmlElement(name = "request-synchronize-resume", namespace = "com/ipetrushin/syncher/request/jaxb/entities")
    protected SynchronizeResumeRequest requestSynchronizeResume;
    @XmlElement(name = "request-synchronize-response", namespace = "com/ipetrushin/syncher/request/jaxb/entities")
    protected SynchronizeResumeResponse requestSynchronizeResponse;

    /**
     * Gets the value of the requestSynchronizeResume property.
     *
     * @return possible object is
     *         {@link SynchronizeResumeRequest }
     */
    public SynchronizeResumeRequest getRequestSynchronizeResume() {
        return requestSynchronizeResume;
    }

    /**
     * Sets the value of the requestSynchronizeResume property.
     *
     * @param value allowed object is
     *              {@link SynchronizeResumeRequest }
     */
    public void setRequestSynchronizeResume(SynchronizeResumeRequest value) {
        this.requestSynchronizeResume = value;
    }

    /**
     * Gets the value of the requestSynchronizeResponse property.
     *
     * @return possible object is
     *         {@link SynchronizeResumeResponse }
     */
    public SynchronizeResumeResponse getRequestSynchronizeResponse() {
        return requestSynchronizeResponse;
    }

    /**
     * Sets the value of the requestSynchronizeResponse property.
     *
     * @param value allowed object is
     *              {@link SynchronizeResumeResponse }
     */
    public void setRequestSynchronizeResponse(SynchronizeResumeResponse value) {
        this.requestSynchronizeResponse = value;
    }

}
