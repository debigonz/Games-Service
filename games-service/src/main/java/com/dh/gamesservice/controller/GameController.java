package com.dh.gamesservice.controller;

import com.dh.gamesservice.model.Game;
import com.dh.gamesservice.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {
	private GameService gameService;

	@Autowired
	public GameController(GameService gameService) {
		this.gameService = gameService;
	}

	@GetMapping("/{gameId}")
	public Game getGameDetails(@PathVariable Integer gameId) {
		return gameService.getGameDetails(gameId);
	}
}
