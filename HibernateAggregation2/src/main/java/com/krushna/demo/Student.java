package com.krushna.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	private int studentid;
	@Column(name="studnetname")
	private String studentName;
	@Column(name = "percentage")
	private float percentage;
	
	@OneToOne(targetEntity = Date.class)
	private Date dob;
	
	@OneToOne(targetEntity = Address.class)
	private Address address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentid, String studentName, float percentage, Date dob, Address address) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.percentage = percentage;
		this.dob = dob;
		this.address = address;
	}

	public int getStudentid() {
		return studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public float getPercentage() {
		return percentage;
	}

	public Date getDob() {
		return dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
