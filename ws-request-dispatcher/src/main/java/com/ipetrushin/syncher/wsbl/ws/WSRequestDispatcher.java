package com.ipetrushin.syncher.wsbl.ws;



import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessage;

import javax.jws.*;
import javax.xml.ws.Response;
import java.util.List;

@WebService
public interface WSRequestDispatcher {
    boolean doDispatching(String destinationResourceName,SyncherMessage request);

}
