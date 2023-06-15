package com.example.bank.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String client_number;
    private Integer bank_rating;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
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
}
