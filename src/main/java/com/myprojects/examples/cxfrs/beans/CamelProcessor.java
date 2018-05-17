package com.myprojects.examples.cxfrs.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CamelProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {

        // Get input from exchange
        String msg = exchange.getIn().getBody(String.class);
        // set output in exchange
        exchange.getOut().setBody("Hello World " + msg);
    }

}
