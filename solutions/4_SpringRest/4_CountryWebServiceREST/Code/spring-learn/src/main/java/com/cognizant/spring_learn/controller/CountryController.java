package com.cognizant.spring_learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;

@RestController
public class CountryController {
    @Autowired
    @Qualifier("in")
    private Country indiaCountry;
    
    @RequestMapping("/country")
    public Country getIndiaCountry() {
        return indiaCountry;
    }
}