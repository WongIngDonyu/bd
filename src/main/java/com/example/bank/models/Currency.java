package com.example.bank.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "currencys")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "currency_id", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Credit> credits;
    @OneToMany(mappedBy = "currency_id", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Deposit> deposits;
    public Currency(){

    }
    public Currency(Long id, String name, List<Credit> credits, List<Deposit> deposits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.deposits = deposits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }
}
