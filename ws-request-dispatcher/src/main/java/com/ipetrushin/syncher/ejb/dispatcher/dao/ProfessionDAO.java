package com.ipetrushin.syncher.ejb.dispatcher.dao;


import com.ipetrushin.syncher.ejb.dispatcher.dao.entities.ProfessionEntity;


/**
 * Created with IntelliJ IDEA. User: Ivan Date: 5/9/13 Time: 10:50 PM To change
 * this template use File | Settings | File Templates.
 *
 * @author Ivan
 * @version 1.0
 * @created 10-May-2013 4:48:16 PM
 */
public interface ProfessionDAO {


    /**
     * @param professionName
     */
    public ProfessionEntity findByName(String professionName);

    /**
     * @param sourceEntity
     * @param referenceValue
     */
    public boolean bindReferenceValueHH(ProfessionEntity sourceEntity, String referenceValue);

    /**
     * @param sourceEntity
     * @param referenceValue
     */
    public boolean bindReferenceValueMonster(ProfessionEntity sourceEntity, String referenceValue);

    public String getHHValueByName(String professionName);
}