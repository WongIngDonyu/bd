package com.example.bank.models;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pay_credits")
public class Pay_Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer transaction_payment_number_c;
    private LocalDateTime data_of_payment;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_id")
    private Credit credit;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    public Pay_Credit(){

    }

    public Pay_Credit(Long id, Integer transaction_payment_number_c, LocalDateTime data_of_payment, Credit credit, Client client) {
        this.id = id;
        this.transaction_payment_number_c = transaction_payment_number_c;
        this.data_of_payment = data_of_payment;
        this.credit = credit;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTransaction_payment_number_c() {
        return transaction_payment_number_c;
    }

    public void setTransaction_payment_number_c(Integer transaction_payment_number_c) {
        this.transaction_payment_number_c = transaction_payment_number_c;
    }

    public LocalDateTime getData_of_payment() {
        return data_of_payment;
    }

    public void setData_of_payment(LocalDateTime data_of_payment) {
        this.data_of_payment = data_of_payment;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
