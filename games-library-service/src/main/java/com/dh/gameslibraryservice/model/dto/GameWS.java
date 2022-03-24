package com.dh.gameslibraryservice.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameWS {
	private Integer id;
	private String name;
	private String classification;
	private String developer;
	private String publisher;
}
