package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private String code;
    private String name;
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    public Country() {
        LOGGER.debug("Inside Country Constructor");
    }

    public String getName() {
        LOGGER.debug("Inside country getName()");
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Inside country setName()");
        this.name = name;
    }

    public String getCode() {
        LOGGER.debug("Inside country getCode()");
        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("Inside country setCode()");
        this.code = code;
    }

    @Override
    public String toString() {
        return "Country: name- " + name + ", code- " + code;
    }
}
