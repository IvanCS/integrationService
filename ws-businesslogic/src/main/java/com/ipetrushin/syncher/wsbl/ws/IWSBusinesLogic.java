package com.ipetrushin.syncher.wsbl.ws;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

import javax.jws.WebService;
import java.rmi.Remote;
import java.util.List;


@WebService
public interface IWSBusinesLogic {
    boolean doSynchronization(SyncherMessageType request);

    List<String> getListOfAvailableWebResources();

    List<String> getListOfGenders();

    List<String> getListOfLanguages();

    List<String> getListOfCountries();

    List<String> getListOfProfessions();

    List<String> getListOfJobTitlesByProfession(String professionName);

    List<String> getListOfCitiesByCountry(String country);



}
