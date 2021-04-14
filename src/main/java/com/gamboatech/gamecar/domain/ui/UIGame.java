package com.gamboatech.gamecar.domain.ui;



public class UIGame {

    public static void startGame() throws InterruptedException {
        SetGame.setGame();
        RunGame.runGame();
    }
}
