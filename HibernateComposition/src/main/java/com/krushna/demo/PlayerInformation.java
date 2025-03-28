package com.krushna.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "playerinformation")
public class PlayerInformation {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "playerid")
	private int playerId;
	@Column(name = "playername")
	private String playerName;
	@Column(name = "jersaynumber")
	private int jersayNumber;
	@Embedded
	private CustomDate date;
	
	public PlayerInformation() {
		// TODO Auto-generated constructor stub
	}

	public PlayerInformation(int playerId, String playerName, int jersayNumber,CustomDate date) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jersayNumber = jersayNumber;
		this.date = date;
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

	public CustomDate getDate() {
		return date;
	}

	public void setDate(CustomDate date) {
		this.date = date;
	}
	
	

}
