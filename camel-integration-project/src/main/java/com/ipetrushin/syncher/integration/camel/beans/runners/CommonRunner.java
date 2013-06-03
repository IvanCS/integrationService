package com.ipetrushin.syncher.integration.camel.beans.runners;

import org.apache.camel.Exchange;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 03.06.13
 * Time: 18:30
 * To change this template use File | Settings | File Templates.
 */
public abstract class CommonRunner implements Runnable {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    protected CommonRunner(WebDriver driverImplementation, String baseUrl) {
        setDriver(driverImplementation);
        setBaseUrl(baseUrl);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public boolean isAcceptNextAlert() {
        return acceptNextAlert;
    }

    public void setAcceptNextAlert(boolean acceptNextAlert) {
        this.acceptNextAlert = acceptNextAlert;
    }

    public StringBuffer getVerificationErrors() {
        return verificationErrors;
    }

    public void setVerificationErrors(StringBuffer verificationErrors) {
        this.verificationErrors = verificationErrors;
    }

    protected void setUp() throws Exception {
        // File pathToBinary = new File("C:\\Users\\ipetrush\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        // FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        // FirefoxProfile firefoxProfile = new FirefoxProfile();
        //  setDriver(new FirefoxDriver(ffBinary, firefoxProfile));

        setDriver(new FirefoxDriver());


        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            //  fail(verificationErrorString);
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

    public void processRequest(Exchange exchange) {
        try {
            //process exchange (xml - > java)
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract void personalInfoUpdate() throws Exception;

    protected abstract void contactInfoUpdate() throws Exception;

    protected abstract void jobExperienceInfoUpdate() throws Exception;

    protected abstract void educationExperienceInfoUpdate() throws Exception;

    @Override
    public void run() {

        try {
            personalInfoUpdate();
            contactInfoUpdate();
            jobExperienceInfoUpdate();
            educationExperienceInfoUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
