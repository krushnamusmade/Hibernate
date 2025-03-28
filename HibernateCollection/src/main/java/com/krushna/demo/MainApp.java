package com.krushna.demo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team team = new Team();
		Set<Player> players = new HashSet<Player>();
		players.add(new Player(1,"Ms Dhoni",7,team));
		players.add(new Player(2,"Ruturaj Gaikwad",33,team));
		players.add(new Player(3,"Shivam Dube",45,team));
		team.setTeamid(1);
		team.setTeamname("Chennai Super Kings");
		team.setPlayers(players);
		
		Configuration con = new Configuration().configure();
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
	//	session.persist(team);
		Team obj = session.getReference(Team.class, 1);
		System.out.println(obj.getTeamid());
		
		tr.commit();
		session.close();
		
	}

}
