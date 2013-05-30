package com.ipetrushin.syncher.integration.camel.beans;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/28/13
 * Time: 1:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExitException extends SecurityException {

    private final int status;

    public ExitException(int status) {
        super("System Exit Captured!");
        this.status = status;
        Thread.currentThread().getThreadGroup().interrupt();
    }

    public int getCode() {
        return status;
    }
}