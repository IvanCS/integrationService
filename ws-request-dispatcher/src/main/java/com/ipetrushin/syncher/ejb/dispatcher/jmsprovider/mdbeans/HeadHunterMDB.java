package com.ipetrushin.syncher.ejb.dispatcher.jmsprovider.mdbeans;

import com.ipetrushin.syncher.ejb.dispatcher.mappers.impl.hh.HHResumeProfileMapper;
import com.ipetrushin.syncher.ejb.dispatcher.procesors.CommonProcessor;
import com.ipetrushin.syncher.ejb.dispatcher.transformers.HHTransformer;
import com.ipetrushin.syncher.request.jaxb.JaxbUtils;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 23.06.13
 * Time: 19:02
 * To change this template use File | Settings | File Templates.
 */

@MessageDriven (
        name = "HeadHunterMDB",
        activationConfig = {
                @ActivationConfigProperty(propertyName = "destinationType",
                        propertyValue = "javax.jms.Queue"),


                @ActivationConfigProperty(propertyName = "destination",
                        propertyValue = "hh") // Ext. JNDI Name
        }
)
public class HeadHunterMDB implements MessageListener {


    public HeadHunterMDB() {
    }

    @Override
    public void onMessage(Message message) {
        System.out.println("*** received message: " + message);
        HHResumeProfileMapper profileMapper = new HHResumeProfileMapper();


        try {
            TextMessage textMessage = (TextMessage) message;
            SyncherMessageType exchangeMessage = (SyncherMessageType) JaxbUtils.getInstance().unmarshalStringToObject(textMessage.getText());

            CommonProcessor processor = new CommonProcessor(new HHTransformer(),new HHResumeProfileMapper());

            try{
                processor.process(exchangeMessage);

            }   catch (Exception e){
                e.printStackTrace();
            }
         //   profileMapper.run();

           //  File pathToBinary = new File("C:\\Users\\ipetrush\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
            ////  FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
           //  FirefoxProfile firefoxProfile = new FirefoxProfile();




        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
