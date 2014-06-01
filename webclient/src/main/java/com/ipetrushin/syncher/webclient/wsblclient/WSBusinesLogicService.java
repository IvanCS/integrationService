package com.ipetrushin.syncher.webclient.wsblclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2014-06-01T15:50:42.877+04:00
 * Generated source version: 2.7.4
 * 
 */
@WebServiceClient(name = "WSBusinesLogicService", 
                  wsdlLocation = "file:/C:/Users/ipetrush/Documents/GitHub/4course-project/webclient/src/main/java/com/ipetrushin/syncher/webclient/wsblclient/WSBusinesLogic.wsdl",
                  targetNamespace = "http://ws.wsbl.syncher.ipetrushin.com/") 
public class WSBusinesLogicService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "WSBusinesLogicService");
    public final static QName WSBusinesLogicPort = new QName("http://ws.wsbl.syncher.ipetrushin.com/", "WSBusinesLogicPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/ipetrush/Documents/GitHub/4course-project/webclient/src/main/java/com/ipetrushin/syncher/webclient/wsblclient/WSBusinesLogic.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WSBusinesLogicService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/ipetrush/Documents/GitHub/4course-project/webclient/src/main/java/com/ipetrushin/syncher/webclient/wsblclient/WSBusinesLogic.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WSBusinesLogicService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSBusinesLogicService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSBusinesLogicService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WSBusinesLogicService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WSBusinesLogicService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WSBusinesLogicService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IWSBusinesLogic
     */
    @WebEndpoint(name = "WSBusinesLogicPort")
    public IWSBusinesLogic getWSBusinesLogicPort() {
        return super.getPort(WSBusinesLogicPort, IWSBusinesLogic.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSBusinesLogic
     */
    @WebEndpoint(name = "WSBusinesLogicPort")
    public IWSBusinesLogic getWSBusinesLogicPort(WebServiceFeature... features) {
        return super.getPort(WSBusinesLogicPort, IWSBusinesLogic.class, features);
    }

}
