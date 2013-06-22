package com.ipetrushin.syncher.wsrd.ws;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;


import javax.jws.WebService;

@WebService(endpointInterface = "com.ipetrushin.syncher.wsrd.ws.WSRequestDispatcher")
public class WSRequestDispatcherImpl implements WSRequestDispatcher {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public boolean doDispatching(String destinationResourceName, SyncherMessage request) {
       return true;
    }
}
