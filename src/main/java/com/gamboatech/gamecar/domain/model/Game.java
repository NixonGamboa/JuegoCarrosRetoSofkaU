package com.gamboatech.gamecar.domain.model;

import com.gamboatech.gamecar.domain.Constants;

import java.util.ArrayList;

public class Game {
    private static int idCount = 0;
    private static ArrayList<Gamer> gamers;
    private static ArrayList<Driver> drivers;
    private static ArrayList<RaceTrack> raceTracks;
    private static RaceTrack currentRaceTrack;


    public static void increaseId(){
        idCount ++;
    }
    public static int idCount() {
        return idCount;
    }

    public static void initGamers() {
        Game.gamers = new ArrayList<>();
    }
    public static void addGamers(int id, String name) {
        Gamer newGamer = new Gamer(id,name);
        Game.gamers.add(newGamer);
    }
    public static ArrayList<Gamer> gamers() {
        return gamers;
    }

    public static void setDrivers(ArrayList<Driver> drivers) {
        Game.drivers = drivers;
    }
    public static void addDrivers(Gamer gamer) {
        Driver newDriver = new Driver(gamer);
        Game.drivers.add(newDriver);
    }
    public static ArrayList<Driver> drivers() {
        return drivers;
    }

    //Crea pistas de juego con longitudes aleatorias entre dos limites y num de carriles igual a conductores
    public static void makeRaceTracks(){
        Game.raceTracks = new ArrayList<>();
        int numbOfLanes = Game.drivers().size();
        for (int i = 0; i < Constants.NUMB_OF_RACETRACKS; i++) {
            int kms = (int) (Math.random()*(Constants.MAX_KMS-Constants.MIN_KMS)+Constants.MIN_KMS);
            RaceTrack newRaceTrack = new RaceTrack(kms,numbOfLanes);
            Game.raceTracks.add(newRaceTrack);
        }
    }
    public static ArrayList<RaceTrack> raceTracks() {
        return raceTracks;
    }

    //Configura la pista actual creando sobre ella carriles y carros para cada jugador
    public static void makeCurrentRaceTrack(RaceTrack currentRaceTrack) {
        Game.currentRaceTrack = currentRaceTrack;
        Game.currentRaceTrack.makeCars();
    }
    public static RaceTrack currentRaceTrack() {
        return currentRaceTrack;
    }
}
