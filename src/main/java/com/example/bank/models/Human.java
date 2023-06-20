package com.example.bank.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "humans")
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String passport_series_and_number;
    private String name;
    private String last_name;
    private String middle_name;
    private Integer age;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "citizen_id")
    private Citizen citizen;

    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;
    @OneToMany(mappedBy = "human_id", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<Client> clients;
    @OneToMany(mappedBy = "human_id", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<Employee> employees;

    public Human(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassport_series_and_number() {
        return passport_series_and_number;
    }

    public void setPassport_series_and_number(String passport_series_and_number) {
        this.passport_series_and_number = passport_series_and_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public Human(Long id, String passport_series_and_number, String name, String last_name, String middle_name, Integer age, Citizen citizen, Country country, List<Client> clients, List<Employee> employees) {
        this.id = id;
        this.passport_series_and_number = passport_series_and_number;
        this.name = name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.age = age;
        this.citizen = citizen;
        this.country = country;
        this.clients = clients;
        this.employees = employees;
    }
}
