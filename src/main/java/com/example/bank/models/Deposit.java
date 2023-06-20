package com.example.bank.models;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "deposits")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer deposit_number;
    private String type_of_deposit;
    private Integer deposit_amount;
    private Double deposit_percentage;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "currency_id")
    private Currency currency_id;
    @OneToMany(mappedBy = "deposit", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Open_Deposit> open_deposits;
    @OneToMany(mappedBy = "deposit", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Close_Deposit> close_deposits;
    @OneToMany(mappedBy = "deposit", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Payout_Deposit> payout_deposits;
    public Deposit(){

    }
    public Deposit(Long id, Integer deposit_number, String type_of_deposit, Integer deposit_amount, Double deposit_percentage, Currency currency_id, List<Open_Deposit> open_deposits, List<Close_Deposit> close_deposits, List<Payout_Deposit> payout_deposits) {
        this.id = id;
        this.deposit_number = deposit_number;
        this.type_of_deposit = type_of_deposit;
        this.deposit_amount = deposit_amount;
        this.deposit_percentage = deposit_percentage;
        this.currency_id = currency_id;
        this.open_deposits = open_deposits;
        this.close_deposits = close_deposits;
        this.payout_deposits = payout_deposits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDeposit_number() {
        return deposit_number;
    }

    public void setDeposit_number(Integer deposit_number) {
        this.deposit_number = deposit_number;
    }

    public String getType_of_deposit() {
        return type_of_deposit;
    }

    public void setType_of_deposit(String type_of_deposit) {
        this.type_of_deposit = type_of_deposit;
    }

    public Integer getDeposit_amount() {
        return deposit_amount;
    }

    public void setDeposit_amount(Integer deposit_amount) {
        this.deposit_amount = deposit_amount;
    }

    public Double getDeposit_percentage() {
        return deposit_percentage;
    }

    public void setDeposit_percentage(Double deposit_percentage) {
        this.deposit_percentage = deposit_percentage;
    }

    public Currency getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(Currency currency_id) {
        this.currency_id = currency_id;
    }

    public List<Open_Deposit> getOpen_deposits() {
        return open_deposits;
    }

    public void setOpen_deposits(List<Open_Deposit> open_deposits) {
        this.open_deposits = open_deposits;
    }

    public List<Close_Deposit> getClose_deposits() {
        return close_deposits;
    }

    public void setClose_deposits(List<Close_Deposit> close_deposits) {
        this.close_deposits = close_deposits;
    }

    public List<Payout_Deposit> getPayout_deposits() {
        return payout_deposits;
    }

    public void setPayout_deposits(List<Payout_Deposit> payout_deposits) {
        this.payout_deposits = payout_deposits;
    }
}
