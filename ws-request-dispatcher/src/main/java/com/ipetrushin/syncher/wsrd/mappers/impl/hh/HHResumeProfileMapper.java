package com.ipetrushin.syncher.wsrd.mappers.impl.hh;


import com.ipetrushin.syncher.request.jaxb.entities.Account;
import com.ipetrushin.syncher.wsrd.mappers.core.IResumeProfileMapper;
import com.ipetrushin.syncher.wsrd.mappers.core.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HHResumeProfileMapper extends WebDriverManager implements IResumeProfileMapper {

    public HHResumeProfileMapper() {
        super(new FirefoxDriver(), "http://hh.ru");
    }

    @Override
    public void logIn() throws Exception {
        Account account = getExchange().getRequestSynchronizeResume().getAccounts().getAccount().get(0);
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
        getDriver().findElement(By.cssSelector("a.resume__emptyblock.m-resume__emptyblock_personal > span.resume__editlink")).click();

        getDriver().findElement(By.name("lastName.string")).clear();
        getDriver().findElement(By.name("lastName.string")).sendKeys("Петр");
        getDriver().findElement(By.name("firstName.string")).clear();
        getDriver().findElement(By.name("firstName.string")).sendKeys("Иа");
        getDriver().findElement(By.name("middleName.string")).clear();
        getDriver().findElement(By.name("middleName.string")).sendKeys("Ал");
        new Select(getDriver().findElement(By.cssSelector("select.form-select.HH-Resume-Birthday-Day"))).selectByVisibleText("16");
        new Select(getDriver().findElement(By.cssSelector("select.form-select.HH-Resume-Birthday-Month"))).selectByVisibleText("марта");
        new Select(getDriver().findElement(By.cssSelector("select.form-select.HH-Resume-Birthday-Year"))).selectByVisibleText("1985");
        getDriver().findElement(By.xpath("(//input[@name='gender.string'])[2]")).click();
        getDriver().findElement(By.name("gender.string")).click();
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).clear();
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Воронеж");
        getDriver().findElement(By.xpath("(//input[@name='relocation.string'])[3]")).click();
        getDriver().findElement(By.xpath("(//input[@value=''])[6]")).clear();
        getDriver().findElement(By.xpath("(//input[@value=''])[6]")).sendKeys("Москва");
        getDriver().findElement(By.cssSelector("button.jsxComponent-Tags-Appender.jsx-component-autocomplete-selected-hidden")).click();
        getDriver().findElement(By.xpath("(//input[@name='businessTripReadiness.string'])[2]")).click();
        getDriver().findElement(By.xpath("(//input[@name='citizenship'])[2]")).click();
        getDriver().findElement(By.name("citizenship.string")).click();
        getDriver().findElement(By.xpath("(//input[@name='citizenship.string'])[2]")).click();
        getDriver().findElement(By.xpath("(//input[@name='workTicket'])[2]")).click();
        getDriver().findElement(By.name("travelTime.string")).click();
        getDriver().findElement(By.xpath("//input[@value='Сохранить']")).click();
        ////input[@resource-name='hh.ru']
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
    public void run() {

        try {

            setUp();

            logIn();

            personalInfoUpdate();
            contactInfoUpdate();
            jobExperienceInfoUpdate();
            educationExperienceInfoUpdate();

            logOut();

            tearDown();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
