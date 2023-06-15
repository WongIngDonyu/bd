package com.example.bank.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employee_ID_card;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
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
}
