package com.ipetrushin.syncher.integration.camel.beans.mappers.core;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 04.06.13
 * Time: 15:38
 * To change this template use File | Settings | File Templates.
 */
public interface IResumeProfileMapper extends ICommonMapper {

    public  void personalInfoUpdate() throws Exception;

    public void contactInfoUpdate() throws Exception;

    public void jobExperienceInfoUpdate() throws Exception;

    public void educationExperienceInfoUpdate() throws Exception;

    //public void getAllProfiles();
}
