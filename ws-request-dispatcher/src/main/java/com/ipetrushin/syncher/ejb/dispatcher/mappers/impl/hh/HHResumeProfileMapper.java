package com.ipetrushin.syncher.ejb.dispatcher.mappers.impl.hh;


import com.ipetrushin.syncher.ejb.dispatcher.mappers.core.ResumeProfileMapper;
import com.ipetrushin.syncher.ejb.dispatcher.mappers.core.WebDriverManager;
import com.ipetrushin.syncher.ejb.dispatcher.transformers.HHTransformer;
import com.ipetrushin.syncher.request.jaxb.entities.AccountType;
import com.ipetrushin.syncher.request.jaxb.entities.PersonalInfoType;
import com.ipetrushin.syncher.request.jaxb.entities.ResumeProfileType;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HHResumeProfileMapper extends ResumeProfileMapper {

    public HHResumeProfileMapper() {
        super(null, "http://hh.ru");
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
        getDriver().findElement(By.linkText("Создать резюме")).click();
    }

    @Override
    public void logOut() throws Exception {
        getDriver().findElement(By.linkText("Выйти")).click();
    }

    @Override
    public void personalInfoUpdate() throws Exception {
        ResumeProfileType profile = getExchangeMessage().getSynchronizeResumeRequest().getResumeProfile();
        PersonalInfoType personalInfo = profile.getPersonalInfo();

        getDriver().findElement(By.cssSelector("a.resume__emptyblock.m-resume__emptyblock_personal > span.resume__editlink")).click();

        getDriver().findElement(By.name("lastName.string")).clear();
        getDriver().findElement(By.name("lastName.string")).sendKeys(personalInfo.getLastname());
        getDriver().findElement(By.name("firstName.string")).clear();
        getDriver().findElement(By.name("firstName.string")).sendKeys(personalInfo.getFirstname());
        getDriver().findElement(By.name("middleName.string")).clear();
        getDriver().findElement(By.name("middleName.string")).sendKeys("");

        String day, mounth, year;
        day = String.valueOf(personalInfo.getBirthDate().getDay());
        mounth = (String) HHTransformer.getMounths().get(personalInfo.getBirthDate().getMonth());
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


        //+city og Living
        String cityOfLiving = profile.getContactInfo().getCurrentLocation().getCity().getCityName();
        if(cityOfLiving == null){
            cityOfLiving = "";
        }
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).clear();
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(cityOfLiving);
        //--------------------------------

        //+relocation Ability
        String relocationAbility = personalInfo.getRelocation();
        switch (relocationAbility){
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
        String businessTripReadiness = personalInfo.getBusinessTripReadiness();
        switch (businessTripReadiness){
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

        //getDriver().findElement(By.xpath("(//input[@value=''])[6]")).clear();
      //  getDriver().findElement(By.xpath("(//input[@value=''])[6]")).sendKeys("Москва");
      //  getDriver().findElement(By.cssSelector("button.jsxComponent-Tags-Appender.jsx-component-autocomplete-selected-hidden")).click();

         String citizenship = personalInfo.getCitizenship().getCountryName();
        if(citizenship.equals("Russia")){
            getDriver().findElement(By.name("citizenship")).click();
        } else{

            getDriver().findElement(By.xpath("(//input[@name='citizenship'])[2]")).click();
            String index =  null;//find index into a map by name
           getDriver().findElement(By.xpath("(//input[@name='citizenship.string'])["+index+"]")).click();
            //
        }

        //+workTicket
        String workTicket =  personalInfo.getWorkTicket().getCountryName();
        if(workTicket.equals("Russia")){
            getDriver().findElement(By.name("workTicket")).click();
        } else{

            getDriver().findElement(By.xpath("(//input[@name='workTicket'])[2]")).click();
            String index =  null;//find index into a map by name
            getDriver().findElement(By.xpath("(//input[@name='workTicket.string'])["+index+"]")).click();
            //
        }


        //+travelTime
        String travelTime =  personalInfo.getTravelTime();
        switch (travelTime){
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


        getDriver().findElement(By.xpath("//input[@value='Сохранить']")).click();
    }

    @Override
    public void contactInfoUpdate() throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void jobExperienceInfoUpdate() throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void educationExperienceInfoUpdate() throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }



}
