package com.ipetrushin.syncher.integration.camel.beans.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.language.XPath;
import org.slf4j.Logger;


import com.ipetrushin.syncher.request.jaxb.entities.SyncherRequest;


public class HHRulesProcessor implements Processor{
	
	private static final Logger LOGGER =  org.slf4j.LoggerFactory.getLogger(HHRulesProcessor.class);
	
	public HHRulesProcessor() {
		// TODO Auto-generated constructor stub
	}
	

	
	
	@Override
	public void process(Exchange exchange) throws Exception {
	//	SyncherRequest syncherRequest = exchange.getIn().getBody(SyncherRequest.class);
		exchange.getIn().setBody(exchange.getIn().getBody()+" </ hhrulesProcessor>");
		LOGGER.warn("syncherRequest is object");
        LOGGER.error("syncherRequest is object");
        LOGGER.info("syncherRequest is object");
		
	}
}

