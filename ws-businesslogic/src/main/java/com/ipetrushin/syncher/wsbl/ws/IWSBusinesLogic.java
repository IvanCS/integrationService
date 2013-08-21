package com.ipetrushin.syncher.wsbl.ws;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

import javax.jws.WebService;

@WebService
public interface IWSBusinesLogic {
    void doSynchronization(SyncherMessageType request);

}
