package com.example.bank.models;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String client_number;
    private Integer bank_rating;
    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JoinColumn(name = "human_id")
    private Human human_id;
    @OneToMany(mappedBy = "client", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Open_Credit> open_credits;
    @OneToMany(mappedBy = "client", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Open_Deposit> open_deposits;
    @OneToMany(mappedBy = "client", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Close_Credit> close_credits;
    @OneToMany(mappedBy = "client", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Close_Deposit> close_deposits;
    @OneToMany(mappedBy = "client", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Pay_Credit> pay_credits;
    @OneToMany(mappedBy = "client", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Payout_Deposit> payout_deposits;

    public Client(Long id, String client_number, Integer bank_rating, Human human_id, List<Open_Credit> open_credits, List<Open_Deposit> open_deposits, List<Close_Credit> close_credits, List<Close_Deposit> close_deposits, List<Pay_Credit> pay_credits, List<Payout_Deposit> payout_deposits) {
        this.id = id;
        this.client_number = client_number;
        this.bank_rating = bank_rating;
        this.human_id = human_id;
        this.open_credits = open_credits;
        this.open_deposits = open_deposits;
        this.close_credits = close_credits;
        this.close_deposits = close_deposits;
        this.pay_credits = pay_credits;
        this.payout_deposits = payout_deposits;
    }
    public Client(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient_number() {
        return client_number;
    }

    public void setClient_number(String client_number) {
        this.client_number = client_number;
    }

    public Integer getBank_rating() {
        return bank_rating;
    }

    public void setBank_rating(Integer bank_rating) {
        this.bank_rating = bank_rating;
    }

    public Human getHuman_id() {
        return human_id;
    }

    public void setHuman_id(Human human_id) {
        this.human_id = human_id;
    }

    public List<Open_Credit> getOpen_credits() {
        return open_credits;
    }

    public void setOpen_credits(List<Open_Credit> open_credits) {
        this.open_credits = open_credits;
    }

    public List<Open_Deposit> getOpen_deposits() {
        return open_deposits;
    }

    public void setOpen_deposits(List<Open_Deposit> open_deposits) {
        this.open_deposits = open_deposits;
    }

    public List<Close_Credit> getClose_credits() {
        return close_credits;
    }

    public void setClose_credits(List<Close_Credit> close_credits) {
        this.close_credits = close_credits;
    }

    public List<Close_Deposit> getClose_deposits() {
        return close_deposits;
    }

    public void setClose_deposits(List<Close_Deposit> close_deposits) {
        this.close_deposits = close_deposits;
    }

    public List<Pay_Credit> getPay_credits() {
        return pay_credits;
    }

    public void setPay_credits(List<Pay_Credit> pay_credits) {
        this.pay_credits = pay_credits;
    }

    public List<Payout_Deposit> getPayout_deposits() {
        return payout_deposits;
    }

    public void setPayout_deposits(List<Payout_Deposit> payout_deposits) {
        this.payout_deposits = payout_deposits;
    }
}
