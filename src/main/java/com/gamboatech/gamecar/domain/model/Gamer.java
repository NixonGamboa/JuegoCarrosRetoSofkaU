package com.gamboatech.gamecar.domain.model;

public class Gamer {
    private final int id;
    private final String username;

    public Gamer (int id,String name){
        this.id = id;
        this.username = name;
    }


    public int id() {
        return id;
    }
    public String username() {
        return username;
    }


}
