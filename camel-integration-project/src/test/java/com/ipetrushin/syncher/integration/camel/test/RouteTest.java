package com.ipetrushin.syncher.integration.camel.test;

import org.apache.activemq.broker.BrokerService;
import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.camel.test.spring.UseAdviceWith;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


public class RouteTest extends CamelTestSupport{
	//@Autowired
	//CamelContext camelContext;
	
	 @EndpointInject(uri = "mock:activemq:input.hh")
	   protected MockEndpoint resultEndpoint;

	 

	   @Produce(uri= "activemq:input")
	   protected ProducerTemplate producerTemplate;
	 
	   @BeforeClass
	    public static void setUpClass() throws Exception {
	        BrokerService brokerSvc = new BrokerService();
	        brokerSvc.setBrokerName("TestBroker");
	        brokerSvc.addConnector("tcp://localhost:61617");
	        brokerSvc.start();
	    }
	   
	@Override
	public boolean isUseDebugger() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	@Override
	protected void debugBefore(Exchange exchange, Processor processor,
	                           ProcessorDefinition<?> definition, String id, String shortName) {
	    // this method is invoked before we are about to enter the given processor
	    // from your Java editor you can just add a breakpoint in the code line below
	    log.info("Before " + definition + " with body " + exchange.getIn().getBody());
	}
	
	@Test
    @Ignore
    public void test() throws Exception {
       // template.sendBody("activemq:queue:EVENTS", "HelloWorld!");
       // Thread.sleep(3000);
		context.start();
		 resultEndpoint.expectedMessageCount(1);

		 producerTemplate.sendBody( "<account> <name>hh.ru</name> </account>");
		 

	     // resultEndpoint.assertIsSatisfied();
	      
	      for (Exchange exchange : resultEndpoint.getReceivedExchanges()) {
	           exchange.getIn();
	        }
	    
	      context.stop();
    }
	
	
	@Override
	protected RouteBuilder createRouteBuilder() throws Exception {
		// TODO Auto-generated method stub
		return new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				from("activemq:input")
				.choice()
                .when(body().contains("hh.ru"))
                .to("activemq:input.hh")
                .otherwise()
                 .to("activemq:input.monster");
				
			}
		};
	}

}
