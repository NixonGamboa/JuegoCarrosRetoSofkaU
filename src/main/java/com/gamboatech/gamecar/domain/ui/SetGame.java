package com.gamboatech.gamecar.domain.ui;

import com.gamboatech.gamecar.domain.model.Game;
import com.gamboatech.gamecar.domain.model.Gamer;
import com.gamboatech.gamecar.domain.model.RaceTrack;

import java.util.ArrayList;

public class SetGame {



    public static void welcome (){
        Game.increaseId();
        System.out.println("\n#####################################################################");
        System.out.println("##                   Bienvenido a TU "+Game.idCount()+" JUEGO DE CARROS             ##");
        System.out.println("##    Reto tecnico presentado por: 'Nixon Raul Gamboa' (4)2021     ##");
        System.out.println("#####################################################################\n");
    }

    //Solicita cantidad de jugadores y crea y agrega a gamers en Game class
    public static void makeGamers(){
        Game.initGamers();
        System.out.println("Cuantos jugadores desea crear?:");
        int numbGamers = Inputs.inputNumber();

        for (int i = 0; i < numbGamers; i++) {
            System.out.println("Ingresa el nombre del " + (i+1) + " jugador");
            String name = Inputs.inputText();
            Game.addGamers(i,name);
        }
    }

    //Se crea una lista temporal de conductores disponibles de donde se van seleccionando uno a uno
    public static void makeDrivers() {
        Game.setDrivers(new ArrayList<>());

        System.out.println("Quieres que todos los jugadores sean conductores? y/n");
        if(Inputs.inputText().equals("y")){
            for (Gamer gamer: Game.gamers()) {
                Game.addDrivers(gamer);
            }
        }else {
            ArrayList<Gamer> availableDrivers = new ArrayList<>(Game.gamers());
            System.out.println("Selecciona los conductores:");
            do{
                for (int i = 0; i < availableDrivers.size(); i++) {
                    System.out.println((i+1)+". "+ availableDrivers.get(i).username());
                }
                int response = Inputs.inputNumber();
                Game.addDrivers(availableDrivers.get(response-1));
                availableDrivers.remove(response-1);
                if (availableDrivers.isEmpty()){
                    System.out.println("No hay mas jugadores disponibles");
                    break;
                }
                System.out.println("Desea agregar otro jugador? y/n");
            }while (Inputs.inputText().equals("y"));
        }

    }

    //Crea la lista de Pistas aleatorias y selecciona la del juego en curso
    public static void selectRaceTrack(){
        Game.makeRaceTracks();
        System.out.println("Selecciona una pista:");
        for (RaceTrack track: Game.raceTracks() ) {
            System.out.println("Pista "+track.id()+". "+track.lengthRace()+" kms");
        }
        int idTrackSelected = Inputs.inputNumber();
        Game.makeCurrentRaceTrack(Game.raceTracks().get(idTrackSelected));
    }









}
