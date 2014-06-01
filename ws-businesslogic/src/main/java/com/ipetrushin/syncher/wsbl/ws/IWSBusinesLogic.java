package com.ipetrushin.syncher.wsbl.ws;


import javax.jws.WebService;



@WebService
public interface IWSBusinesLogic{


    String authorize(String login, String password);
    String registrate(String[] data);
    String updateResume(String userId,String resumeId, String newResumeContent);

    String doSynchronization(String userId, String resumeId);
    String getRequestResponseStatus(String idRequest);

    String[] getListOfAvailableWebResources();

    String[] getListOfGenders();

    String[] getListOfLanguages();

    String[] getListOfCountries();

    String[] getListOfProfessions();

    String[] getListOfJobTitlesByProfession(String professionName);

    String[] getListOfCitiesByCountry(String country);



}
