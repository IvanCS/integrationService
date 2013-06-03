package com.ipetrushin.syncher.integration.camel.beans;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HHRunner {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://voronezh.hh.ru";
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testTc1() throws Exception {

    driver.get(baseUrl + "/");
      String s = driver.getPageSource();
    driver.findElement(By.linkText("Вход в личный кабинет")).click();
    driver.findElement(By.id("loginform-input-username")).clear();
    driver.findElement(By.id("loginform-input-username")).sendKeys("saintjoint@gmail.com");
    driver.findElement(By.id("loginform-input-password")).clear();
    driver.findElement(By.id("loginform-input-password")).sendKeys("saintjoint1");
      driver.findElement(By.name("action")).click();
    driver.findElement(By.linkText("Мои резюме")).click();
    driver.findElement(By.linkText("Создать резюме")).click();
    driver.findElement(By.cssSelector("a.resume__emptyblock.m-resume__emptyblock_personal > span.resume__editlink")).click();
    driver.findElement(By.name("lastName.string")).click();
    driver.findElement(By.name("middleName.string")).clear();
    driver.findElement(By.name("middleName.string")).sendKeys("Alexandrovich");
    driver.findElement(By.name("gender.string")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Москва");
    driver.findElement(By.xpath("(//input[@name='relocation.string'])[2]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[6]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[6]")).sendKeys("Москва");
    driver.findElement(By.xpath("(//input[@name='businessTripReadiness.string'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='citizenship'])[2]")).click();
    driver.findElement(By.name("citizenship")).click();
    driver.findElement(By.xpath("(//input[@name='travelTime.string'])[2]")).click();
    driver.findElement(By.xpath("//input[@value='Сохранить']")).click();

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
