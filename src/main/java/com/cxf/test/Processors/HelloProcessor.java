package com.cxf.test.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.logging.Log;

public class HelloProcessor implements Processor {
    private Log log;

    public HelloProcessor() {
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public void process(Exchange exchange) throws Exception {
        log.info("start log inside HelloProcessor processor");
        log.info("getBody=" + exchange.getIn().getBody());
    }
}
