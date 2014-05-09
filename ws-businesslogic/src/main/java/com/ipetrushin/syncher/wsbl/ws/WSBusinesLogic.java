package com.ipetrushin.syncher.wsbl.ws;

import com.ipetrushin.syncher.request.jaxb.JaxbUtils;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.*;
import javax.jws.WebService;
import java.util.List;


@Stateless
@WebService(endpointInterface = "com.ipetrushin.syncher.wsbl.ws.IWSBusinesLogic")
public class WSBusinesLogic implements IWSBusinesLogic {


    @Resource
    private ConnectionFactory connectionFactory;
    @Resource(name = "input.request")
    private Queue inQueue;

    @Override
    public boolean doSynchronization(SyncherMessageType request) {
        boolean status = false;
        Connection connection = null;
        Session session = null;
        Message message;
        try {


            connection = connectionFactory.createConnection();
            connection.start();

            // Create a Session
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            String exchange = JaxbUtils.getInstance().marshalObjectToString(request);
            message = session.createTextMessage(exchange);

            SyncherMessageType t = (SyncherMessageType) JaxbUtils.getInstance().unmarshalStringToObject(exchange);

            // Create a MessageProducer from the Session to the Topic or Queue
            MessageProducer producer = session.createProducer(inQueue);
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);


            // Tell the producer to send the message
            producer.send(message);
            status = true;
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
            return status;
        }

    }

    @Override
    public List<String> getListOfAvailableWebResources() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getListOfCountries() {
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
