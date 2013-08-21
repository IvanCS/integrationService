package com.ipetrushin.syncher.ejb.dispatcher.jmsprovider;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 26.04.13
 * Time: 13:38
 * To change this template use File | Settings | File Templates.
 */
public class MessageFactory {


    private SyncherMessageType requestObject;

    public MessageFactory() {

    }

    public MessageFactory(SyncherMessageType requestObject) {
        this.requestObject = requestObject;
    }

    public SyncherMessageType getRequestObject() {
        return requestObject;
    }

    public void setRequestObject(SyncherMessageType requestObject) {
        this.requestObject = requestObject;
    }


}
