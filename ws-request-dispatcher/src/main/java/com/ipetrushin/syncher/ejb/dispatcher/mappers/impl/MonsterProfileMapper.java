package com.ipetrushin.syncher.ejb.dispatcher.mappers.impl;

import com.ipetrushin.syncher.ejb.dispatcher.core.ResumeProfileMapper;
import com.ipetrushin.syncher.request.jaxb.entities.AccountType;
import com.ipetrushin.syncher.request.jaxb.entities.PersonalInfoType;
import com.ipetrushin.syncher.request.jaxb.entities.ResumeProfileType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 27.08.13
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */
public class MonsterProfileMapper extends ResumeProfileMapper {
    public MonsterProfileMapper() {
        super(null, "http://monster.com/");
    }

    @Override
    public void logIn() throws Exception {

        AccountType account = getExchangeMessage().getSynchronizeResumeRequest().getAccounts().getAccount().get(0);
        String login = account.getLogin();
        String password = account.getPassword();

        getDriver().get(getBaseUrl() + "/geo/siteselection");
        getDriver().findElement(By.linkText("Russian Federation")).click();
        getDriver().findElement(By.linkText("Вход")).click();

        getDriver().findElement(By.id("Password")).clear();
        getDriver().findElement(By.id("Password")).sendKeys(password);
        getDriver().findElement(By.id("EmailAddress")).clear();
        getDriver().findElement(By.id("EmailAddress")).sendKeys(login);
        getDriver().findElement(By.xpath("//input[@value='Вход']")).click();
    }

    @Override
    public void logOut() throws Exception {
        getDriver().findElement(By.linkText("Выход")).click();
    }

    @Override
    public void personalInfoUpdate() throws Exception {
        ResumeProfileType profile = getExchangeMessage().getSynchronizeResumeRequest().getResumeProfile();
        PersonalInfoType personalInfo = profile.getPersonalInfo();



        getDriver().findElement(By.linkText("Редактировать профиль")).click();
        getDriver().findElement(By.id("FirstName")).clear();
        getDriver().findElement(By.id("FirstName")).sendKeys(personalInfo.getFirstName());
        getDriver().findElement(By.id("MiddleName")).clear();
        getDriver().findElement(By.id("MiddleName")).sendKeys("Alex");
        getDriver().findElement(By.id("LastName")).clear();
        getDriver().findElement(By.id("LastName")).sendKeys("Petrushinr");
        getDriver().findElement(By.cssSelector("input.btn.styleE")).click();

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

    @Override
    public void extraInfoUpdate() throws Exception {

    }
}
