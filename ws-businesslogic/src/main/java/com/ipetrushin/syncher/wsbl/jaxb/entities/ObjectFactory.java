
package com.ipetrushin.syncher.wsbl.jaxb.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipetrushin.syncher.wsbl.jaxb.entities package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SyncherRequest_QNAME = new QName("http://www.syncher.com", "syncher-request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipetrushin.syncher.wsbl.jaxb.entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SyncherRequest }
     * 
     */
    public SyncherRequest createSyncherRequest() {
        return new SyncherRequest();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link SyncherRequest.Accounts }
     * 
     */
    public SyncherRequest.Accounts createSyncherRequestAccounts() {
        return new SyncherRequest.Accounts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncherRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.syncher.com", name = "syncher-request")
    public JAXBElement<SyncherRequest> createSyncherRequest(SyncherRequest value) {
        return new JAXBElement<SyncherRequest>(_SyncherRequest_QNAME, SyncherRequest.class, null, value);
    }

}
