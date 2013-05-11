package com.ipetrushin.syncher.wsbl.jmsprovider;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherRequest;
import org.springframework.jms.core.MessageCreator;

import javax.jms.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 26.04.13
 * Time: 13:38
 * To change this template use File | Settings | File Templates.
 */
public class JMSCreator implements MessageCreator {

    private SyncherRequest requestObject;

    public JMSCreator(){

    }

    public JMSCreator(SyncherRequest requestObject){
        this.requestObject = requestObject;
    }

    public SyncherRequest getRequestObject() {
        return requestObject;
    }

    public void setRequestObject(SyncherRequest requestObject) {
        this.requestObject = requestObject;
    }

    @Override
    public Message createMessage(Session session) throws JMSException {
        String content = null;
        TextMessage message = session.createTextMessage() ;

        try{
            content = marshalObjectToString(getRequestObject());
        }   catch (JAXBException e){
            e.printStackTrace();
        }


        message.setText(content);

        return message;

    }

    private String marshalObjectToString(SyncherRequest requestObject) throws JAXBException{

        StringWriter stringWriter = new StringWriter();


            JAXBContext context = JAXBContext.newInstance(requestObject.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING,"Unicode");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

            marshaller.marshal(requestObject,stringWriter);


        return  stringWriter.toString();
    }
}
