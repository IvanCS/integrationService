package com.ipetrushin.syncher.wsrp.ws;

import javax.jws.WebService;
import java.util.List;

/**
 * @author Ivan
 * @version 1.0
 * @created 10-May-2013 4:31:25 PM
 */
@WebService
public interface WSRulesProvider {

    /**
     * @param jobtitleName
     */
    public String getJobtitleRefHH(String jobtitleName);

    /**
     * @param jobtitleName
     */
    public String getJobtitleRefMonster(String jobtitleName);

    /**
     * @param professionName
     */
    public String getProfessionRefHH(String professionName);

    /**
     * @param professionName
     */
    public String getProfessionRefMonster(String professionName);

    List<String> getListOfAvailableWebResources();

    List<String> getListOfGenders();

    List<String> getListOfLanguages();

    List<String> getListOfCountries();

    List<String> getListOfProfessions();

    List<String> getListOfJobTitlesByProfession(String professionName);

    List<String> getListOfCitiesByCountry(String country);

}