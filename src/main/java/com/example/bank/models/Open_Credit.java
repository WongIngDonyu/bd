package com.example.bank.models;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "open_credits")
public class Open_Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number_operation_open_c;
    private LocalDateTime data_open;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_id")
    private Credit credit;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;
    public Open_Credit()
    {

    }
    public Open_Credit(Long id, Integer number_operation_open_c, LocalDateTime data_open, Credit credit, Client client, Employee employee) {
        this.id = id;
        this.number_operation_open_c = number_operation_open_c;
        this.data_open = data_open;
        this.credit = credit;
        this.client = client;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber_operation_open_c() {
        return number_operation_open_c;
    }

    public void setNumber_operation_open_c(Integer number_operation_open_c) {
        this.number_operation_open_c = number_operation_open_c;
    }

    public LocalDateTime getData_open() {
        return data_open;
    }

    public void setData_open(LocalDateTime data_open) {
        this.data_open = data_open;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
