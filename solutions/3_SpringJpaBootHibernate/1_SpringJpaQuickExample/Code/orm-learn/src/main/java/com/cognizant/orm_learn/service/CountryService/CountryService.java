package com.cognizant.orm_learn.service.CountryService;

import com.cognizant.orm_learn.CountryRepository.CountryRepository;
import com.cognizant.orm_learn.model.Country;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
