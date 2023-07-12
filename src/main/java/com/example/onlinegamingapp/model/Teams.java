package com.example.onlinegamingapp.model;

import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

@Entity
@Table(name = "TEAMS")
public class Teams {

    @Id
    @Column(name = "id",insertable = false,nullable = false,unique = true,scale = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "team_name")
    private String teamName;
    @Column(name = "team_city")
    private String teamCity;
    @Column(name = "team_captain")
    private String teamCaptain;
    @Column(name = "coach")
    private String coach;
    @Column(name = "number_of_players")
    private int numberOfPlayers;


    public Teams(){

    }
    public Teams( String teamName, String teamCity, String teamCaptain, String coach, Integer numberOfPlayers) {
        this.teamName = teamName;
        this.teamCity = teamCity;
        this.teamCaptain = teamCaptain;
        this.coach = coach;
        this.numberOfPlayers = numberOfPlayers;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public String getTeamCaptain() {
        return teamCaptain;
    }

    public void setTeamCaptain(String teamCaptain) {
        this.teamCaptain = teamCaptain;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }


}
