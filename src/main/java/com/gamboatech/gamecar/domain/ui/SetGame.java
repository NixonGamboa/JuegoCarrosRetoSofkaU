package com.gamboatech.gamecar.domain.ui;

import com.gamboatech.gamecar.domain.model.Game;
import com.gamboatech.gamecar.domain.model.Gamer;
import com.gamboatech.gamecar.domain.model.RaceTrack;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

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
        Game.setGamers(new ArrayList<>());
        System.out.println("Cuantos jugadores desea crear:");
        int numbGamers = inputNumber();

        for (int i = 0; i < numbGamers; i++) {
            System.out.println("Por favor ingrese el nombre del " + (i+1) + " jugador");
            String name = inputText();
            Game.addGamers(i,name);
        }
    }

    //Se crea una lista temporal de conductores disponibles de donde se van seleccionando uno a uno
    public static void makeDrivers() {
        Game.setDrivers(new ArrayList<>());

        boolean select = true;
        ArrayList<Gamer> availableDrivers = new ArrayList<>();
        availableDrivers.addAll(Game.gamers());

        System.out.println("Seleccione quienes desean jugar en esta ocacion:");
        while (select){
            for (int i = 0; i < availableDrivers.size(); i++) {
                System.out.println((i+1)+". "+ availableDrivers.get(i).username());
            }
            int response = inputNumber();
            Game.addDrivers(availableDrivers.get(response-1));
            availableDrivers.remove(response-1);
            System.out.println("Desea agregar otro jugador? y/n");
            select = inputText().equals("y");
        }
    }

    //Crea la lista de Pistas y selecciona la del juego en curso
    public static void selectRaceTrack(){
        Game.makeRaceTracks();
        System.out.println("Selecciona una pista:");
        for (RaceTrack track: Game.raceTracks() ) {
            System.out.println("Pista "+track.id()+". "+track.length()+" kms");
        }
        int idTrackSelected = inputNumber();
        Game.makeCurrentRaceTrack(Game.raceTracks().get(idTrackSelected));
    }






    private static int inputNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("::Ingrese un numero:");
        String input = Objects.requireNonNull(sc.nextLine(),"number is required");
        int number = Integer.parseInt(input);
        return number;
    }

    private static String inputText(){
        Scanner sc = new Scanner(System.in);
        String input = Objects.requireNonNull(sc.nextLine(),"input is required");
        return input;
    }

}
