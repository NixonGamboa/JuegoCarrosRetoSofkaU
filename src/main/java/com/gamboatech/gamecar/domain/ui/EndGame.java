package com.gamboatech.gamecar.domain.ui;

import com.gamboatech.gamecar.domain.model.Gamer;

import java.util.List;

public class EndGame {
    public static void endGame(List<Gamer> gamers){
        System.out.println("Historico del juego: ");
        for (Gamer gamer: gamers) {
            System.out.println("Jugador: "+gamer.username()+" *Oros: "+gamer.golds()+
                    " Platas: "+gamer.silver()+" Bronces:"+gamer.bronzes());
        }
    }
}
