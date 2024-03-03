package com.example.venus.shoot.models;

import jakarta.persistence.*;

@Entity
@Table(name="team")
public class TeamModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TEAM_ID")
    private Long id;
    private String name;
    private String sinceOf;


    public TeamModel() {
    }

    public TeamModel( String name, String sinceOf) {

        this.name = name;
        this.sinceOf = sinceOf;
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

    public String getSinceOf() {
        return sinceOf;
    }

    public void setSinceOf(String sinceOf) {
        this.sinceOf = sinceOf;
    }

    @Override
    public String toString() {
        return "TeamModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sinceOf='" + sinceOf + '\'' +
                '}';
    }
}
