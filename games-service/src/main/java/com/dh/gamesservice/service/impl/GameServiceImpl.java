package com.dh.gamesservice.service.impl;

import com.dh.gamesservice.model.Game;
import com.dh.gamesservice.repository.GameRepository;
import com.dh.gamesservice.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
	private GameRepository gameRepository;

	@Autowired
	public GameServiceImpl(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	@Override
	public Game getGameDetails(Integer gameId) {
		return gameRepository.findById(gameId).orElse(null);
	}
}
