package com.ipetrushin.syncher.integration.camel.exceptions;

import com.ipetrushin.syncher.request.exceptions.SynchronizeRequestException;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 05.06.13
 * Time: 17:42
 * To change this template use File | Settings | File Templates.
 */
public class CamelIntegrationException extends SynchronizeRequestException {
    public CamelIntegrationException(String message) {
        super("CamelIntegrationException:" + message);
    }
}
