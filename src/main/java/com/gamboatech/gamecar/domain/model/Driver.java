package com.gamboatech.gamecar.domain.model;

public class Driver {

    private final Gamer player;
    private Car car;

    public Driver(Gamer gamer){
        this.player = gamer;
    }


    public int throwDice(){
        int dice = (int) (Math.random()*6+1);
        return dice;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Gamer player() {
        return player;
    }

    public Car car() {
        return car;
    }
}
