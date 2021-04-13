package com.gamboatech.gamecar;

import com.gamboatech.gamecar.domain.ui.UIGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamecarApplication.class, args);
		UIGame.startGame();


	}

}
