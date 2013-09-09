package com.ipetrushin.syncher.wsrp.ws;

import com.ipetrushin.syncher.wsrp.dao.JobTitleDAO;
import com.ipetrushin.syncher.wsrp.dao.ProfessionDAO;
import com.ipetrushin.syncher.wsrp.entities.JobtitleEntity;
import com.ipetrushin.syncher.wsrp.entities.JobtitlehhEntity;
import com.ipetrushin.syncher.wsrp.entities.ProfessionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

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

    public WSRulesProviderImpl() {

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
     * @param jobtitleName
     */
    public String getJobtitleRefHH(String jobtitleName) {


        JobtitleEntity jobtitleEntity = getJobTitleDAO().findByName(jobtitleName);
        JobtitlehhEntity hhEntity = jobtitleEntity.getJobtitlehhByReferenceValueHh();
        return hhEntity.getName();

    }

    /**
     * @param jobtitleName
     */
    public String getJobtitleRefMonster(String jobtitleName) {
        return "";
    }

    /**
     * @param professionName
     */
    public String getProfessionRefHH(String professionName) {
        ProfessionEntity entity = getProfessionDAO().findByName(professionName);
        entity.getProfessionhhByReferenceValueHh().getName();
        return entity.getProfessionhhByReferenceValueHh().getName();
    }

    /**
     * @param professionName
     */
    public String getProfessionRefMonster(String professionName) {
        return "";
    }

    @Override
    public List<String> getListOfAvailableWebResources() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getListOfGenders() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getListOfLanguages() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getListOfCountries() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getListOfProfessions() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getListOfJobTitlesByProfession(String professionName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getListOfCitiesByCountry(String country) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}