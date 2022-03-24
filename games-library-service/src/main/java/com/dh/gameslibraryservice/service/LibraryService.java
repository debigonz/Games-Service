package com.dh.gameslibraryservice.service;

import com.dh.gameslibraryservice.model.dto.LibraryWS;

public interface LibraryService {
	LibraryWS getUserLibrary(String userTag);
}
