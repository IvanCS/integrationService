package com.ipetrushin.syncher.ejb.dispatcher.ws;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessage;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "com.ipetrushin.syncher.ejb.dispatcher.ws.WSRequestDispatcher")
public class WSRequestDispatcherImpl implements WSRequestDispatcher {


    public WSRequestDispatcherImpl() {
    }

    @Override
    public boolean doDispatching(String destinationResourceName, SyncherMessage request) {
        return true;
    }
}
