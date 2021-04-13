package com.gamboatech.gamecar.domain.model;

public class TrackLane {
    private int lanePosition;
    private int finishMtrs;
    private Car car;

    //Metodo constructor de carril, aqui se instancia tambien el carro sobre el carril y se asigna al conductor junto con la posicion
    public TrackLane(int lanePosition, Driver driver, int length) {
        this.lanePosition = lanePosition;
        this.finishMtrs = length*1000;
        this.car = new Car(driver,this);
        driver.setCar(this.car);
        driver.setLanePosition(lanePosition);
    }

    public int lanePosition() {
        return lanePosition;
    }
}
