package com.ipetrushin.syncher.wsbl.ws;


import com.ipetrushin.syncher.wsbl.jaxb.entities.Account;
import com.ipetrushin.syncher.wsbl.jaxb.entities.SyncherRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.ipetrushin.syncher.wsbl.ws.IWSBusinesLogic")
public class WSBusinesLogic implements IWSBusinesLogic{

    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void doSynchronization(SyncherRequest request) {

        jmsTemplate.send(
                new MessageCreator() {
                    public Message createMessage(Session session) throws JMSException {
                        MapMessage mapMessage = session.createMapMessage();
                        mapMessage.setInt("orderId", 1);
                        mapMessage.setInt("customerId", 2);
                        mapMessage.setDouble("price", 3);
                        mapMessage.setString("orderCode", "4");
                        return mapMessage;
                    }
                } );
    }

    @Override
    public List<Account> getAvailableAccountsList() {
        return  null;
    }




}
