package com.example.bank.services;

import com.example.bank.models.Country;
import com.example.bank.models.Human;
import com.example.bank.repositories.CountryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;
    public List<Country> listCountry(){
        return countryRepository.findAll();
    }
    public void updateCountry(Country country){
        countryRepository.save(country);
    }
}
