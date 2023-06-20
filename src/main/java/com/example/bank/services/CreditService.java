package com.example.bank.services;

import com.example.bank.models.Credit;
import com.example.bank.repositories.CreditRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditService {
    private final CreditRepository creditRepository;

    public CreditService(CreditRepository creditRepository) {
        this.creditRepository = creditRepository;
    }

    public List<Credit> listCredit(){
        return creditRepository.findAll();
    }
}
