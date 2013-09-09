package com.ipetrushin.syncher.ejb.dispatcher.jmsprovider.mdbeans;

import com.ipetrushin.syncher.ejb.dispatcher.core.CommonProcessor;
import com.ipetrushin.syncher.ejb.dispatcher.mappers.impl.HHResumeProfileMapper;
import com.ipetrushin.syncher.ejb.dispatcher.mappers.impl.MonsterProfileMapper;
import com.ipetrushin.syncher.ejb.dispatcher.transformers.HHTransformer;
import com.ipetrushin.syncher.ejb.dispatcher.transformers.MonsterTransformer;
import com.ipetrushin.syncher.request.jaxb.JaxbUtils;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.*;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 06.09.13
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */
@MessageDriven(
        name = "HeadHunterMDB",
        activationConfig = {
                @ActivationConfigProperty(propertyName = "destinationType",
                        propertyValue = "javax.jms.Queue"),


                @ActivationConfigProperty(propertyName = "destination",
                        propertyValue = "monster") // Ext. JNDI Name
        }
)
public class MonsterMDB implements MessageListener {
    @Resource
    private ConnectionFactory connectionFactory;
    @Resource(name = "output.response")
    private Queue answerQueue;


    public MonsterMDB() {
    }

    @Override
    public void onMessage(Message message) {
        System.out.println("*** received message: " + message);
        MonsterProfileMapper profileMapper = new MonsterProfileMapper();
        SyncherMessageType response = null;
        String responseMessage = null;

        try {
            TextMessage textMessage = (TextMessage) message;
            SyncherMessageType exchangeMessage = (SyncherMessageType) JaxbUtils.getInstance().unmarshalStringToObject(textMessage.getText());

            CommonProcessor processor = new CommonProcessor(new MonsterTransformer(), new MonsterProfileMapper());


            processor.process(exchangeMessage);

            response = JaxbUtils.getInstance().buildReportResponse("test","test","test","test");



        } catch (Exception e) {
            response = JaxbUtils.getInstance().buildErrorResponse(e.getClass().toString(),
                    e.getMessage(),
                    e.getStackTrace().toString());

        }finally {
            try{
                responseMessage  = JaxbUtils.getInstance().marshalObjectToString(response);
                respond(responseMessage);
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }

    }

    private void respond(String text) throws JMSException {

        Connection connection = null;
        Session session = null;

        try {
            connection = connectionFactory.createConnection();
            connection.start();

            // Create a Session
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // Create a MessageProducer from the Session to the Topic or Queue
            MessageProducer producer = session.createProducer(answerQueue);
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);

            // Create a message
            TextMessage message = session.createTextMessage(text);

            // Tell the producer to send the message
            producer.send(message);
        } finally {
            // Clean up
            if (session != null) session.close();
            if (connection != null) connection.close();
        }
    }
}
