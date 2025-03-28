package com.krushna.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayerInformation player = new PlayerInformation(2,"VIrat Kohali",18,new CustomDate(18,8,1985));
		
		//Approch 1 
		
		Configuration con = new Configuration();
		con.configure();
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		session.persist(player);;
		
		tr.commit();
		session.close();
	}

}
