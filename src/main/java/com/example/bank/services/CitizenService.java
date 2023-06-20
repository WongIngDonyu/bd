package com.example.bank.services;

import com.example.bank.models.Citizen;
import com.example.bank.repositories.CitizenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService {
    private final CitizenRepository citizenRepository;

    public CitizenService(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

    public List<Citizen> listCitizen(){
        return citizenRepository.findAll();
    }
    public Citizen getCitizenById(Long id){
        return citizenRepository.findCitizenById(id);
    }
}
