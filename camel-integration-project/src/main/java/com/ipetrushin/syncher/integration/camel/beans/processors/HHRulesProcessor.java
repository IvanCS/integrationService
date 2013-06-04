package com.ipetrushin.syncher.integration.camel.beans.processors;

import com.ipetrushin.syncher.request.jaxb.entities.Account;
import com.ipetrushin.syncher.request.jaxb.entities.ResumeProfile;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessage;
import com.ipetrushin.syncher.request.jaxb.entities.SynchronizeResumeRequest;
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

            SyncherMessage syncherMessage = exchange.getIn().getBody(SyncherMessage.class);
            SynchronizeResumeRequest hhRequest = syncherMessage.getRequestSynchronizeResume();


            //set hh account
            hhRequest.setAccounts(new SynchronizeResumeRequest.Accounts());

            for (Account account : hhRequest.getAccounts().getAccount()) {
                if (account.getResourceName() == "HH.RU") {


                    hhRequest.getAccounts().getAccount().add(account);
                    break;
                }
            }

            if (hhRequest.getAccounts().getAccount().get(0) == null) {
                throw new Exception("account's information is absent");
            }

            //set hh request
            hhRequest.setResumeProfile(new ResumeProfile());


            //  ResumeProfile resumeProfile = syncherRequest.getResumeProfile();
            //  exchange.getIn().setBody(exchange.getIn().getBody()+" </ hhrulesProcessor>");
            //  LOGGER.warn("syncherRequest is object");
            //  System.out.println("hh - syncherRequest is object") ;
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage().toString());
        }


    }
}

