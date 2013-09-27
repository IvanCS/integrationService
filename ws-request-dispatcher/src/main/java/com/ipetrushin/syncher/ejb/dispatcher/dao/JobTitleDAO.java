package com.ipetrushin.syncher.ejb.dispatcher.dao;


import com.ipetrushin.syncher.ejb.dispatcher.core.DestinationService;
import com.ipetrushin.syncher.ejb.dispatcher.dao.entities.JobtitleEntity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface JobTitleDAO extends GenericDAO{

    public JobtitleEntity findByJTName(String jobtitleName);


    public boolean bindJTNameToDestinationService(JobtitleEntity sourceEntity,DestinationService destinationService, String referenceValue);

    public String getJTReferenceName(String name, DestinationService destinationService);
}
