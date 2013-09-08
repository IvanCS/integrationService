package com.ipetrushin.syncher.ejb.dispatcher.jmsprovider.mdbeans;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 06.09.13
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */
@MessageDriven(
        name = "HeadHunterMDB",
        activationConfig = {
                @ActivationConfigProperty(propertyName = "destinationType",
                        propertyValue = "javax.jms.Queue"),


                @ActivationConfigProperty(propertyName = "destination",
                        propertyValue = "monster") // Ext. JNDI Name
        }
)
public class MonsterMB {
}
