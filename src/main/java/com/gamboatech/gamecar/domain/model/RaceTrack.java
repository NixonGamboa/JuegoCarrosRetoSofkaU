package com.gamboatech.gamecar.domain.model;

import com.gamboatech.gamecar.domain.ui.RunGame;

import java.util.ArrayList;

public class RaceTrack {
   private final int id;
    private final int lengthRace;
    private final int numbOfLanes;
    private ArrayList<Car> cars;

    public RaceTrack(int id, int kms, int numbOfLanes){
        this.id = id;
        this.lengthRace = kms;
        this.numbOfLanes =numbOfLanes;
    }

    //Itera e instancia carros sobre la pista actual
    public void makeCars(){
        cars = new ArrayList<>();
        for (int i = 0; i < numbOfLanes; i++) {
            Driver driver = Game.drivers().get(i);
            Car newCar = new Car(i,lengthRace , driver);
            driver.setCar(newCar);
            cars.add(newCar);
        }
    }

    public void runRace(){
        do {
            for (Car car: cars) {
                car.turn();
                boolean arrived = car.isFinish();
                if (arrived){
                    Podio.addToPodio(car.driver());
                    outOfRace(car);
                    break;
                }
            }
            RunGame.printAdvance(cars);
        }while (!Podio.isFullPodium()&&!cars.isEmpty());
        cars.clear();
    }

    public void outOfRace(Car car){
        cars.remove(car);
    }
    public void addToRace(Car car){
        cars.add(car);
    }


    public int id() {
        return id;
    }
    public int lengthRace() {
        return lengthRace;
    }
}
