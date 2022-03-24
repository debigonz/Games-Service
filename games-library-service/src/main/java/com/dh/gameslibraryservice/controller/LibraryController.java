package com.dh.gameslibraryservice.controller;

import com.dh.gameslibraryservice.model.dto.LibraryWS;
import com.dh.gameslibraryservice.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {
	private LibraryService libraryService;

	@Autowired
	public LibraryController(LibraryService libraryService) {
		this.libraryService = libraryService;
	}

	@GetMapping("/{userTag}")
	public LibraryWS getUserLibrary(@PathVariable String userTag) {
		return libraryService.getUserLibrary(userTag);
	}
}
