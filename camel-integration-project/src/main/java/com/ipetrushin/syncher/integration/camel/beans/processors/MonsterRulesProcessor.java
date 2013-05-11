package com.ipetrushin.syncher.integration.camel.beans.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MonsterRulesProcessor implements Processor  {
@Override
public void process(Exchange exchange) throws Exception {
	// TODO Auto-generated method stub
	exchange.getIn().setBody(exchange.getIn().getBody()+" </ monsterrulesProcessor>");
}
}
