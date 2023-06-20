package com.example.bank.services;

import com.example.bank.models.Currency;
import com.example.bank.repositories.CurrencyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {
    private final CurrencyRepository currencyRepository;
    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public List<Currency> searchCurrencyByDepositAndCreditNumber(String depositNumber, String creditNumber) {
        return currencyRepository.findByDepositNumberAndCreditNumber(depositNumber, creditNumber);
    }
}
