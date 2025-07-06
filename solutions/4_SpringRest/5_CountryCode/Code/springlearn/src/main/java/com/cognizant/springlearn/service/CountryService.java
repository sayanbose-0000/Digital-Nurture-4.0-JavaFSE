package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    @Qualifier("countryList")
    private List<Country> countryList;

    public Country getCountry(String code) {
        return countryList
            .stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst()
            .orElse(null);
    }
}
