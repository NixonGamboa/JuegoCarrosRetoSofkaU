package com.gamboatech.gamecar.domain.ui;

import com.gamboatech.gamecar.domain.model.Car;
import com.gamboatech.gamecar.domain.model.Game;
import com.gamboatech.gamecar.domain.model.Podio;

import java.util.ArrayList;
import java.util.Objects;

public class RunGame {

    public static void runGame() throws InterruptedException {
        adviseStart();
        runRace();
        congratulateWinners();

    }

    private static void adviseStart () throws InterruptedException {
        System.out.println("\n Preparados... El juego empezara pronto...");
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("GO!!!");
    }

    private static void runRace(){
        Game.currentRaceTrack().runRace();
    }

    private static void congratulateWinners(){
        Podio.awardMedals();
        System.out.println("\n#####################################################");
        System.out.println("===========...FELICIDADES... ...PODIO... ============");
        if(!Objects.isNull(Podio.firstPlace())){
            System.out.println("Primer lugar: "+Podio.firstPlace().car().brand()+" "+Podio.firstPlace().car().color()+
                " conducido por: "+Podio.firstPlace().player().username());}
        if(!Objects.isNull(Podio.secondPlace())){
            System.out.println("Segundo lugar: "+Podio.secondPlace().car().brand()+" "+Podio.secondPlace().car().color()+
                    " conducido por: "+Podio.secondPlace().player().username());}
        if(!Objects.isNull(Podio.firstPlace())){
            System.out.println("Tercer lugar: "+Podio.thirdPlace().car().brand()+" "+Podio.thirdPlace().car().color()+
                    " conducido por: "+Podio.thirdPlace().player().username());}
    }

    public static void printAdvance(ArrayList<Car> cars) {
        System.out.println("\n###################################################################################");
        for (Car car: cars) {
            String dataDriver =car.id()+". "+car.driver().player().username();
            String dataCar = car.brand()+" "+car.color();
            String dataPosition = "Avance: "+car.lastMovement()+"mts Posicion Actual: "+car.distance()+"mts";
            System.out.println("*Corredor:"+dataDriver+" *Carro: "+dataCar+" *"+dataPosition);
        }
    }


}
