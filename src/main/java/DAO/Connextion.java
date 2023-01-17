package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Connextion {
	static SessionFactory sessionFactory=null;
	static Session session=null;
	static Configuration cfg=new Configuration().configure("/DAO/hibernate.cfg.xml").addAnnotatedClass(Object.class);
	
	
	public static void  SetConnection() {
		if (session==null) {
			sessionFactory=cfg.buildSessionFactory();
			session = sessionFactory.openSession();
		}
		 
	}


	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public static void setSessionFactory(SessionFactory sessionFactory) {
		Connextion.sessionFactory = sessionFactory;
	}


	public static Session getSession() {
		return session;
	}


	public static void setSession(Session session) {
		Connextion.session = session;
	}


	public static Configuration getCfg() {
		return cfg;
	}


	public static void setCfg(Configuration cfg) {
		Connextion.cfg = cfg;
	}
	
}
