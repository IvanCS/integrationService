package com.ipetrushin.syncher.integration.camel.test;

import org.apache.camel.CamelContext;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelSpringJUnit4ClassRunner;
import org.apache.camel.test.spring.MockEndpoints;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(CamelSpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/camel-context.xml"})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class SpringTestRoute{
 
   // @Autowired
    private CamelContext context1;
 
    @Produce(uri = "activemq:input")
    protected ProducerTemplate inputProducerTemplate;
 
    @EndpointInject(uri = "mock:activemq:input.hh")
    protected MockEndpoint mockBeanExampleBean;
 
    @Test
    @Ignore
    public void testRoute() throws Exception {
    	
        mockBeanExampleBean.expectedBodiesReceived("hh.ru");
 
        inputProducerTemplate.sendBody("<account> <name>hh.ru</name> </account>");
 
        MockEndpoint.assertIsSatisfied(context1);
        int y = 6;
    }
}