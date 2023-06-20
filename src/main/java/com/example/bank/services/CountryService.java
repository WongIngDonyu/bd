package com.example.bank.services;

import com.example.bank.models.Country;
import com.example.bank.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> listCountry(){
        return countryRepository.findAll();
    }
    public void updateCountry(Country country){
        countryRepository.save(country);
    }
    public String searchIndexByName(String name) {
        return countryRepository.findIndexByName(name);
    }
}
