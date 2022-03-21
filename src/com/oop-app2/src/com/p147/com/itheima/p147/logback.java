package com.p147.com.itheima.p147;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logback {
    public static final Logger LOGGER = LoggerFactory.getLogger("logback.class");

    public static void main(String[] args) {
        try {
            LOGGER.debug("Start");
            LOGGER.info("info ");
            int a = 10;
            int b = 0;

            LOGGER.trace("A= " + a);
            LOGGER.trace("B= " + b);
            System.out.println(a / b);


        } catch(Exception e){
            e.printStackTrace();
            LOGGER.error("error "+e);

        }

    }
}
