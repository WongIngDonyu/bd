package com.example.bank.services;

import com.example.bank.models.Human;
import com.example.bank.repositories.CountryRepository;
import com.example.bank.repositories.HumanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanService {
    private final HumanRepository humanRepository;
    private final CountryRepository countryRepository;

    public HumanService(HumanRepository humanRepository, CountryRepository countryRepository) {
        this.humanRepository = humanRepository;
        this.countryRepository = countryRepository;
    }

    public List<Human> listHuman(){
        return humanRepository.findAll();
    }
    public void saveHuman(Human human){
        humanRepository.save(human);
    }

    public void deleteHuman(Long humanId) {
        Human human = humanRepository.findById(humanId).orElse(null);
        if (human != null) {
            humanRepository.delete(human);
        }
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
    public String searchLastNameByAddress(String address) {
        return humanRepository.findLastNameByAddress(address);
    }
}
