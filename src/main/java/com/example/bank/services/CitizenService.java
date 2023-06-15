package com.example.bank.services;

import com.example.bank.models.Citizen;
import com.example.bank.models.Human;
import com.example.bank.repositories.CitizenRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CitizenService {
    private final CitizenRepository citizenRepository;
    public List<Citizen> listCitizen(){
        return citizenRepository.findAll();
    }
    public Citizen getCitizenById(Long id){
        return citizenRepository.findCitizenById(id);
    }
}
