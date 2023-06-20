package com.example.bank.repositories;

import com.example.bank.models.Country;
import com.example.bank.models.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface HumanRepository extends JpaRepository<Human, Long> {
    Human findHumanById(Long id);
    List<Human> findByCitizen_CitizenshipAndCountry_Index(String citizenship, String index);
    @Query("SELECT h.last_name FROM Human h WHERE h.country.address = :address")
    String findLastNameByAddress(@Param("address") String address);
}
