package com.gamboatech.gamecar.domain.model;

public class TrackLane {
    private final int id;
    private final int endOfRace;
    private int distance;
    private boolean isFinish;

    public TrackLane(int lanePosition, int lengthLane) {
        this.id = lanePosition;
        this.distance=0;
        this.endOfRace = lengthLane*1000;
        this.isFinish = false;
    }


    public void toRun(int advance){
        distance += advance;
    }

    public void verifyingArrival(){
        isFinish = (distance >= endOfRace);
    }



    public int id() {
        return id;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public int distance() {
        return distance;
    }
}
