package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService.CountryService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private CountryService countryService;

    @Autowired
    public OrmLearnApplication(CountryService countryService) {
        this.countryService = countryService;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(
        OrmLearnApplication.class
    );

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }
}

/*
create table Country (
    co_code varchar2(2) primary key,
    co_name varchar2(50)
);

insert into country values ('IN', 'India');
insert into country values ('US', 'United States of America');
*/
