package com.gamboatech.gamecar.domain.model;

import com.gamboatech.gamecar.domain.Constants;

public class Car extends TrackLane {

    private final String color;
    private final String brand;
    private final Driver driver;
    private int lastMovement;

    public Car(int lanePosition,int lengthLane, Driver driver) {
        super(lanePosition,lengthLane);
        this.driver = driver;
        this.brand = launchBrand();
        this.color = launchColor();
    }

    private String launchBrand(){
        String[] brands = Constants.BRANDS;
        int objectRandom = (int) (Math.random()*brands.length);
        return brands[objectRandom];
    }
    public String brand() {
        return brand;
    }

    private String launchColor(){
        String[] colors = Constants.COLORS;
        int objectRandom = (int) (Math.random()*colors.length);
        return colors[objectRandom];
    }
    public String color() {
        return color;
    }

    public void turn(){
        int dice = driver.throwDice();
        int advance = carMoving(dice);
        super.toRun(advance);
        super.verifyingArrival();
    }

    private int carMoving(int speed){
        int advance = speed*100;
        lastMovement = advance;
        return advance;
    }

    public Driver driver() {
        return driver;
    }

    public int lastMovement() {
        return lastMovement;
    }
}
