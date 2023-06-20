package com.example.bank.models;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "close_credits")
public class Close_Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number_operation_close_c;
    private LocalDateTime closing_data;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_id")
    private Credit credit;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Close_Credit(Long id, Integer number_operation_close_c, LocalDateTime closing_data, Credit credit, Client client, Employee employee) {
        this.id = id;
        this.number_operation_close_c = number_operation_close_c;
        this.closing_data = closing_data;
        this.credit = credit;
        this.client = client;
        this.employee = employee;
    }
    public Close_Credit(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber_operation_close_c() {
        return number_operation_close_c;
    }

    public void setNumber_operation_close_c(Integer number_operation_close_c) {
        this.number_operation_close_c = number_operation_close_c;
    }

    public LocalDateTime getClosing_data() {
        return closing_data;
    }

    public void setClosing_data(LocalDateTime closing_data) {
        this.closing_data = closing_data;
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
