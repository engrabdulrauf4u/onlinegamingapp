package com.example.onlinegamingapp.model;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "PLAYERS")
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "role")
    private String role;

    @Column(name = "email" , unique=true)
    private String email;



    @Column(name = "password")
    private String password;

    @Column(name = "position")
    private String position;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "cell_number")
    private String cellNumber;


    @Column(name = "user_name")
    private String username;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    private Teams teams;

    public Players(){
    }
    public Players(String firstName, String lastName, int age, String role, String email, String cellNumber, Date dateOfBirth, String position,String username,String password,Teams teams){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.role =role;
        this.email=email;
        this.cellNumber = cellNumber;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.teams = teams;
        this.username = username;
        this.password = password;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
