package com.ipetrushin.syncher.wsrp.dao;

import com.ipetrushin.syncher.wsrp.entities.JobtitleEntity;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface JobTitleDAO {
    /**
     *
     * @param jobtitleName
     */
    public JobtitleEntity findByName(String jobtitleName);

    /**
     *
     * @param sourceEntity
     * @param referenceValue
     */
    public boolean bindReferenceValueHH(JobtitleEntity sourceEntity, String referenceValue);

    /**
     *
     * @param sourceEntity
     * @param referenceValue
     */
    public boolean bindReferenceValueMonster(JobtitleEntity sourceEntity, String referenceValue);

}
