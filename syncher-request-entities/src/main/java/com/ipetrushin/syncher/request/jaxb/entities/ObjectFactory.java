
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

    private final static QName _ResumeProfile_QNAME = new QName("com/ipetrushin/syncher/request/jaxb/entities/", "resumeProfile");
    private final static QName _SyncherMessage_QNAME = new QName("com/ipetrushin/syncher/request/jaxb/entities/", "syncherMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipetrushin.syncher.request.jaxb.entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SynchronizeResumeRequestType }
     * 
     */
    public SynchronizeResumeRequestType createSynchronizeResumeRequestType() {
        return new SynchronizeResumeRequestType();
    }

    /**
     * Create an instance of {@link SyncherMessageType }
     * 
     */
    public SyncherMessageType createSyncherMessageType() {
        return new SyncherMessageType();
    }

    /**
     * Create an instance of {@link ResumeProfileType }
     * 
     */
    public ResumeProfileType createResumeProfileType() {
        return new ResumeProfileType();
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link CertificateType }
     * 
     */
    public CertificateType createCertificateType() {
        return new CertificateType();
    }

    /**
     * Create an instance of {@link MainEducationType }
     * 
     */
    public MainEducationType createMainEducationType() {
        return new MainEducationType();
    }

    /**
     * Create an instance of {@link LevelType }
     * 
     */
    public LevelType createLevelType() {
        return new LevelType();
    }

    /**
     * Create an instance of {@link EducationInfoType }
     * 
     */
    public EducationInfoType createEducationInfoType() {
        return new EducationInfoType();
    }

    /**
     * Create an instance of {@link SynchronizeResumeResponseType }
     * 
     */
    public SynchronizeResumeResponseType createSynchronizeResumeResponseType() {
        return new SynchronizeResumeResponseType();
    }

    /**
     * Create an instance of {@link TrainingType }
     * 
     */
    public TrainingType createTrainingType() {
        return new TrainingType();
    }

    /**
     * Create an instance of {@link JobExperienceInfoType }
     * 
     */
    public JobExperienceInfoType createJobExperienceInfoType() {
        return new JobExperienceInfoType();
    }

    /**
     * Create an instance of {@link CityType }
     * 
     */
    public CityType createCityType() {
        return new CityType();
    }

    /**
     * Create an instance of {@link ExtraInfoType }
     * 
     */
    public ExtraInfoType createExtraInfoType() {
        return new ExtraInfoType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link JobExperienceType }
     * 
     */
    public JobExperienceType createJobExperienceType() {
        return new JobExperienceType();
    }

    /**
     * Create an instance of {@link PersonalInfoType }
     * 
     */
    public PersonalInfoType createPersonalInfoType() {
        return new PersonalInfoType();
    }

    /**
     * Create an instance of {@link SynchronizeResumeRequestType.Accounts }
     * 
     */
    public SynchronizeResumeRequestType.Accounts createSynchronizeResumeRequestTypeAccounts() {
        return new SynchronizeResumeRequestType.Accounts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com/ipetrushin/syncher/request/jaxb/entities/", name = "resumeProfile")
    public JAXBElement<ResumeProfileType> createResumeProfile(ResumeProfileType value) {
        return new JAXBElement<ResumeProfileType>(_ResumeProfile_QNAME, ResumeProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncherMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com/ipetrushin/syncher/request/jaxb/entities/", name = "syncherMessage")
    public JAXBElement<SyncherMessageType> createSyncherMessage(SyncherMessageType value) {
        return new JAXBElement<SyncherMessageType>(_SyncherMessage_QNAME, SyncherMessageType.class, null, value);
    }

}
