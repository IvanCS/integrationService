package com.ipetrushin.syncher.ejb.dispatcher.dao;


//import com.googlecode.genericdao.search.Search;
import com.ipetrushin.syncher.ejb.dispatcher.dao.entities.ProfessionEntity;


import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA. User: Ivan Date: 5/9/13 Time: 10:51 PM To change
 * this template use File | Settings | File Templates.
 *
 * @author Ivan
 * @version 1.0
 * @created 10-May-2013 4:48:16 PM
 */

@Stateless
public class ProfessionDAOImpl extends GenericDAOImpl<ProfessionEntity, Integer> implements ProfessionDAO {

   // private Search search;

    public ProfessionDAOImpl() {
   //     setSearch(new Search());
    }

 //   private Search getSearch() {
  //      return search;
  //  }

   // private void setSearch(Search search) {
   //     this.search = search;
  //  }

    /**
     * @param professionName
     */
    public ProfessionEntity findByName(String professionName) {
        ProfessionEntity entity = null;

     //   getSearch().clear();
     //   getSearch().addFilterEqual("name", professionName);

      //  entity = (ProfessionEntity) getSearchProcessor().searchUnique(getSession(), ProfessionEntity.class, search);
        return entity;

    }

    /**
     * @param sourceEntity
     * @param referenceValue
     */
    public boolean bindReferenceValueHH(ProfessionEntity sourceEntity, String referenceValue) {
        return false;
    }

    /**
     * @param sourceEntity
     * @param referenceValue
     */
    public boolean bindReferenceValueMonster(ProfessionEntity sourceEntity, String referenceValue) {
        return false;
    }

    public String getHHValueByName(String professionName){
        return null;
    }

}