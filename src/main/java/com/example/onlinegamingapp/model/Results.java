package com.example.onlinegamingapp.model;

import javax.persistence.*;

@Entity
@Table(name = "RESULTS")
public class Results {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String gameResult;


    @OneToOne(targetEntity = Games.class, orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "GAME_ID")
    private Games games;


}
