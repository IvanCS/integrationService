package com.ipetrushin.syncher.ejb.dispatcher.ws;



import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

import javax.jws.WebService;

@WebService
public interface WSRequestDispatcher {
    boolean doDispatching(String destinationResourceName,SyncherMessageType request);

}
