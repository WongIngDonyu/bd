package com.example.bank.services;

import com.example.bank.models.Client;
import com.example.bank.repositories.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public int getBankRatingByPassportSeriesAndNumber(String passportSeriesAndNumber) {
        Client client = clientRepository.findByHumanPassportSeriesAndNumber(passportSeriesAndNumber);
        if (client != null) {
            return client.getBank_rating();
        } else {
            // Обработка случая, когда клиент не найден
            return 0; // Или другое значение по умолчанию
        }
    }
}
