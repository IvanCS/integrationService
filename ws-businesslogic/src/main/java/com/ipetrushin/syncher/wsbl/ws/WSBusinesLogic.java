package com.ipetrushin.syncher.wsbl.ws;

import com.ipetrushin.syncher.request.jaxb.entities.Account;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherRequest;
import com.ipetrushin.syncher.wsbl.jmsprovider.JMSCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.ipetrushin.syncher.wsbl.ws.IWSBusinesLogic")
public class WSBusinesLogic implements IWSBusinesLogic{

    @Autowired
    private JmsTemplate jmsTemplate;

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void doSynchronization(SyncherRequest request) {

        JMSCreator jmsCreator = new JMSCreator(request);
        getJmsTemplate().send(jmsCreator);

    }

    @Override
    public List<Account> getAvailableAccountsList() {
        return  null;
    }




}
