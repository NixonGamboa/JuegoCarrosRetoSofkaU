package com.gamboatech.gamecar.domain.model;

import java.util.Objects;

public class Podio {
    private static Driver firstPlace;
    private static Driver secondPlace;
    private static Driver thirdPlace;
    private static boolean fullPodium;


    public static void addToPodio(Driver driver){
        if (Objects.isNull(firstPlace())){
            addFirstPlace(driver);
        }else if (Objects.isNull(secondPlace())){
            addSecondPlace(driver);
        } else if (Objects.isNull(thirdPlace())){
            addThirdPlace(driver);
            fullPodium =true;
        }
    }

    public static void clearPodium(){
        addFirstPlace(null);
        addSecondPlace(null);
        addThirdPlace(null);
        fullPodium=false;
    }

    public static void awardMedals() {
        firstPlace().player().addGold();
        secondPlace().player().addSilver();
        thirdPlace().player().addBronze();
    }


    public static Driver firstPlace() {
        return firstPlace;
    }
    private static void addFirstPlace(Driver firstPlace) {
        Podio.firstPlace = firstPlace;
    }

    public static Driver secondPlace() {
        return secondPlace;
    }
    private static void addSecondPlace(Driver secondPlace) {
        Podio.secondPlace = secondPlace;
    }

    public static Driver thirdPlace() {
        return thirdPlace;
    }
    private static void addThirdPlace(Driver thirdPlace) {
        Podio.thirdPlace = thirdPlace;
    }

    public static boolean isFullPodium() {
        return fullPodium;
    }

}
