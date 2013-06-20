package com.ipetrushin.syncher.wsbl.ws;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;


import javax.jws.WebService;
import javax.xml.ws.Response;
import java.util.List;

@WebService(endpointInterface = "com.ipetrushin.syncher.wsbl.ws.WSRequestDispatcher")
public class WSRequestDispatcherImpl implements WSRequestDispatcher {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public boolean doDispatching(String destinationResourceName, SyncherMessage request) {
       return true;
    }
}
