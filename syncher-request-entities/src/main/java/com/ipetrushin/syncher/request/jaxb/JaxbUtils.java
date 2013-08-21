package com.ipetrushin.syncher.request.jaxb;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 08.07.13
 * Time: 17:22
 * To change this template use File | Settings | File Templates.
 */
public class JaxbUtils {

    private static JaxbUtils instance = null;

    private final Class EXCHANGE_TYPE = SyncherMessageType.class;

    private JaxbUtils(){

    }

    public static JaxbUtils getInstance(){
        if(instance == null){
            instance = new JaxbUtils();
        }
        return instance;
    }

    public  String marshalObjectToString(SyncherMessageType requestObject) throws JAXBException {

        StringWriter stringWriter = new StringWriter();


        JAXBContext context = JAXBContext.newInstance(requestObject.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "Unicode");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(requestObject, stringWriter);

        System.out.println(stringWriter.toString());
        return stringWriter.toString();
    }

    public  Object unmarshalStringToObject(String source) {
        Object resultObject = null;
        try {
            StringReader stringReader = new StringReader(source);
            JAXBContext context = JAXBContext.newInstance(EXCHANGE_TYPE);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            resultObject = unmarshaller.unmarshal(stringReader);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return resultObject;
        }
    }
}
