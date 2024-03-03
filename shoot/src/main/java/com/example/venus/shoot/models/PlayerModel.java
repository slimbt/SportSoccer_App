package com.example.venus.shoot.models;


import jakarta.persistence.*;


@Entity
@Table(name="player")
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PLAYER_ID")
    private Long id;

    private String name;
    private String poste;
    private String number;
    private String teamId;

    public PlayerModel() {
    }

    public PlayerModel( String name, String poste, String number, String teamId) {

        this.name = name;
        this.poste = poste;
        this.number = number;
        this.teamId = teamId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "PlayerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", poste='" + poste + '\'' +
                ", number='" + number + '\'' +
                ", teamId='" + teamId + '\'' +
                '}';
    }
}
