package com.krushna.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Playerpratice")
public class Player {
	
	@Id
	@Column(name = "playerid")
	private int id;
	@Column(name="playername")
	private String playerName;
	@Column(name = "jerseynumber")
	private int jerseyNumber;
	
	@OneToOne(targetEntity = CustomDate.class)
	private CustomDate date;  
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String playerName, int jerseyNumber, CustomDate date) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public CustomDate getDate() {
		return date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public void setDate(CustomDate date) {
		this.date = date;
	}
	
	

}
