package com.gamboatech.gamecar.domain.ui;

import com.gamboatech.gamecar.domain.model.Game;

public class UIGame {

    public static void startGame(){
        SetGame.welcome();
        SetGame.makeGamers();
        SetGame.makeDrivers();
        SetGame.selectRaceTrack();


    }
}
