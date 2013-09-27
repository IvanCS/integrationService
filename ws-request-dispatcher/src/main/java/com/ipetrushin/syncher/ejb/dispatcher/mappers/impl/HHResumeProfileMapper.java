package com.ipetrushin.syncher.ejb.dispatcher.mappers.impl;


import com.ipetrushin.syncher.ejb.dispatcher.core.ResumeProfileMapper;
import com.ipetrushin.syncher.ejb.dispatcher.transformers.HHTransformer;
import com.ipetrushin.syncher.request.jaxb.entities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HHResumeProfileMapper extends ResumeProfileMapper {
    private final String LINK_OPEN_RESUME = "http://hh.ru/resume/";
    private final String LINK_VIEW_RESUME = "http://hh.ru/applicant/resumes/view?resume=";
    private final String LINK_CHANGE_PERSONAL = "http://hh.ru/applicant/resumes/edit/personal?resume=";
    private final String LINK_CHANGE_CONTACTS = "http://hh.ru/applicant/resumes/edit/contacts?resume=";
    private final String LINK_CHANGE_POSITION = "http://hh.ru/applicant/resumes/edit/position?resume=";
    private final String LINK_CHANGE_EDU = "http://hh.ru/applicant/resumes/edit/education?resume=";
    private final String FIELD_EDU_PRIMARY = "&field=primaryEducation";
    private final String FIELD_EDU_LANGUAGE = "&field=language";
    private final String LINK_CHANGE_EXPERIANCE = "http://hh.ru/applicant/resumes/edit/personal?resume=";
    private final String LINK_CHANGE_ADDITIONAL = "http://hh.ru/applicant/resumes/edit/additional?resume=";
    private ResumeProfileType resumeProfile;


    public HHResumeProfileMapper() {
        super(null, "http://hh.ru");
    }

    public ResumeProfileType getResumeProfile() {
        return getExchangeMessage().getSynchronizeResumeRequest().getResumeProfile();
    }

    @Override
    public void logIn() throws Exception {
        AccountType account = getExchangeMessage().getSynchronizeResumeRequest().getAccounts().getAccount().get(0);
        String login = account.getLogin();
        String password = account.getPassword();


        getDriver().get(getBaseUrl() + "/");
        getDriver().findElement(By.linkText("Вход в личный кабинет")).click();
        getDriver().findElement(By.id("loginform-input-username")).clear();
        getDriver().findElement(By.id("loginform-input-username")).sendKeys(login);
        getDriver().findElement(By.id("loginform-input-password")).clear();
        getDriver().findElement(By.id("loginform-input-password")).sendKeys(password);
        getDriver().findElement(By.name("action")).click();

        getDriver().findElement(By.linkText("Мои резюме")).click();

        if (getResumeProfile().getResumeId() == null || getResumeProfile().getResumeId().equals("")) {
            getDriver().findElement(By.linkText("Создать резюме")).click();
        } else {
            getDriver().get(LINK_OPEN_RESUME + getResumeProfile().getResumeId());
        }


    }

    @Override
    public void logOut() throws Exception {
        getDriver().findElement(By.linkText("Выйти")).click();
    }

    @Override
    public void personalInfoUpdate() throws Exception {
        ResumeProfileType profile = getExchangeMessage().getSynchronizeResumeRequest().getResumeProfile();
        PersonalInfoType personalInfo = profile.getPersonalInfo();

        String resumeID = getResumeProfile().getResumeId();
        //pre
        if (resumeID == null || resumeID.equals("")) {
            getDriver().get(LINK_CHANGE_PERSONAL);
        } else {
            getDriver().get(LINK_CHANGE_PERSONAL + getResumeProfile().getResumeId());
        }
        //------------------

        getDriver().findElement(By.name("lastName.string")).clear();
        getDriver().findElement(By.name("lastName.string")).sendKeys(personalInfo.getLastName());
        getDriver().findElement(By.name("firstName.string")).clear();
        getDriver().findElement(By.name("firstName.string")).sendKeys(personalInfo.getFirstName());
        getDriver().findElement(By.name("middleName.string")).clear();
        getDriver().findElement(By.name("middleName.string")).sendKeys("");

        String day, mounth, year;
        day = String.valueOf(personalInfo.getBirthDate().getDay());
        mounth = "9";//mounth = (String) HHTransformer.getMounths().get(personalInfo.getBirthDate().getMonth());
        year = String.valueOf(personalInfo.getBirthDate().getYear());

        new Select(getDriver().findElement(By.cssSelector("select.form-select.HH-Resume-Birthday-Day"))).selectByVisibleText(day);
        new Select(getDriver().findElement(By.cssSelector("select.form-select.HH-Resume-Birthday-Month"))).selectByVisibleText(mounth);
        new Select(getDriver().findElement(By.cssSelector("select.form-select.HH-Resume-Birthday-Year"))).selectByVisibleText(year);

        String gender = personalInfo.getGender();
        if (gender.equals("male")) {
            getDriver().findElement(By.name("gender.string")).click();
        } else if (gender.equals("female")) {
            getDriver().findElement(By.xpath("(//input[@name='gender.string'])[2]")).click();
        }

        //citizenship
        String citizenship = personalInfo.getCitizenship().getCountryName();
        if (citizenship.equals("Russia")) {
            getDriver().findElement(By.name("citizenship")).click();
        } else {

            getDriver().findElement(By.xpath("(//input[@name='citizenship'])[2]")).click();
            String index = null;//find index into a map by name
            getDriver().findElement(By.xpath("(//input[@name='citizenship.string'])[" + index + "]")).click();
            //  -----------------------
        }

        //+city og Living
        String cityOfLiving = profile.getContactInfo().getCurrentLocation().getCity().getCityName();
        if (cityOfLiving == null) {
            cityOfLiving = "";
        }
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).clear();
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(cityOfLiving);
        //--------------------------------


        getDriver().findElement(By.xpath("//input[@value='Сохранить']")).click();


        //post
        if (resumeID == null || resumeID.equals("")) {


            int index = LINK_VIEW_RESUME.length();
            // index--;
            resumeID = getDriver().getCurrentUrl().substring(index);
            getResumeProfile().setResumeId(resumeID);


        }
        //------------------

    }

    @Override
    public void contactInfoUpdate() throws Exception {

        getDriver().get(LINK_CHANGE_CONTACTS + getResumeProfile().getResumeId());

        ResumeProfileType profile = getExchangeMessage().getSynchronizeResumeRequest().getResumeProfile();
        ContactInfoType contactInfo = profile.getContactInfo();




    }

    @Override
    public void jobExperienceInfoUpdate() throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void educationExperienceInfoUpdate() throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void extraInfoUpdate() throws Exception {
        //+pre!!!
        getDriver().get(LINK_CHANGE_ADDITIONAL + getResumeProfile().getResumeId());


        ResumeProfileType profile = getExchangeMessage().getSynchronizeResumeRequest().getResumeProfile();
        ExtraInfoType extraInfo = profile.getExtraInfo();

        //+relocation Ability
        String relocationAbility = extraInfo.getRelocation();
        switch (relocationAbility) {
            case "not":
                getDriver().findElement(By.name("relocation.string")).click();
                break;
            case "ok":
                getDriver().findElement(By.xpath("(//input[@name='relocation.string'])[2]")).click();
                break;

            case "desirible":
                getDriver().findElement(By.xpath("(//input[@name='relocation.string'])[3]")).click();
                break;

        }
        //----------------

        //+readiness to b-trips
        String businessTripReadiness = extraInfo.getBusinessTripReadiness();
        switch (businessTripReadiness) {
            case "never":
                getDriver().findElement(By.name("businessTripReadiness.string")).click();
                break;
            case "ready":
                getDriver().findElement(By.xpath("(//input[@name='businessTripReadiness.string'])[2]")).click();
                break;

            case "sometimes":
                getDriver().findElement(By.xpath("(//input[@name='businessTripReadiness.string'])[3]")).click();
                break;

        }
        //----------------

        //+workTicket
        String workTicket = extraInfo.getWorkTicket().getCountryName();
        if (workTicket.equals("Russia")) {
            getDriver().findElement(By.name("workTicket")).click();
        } else {

            getDriver().findElement(By.xpath("(//input[@name='workTicket'])[2]")).click();
            String index = null;//find index into a map by name
            getDriver().findElement(By.xpath("(//input[@name='workTicket.string'])[" + index + "]")).click();
            //
        }


        //+travelTime
        String travelTime = extraInfo.getTravelTime();
        switch (travelTime) {
            case "any":
                getDriver().findElement(By.name("travelTime.string")).click();
                break;
            case "1h":
                getDriver().findElement(By.xpath("(//input[@name='travelTime.string'])[2]")).click();
                break;

            case "1.5h":
                getDriver().findElement(By.xpath("(//input[@name='travelTime.string'])[3]")).click();
                break;

        }
        //----------------
    }
}
