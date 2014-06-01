
package com.ipetrushin.syncher.webclient.wsblclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipetrushin.syncher.webclient.wsblclient package. 
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

    private final static QName _GetListOfLanguagesResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfLanguagesResponse");
    private final static QName _AuthorizeResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "authorizeResponse");
    private final static QName _Authorize_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "authorize");
    private final static QName _GetListOfGenders_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfGenders");
    private final static QName _Registrate_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "registrate");
    private final static QName _GetListOfGendersResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfGendersResponse");
    private final static QName _DoSynchronizationResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "doSynchronizationResponse");
    private final static QName _GetRequestResponseStatusResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getRequestResponseStatusResponse");
    private final static QName _GetListOfJobTitlesByProfession_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfJobTitlesByProfession");
    private final static QName _UpdateResumeResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "updateResumeResponse");
    private final static QName _GetListOfCitiesByCountry_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfCitiesByCountry");
    private final static QName _GetListOfProfessionsResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfProfessionsResponse");
    private final static QName _GetRequestResponseStatus_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getRequestResponseStatus");
    private final static QName _GetListOfJobTitlesByProfessionResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfJobTitlesByProfessionResponse");
    private final static QName _GetListOfProfessions_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfProfessions");
    private final static QName _UpdateResume_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "updateResume");
    private final static QName _GetListOfLanguages_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfLanguages");
    private final static QName _GetListOfCountriesResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfCountriesResponse");
    private final static QName _GetListOfAvailableWebResourcesResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfAvailableWebResourcesResponse");
    private final static QName _GetListOfCountries_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfCountries");
    private final static QName _DoSynchronization_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "doSynchronization");
    private final static QName _GetListOfAvailableWebResources_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfAvailableWebResources");
    private final static QName _GetListOfCitiesByCountryResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "getListOfCitiesByCountryResponse");
    private final static QName _RegistrateResponse_QNAME = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "registrateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipetrushin.syncher.webclient.wsblclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRequestResponseStatus }
     * 
     */
    public GetRequestResponseStatus createGetRequestResponseStatus() {
        return new GetRequestResponseStatus();
    }

    /**
     * Create an instance of {@link GetListOfJobTitlesByProfessionResponse }
     * 
     */
    public GetListOfJobTitlesByProfessionResponse createGetListOfJobTitlesByProfessionResponse() {
        return new GetListOfJobTitlesByProfessionResponse();
    }

    /**
     * Create an instance of {@link GetListOfProfessionsResponse }
     * 
     */
    public GetListOfProfessionsResponse createGetListOfProfessionsResponse() {
        return new GetListOfProfessionsResponse();
    }

    /**
     * Create an instance of {@link GetListOfProfessions }
     * 
     */
    public GetListOfProfessions createGetListOfProfessions() {
        return new GetListOfProfessions();
    }

    /**
     * Create an instance of {@link GetListOfCountries }
     * 
     */
    public GetListOfCountries createGetListOfCountries() {
        return new GetListOfCountries();
    }

    /**
     * Create an instance of {@link GetListOfAvailableWebResourcesResponse }
     * 
     */
    public GetListOfAvailableWebResourcesResponse createGetListOfAvailableWebResourcesResponse() {
        return new GetListOfAvailableWebResourcesResponse();
    }

    /**
     * Create an instance of {@link GetListOfLanguages }
     * 
     */
    public GetListOfLanguages createGetListOfLanguages() {
        return new GetListOfLanguages();
    }

    /**
     * Create an instance of {@link GetListOfCountriesResponse }
     * 
     */
    public GetListOfCountriesResponse createGetListOfCountriesResponse() {
        return new GetListOfCountriesResponse();
    }

    /**
     * Create an instance of {@link UpdateResume }
     * 
     */
    public UpdateResume createUpdateResume() {
        return new UpdateResume();
    }

    /**
     * Create an instance of {@link RegistrateResponse }
     * 
     */
    public RegistrateResponse createRegistrateResponse() {
        return new RegistrateResponse();
    }

    /**
     * Create an instance of {@link GetListOfAvailableWebResources }
     * 
     */
    public GetListOfAvailableWebResources createGetListOfAvailableWebResources() {
        return new GetListOfAvailableWebResources();
    }

    /**
     * Create an instance of {@link GetListOfCitiesByCountryResponse }
     * 
     */
    public GetListOfCitiesByCountryResponse createGetListOfCitiesByCountryResponse() {
        return new GetListOfCitiesByCountryResponse();
    }

    /**
     * Create an instance of {@link DoSynchronization }
     * 
     */
    public DoSynchronization createDoSynchronization() {
        return new DoSynchronization();
    }

    /**
     * Create an instance of {@link Authorize }
     * 
     */
    public Authorize createAuthorize() {
        return new Authorize();
    }

    /**
     * Create an instance of {@link AuthorizeResponse }
     * 
     */
    public AuthorizeResponse createAuthorizeResponse() {
        return new AuthorizeResponse();
    }

    /**
     * Create an instance of {@link GetListOfLanguagesResponse }
     * 
     */
    public GetListOfLanguagesResponse createGetListOfLanguagesResponse() {
        return new GetListOfLanguagesResponse();
    }

    /**
     * Create an instance of {@link Registrate }
     * 
     */
    public Registrate createRegistrate() {
        return new Registrate();
    }

    /**
     * Create an instance of {@link GetListOfGenders }
     * 
     */
    public GetListOfGenders createGetListOfGenders() {
        return new GetListOfGenders();
    }

    /**
     * Create an instance of {@link GetListOfJobTitlesByProfession }
     * 
     */
    public GetListOfJobTitlesByProfession createGetListOfJobTitlesByProfession() {
        return new GetListOfJobTitlesByProfession();
    }

    /**
     * Create an instance of {@link GetRequestResponseStatusResponse }
     * 
     */
    public GetRequestResponseStatusResponse createGetRequestResponseStatusResponse() {
        return new GetRequestResponseStatusResponse();
    }

    /**
     * Create an instance of {@link DoSynchronizationResponse }
     * 
     */
    public DoSynchronizationResponse createDoSynchronizationResponse() {
        return new DoSynchronizationResponse();
    }

    /**
     * Create an instance of {@link GetListOfGendersResponse }
     * 
     */
    public GetListOfGendersResponse createGetListOfGendersResponse() {
        return new GetListOfGendersResponse();
    }

    /**
     * Create an instance of {@link GetListOfCitiesByCountry }
     * 
     */
    public GetListOfCitiesByCountry createGetListOfCitiesByCountry() {
        return new GetListOfCitiesByCountry();
    }

    /**
     * Create an instance of {@link UpdateResumeResponse }
     * 
     */
    public UpdateResumeResponse createUpdateResumeResponse() {
        return new UpdateResumeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfLanguagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfLanguagesResponse")
    public JAXBElement<GetListOfLanguagesResponse> createGetListOfLanguagesResponse(GetListOfLanguagesResponse value) {
        return new JAXBElement<GetListOfLanguagesResponse>(_GetListOfLanguagesResponse_QNAME, GetListOfLanguagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "authorizeResponse")
    public JAXBElement<AuthorizeResponse> createAuthorizeResponse(AuthorizeResponse value) {
        return new JAXBElement<AuthorizeResponse>(_AuthorizeResponse_QNAME, AuthorizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authorize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "authorize")
    public JAXBElement<Authorize> createAuthorize(Authorize value) {
        return new JAXBElement<Authorize>(_Authorize_QNAME, Authorize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfGenders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfGenders")
    public JAXBElement<GetListOfGenders> createGetListOfGenders(GetListOfGenders value) {
        return new JAXBElement<GetListOfGenders>(_GetListOfGenders_QNAME, GetListOfGenders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "registrate")
    public JAXBElement<Registrate> createRegistrate(Registrate value) {
        return new JAXBElement<Registrate>(_Registrate_QNAME, Registrate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfGendersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfGendersResponse")
    public JAXBElement<GetListOfGendersResponse> createGetListOfGendersResponse(GetListOfGendersResponse value) {
        return new JAXBElement<GetListOfGendersResponse>(_GetListOfGendersResponse_QNAME, GetListOfGendersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSynchronizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "doSynchronizationResponse")
    public JAXBElement<DoSynchronizationResponse> createDoSynchronizationResponse(DoSynchronizationResponse value) {
        return new JAXBElement<DoSynchronizationResponse>(_DoSynchronizationResponse_QNAME, DoSynchronizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestResponseStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getRequestResponseStatusResponse")
    public JAXBElement<GetRequestResponseStatusResponse> createGetRequestResponseStatusResponse(GetRequestResponseStatusResponse value) {
        return new JAXBElement<GetRequestResponseStatusResponse>(_GetRequestResponseStatusResponse_QNAME, GetRequestResponseStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfJobTitlesByProfession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfJobTitlesByProfession")
    public JAXBElement<GetListOfJobTitlesByProfession> createGetListOfJobTitlesByProfession(GetListOfJobTitlesByProfession value) {
        return new JAXBElement<GetListOfJobTitlesByProfession>(_GetListOfJobTitlesByProfession_QNAME, GetListOfJobTitlesByProfession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResumeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "updateResumeResponse")
    public JAXBElement<UpdateResumeResponse> createUpdateResumeResponse(UpdateResumeResponse value) {
        return new JAXBElement<UpdateResumeResponse>(_UpdateResumeResponse_QNAME, UpdateResumeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfCitiesByCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfCitiesByCountry")
    public JAXBElement<GetListOfCitiesByCountry> createGetListOfCitiesByCountry(GetListOfCitiesByCountry value) {
        return new JAXBElement<GetListOfCitiesByCountry>(_GetListOfCitiesByCountry_QNAME, GetListOfCitiesByCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfProfessionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfProfessionsResponse")
    public JAXBElement<GetListOfProfessionsResponse> createGetListOfProfessionsResponse(GetListOfProfessionsResponse value) {
        return new JAXBElement<GetListOfProfessionsResponse>(_GetListOfProfessionsResponse_QNAME, GetListOfProfessionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestResponseStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getRequestResponseStatus")
    public JAXBElement<GetRequestResponseStatus> createGetRequestResponseStatus(GetRequestResponseStatus value) {
        return new JAXBElement<GetRequestResponseStatus>(_GetRequestResponseStatus_QNAME, GetRequestResponseStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfJobTitlesByProfessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfJobTitlesByProfessionResponse")
    public JAXBElement<GetListOfJobTitlesByProfessionResponse> createGetListOfJobTitlesByProfessionResponse(GetListOfJobTitlesByProfessionResponse value) {
        return new JAXBElement<GetListOfJobTitlesByProfessionResponse>(_GetListOfJobTitlesByProfessionResponse_QNAME, GetListOfJobTitlesByProfessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfProfessions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfProfessions")
    public JAXBElement<GetListOfProfessions> createGetListOfProfessions(GetListOfProfessions value) {
        return new JAXBElement<GetListOfProfessions>(_GetListOfProfessions_QNAME, GetListOfProfessions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResume }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "updateResume")
    public JAXBElement<UpdateResume> createUpdateResume(UpdateResume value) {
        return new JAXBElement<UpdateResume>(_UpdateResume_QNAME, UpdateResume.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfLanguages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfLanguages")
    public JAXBElement<GetListOfLanguages> createGetListOfLanguages(GetListOfLanguages value) {
        return new JAXBElement<GetListOfLanguages>(_GetListOfLanguages_QNAME, GetListOfLanguages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfCountriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfCountriesResponse")
    public JAXBElement<GetListOfCountriesResponse> createGetListOfCountriesResponse(GetListOfCountriesResponse value) {
        return new JAXBElement<GetListOfCountriesResponse>(_GetListOfCountriesResponse_QNAME, GetListOfCountriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfAvailableWebResourcesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfAvailableWebResourcesResponse")
    public JAXBElement<GetListOfAvailableWebResourcesResponse> createGetListOfAvailableWebResourcesResponse(GetListOfAvailableWebResourcesResponse value) {
        return new JAXBElement<GetListOfAvailableWebResourcesResponse>(_GetListOfAvailableWebResourcesResponse_QNAME, GetListOfAvailableWebResourcesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfCountries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfCountries")
    public JAXBElement<GetListOfCountries> createGetListOfCountries(GetListOfCountries value) {
        return new JAXBElement<GetListOfCountries>(_GetListOfCountries_QNAME, GetListOfCountries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSynchronization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "doSynchronization")
    public JAXBElement<DoSynchronization> createDoSynchronization(DoSynchronization value) {
        return new JAXBElement<DoSynchronization>(_DoSynchronization_QNAME, DoSynchronization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfAvailableWebResources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfAvailableWebResources")
    public JAXBElement<GetListOfAvailableWebResources> createGetListOfAvailableWebResources(GetListOfAvailableWebResources value) {
        return new JAXBElement<GetListOfAvailableWebResources>(_GetListOfAvailableWebResources_QNAME, GetListOfAvailableWebResources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfCitiesByCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "getListOfCitiesByCountryResponse")
    public JAXBElement<GetListOfCitiesByCountryResponse> createGetListOfCitiesByCountryResponse(GetListOfCitiesByCountryResponse value) {
        return new JAXBElement<GetListOfCitiesByCountryResponse>(_GetListOfCitiesByCountryResponse_QNAME, GetListOfCitiesByCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "registrateResponse")
    public JAXBElement<RegistrateResponse> createRegistrateResponse(RegistrateResponse value) {
        return new JAXBElement<RegistrateResponse>(_RegistrateResponse_QNAME, RegistrateResponse.class, null, value);
    }

}
