package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public static Logger LOGGER = LoggerFactory.getLogger(
        HelloController.class
    );

    @GetMapping(path = "/hello")
    public String sayHello() {
        LOGGER.debug("Starting Hello");
        String toReturnValue = "Hello World!!";
        LOGGER.debug("Ending Hello");
        
        return toReturnValue;
    }
}
