package com.gamboatech.gamecar.domain.model;

public class Driver {

    private int lanePosition;
    private Gamer player;
    private Car car;

    public Driver(Gamer gamer){
        this.player = gamer;
    }



    public void setCar(Car car) {
        this.car = car;
    }

    public void setLanePosition(int lanePosition) {
        this.lanePosition = lanePosition;
    }
}
