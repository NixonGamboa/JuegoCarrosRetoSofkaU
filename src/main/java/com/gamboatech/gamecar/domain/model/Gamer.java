package com.gamboatech.gamecar.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "jugadores")
public class Gamer {

    @Id
    private int id;

    private String username;
    private int golds;
    private int silver;
    private int bronzes;


    public Gamer() {
    }

    public Gamer (int id, String name){
        this.id = id;
        this.username = name;
        this.golds=0;
        this.silver=0;
        this.bronzes=0;
    }


    public void addGold() {
        golds++;
    }

    public void addSilver() {
        silver++;
    }

    public void addBronze() {
        bronzes++;
    }

    public int id() {
        return id;
    }
    public String username() {
        return username;
    }
    public int golds() {
        return golds;
    }
    public int silver() {
        return silver;
    }
    public int bronzes() {
        return bronzes;
    }
}
