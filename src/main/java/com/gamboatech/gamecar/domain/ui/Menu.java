package com.gamboatech.gamecar.domain.ui;


public class Menu {
    public static void menu() throws InterruptedException {
        System.out.println("--MENU::\n 1.Volver a jugar \n 2.Seleccionar conductores\n 3.Reiniciar juego\n 4.Guardar datos y salir");
        int menuResponse = Inputs.inputNumber();
        switch (menuResponse){
            case 1:{
                UIGame.playAgain();
                break;
            }
            case 2:{
                UIGame.selectDriversAgain();
                break;
            }
            case 3:{
                UIGame.startGame();
                break;
            }
            case 4:{
                break;
            }
            default:
                System.out.println("Opcion invalida");
                menu();
        }


    }
}
