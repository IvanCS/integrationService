package com.ipetrushin.syncher.integration.camel.beans.runners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class HHRunner extends CommonRunner {

    public HHRunner() {
        super(new FirefoxDriver(), "http://hh.ru");
    }

    @Override
    protected void personalInfoUpdate() throws Exception {
        getDriver().get(getBaseUrl() + "/");
        String s = getDriver().getPageSource();

        getDriver().findElement(By.linkText("Вход в личный кабинет")).click();
        getDriver().findElement(By.id("loginform-input-username")).clear();
        getDriver().findElement(By.id("loginform-input-username")).sendKeys("saintjoint@gmail.com");
        getDriver().findElement(By.id("loginform-input-password")).clear();
        getDriver().findElement(By.id("loginform-input-password")).sendKeys("saintjoint1");
        getDriver().findElement(By.name("action")).click();
        getDriver().findElement(By.linkText("Мои резюме")).click();
        getDriver().findElement(By.linkText("Создать резюме")).click();
        getDriver().findElement(By.cssSelector("a.resume__emptyblock.m-resume__emptyblock_personal > span.resume__editlink")).click();
      /*
    driver.findElement(By.name("lastName.string")).click();
    driver.findElement(By.name("middleName.string")).clear();
    driver.findElement(By.name("middleName.string")).sendKeys("Alexandrovich");
       */
        List<WebElement> webElements = getDriver().findElements(By.name("gender.string"));
        // webElements.get(0).click();

        WebElement webElement = getDriver().findElement(By.xpath("//input[@name='gender.string' and @value='female']"));
        webElement.click();


        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).click();
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).clear();
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Москва");
        getDriver().findElement(By.xpath("(//input[@name='relocation.string'])[2]")).click();
        getDriver().findElement(By.xpath("(//input[@value=''])[6]")).clear();
        getDriver().findElement(By.xpath("(//input[@value=''])[6]")).sendKeys("Москва");
        getDriver().findElement(By.xpath("(//input[@name='businessTripReadiness.string'])[2]")).click();
        getDriver().findElement(By.xpath("(//input[@name='citizenship'])[2]")).click();
        getDriver().findElement(By.name("citizenship")).click();
        getDriver().findElement(By.xpath("(//input[@name='travelTime.string'])[2]")).click();
        getDriver().findElement(By.xpath("//input[@value='Сохранить']")).click();

    }

    @Override
    protected void contactInfoUpdate() throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void jobExperienceInfoUpdate() throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void educationExperienceInfoUpdate() throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }


}
