package com.ipetrushin.syncher.integration.camel.beans.processors;

import com.ipetrushin.syncher.integration.camel.exceptions.SynchronizeRequestException;
import com.ipetrushin.syncher.request.jaxb.entities.AccountType;
import com.ipetrushin.syncher.request.jaxb.entities.ResumeProfileType;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;
import com.ipetrushin.syncher.request.jaxb.entities.SynchronizeResumeRequestType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;


public class HHRulesProcessor implements Processor {

    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(HHRulesProcessor.class);

    public HHRulesProcessor() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        try {

            SyncherMessageType syncherMessage = exchange.getIn().getBody(SyncherMessageType.class);
            SynchronizeResumeRequestType hhRequest = syncherMessage.getSynchronizeResumeRequest();


            //set hh account
            hhRequest.setAccounts(new SynchronizeResumeRequestType().getAccounts());

            for (AccountType account : syncherMessage.getSynchronizeResumeRequest().getAccounts().getAccount()) {
                if (account.getResourceName() == "HH.RU") {


                    hhRequest.getAccounts().getAccount().add(account);
                    break;
                }
            }

            if (hhRequest.getAccounts().getAccount().get(0) == null) {
                throw new SynchronizeRequestException("account's information is absent");
            }

            //set hh request
            hhRequest.setResumeProfile(new ResumeProfileType());


            //  ResumeProfile resumeProfile = syncherRequest.getResumeProfile();
            //  exchange.getIn().setBody(exchange.getIn().getBody()+" </ hhrulesProcessor>");
            //  LOGGER.warn("syncherRequest is object");
            //  System.out.println("hh - syncherRequest is object") ;
        } catch (SynchronizeRequestException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage().toString());
        }


    }
}

