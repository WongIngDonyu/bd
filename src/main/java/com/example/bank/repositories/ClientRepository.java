package com.example.bank.repositories;

import com.example.bank.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c JOIN c.human_id h WHERE h.passport_series_and_number = :passportSeriesAndNumber")
    Client findByHumanPassportSeriesAndNumber(@Param("passportSeriesAndNumber") String passportSeriesAndNumber);

}
