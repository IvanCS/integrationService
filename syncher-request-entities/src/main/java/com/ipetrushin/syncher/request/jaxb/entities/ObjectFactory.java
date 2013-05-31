
package com.ipetrushin.syncher.request.jaxb.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipetrushin.syncher.request.jaxb.entities package. 
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

    private final static QName _SyncherRequest_QNAME = new QName("com/ipetrushin/syncher/request/jaxb/entities", "syncher-request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipetrushin.syncher.request.jaxb.entities
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
     * Create an instance of {@link EducationInfo }
     * 
     */
    public EducationInfo createEducationInfo() {
        return new EducationInfo();
    }

    /**
     * Create an instance of {@link JobExperience }
     * 
     */
    public JobExperience createJobExperience() {
        return new JobExperience();
    }

    /**
     * Create an instance of {@link MainEducation }
     * 
     */
    public MainEducation createMainEducation() {
        return new MainEducation();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link Training }
     * 
     */
    public Training createTraining() {
        return new Training();
    }

    /**
     * Create an instance of {@link JobExperienceInfo }
     * 
     */
    public JobExperienceInfo createJobExperienceInfo() {
        return new JobExperienceInfo();
    }

    /**
     * Create an instance of {@link Certificate }
     * 
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link Level }
     * 
     */
    public Level createLevel() {
        return new Level();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ResumeProfile }
     * 
     */
    public ResumeProfile createResumeProfile() {
        return new ResumeProfile();
    }

    /**
     * Create an instance of {@link PersonalInfo }
     * 
     */
    public PersonalInfo createPersonalInfo() {
        return new PersonalInfo();
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
    @XmlElementDecl(namespace = "com/ipetrushin/syncher/request/jaxb/entities", name = "syncher-request")
    public JAXBElement<SyncherRequest> createSyncherRequest(SyncherRequest value) {
        return new JAXBElement<SyncherRequest>(_SyncherRequest_QNAME, SyncherRequest.class, null, value);
    }

}