package com.example.bank.repositories;

import com.example.bank.models.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    @Query("SELECT c FROM Currency c JOIN c.deposits d JOIN c.credits cr WHERE d.deposit_number = :depositNumber AND cr.credit_number = :creditNumber")
    List<Currency> findByDepositNumberAndCreditNumber(@Param("depositNumber") String depositNumber, @Param("creditNumber") String creditNumber);
}
