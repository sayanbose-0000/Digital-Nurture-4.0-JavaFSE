package com.cognizant.springlearn;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringlearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringlearnApplication.class);

    public static void main(String[] args) {        
        LOGGER.debug("SpringLearnApplication Started!");
        displayCountry();
        LOGGER.debug("SrpingLearnApplication Ended!");
    }
    
    public static void displayCountry() {
        LOGGER.debug("displayCountry() started!");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
        
        Map<String, Country> countriesMap = context.getBeansOfType(Country.class);
    
        LOGGER.debug("--- Displaying all Countries ---");
        for (Map.Entry<String, Country> entry : countriesMap.entrySet()) {
            LOGGER.debug("Bean ID: {}, Country: {}", entry.getKey(), entry.getValue());
        }
        LOGGER.debug("--- End of Countries ---");

        
        ((ClassPathXmlApplicationContext) context).close();
        
        LOGGER.debug("displayCountry() ended!");
    }
}
