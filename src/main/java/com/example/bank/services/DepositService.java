package com.example.bank.services;

import com.example.bank.models.Credit;
import com.example.bank.models.Deposit;
import com.example.bank.repositories.DepositRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class DepositService {
    private final DepositRepository depositRepository;
    public List<Deposit> listDeposit(){
        return depositRepository.findAll();
    }
}
