package com.krushna.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		Date date = new Date(20,10,2001);
		Address address = new  Address("Musmade vasti","Kopargaon",423601,"India");
		Student student = new Student(2,"Pramod More",84.40f,date,address);
		date.setStudentid(student);
		address.setStudentid(student);
		
		Configuration con = new Configuration();
		con.configure();
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		session.persist(student);
		session.persist(date);
		session.persist(address);
		
		tr.commit();
		session.close();
		
	}

}
