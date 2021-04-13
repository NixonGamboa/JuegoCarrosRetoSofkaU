package com.gamboatech.gamecar.domain.model;

public class Car {
    private int id;
    private int position;
    private Driver driver;

    public Car(Driver driver, TrackLane trackLane) {
        this.driver = driver;
        this.id= trackLane.lanePosition();
        this.position=0;
    }
}
