package com.dh.gameslibraryservice.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data @Builder
public class LibraryWS {
	private String userTag;
	private List<GameWS> games;
}
