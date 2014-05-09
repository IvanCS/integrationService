package com.ipetrushin.syncher.ejb.dispatcher.mappers.impl;


import com.ipetrushin.syncher.ejb.dispatcher.core.ResumeProfileMapper;
import com.ipetrushin.syncher.ejb.dispatcher.transformers.HHTransformer;
import com.ipetrushin.syncher.request.jaxb.entities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    private void setupProfileID(String currentLink){
        String resumeID = resumeProfile.getResumeId();

        if (resumeID == null || resumeID.equals("")) {


            int index = currentLink.length();
            // index--;
            resumeID = getDriver().getCurrentUrl().substring(index);
            getResumeProfile().setResumeId(resumeID);


        }
    }
    @Override
    public void logIn() throws Exception {
        AccountType account = getExchangeMessage().getSynchronizeResumeRequest().getAccounts().getAccount().get(0);
        String login = account.getLogin();
        String password = account.getPassword();

        resumeProfile = getExchangeMessage().getSynchronizeResumeRequest().getResumeProfile();


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
        PersonalInfoType personalInfo = resumeProfile.getPersonalInfo();

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
        mounth = "сентября";//mounth = (String) HHTransformer.getMounths().get(personalInfo.getBirthDate().getMonth());
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
        String cityOfLiving = resumeProfile.getContactInfo().getCurrentLocation().getCity().getCityName();
        if (cityOfLiving == null) {
            cityOfLiving = "";
        }
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).clear();
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(cityOfLiving);
        //--------------------------------


       getDriver().findElement(By.xpath("//input[@value='Сохранить']")).submit();

        /*
        (new WebDriverWait(getDriver(), 5)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().startsWith("http://voronezh.hh.ru/applicant/resumes/view?");
            }
        });

*/
    //  WebElement e =   getDriver().findElement(By.xpath("//a/Отмена"));
    //  String a =   e.getAttribute("hreaf");

      // WebDriverWait wait = new WebDriverWait(getDriver(),5);
     //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Сохранить']")));

     //   getDriver().findElement(By.cssSelector("a.resume__emptyblock.m-resume__emptyblock_contacts > span.resume__editlink")).click();


        //post
         setupProfileID(LINK_CHANGE_PERSONAL);
        //------------------

    }

    @Override
    public void contactInfoUpdate() throws Exception {


        getDriver().get(LINK_CHANGE_CONTACTS + getResumeProfile().getResumeId());

        ResumeProfileType profile = getExchangeMessage().getSynchronizeResumeRequest().getResumeProfile();
        ContactInfoType contactInfo = profile.getContactInfo();

        //phone number
        String pCountry, pCity, pNumber;
        String[] phone = contactInfo.getMobilePhone().split("\\s+") ;
        pCountry = phone[0];
        pCity = phone[1];
        pNumber = phone[2];

        getDriver().findElement(By.name("phone.country")).sendKeys(pCountry);
        getDriver().findElement(By.name("phone.city")).sendKeys(pCity);
        getDriver().findElement(By.name("phone.number")).sendKeys(pNumber);
        //----------------------

        //add some another phones => requires of changing of request schema
        /*
            //[2] - home
            driver.findElement(By.xpath("(//input[@name='phone.city'])[2]")).sendKeys("88");
            driver.findElement(By.xpath("(//input[@name='phone.number'])[2]")).sendKeys("777");
            driver.findElement(By.xpath("(//input[@name='phone.country'])[2]")).sendKeys("8");

            //[3]- work
            driver.findElement(By.xpath("(//input[@name='phone.country'])[3]")).sendKeys("8");
            driver.findElement(By.xpath("(//input[@name='phone.city'])[3]")).sendKeys("787");
            driver.findElement(By.xpath("(//input[@name='phone.number'])[3]")).sendKeys("787");
         */

        //email
        String email = contactInfo.getEmail();
        getDriver().findElement(By.name("email.string")).sendKeys(email);

        //icq
        String icq =  contactInfo.getIcq();
        getDriver().findElement(By.cssSelector("input.HH-Resume-PersonalSites-Input.form-text")).clear();
        getDriver().findElement(By.cssSelector("input.HH-Resume-PersonalSites-Input.form-text")).sendKeys(icq);

        //following need complex xpath
      /*  //skype
        String skype =  contactInfo.getSkype();

        getDriver().findElement(By.xpath("(//input[@value=''])[14]")).clear();
        getDriver().findElement(By.xpath("(//input[@value=''])[14]")).sendKeys(skype);

        getDriver().findElement(By.xpath("//html[@id='js-enabled']/body/div[4]/div/table/tbody/tr/td/form/table[2]/tbody/tr[10]/td[2]/div/span/span")).click();
        getDriver().findElement(By.cssSelector("span.g-switcher.HH-Resume-PersonalSites-Link")).click();
        getDriver().findElement(By.xpath("(//input[@value=''])[25]")).clear();
        getDriver().findElement(By.xpath("(//input[@value=''])[25]")).sendKeys("freelance");

        getDriver().findElement(By.xpath("//html[@id='js-enabled']/body/div[4]/div/table/tbody/tr/td/form/table[2]/tbody/tr[10]/td[2]/div/span/span")).click();
        getDriver().findElement(By.xpath("//span[@onclick=\"return 'moi_krug'\"]")).click();
        getDriver().findElement(By.xpath("(//input[@value=''])[24]")).clear();
        getDriver().findElement(By.xpath("(//input[@value=''])[24]")).sendKeys("mycircle");

        getDriver().findElement(By.xpath("//html[@id='js-enabled']/body/div[4]/div/table/tbody/tr/td/form/table[2]/tbody/tr[10]/td[2]/div/span/span")).click();
        getDriver().findElement(By.xpath("//span[@onclick=\"return 'linkedin'\"]")).click();
        getDriver().findElement(By.xpath("(//input[@value=''])[23]")).clear();
        getDriver().findElement(By.xpath("(//input[@value=''])[23]")).sendKeys("linkin");

        String fbLink = contactInfo.getFacebook();
        if(fbLink == null){
            fbLink = "";
        }
        getDriver().findElement(By.xpath("//html[@id='js-enabled']/body/div[4]/div/table/tbody/tr/td/form/table[2]/tbody/tr[10]/td[2]/div/span/span")).click();
        getDriver().findElement(By.xpath("//span[@onclick=\"return 'facebook'\"]")).click();
        getDriver().findElement(By.xpath("(//input[@value=''])[22]")).clear();
        getDriver().findElement(By.xpath("(//input[@value=''])[22]")).sendKeys(fbLink);

        String ljLink = contactInfo.getWebSite();
        if(ljLink == null){
            ljLink = "";
        }
        getDriver().findElement(By.xpath("//html[@id='js-enabled']/body/div[4]/div/table/tbody/tr/td/form/table[2]/tbody/tr[10]/td[2]/div/span/span")).click();
        getDriver().findElement(By.xpath("//span[@onclick=\"return 'livejournal'\"]")).click();
        getDriver().findElement(By.xpath("(//input[@value=''])[21]")).clear();
        getDriver().findElement(By.xpath("(//input[@value=''])[21]")).sendKeys(ljLink);


        String extraLink = contactInfo.getWebSite();
        if(extraLink == null){
            extraLink = "";
        }
        getDriver().findElement(By.xpath("//html[@id='js-enabled']/body/div[4]/div/table/tbody/tr/td/form/table[2]/tbody/tr[10]/td[2]/div/span/span")).click();
        getDriver().findElement(By.xpath("//span[@onclick=\"return 'personal'\"]")).click();
        getDriver().findElement(By.xpath("(//input[@value=''])[20]")).clear();
        getDriver().findElement(By.xpath("(//input[@value=''])[20]")).sendKeys(extraLink);

 */

        //post

        getDriver().findElement(By.xpath("//input[@value='Сохранить']")).submit();
        setupProfileID(LINK_CHANGE_CONTACTS);
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
