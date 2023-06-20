package com.example.bank.services;

import com.example.bank.models.Deposit;
import com.example.bank.repositories.DepositRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositService {
    private final DepositRepository depositRepository;

    public DepositService(DepositRepository depositRepository) {
        this.depositRepository = depositRepository;
    }

    public List<Deposit> listDeposit(){
        return depositRepository.findAll();
    }
}
