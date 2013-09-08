package com.ipetrushin.syncher.integration.camel.beans.validators;


import com.ipetrushin.syncher.request.exceptions.SynchronizeRequestException;
import com.ipetrushin.syncher.request.jaxb.JaxbUtils;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 07.09.13
 * Time: 19:20
 * To change this template use File | Settings | File Templates.
 */
public class MessageValidator implements Processor {
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MessageValidator.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        SyncherMessageType message = null;

        message = (SyncherMessageType) JaxbUtils.getInstance().unmarshalStringToObject(exchange.getIn().getBody().toString());

        // SyncherMessageType syncherMessage = exchange.getIn().getBody(SyncherMessageType.class);
        if (message == null) {

            LOGGER.error("message was not unmarshalled");
            throw new SynchronizeRequestException("message was not unmarshalled");

        }

        if (message.getSynchronizeResumeRequest() == null) {
            LOGGER.error("message doesn't hold a request definition");
            throw new SynchronizeRequestException("message doesn't hold a request definition");
        }

        if (message.getSynchronizeResumeRequest().getAccounts().getAccount() == null) {
            LOGGER.error("message doesn't hold a accounts definition");
            throw new SynchronizeRequestException("message doesn't hold a accounts definition");
        }

        if (message.getSynchronizeResumeRequest().getResumeProfile() == null) {
            LOGGER.error("message doesn't hold a resumeProfile definition");
            throw new SynchronizeRequestException("message doesn't hold a resumeProfile definition");
        }



    }
}
