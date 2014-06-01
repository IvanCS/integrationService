package com.ipetrushin.syncher.wsbl.ws;

import com.ipetrushin.syncher.request.jaxb.JaxbUtils;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;
import com.ipetrushin.syncher.wsbl.dao.ResumeDAO;
import com.ipetrushin.syncher.wsbl.dao.RoleDAO;
import com.ipetrushin.syncher.wsbl.dao.UserDAO;
import com.ipetrushin.syncher.wsbl.model.ResumeEntity;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.*;
import javax.jws.WebService;


@Stateless
@WebService(endpointInterface = "com.ipetrushin.syncher.wsbl.ws.IWSBusinesLogic")
public class WSBusinesLogic implements IWSBusinesLogic {


    @Resource
    private ConnectionFactory connectionFactory;
    @Resource(name = "input.request")
    private Queue inQueue;


    @Inject
    private ResumeDAO resumeDAO;
    @Inject
    private RoleDAO roleDAO;
    @Inject
    private UserDAO userDAO;

    public WSBusinesLogic() {
        //this.resumeDAO = new ResumeDAOImpl();
    }

    @Override
    public String authorize(String login, String password) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String registrate(String[] data) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String updateResume(String userId, String resumeId, String newResumeContent) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String doSynchronization(String userId, String resumeId) {
        boolean status = false;
        Connection connection = null;
        Session session = null;
        Message message;
        try {


            connection = connectionFactory.createConnection();
            connection.start();

            // Create a Session
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

           // String exchange = JaxbUtils.getInstance().marshalObjectToString(request);

           if(resumeDAO.isRequestPermittedForTheUser(new Integer(userId),new Integer(resumeId))){

              ResumeEntity resumeEntity =  resumeDAO.find(new Integer(resumeId));
              String exchangeContent  = resumeEntity.getContentdata();

               message = session.createTextMessage(exchangeContent);
               SyncherMessageType t = (SyncherMessageType) JaxbUtils.getInstance().unmarshalStringToObject(exchangeContent);

               // Create a MessageProducer from the Session to the Topic or Queue
               MessageProducer producer = session.createProducer(inQueue);
               producer.setDeliveryMode(DeliveryMode.PERSISTENT);


               // Tell the producer to send the message
               producer.send(message);
               status = true;

           }   else {
               status = false;
           }

        } catch (Exception e) {

            e.printStackTrace();
            status = false;
        } finally {

            try {
                // Clean up
                //  if (session != null) session.close();
                // if (connection != null) connection.close();
            } catch (Exception e) {

                e.printStackTrace();
            }
            return String.valueOf(status);
        }
    }

    @Override
    public String getRequestResponseStatus(String idRequest) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String[] getListOfAvailableWebResources() {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String[] getListOfGenders() {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String[] getListOfLanguages() {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String[] getListOfCountries() {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String[] getListOfProfessions() {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String[] getListOfJobTitlesByProfession(String professionName) {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String[] getListOfCitiesByCountry(String country) {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }
}
