package com.krushna;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "playerinformation")
public class PlayerInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "playerid")
	private int playerId;
	@Column(name = "playername")
	private String playerName;
	@Column(name = "jersaynumber")
	private int jersayNumber;
	
	public PlayerInformation() {
		// TODO Auto-generated constructor stub
	}

	public PlayerInformation( String playerName, int jersayNumber) {
		super();
		
		this.playerName = playerName;
		this.jersayNumber = jersayNumber;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getJersayNumber() {
		return jersayNumber;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setJersayNumber(int jersayNumber) {
		this.jersayNumber = jersayNumber;
	}
	
	

}
