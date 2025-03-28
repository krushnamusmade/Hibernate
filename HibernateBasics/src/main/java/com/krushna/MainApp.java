package com.krushna;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		PlayerInformation obj = new PlayerInformation("Rohit Sharama",45);
		
		Configuration con = new Configuration();
		con.configure();
		
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tr = session.beginTransaction();
//		session.save(obj);
		
		PlayerInformation exit = session.load(PlayerInformation.class, 152);
		System.out.println("Player Name : "+exit.getPlayerName());
		
		session.delete(exit);
		
		tr.commit();
		session.close();
		
	}

}
