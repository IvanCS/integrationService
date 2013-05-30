package com.ipetrushin.syncher.integration.camel.beans;

import com.sun.javaws.exceptions.ExitException;

import java.security.Permission;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/28/13
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class JMeterPluginSecurityManager extends SecurityManager {
    @Override
    public void checkExit(int status){
        super.checkExit(status);
        throw new com.ipetrushin.syncher.integration.camel.beans.ExitException(status);
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
    }

    @Override
    public void checkPermission(Permission perm) {
    }

}
