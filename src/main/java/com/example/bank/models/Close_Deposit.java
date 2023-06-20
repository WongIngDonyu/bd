package com.example.bank.models;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "close_deposits")
public class Close_Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number_operation_close_d;
    private LocalDateTime closing_data;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "deposit_id")
    private Deposit deposit;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;
    public Close_Deposit(){

    }

    public Close_Deposit(Long id, Integer number_operation_close_d, LocalDateTime closing_data, Deposit deposit, Client client, Employee employee) {
        this.id = id;
        this.number_operation_close_d = number_operation_close_d;
        this.closing_data = closing_data;
        this.deposit = deposit;
        this.client = client;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber_operation_close_d() {
        return number_operation_close_d;
    }

    public void setNumber_operation_close_d(Integer number_operation_close_d) {
        this.number_operation_close_d = number_operation_close_d;
    }

    public LocalDateTime getClosing_data() {
        return closing_data;
    }

    public void setClosing_data(LocalDateTime closing_data) {
        this.closing_data = closing_data;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
