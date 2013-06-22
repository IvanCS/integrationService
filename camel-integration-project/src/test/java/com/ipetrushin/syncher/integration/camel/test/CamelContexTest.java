package com.ipetrushin.syncher.integration.camel.test;

import org.apache.activemq.broker.BrokerService;
import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelSpringTestSupport;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import java.io.File;
import java.io.IOException;
import java.security.Permission;
import java.util.Arrays;
import java.util.List;

@DirtiesContext(classMode= ClassMode.AFTER_EACH_TEST_METHOD)
public class CamelContexTest extends CamelSpringTestSupport {

	// Templates to send to input endpoints
	@Produce(uri = "activemq:input")
	protected ProducerTemplate producerEndpoint;

	// Mock endpoints used to consume messages from the output endpoints and
	// then perform assertions


	@EndpointInject(uri = "mock:monster.output")
	protected MockEndpoint mockMonsterOutput;
	
	@EndpointInject(uri = "mock:hh.output")
	protected MockEndpoint mockHHOutput;

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext(
				"META-INF/spring/camel-context.xml");
	}

	@Override
	public boolean isUseDebugger() {
		// TODO Auto-generated method stub
		return true;
	}

	
	
	@Test
    @Ignore
	public void testHHQueue() throws Exception {

        boolean isOk = false;
		mockHHOutput.expectedMessageCount(1);

		producerEndpoint.sendBody("<account> <name>hh.ru</name> </account>");

		for (Exchange exchange : mockHHOutput.getReceivedExchanges()) {
			Message message = exchange.getIn();
			String body = message.getBody().toString();
			isOk = true;
		}

        Assert.assertTrue(isOk);

		//mockHHOutput.assertIsSatisfied();

	}

	@Test
    @Ignore
	public void testMonsterQueue() throws Exception {

		//mockMonsterOutput.expectedMessageCount(1);
         boolean isOk = false;
		producerEndpoint.sendBody("<account> <name>monster.com</name> </account>");

		for (Exchange exchange : mockMonsterOutput.getReceivedExchanges()) {
			Message message = exchange.getIn();
			String body = message.getBody().toString();
			isOk = true;
        }
            Assert.assertTrue(isOk);
            //mockMonsterOutput.assertIsSatisfied();

	}


}
