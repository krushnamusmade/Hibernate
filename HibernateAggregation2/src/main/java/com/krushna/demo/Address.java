package com.krushna.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToOne(targetEntity = Student.class)
	private Student studentid;
	@Column(name = "line")
	private String line;
	@Column(name = "city")
	private String city;
	@Column(name = "pin")
	private int pin;
	@Column(name = "county")
	private String country;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String line, String city, int pin, String country) {
		super();
		this.line = line;
		this.city = city;
		this.pin = pin;
		this.country = country;
	}

	public Student getStudentid() {
		return studentid;
	}

	public String getLine() {
		return line;
	}

	public String getCity() {
		return city;
	}

	public int getPin() {
		return pin;
	}

	public String getCountry() {
		return country;
	}

	public void setStudentid(Student studentid) {
		this.studentid = studentid;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
	
	
	

}
