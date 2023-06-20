package com.example.bank.models;
import jakarta.persistence.*;


import java.util.List;


@Entity
@Table(name = "citizens")
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String citizenship;
    @OneToMany(mappedBy = "citizen", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Human> humans;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }

    public Citizen(Long id, String citizenship, List<Human> humans) {
        this.id = id;
        this.citizenship = citizenship;
        this.humans = humans;
    }
    public Citizen(){

    }
}
