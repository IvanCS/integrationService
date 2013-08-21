package com.ipetrushin.syncher.wsbl.ws;

import com.ipetrushin.syncher.request.jaxb.JaxbUtils;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.*;
import javax.jws.WebService;


@Stateless
@WebService(endpointInterface = "com.ipetrushin.syncher.wsbl.ws.IWSBusinesLogic")
public class WSBusinesLogic implements IWSBusinesLogic {
    @Resource
    private ConnectionFactory connectionFactory;
    @Resource(name = "input")
    private Queue inQueue;

    @Override
    public void doSynchronization(SyncherMessageType request) {
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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                // Clean up
               // if (session != null) session.close();
               // if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }


}
