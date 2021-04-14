package com.gamboatech.gamecar.domain.ui;

import com.gamboatech.gamecar.domain.model.Driver;
import com.gamboatech.gamecar.domain.model.Game;
import com.gamboatech.gamecar.domain.model.Podio;

public class Menu {
    public static void menu() throws InterruptedException {
        System.out.println("--MENU::\n 1.Volver a jugar \n 2.Seleccionar conductores\n 3.Reiniciar juego\n 4.Salir");
        int menuResponse = Inputs.inputNumber();
        switch (menuResponse){
            case 1:{
                UIGame.playAgain();
            }
            case 2:{
                UIGame.selectDriversAgain();
            }
            case 3:{
                UIGame.startGame();
            }
            case 4:{
                System.exit(0);
            }
            default:
                System.out.println("Opcion invalida");
                menu();
        }

    }
}
