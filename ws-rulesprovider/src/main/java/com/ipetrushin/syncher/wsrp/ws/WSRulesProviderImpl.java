package com.ipetrushin.syncher.wsrp.ws;

import com.ipetrushin.syncher.wsrp.dao.ProfessionDAO;
import com.ipetrushin.syncher.wsrp.entities.ProfessionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @author Ivan
 * @version 1.0
 * @created 10-May-2013 4:31:25 PM
 */
@WebService(endpointInterface = "com.ipetrushin.syncher.wsrp.ws.WSRulesProvider")
@Service
public class WSRulesProviderImpl implements WSRulesProvider {



    @Autowired
    private ProfessionDAO professionDAO;

	public WSRulesProviderImpl(){

	}

    private void setProfessionDAO(ProfessionDAO professionDAO) {
        this.professionDAO = professionDAO;
    }

    private ProfessionDAO getProfessionDAO() {

        return professionDAO;
    }


	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param jobtitleName
	 */
	public String getJobtitleRefHH(String jobtitleName){
        ProfessionEntity entity = new ProfessionEntity();
       // entity.setProfessionId(2);
        entity.setName("TestEntity");

        getProfessionDAO().addEntity(entity);

		return "";
	}

	/**
	 * 
	 * @param jobtitleName
	 */
	public String getJobtitleRefMonster(String jobtitleName){
		return "";
	}

	/**
	 * 
	 * @param professionName
	 */
	public String getProfessionRefHH(String professionName){
		return "";
	}

	/**
	 * 
	 * @param professionName
	 */
	public String getProfessionRefMonster(String professionName){
		return "";
	}


}