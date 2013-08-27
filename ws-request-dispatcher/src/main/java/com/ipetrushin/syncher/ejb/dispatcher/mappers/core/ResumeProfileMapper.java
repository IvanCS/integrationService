package com.ipetrushin.syncher.ejb.dispatcher.mappers.core;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 04.06.13
 * Time: 15:38
 * To change this template use File | Settings | File Templates.
 */
public abstract class ResumeProfileMapper extends  WebDriverManager implements IMapper {

    protected ResumeProfileMapper(WebDriver driverImplementation, String baseUrl) {
        super(driverImplementation, baseUrl);
    }

    public abstract void personalInfoUpdate() throws Exception;

    public abstract void contactInfoUpdate() throws Exception;

    public abstract void jobExperienceInfoUpdate() throws Exception;

    public  abstract void educationExperienceInfoUpdate() throws Exception;

    public abstract void logIn() throws Exception;
    public abstract void logOut() throws Exception;

    @Override
    public void run(SyncherMessageType message) throws Exception{
        try {
            setExchangeMessage(message);

            setUp();

            logIn();

            personalInfoUpdate();
            contactInfoUpdate();
            jobExperienceInfoUpdate();
            educationExperienceInfoUpdate();

            logOut();


        } catch (Exception e) {
            e.printStackTrace();
        }  finally {

            tearDown();

        }

    }

    //public void getAllProfiles();
}
