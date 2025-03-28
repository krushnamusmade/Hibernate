package com.krushna.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "allplayer")
public class Player {
	
	@Id
	@Column(name = "playerid")
	private int playerid;
	@Column(name = "playername")
	private String playername;
	@Column(name = "jersay")
	private int jersay;
	
	@ManyToOne(targetEntity = Team.class)
	private Team team;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int playerid, String playername, int jersay, Team team) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.jersay = jersay;
		this.team = team;
	}

	public int getPlayerid() {
		return playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public int getJersay() {
		return jersay;
	}

	public Team getTeam() {
		return team;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public void setJersay(int jersay) {
		this.jersay = jersay;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	

}
