package com.acf.logbacktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Log2Service {
    private final static Logger logger = LoggerFactory.getLogger(Log2Service.class);

    @Bean
    public void logInfo() {
        logger.trace("Trace log");
        logger.debug("Debug log");
        //預設到這層
        logger.info("Info Log");
        logger.warn("Warn Log");
        logger.error("Error Log");
    }
}
