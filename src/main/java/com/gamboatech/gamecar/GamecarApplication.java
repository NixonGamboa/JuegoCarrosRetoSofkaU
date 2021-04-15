package com.gamboatech.gamecar;

import com.gamboatech.gamecar.domain.model.Game;
import com.gamboatech.gamecar.domain.model.Gamer;
import com.gamboatech.gamecar.domain.repository.GameService;
import com.gamboatech.gamecar.domain.ui.EndGame;
import com.gamboatech.gamecar.domain.ui.UIGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GamecarApplication implements CommandLineRunner {

	@Autowired
	GameService gameService;

	public static void main(String[] args)  {
		SpringApplication.run(GamecarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UIGame.startGame();
		gameService.deleteAll();
		gameService.saveAll(Game.gamers());
		EndGame.endGame((List<Gamer>) gameService.findAll());
	}

}
