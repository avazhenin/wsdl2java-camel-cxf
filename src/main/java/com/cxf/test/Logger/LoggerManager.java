package com.cxf.test.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggerManager {
    public static Log getLogger(String logName) {
        return LogFactory.getLog(logName);
    }
}
