package com.ipetrushin.syncher.wsrp.dao;

import com.googlecode.genericdao.search.Search;
import com.ipetrushin.syncher.wsrp.entities.JobtitleEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class JobTitleDAOImpl extends GenericDAOImpl<JobtitleEntity, Integer> implements JobTitleDAO {

    private Search search;

    public JobTitleDAOImpl() {
        search = new Search();

    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    @Override
    @Transactional
    public JobtitleEntity findByName(String jobtitleName) {
        JobtitleEntity entity;

        getSearch().clear();
        getSearch().addFilterEqual("name", jobtitleName);

        entity = (JobtitleEntity) getSearchProcessor().searchUnique(getSession(), JobtitleEntity.class, search);
        return entity;
    }

    @Override
    public boolean bindReferenceValueHH(JobtitleEntity sourceEntity, String referenceValue) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean bindReferenceValueMonster(JobtitleEntity sourceEntity, String referenceValue) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getHHValueByName(String jobTitleName){
        return null;
    }
}
