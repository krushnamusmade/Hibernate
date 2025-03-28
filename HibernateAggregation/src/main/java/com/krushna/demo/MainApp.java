package com.krushna.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomDate date = new CustomDate(12,8,2001);
		Player player = new Player(2,"Krushna Musmade",101,date);
		date.setPlayer(player);
		
		Configuration con = new Configuration();
		con.configure();
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		session.persist(date);
		session.persist(player);
		
		tr.commit();
		session.close();
		
	}

}
