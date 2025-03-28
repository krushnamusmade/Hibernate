package com.krushna.demo;

import jakarta.persistence.Embeddable;

@Embeddable
public class CustomDate {

	private int day;
	private int month;
	private int year;
	
	public CustomDate() {
		// TODO Auto-generated constructor stub
	}

	public CustomDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
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

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
