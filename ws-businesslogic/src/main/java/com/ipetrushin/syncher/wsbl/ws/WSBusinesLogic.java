package com.ipetrushin.syncher.wsbl.ws;


import com.ipetrushin.syncher.wsbl.jaxb.entities.Account;
import com.ipetrushin.syncher.wsbl.jaxb.entities.SyncherRequest;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.ipetrushin.syncher.wsbl.ws.IWSBusinesLogic")
public class WSBusinesLogic implements IWSBusinesLogic{

    @Override
    public void doSynchronization(SyncherRequest request) {

    }

    @Override
    public List<Account> getAvailableAccountsList() {
        return  null;
    }
}
