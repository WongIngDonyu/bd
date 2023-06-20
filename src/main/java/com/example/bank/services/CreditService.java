package com.example.bank.services;

import com.example.bank.models.Credit;
import com.example.bank.models.Human;
import com.example.bank.repositories.CreditRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CreditService {
    private final CreditRepository creditRepository;
    public List<Credit> listCredit(){
        return creditRepository.findAll();
    }
}
