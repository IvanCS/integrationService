package com.ipetrushin.syncher.webclient.beans;

import com.ipetrushin.syncher.request.jaxb.JaxbUtils;
import com.ipetrushin.syncher.request.jaxb.entities.*;
import com.ipetrushin.syncher.webclient.wsblclient.WSBusinesLogicService;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.xml.datatype.DatatypeFactory;
import java.io.Serializable;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 28.05.14
 * Time: 18:29
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name = "resumeMB", eager = false)
@SessionScoped
public class ResumeProfileMB implements Serializable {

    private ResumeProfileType resumeProfile;

    public ResumeProfileMB() {
        try {

            CityType city = new CityType();
            city.setCityName("Воронеж");
            CountryType country = new CountryType();
            country.setCountryName("Россия");
            LocationType location = new LocationType();
            location.setCity(city);
            location.setCountry(country);

            this.resumeProfile = new ResumeProfileType();

            PersonalInfoType personalInfo = new PersonalInfoType();
            personalInfo.setFirstName("Иван");
            personalInfo.setLastName("Петрушин");
            personalInfo.setMiddleName("Александрович");
            personalInfo.setBirthDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("1991-09-12"));
            personalInfo.setCitizenship(country);
            personalInfo.setGender("мужской");


            ExtraInfoType extraInfo = new ExtraInfoType();
            extraInfo.setBusinessTripReadiness("готов");
            extraInfo.setRelocation("готов");
            extraInfo.setDesiredSalary("xxxxxx");


            ContactInfoType contactInfo = new ContactInfoType();
            contactInfo.setCurrentLocation(location);
            contactInfo.setEmail("petrush.ivan@gmail.com");
            contactInfo.setMobilePhone("8-980-540-1770");
            contactInfo.setSkype("petrushin_ivan");
            contactInfo.setFacebook("facebook.com/lvan.petrushin");
            contactInfo.setVkontakte("vk.com/ivan_petrushin");

            EducationInfoType educationInfo = new EducationInfoType();

            CertificateType certificate1 = new CertificateType();
            certificate1.setCertificateName("Oracle Java Programmer I");
            certificate1.setObtainingDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-08-15"));

            MainEducationType mainEducation = new MainEducationType();
            mainEducation.setInstitutionName("ВГУ");
            mainEducation.setDepartmentName("ФКН");
            mainEducation.setGraduationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2014-07-01"));
            mainEducation.setInceptionDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2009-09-01"));
            mainEducation.setProfessionName("Специалист в области информационных технологий");
            mainEducation.setLocation(location);

            TrainingType training = new TrainingType();
            training.setTrainingName("Business presentation in English");
            training.setObtainedQualification("навыки организации и проведения презентаций на английском языке");
            training.setOrganisationName("ВГУ кафедра РГФ");
            training.setGraduationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2012-05-24"));

            educationInfo.getCertificate().add(certificate1);
            educationInfo.getEducationExperience().add(mainEducation);
            educationInfo.getTrainingExperience().add(training);


            JobExperienceInfoType jobExperienceInfo = new JobExperienceInfoType();
             JobExperienceType jobExperience = new JobExperienceType();
            jobExperience.setCompanyLocation(location);
            jobExperience.setCompanyName("T-Systems");
            jobExperience.setFromDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2012-10-01"));
            jobExperience.setIndustryArea("Информационные технологии");
            jobExperience.setPosition("Java Разработчик");
            jobExperience.setLink("http://www.t-systems.ru/");
            jobExperience.setResponsibilities("разработка програмного обеспечения");

            jobExperienceInfo.getJobExperience().add(jobExperience);

            resumeProfile.setPersonalInfo(personalInfo);
            resumeProfile.setExtraInfo(extraInfo);
            resumeProfile.setContactInfo(contactInfo);
            resumeProfile.setEducationInfo(educationInfo);
            resumeProfile.setJobExperienceInfo(jobExperienceInfo);

            setResumeProfile(resumeProfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getFirstName() {
        return resumeProfile.getPersonalInfo().getFirstName();
    }

    public String getLastName() {
        return resumeProfile.getPersonalInfo().getLastName();
    }

    public ResumeProfileType getResumeProfile() {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = externalContext.getSessionMap();
        return (ResumeProfileType) sessionMap.get("resumeProfile");
    }

    public void setResumeProfile(ResumeProfileType resumeProfile) {
        this.resumeProfile = resumeProfile;

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = externalContext.getSessionMap();
        sessionMap.put("resumeProfile", resumeProfile);
    }

    public void applyChanges() {

        try {
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> sessionMap = externalContext.getSessionMap();

            String userId = sessionMap.get("user_id").toString();
            String resumeId = resumeProfile.getResumeId();

            WSBusinesLogicService businesLogicService = new WSBusinesLogicService();
            String resumeProfileContent = JaxbUtils.getInstance().marshalObjectToString(resumeProfile);

            businesLogicService.getWSBusinesLogicPort().updateResume(userId, resumeId, resumeProfileContent);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
