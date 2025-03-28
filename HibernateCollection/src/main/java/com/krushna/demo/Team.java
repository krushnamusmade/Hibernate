package com.krushna.demo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "all_ipl_teams")
public class Team {
	
	@Id
	@Column(name = "teamid")
	private int teamid;
	@Column(name = "teamname")
	private String teamname;
	
	@OneToMany(targetEntity = Player.class,cascade = CascadeType.ALL)
	private Set<Player> players;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int teamid, String teamname, Set<Player> players) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.players = players;
	}

	public int getTeamid() {
		return teamid;
	}

	public String getTeamname() {
		return teamname;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
	
}
