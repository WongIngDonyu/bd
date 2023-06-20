package com.example.bank.models;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "open_deposits")
public class Open_Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number_operation_open_d;
    private LocalDateTime data_open;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "deposit_id")
    private Deposit deposit;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;
    public Open_Deposit(){

    }

    public Open_Deposit(Long id, Integer number_operation_open_d, LocalDateTime data_open, Deposit deposit, Client client, Employee employee) {
        this.id = id;
        this.number_operation_open_d = number_operation_open_d;
        this.data_open = data_open;
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

    public Integer getNumber_operation_open_d() {
        return number_operation_open_d;
    }

    public void setNumber_operation_open_d(Integer number_operation_open_d) {
        this.number_operation_open_d = number_operation_open_d;
    }

    public LocalDateTime getData_open() {
        return data_open;
    }

    public void setData_open(LocalDateTime data_open) {
        this.data_open = data_open;
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
