package com.ipetrushin.syncher.wsrp.ws;

import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

/**
 * @author Ivan
 * @version 1.0
 * @created 10-May-2013 4:31:25 PM
 */
@WebService(endpointInterface = "com.ipetrushin.syncher.wsrp.ws.WSDataProvider")
@Service
public class WSDataProviderImpl implements WSDataProvider {
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