package com.ipetrushin.syncher.request.jaxb;

import com.ipetrushin.syncher.request.jaxb.entities.ErrorType;
import com.ipetrushin.syncher.request.jaxb.entities.ReportType;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;
import com.ipetrushin.syncher.request.jaxb.entities.SynchronizeResumeResponseType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.InputStream;
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

    private JaxbUtils() {

    }

    public static JaxbUtils getInstance() {
        if (instance == null) {
            instance = new JaxbUtils();
        }
        return instance;
    }

    public String marshalObjectToString(SyncherMessageType requestObject) throws JAXBException {

        StringWriter stringWriter = new StringWriter();


        JAXBContext context = JAXBContext.newInstance(requestObject.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "Unicode");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(requestObject, stringWriter);

        System.out.println(stringWriter.toString());
        return stringWriter.toString();
    }

    public Object unmarshalStringToObject(String source) throws Exception {
        Object resultObject = null;

        StringReader stringReader = new StringReader(source);
        JAXBContext context = JAXBContext.newInstance(EXCHANGE_TYPE);
        Unmarshaller unmarshaller = context.createUnmarshaller();


        SchemaFactory schemaFactory = SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);

       // Source schemaFile = new StreamSource(getClass().getClassLoader().getResourceAsStream("schema/request-schema.xsd"));
        //Schema schema = schemaFactory.newSchema(schemaFile);
       // Validator validator = schema.newValidator();

       // StreamSource sSource = new StreamSource(stringReader);
       // validator.validate(sSource);

      //  unmarshaller.setSchema(schema);
        resultObject = unmarshaller.unmarshal(stringReader);

        return resultObject;

    }

    public SyncherMessageType buildErrorResponse(String exceptionClass,String exceptionMessage, String exceptionStakeTrace){
        SyncherMessageType errorMessage = new SyncherMessageType();
        SynchronizeResumeResponseType response = new SynchronizeResumeResponseType();
        ErrorType error = new ErrorType();

        error.setExceptionClass(exceptionClass);
        error.setExceptionMessage(exceptionMessage);
        error.setExceptionStakeTrace(exceptionStakeTrace);

        response.setError(error);
        errorMessage.setSynchronizeResumeResponse(response);

        return  errorMessage;
    }

    public  SyncherMessageType buildReportResponse(String accountName,String resumeProfileID, String userID, String details){
        SyncherMessageType reportMessage = new SyncherMessageType();
        SynchronizeResumeResponseType response = new SynchronizeResumeResponseType();
        ReportType report = new ReportType();

        report.setAccountName(accountName);
        report.setResumeProfileID(resumeProfileID);
        report.setUserID(userID);
        report.setDetails(details);

        response.setReport(report);
        reportMessage.setSynchronizeResumeResponse(response);

        return  reportMessage;
    }
}
