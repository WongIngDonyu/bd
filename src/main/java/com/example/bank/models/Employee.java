package com.example.bank.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employee_ID_card;
    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JoinColumn(name = "human_id")
    private Human human_id;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Open_Credit> open_credits;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Open_Deposit> open_deposits;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Close_Credit> close_credits;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Close_Deposit> close_deposits;
    public Employee(){

    }
    public Employee(Long id, String employee_ID_card, Human human_id, List<Open_Credit> open_credits, List<Open_Deposit> open_deposits, List<Close_Credit> close_credits, List<Close_Deposit> close_deposits) {
        this.id = id;
        this.employee_ID_card = employee_ID_card;
        this.human_id = human_id;
        this.open_credits = open_credits;
        this.open_deposits = open_deposits;
        this.close_credits = close_credits;
        this.close_deposits = close_deposits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee_ID_card() {
        return employee_ID_card;
    }

    public void setEmployee_ID_card(String employee_ID_card) {
        this.employee_ID_card = employee_ID_card;
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
}
