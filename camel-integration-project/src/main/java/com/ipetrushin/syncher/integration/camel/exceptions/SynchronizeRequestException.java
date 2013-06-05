package com.ipetrushin.syncher.integration.camel.exceptions;


/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 05.06.13
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public class SynchronizeRequestException extends Exception {
    public SynchronizeRequestException(String message) {
        super("SynchronizeRequestException: "+message);
    }
}
