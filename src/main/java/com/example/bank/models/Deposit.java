package com.example.bank.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "deposits")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer deposit_number;
    private String type_of_deposit;
    private Integer deposit_amount;
    private Integer deposit_percentage;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "currency_id")
    private Currency currency_id;
    @OneToMany(mappedBy = "deposit", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Open_Deposit> open_deposits;
    @OneToMany(mappedBy = "deposit", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Close_Deposit> close_deposits;
    @OneToMany(mappedBy = "deposit", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Payout_Deposit> payout_deposits;
}
