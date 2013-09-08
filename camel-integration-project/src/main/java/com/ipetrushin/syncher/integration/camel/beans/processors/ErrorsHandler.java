package com.ipetrushin.syncher.integration.camel.beans.processors;

import com.ipetrushin.syncher.request.jaxb.JaxbUtils;
import com.ipetrushin.syncher.request.jaxb.entities.ErrorType;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;
import com.ipetrushin.syncher.request.jaxb.entities.SynchronizeResumeResponseType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 07.09.13
 * Time: 20:02
 * To change this template use File | Settings | File Templates.
 */
public class ErrorsHandler implements Processor {

    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ErrorsHandler.class);

    public ErrorsHandler() {
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        Exception exception = (Exception) exchange.getProperty(Exchange.EXCEPTION_CAUGHT);

        SyncherMessageType errorMessage = new SyncherMessageType();
        SynchronizeResumeResponseType response = new SynchronizeResumeResponseType();
        ErrorType error = new ErrorType();

        error.setExceptionClass(exception.getClass().toString());
        error.setExceptionMessage(exception.getMessage());
        error.setExceptionStaketrace(exception.getStackTrace().toString());

        response.setError(error);
        response.setIsComplete(false);
        errorMessage.setSynchronizeResumeResponse(response);


        String newExchangeBody = JaxbUtils.getInstance().marshalObjectToString(errorMessage);
        exchange.getIn().setBody(newExchangeBody);

        System.out.print(exception.getMessage());
        LOGGER.error(exception.getMessage());
    }
}
