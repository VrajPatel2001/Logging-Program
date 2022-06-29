package org.learn.java;


import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Application.class);

        logger.info("info logging");
        logger.debug("debug logging");

        logger.trace("Trace logging");
    }
}
