package com.example.bank.models;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payout_deposits")
public class Payout_Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer transaction_payment_number_d;
    private LocalDateTime data_of_payment;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "deposit_id")
    private Deposit deposit;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    public Payout_Deposit(){

    }

    public Payout_Deposit(Long id, Integer transaction_payment_number_d, LocalDateTime data_of_payment, Deposit deposit, Client client) {
        this.id = id;
        this.transaction_payment_number_d = transaction_payment_number_d;
        this.data_of_payment = data_of_payment;
        this.deposit = deposit;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTransaction_payment_number_d() {
        return transaction_payment_number_d;
    }

    public void setTransaction_payment_number_d(Integer transaction_payment_number_d) {
        this.transaction_payment_number_d = transaction_payment_number_d;
    }

    public LocalDateTime getData_of_payment() {
        return data_of_payment;
    }

    public void setData_of_payment(LocalDateTime data_of_payment) {
        this.data_of_payment = data_of_payment;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
