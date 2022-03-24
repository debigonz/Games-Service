package com.dh.gamesservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "games")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String classification;
	private String developer;
	private String publisher;
}
