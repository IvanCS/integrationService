package com.ipetrushin.syncher.wsrd.jmsprovider;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 23.06.13
 * Time: 19:02
 * To change this template use File | Settings | File Templates.
 */


public class HHMessageReceiver implements MessageListener{


    public HHMessageReceiver() {
    }

    @Override
    public void onMessage(Message message) {
        System.out.println("*** received message: " + message);
    }
}
