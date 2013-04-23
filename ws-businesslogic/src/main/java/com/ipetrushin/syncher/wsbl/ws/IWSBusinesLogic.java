package com.ipetrushin.syncher.wsbl.ws;

import com.ipetrushin.syncher.wsbl.jaxb.entities.Account;
import com.ipetrushin.syncher.wsbl.jaxb.entities.SyncherRequest;

import javax.jws.*;
import java.util.List;

@WebService
public interface IWSBusinesLogic {
	 void doSynchronization(SyncherRequest request);
     List<Account> getAvailableAccountsList();
}
