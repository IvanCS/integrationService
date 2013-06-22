package com.ipetrushin.syncher.wsrd.ws;



import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessage;

import javax.jws.*;

@WebService
public interface WSRequestDispatcher {
    boolean doDispatching(String destinationResourceName,SyncherMessage request);

}
