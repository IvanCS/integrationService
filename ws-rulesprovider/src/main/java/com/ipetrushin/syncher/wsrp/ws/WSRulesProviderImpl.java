package com.ipetrushin.syncher.wsrp.ws;

import com.ipetrushin.syncher.wsrp.dao.JobTitleDAO;
import com.ipetrushin.syncher.wsrp.dao.ProfessionDAO;
import com.ipetrushin.syncher.wsrp.entities.JobtitleEntity;
import com.ipetrushin.syncher.wsrp.entities.JobtitlehhEntity;
import com.ipetrushin.syncher.wsrp.entities.ProfessionEntity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.io.File;
import java.util.concurrent.TimeUnit;

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
    @Autowired
    private JobTitleDAO jobTitleDAO;

	public WSRulesProviderImpl(){

	}

    private void setProfessionDAO(ProfessionDAO professionDAO) {
        this.professionDAO = professionDAO;
    }

    private ProfessionDAO getProfessionDAO() {

        return professionDAO;
    }

    private JobTitleDAO getJobTitleDAO() {
        return jobTitleDAO;
    }

    private void setJobTitleDAO(JobTitleDAO jobTitleDAO) {
        this.jobTitleDAO = jobTitleDAO;
    }

    public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param jobtitleName
	 */
	public String getJobtitleRefHH(String jobtitleName){


        JobtitleEntity jobtitleEntity =  getJobTitleDAO().findByName(jobtitleName);
        JobtitlehhEntity hhEntity = jobtitleEntity.getJobtitlehhByReferenceValueHh();
        return  hhEntity.getName();

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
        ProfessionEntity entity =  getProfessionDAO().findByName(professionName);
        entity.getProfessionhhByReferenceValueHh().getName();
	    return   entity.getProfessionhhByReferenceValueHh().getName();
	}

	/**
	 * 
	 * @param professionName
	 */
	public String getProfessionRefMonster(String professionName){
		return "";
	}


}