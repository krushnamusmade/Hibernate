package com.krushna.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Date")
public class Date {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToOne(targetEntity = Student.class)
	private Student studentid;
	@Column(name = "day")
	private int day;
	@Column(name = "month")
	private int month;
	@Column(name = "year")
	private int year;

	
	public Date() {
		// TODO Auto-generated constructor stub
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Student getStudentid() {
		return studentid;
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

	public void setStudentid(Student studentid) {
		this.studentid = studentid;
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
