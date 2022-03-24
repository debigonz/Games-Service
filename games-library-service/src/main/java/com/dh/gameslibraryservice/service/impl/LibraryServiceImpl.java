package com.dh.gameslibraryservice.service.impl;

import com.dh.gameslibraryservice.model.Library;
import com.dh.gameslibraryservice.model.dto.GameWS;
import com.dh.gameslibraryservice.model.dto.LibraryWS;
import com.dh.gameslibraryservice.repository.LibraryRepository;
import com.dh.gameslibraryservice.repository.feign.GameFeignRepository;
import com.dh.gameslibraryservice.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {
	private LibraryRepository libraryRepository;
	private GameFeignRepository gameFeignRepository;

	@Autowired
	public LibraryServiceImpl(LibraryRepository libraryRepository, GameFeignRepository gameFeignRepository) {
		this.libraryRepository = libraryRepository;
		this.gameFeignRepository = gameFeignRepository;
	}

	@Override
	public LibraryWS getUserLibrary(String userTag) {
		List<Library> libraryList = libraryRepository.findAllByUserTag(userTag);
		List<GameWS> gamesList = libraryList.stream()
				.map(Library::getGameId)
				.map(gameId -> gameFeignRepository.getGameDetails(gameId))
				.toList();
		return LibraryWS.builder()
				.userTag(userTag)
				.games(gamesList)
				.build();
	}
}
