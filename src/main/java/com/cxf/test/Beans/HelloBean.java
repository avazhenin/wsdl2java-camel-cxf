package com.cxf.test.Beans;

import org.apache.commons.logging.Log;

public class HelloBean {

    private Log log;

    public HelloBean() {
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public void Hello() {
        log.info("hello from bean");
    }

    public void Bye() {
        log.info("bye from bean");
    }

}