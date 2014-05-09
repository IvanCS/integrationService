package com.ipetrushin.syncher.ejb.dispatcher.dao;

//import com.googlecode.genericdao.search.Search;
import com.ipetrushin.syncher.ejb.dispatcher.core.DestinationService;
import com.ipetrushin.syncher.ejb.dispatcher.dao.entities.JobtitleEntity;
//import org.hibernate.Query;

import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class JobTitleDAOImpl extends GenericDAOImpl<JobtitleEntity, Integer> implements JobTitleDAO {

    //private Search search;

    public JobTitleDAOImpl() {
        super(JobtitleEntity.class);
        //search = new Search();

    }

   /* public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }
      */
    public String getHHValueByName(String jobTitleName) {
        return null;
    }

    @Override
    public JobtitleEntity findByJTName(String jobtitleName) {
        JobtitleEntity entity = null;

      //  getSearch().clear();
     //   getSearch().addFilterEqual("name", jobtitleName);

      //  entity = (JobtitleEntity) getSearchProcessor().searchUnique(getSession(), JobtitleEntity.class, getSearch());
        return entity;
    }

    @Override
    public boolean bindJTNameToDestinationService(JobtitleEntity sourceEntity, DestinationService destinationService, String referenceValue) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getJTReferenceName(String name, DestinationService destinationService) {
        Query query = null;
        String result = null;
        try {

            switch (destinationService) {
                case HH: {
                    query = getEM().createQuery("select jthh.name " +
                                                        "from  JobtitlehhEntity as jthh " +
                                                        "where jthh.jobtitlehhid = " +
                                                                 "(select jt.referenceValueHh " +
                                                                     "from JobtitleEntity as jt " +
                                                                     "where jt.name = ?)"
                                                        );
                    break;
                }
                case MONSTER: {
                    query = getEM().createQuery("select jtmonster.name " +
                                                        "from  JobtitlemonsterEntity as jtmonster " +
                                                        "where jtmonster.jobtitlemonsterid = " +
                                                               "(select jt.referenceValueHh " +
                                                                    "from JobtitleEntity as jt " +
                                                                    "where jt.name = ?)"
                    );
                    break;
                }
            }


            query.setParameter(0, name);

            result = query.getSingleResult().toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return result;
        }


    }


}
