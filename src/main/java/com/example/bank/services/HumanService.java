package com.example.bank.services;

import com.example.bank.models.Country;
import com.example.bank.models.Human;
import com.example.bank.repositories.CountryRepository;
import com.example.bank.repositories.HumanRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import java.io.IOException;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class HumanService {
    private final HumanRepository humanRepository;
    private final CountryRepository countryRepository;
    public List<Human> listHuman(){
        return humanRepository.findAll();
    }
    public void saveHuman(Human human){
        humanRepository.save(human);
    }
    public void deleteHuman(Long id) {
        Human human = humanRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Human not found"));
        Country country = human.getCountry();
        humanRepository.delete(human);
        countryRepository.delete(country);
    }
    public Human getHumanById(Long id){
        return humanRepository.findHumanById(id);
    }
    public void updateHuman(Human human){
        humanRepository.save(human);
    }
    public List<Human> searchHuman(String citizenship, String index){
        return humanRepository.findByCitizen_CitizenshipAndCountry_Index(citizenship, index);
    }
}
