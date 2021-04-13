package com.gamboatech.gamecar.domain.model;

import java.util.ArrayList;

public class RaceTrack {
    private static int countId=0;
    private final int id;
    private final int length;
    private final int numbOfLanes;
    private ArrayList<TrackLane> trackLanes;

    public RaceTrack(int kms, int numbOfLanes){
        this.id = RaceTrack.countId;
        this.length = kms;
        this.numbOfLanes =numbOfLanes;
        RaceTrack.countId ++;
    }

    //Itera e instancia carriles sobre la pista actual
    public void makeTrackLanes(){
        trackLanes = new ArrayList<>();
        for (int i = 0; i < numbOfLanes; i++) {
            int lanePosition = i;
            Driver driver = Game.drivers().get(i);
            TrackLane newTrackLane = new TrackLane(lanePosition, driver, length);
            trackLanes.add(newTrackLane);
        }
        System.out.println("Lista de carriles sobre la pista "+ this.trackLanes);
    }

    public int length() {
        return length;
    }

    public int id() {
        return id;
    }
}
