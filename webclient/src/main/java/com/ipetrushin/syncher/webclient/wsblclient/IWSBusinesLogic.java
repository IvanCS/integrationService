package com.ipetrushin.syncher.webclient.wsblclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2014-06-01T15:50:42.841+04:00
 * Generated source version: 2.7.4
 * 
 */
@WebService(targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", name = "IWSBusinesLogic")
@XmlSeeAlso({ObjectFactory.class})
public interface IWSBusinesLogic {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getListOfJobTitlesByProfession", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfJobTitlesByProfession")
    @WebMethod
    @ResponseWrapper(localName = "getListOfJobTitlesByProfessionResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfJobTitlesByProfessionResponse")
    public java.util.List<java.lang.String> getListOfJobTitlesByProfession(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "authorize", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.Authorize")
    @WebMethod
    @ResponseWrapper(localName = "authorizeResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.AuthorizeResponse")
    public java.lang.String authorize(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "doSynchronization", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.DoSynchronization")
    @WebMethod
    @ResponseWrapper(localName = "doSynchronizationResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.DoSynchronizationResponse")
    public java.lang.String doSynchronization(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getListOfLanguages", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfLanguages")
    @WebMethod
    @ResponseWrapper(localName = "getListOfLanguagesResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfLanguagesResponse")
    public java.util.List<java.lang.String> getListOfLanguages();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getListOfCitiesByCountry", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfCitiesByCountry")
    @WebMethod
    @ResponseWrapper(localName = "getListOfCitiesByCountryResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfCitiesByCountryResponse")
    public java.util.List<java.lang.String> getListOfCitiesByCountry(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getListOfAvailableWebResources", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfAvailableWebResources")
    @WebMethod
    @ResponseWrapper(localName = "getListOfAvailableWebResourcesResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfAvailableWebResourcesResponse")
    public java.util.List<java.lang.String> getListOfAvailableWebResources();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getListOfGenders", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfGenders")
    @WebMethod
    @ResponseWrapper(localName = "getListOfGendersResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfGendersResponse")
    public java.util.List<java.lang.String> getListOfGenders();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "updateResume", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.UpdateResume")
    @WebMethod
    @ResponseWrapper(localName = "updateResumeResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.UpdateResumeResponse")
    public java.lang.String updateResume(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getListOfCountries", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfCountries")
    @WebMethod
    @ResponseWrapper(localName = "getListOfCountriesResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfCountriesResponse")
    public java.util.List<java.lang.String> getListOfCountries();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getRequestResponseStatus", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetRequestResponseStatus")
    @WebMethod
    @ResponseWrapper(localName = "getRequestResponseStatusResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetRequestResponseStatusResponse")
    public java.lang.String getRequestResponseStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getListOfProfessions", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfProfessions")
    @WebMethod
    @ResponseWrapper(localName = "getListOfProfessionsResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.GetListOfProfessionsResponse")
    public java.util.List<java.lang.String> getListOfProfessions();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "registrate", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.Registrate")
    @WebMethod
    @ResponseWrapper(localName = "registrateResponse", targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/", className = "com.ipetrushin.syncher.webclient.wsblclient.RegistrateResponse")
    public java.lang.String registrate(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<java.lang.String> arg0
    );
}
