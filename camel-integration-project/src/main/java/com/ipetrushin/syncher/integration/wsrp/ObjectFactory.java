
package com.ipetrushin.syncher.integration.wsrp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipetrushin.syncher.integration.wsrp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProfessionRefHHResponse_QNAME = new QName("http://ws.wsrp.syncher.ipetrushin.com/", "getProfessionRefHHResponse");
    private final static QName _GetJobtitleRefHH_QNAME = new QName("http://ws.wsrp.syncher.ipetrushin.com/", "getJobtitleRefHH");
    private final static QName _GetProfessionRefHH_QNAME = new QName("http://ws.wsrp.syncher.ipetrushin.com/", "getProfessionRefHH");
    private final static QName _GetProfessionRefMonsterResponse_QNAME = new QName("http://ws.wsrp.syncher.ipetrushin.com/", "getProfessionRefMonsterResponse");
    private final static QName _GetJobtitleRefHHResponse_QNAME = new QName("http://ws.wsrp.syncher.ipetrushin.com/", "getJobtitleRefHHResponse");
    private final static QName _GetJobtitleRefMonster_QNAME = new QName("http://ws.wsrp.syncher.ipetrushin.com/", "getJobtitleRefMonster");
    private final static QName _GetJobtitleRefMonsterResponse_QNAME = new QName("http://ws.wsrp.syncher.ipetrushin.com/", "getJobtitleRefMonsterResponse");
    private final static QName _GetProfessionRefMonster_QNAME = new QName("http://ws.wsrp.syncher.ipetrushin.com/", "getProfessionRefMonster");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipetrushin.syncher.integration.wsrp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetJobtitleRefMonster }
     * 
     */
    public GetJobtitleRefMonster createGetJobtitleRefMonster() {
        return new GetJobtitleRefMonster();
    }

    /**
     * Create an instance of {@link GetJobtitleRefHHResponse }
     * 
     */
    public GetJobtitleRefHHResponse createGetJobtitleRefHHResponse() {
        return new GetJobtitleRefHHResponse();
    }

    /**
     * Create an instance of {@link GetJobtitleRefMonsterResponse }
     * 
     */
    public GetJobtitleRefMonsterResponse createGetJobtitleRefMonsterResponse() {
        return new GetJobtitleRefMonsterResponse();
    }

    /**
     * Create an instance of {@link GetProfessionRefMonster }
     * 
     */
    public GetProfessionRefMonster createGetProfessionRefMonster() {
        return new GetProfessionRefMonster();
    }

    /**
     * Create an instance of {@link GetProfessionRefHHResponse }
     * 
     */
    public GetProfessionRefHHResponse createGetProfessionRefHHResponse() {
        return new GetProfessionRefHHResponse();
    }

    /**
     * Create an instance of {@link GetJobtitleRefHH }
     * 
     */
    public GetJobtitleRefHH createGetJobtitleRefHH() {
        return new GetJobtitleRefHH();
    }

    /**
     * Create an instance of {@link GetProfessionRefHH }
     * 
     */
    public GetProfessionRefHH createGetProfessionRefHH() {
        return new GetProfessionRefHH();
    }

    /**
     * Create an instance of {@link GetProfessionRefMonsterResponse }
     * 
     */
    public GetProfessionRefMonsterResponse createGetProfessionRefMonsterResponse() {
        return new GetProfessionRefMonsterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessionRefHHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsrp.syncher.ipetrushin.com/", name = "getProfessionRefHHResponse")
    public JAXBElement<GetProfessionRefHHResponse> createGetProfessionRefHHResponse(GetProfessionRefHHResponse value) {
        return new JAXBElement<GetProfessionRefHHResponse>(_GetProfessionRefHHResponse_QNAME, GetProfessionRefHHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobtitleRefHH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsrp.syncher.ipetrushin.com/", name = "getJobtitleRefHH")
    public JAXBElement<GetJobtitleRefHH> createGetJobtitleRefHH(GetJobtitleRefHH value) {
        return new JAXBElement<GetJobtitleRefHH>(_GetJobtitleRefHH_QNAME, GetJobtitleRefHH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessionRefHH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsrp.syncher.ipetrushin.com/", name = "getProfessionRefHH")
    public JAXBElement<GetProfessionRefHH> createGetProfessionRefHH(GetProfessionRefHH value) {
        return new JAXBElement<GetProfessionRefHH>(_GetProfessionRefHH_QNAME, GetProfessionRefHH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessionRefMonsterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsrp.syncher.ipetrushin.com/", name = "getProfessionRefMonsterResponse")
    public JAXBElement<GetProfessionRefMonsterResponse> createGetProfessionRefMonsterResponse(GetProfessionRefMonsterResponse value) {
        return new JAXBElement<GetProfessionRefMonsterResponse>(_GetProfessionRefMonsterResponse_QNAME, GetProfessionRefMonsterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobtitleRefHHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsrp.syncher.ipetrushin.com/", name = "getJobtitleRefHHResponse")
    public JAXBElement<GetJobtitleRefHHResponse> createGetJobtitleRefHHResponse(GetJobtitleRefHHResponse value) {
        return new JAXBElement<GetJobtitleRefHHResponse>(_GetJobtitleRefHHResponse_QNAME, GetJobtitleRefHHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobtitleRefMonster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsrp.syncher.ipetrushin.com/", name = "getJobtitleRefMonster")
    public JAXBElement<GetJobtitleRefMonster> createGetJobtitleRefMonster(GetJobtitleRefMonster value) {
        return new JAXBElement<GetJobtitleRefMonster>(_GetJobtitleRefMonster_QNAME, GetJobtitleRefMonster.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobtitleRefMonsterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsrp.syncher.ipetrushin.com/", name = "getJobtitleRefMonsterResponse")
    public JAXBElement<GetJobtitleRefMonsterResponse> createGetJobtitleRefMonsterResponse(GetJobtitleRefMonsterResponse value) {
        return new JAXBElement<GetJobtitleRefMonsterResponse>(_GetJobtitleRefMonsterResponse_QNAME, GetJobtitleRefMonsterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessionRefMonster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsrp.syncher.ipetrushin.com/", name = "getProfessionRefMonster")
    public JAXBElement<GetProfessionRefMonster> createGetProfessionRefMonster(GetProfessionRefMonster value) {
        return new JAXBElement<GetProfessionRefMonster>(_GetProfessionRefMonster_QNAME, GetProfessionRefMonster.class, null, value);
    }

}
