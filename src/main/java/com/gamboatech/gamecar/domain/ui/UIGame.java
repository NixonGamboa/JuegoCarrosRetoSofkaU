package com.gamboatech.gamecar.domain.ui;


import com.gamboatech.gamecar.domain.model.Driver;
import com.gamboatech.gamecar.domain.model.Game;

public class UIGame {

    public static void startGame() throws InterruptedException {
        SetGame.welcome();
        SetGame.makeGamers();
        SetGame.makeDrivers();
        SetGame.selectRaceTrack();
        RunGame.runGame();
    }

    public static void playAgain() throws InterruptedException {
        for (Driver driver: Game.drivers() ) {
            driver.car().resetDistance();
            Game.currentRaceTrack().addToRace(driver.car());
        }
        RunGame.runGame();
    }
    public static void selectDriversAgain() throws InterruptedException {
        SetGame.makeDrivers();
        SetGame.selectRaceTrack();
        RunGame.runGame();
    }
}
