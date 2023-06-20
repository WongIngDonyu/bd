package com.example.bank.repositories;

import com.example.bank.models.Country;
import com.example.bank.models.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
    @Query("SELECT h.country.index FROM Human h WHERE h.name = :name")
    String findIndexByName(@Param("name") String name);

}
