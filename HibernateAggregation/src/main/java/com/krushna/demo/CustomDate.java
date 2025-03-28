package com.krushna.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customdatepratice")
public class CustomDate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srno;
	@Column(name = "day")
	private int day;
	@Column(name = "month")
	private int month;
	@Column(name = "year")
	private int year;
	
	@OneToOne(targetEntity = Player.class)
	private Player player;
	

	public CustomDate() {
		// TODO Auto-generated constructor stub
	}

	public CustomDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getSrno() {
		return srno;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public Player getPlayer() {
		return player;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
  
	
	

}
