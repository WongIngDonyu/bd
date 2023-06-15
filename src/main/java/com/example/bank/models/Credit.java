package com.example.bank.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credits")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer credit_number;
    private String type_of_credit;
    private Integer credit_amount;
    private Integer percentage_of_the_credit;
    private LocalDateTime monthly_payment_of_the_credit;
    private Integer credit_period;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "currency_id")
    private Currency currency_id;
    @OneToMany(mappedBy = "credit", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Open_Credit> open_credits;
    @OneToMany(mappedBy = "credit", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Close_Credit> close_credits;
    @OneToMany(mappedBy = "credit", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Pay_Credit> pay_credits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCredit_number() {
        return credit_number;
    }

    public void setCredit_number(Integer credit_number) {
        this.credit_number = credit_number;
    }

    public String getType_of_credit() {
        return type_of_credit;
    }

    public void setType_of_credit(String type_of_credit) {
        this.type_of_credit = type_of_credit;
    }

    public Integer getCredit_amount() {
        return credit_amount;
    }

    public void setCredit_amount(Integer credit_amount) {
        this.credit_amount = credit_amount;
    }

    public Integer getPercentage_of_the_credit() {
        return percentage_of_the_credit;
    }

    public void setPercentage_of_the_credit(Integer percentage_of_the_credit) {
        this.percentage_of_the_credit = percentage_of_the_credit;
    }

    public LocalDateTime getMonthly_payment_of_the_credit() {
        return monthly_payment_of_the_credit;
    }

    public void setMonthly_payment_of_the_credit(LocalDateTime monthly_payment_of_the_credit) {
        this.monthly_payment_of_the_credit = monthly_payment_of_the_credit;
    }

    public Integer getCredit_period() {
        return credit_period;
    }

    public void setCredit_period(Integer credit_period) {
        this.credit_period = credit_period;
    }

    public Currency getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(Currency currency_id) {
        this.currency_id = currency_id;
    }
}
