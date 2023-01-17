package DAO;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BEANS.Admin;
import BEANS.Element;
import BEANS.Etudiant;
import BEANS.Professuer;

public class DaoElement  implements Traitement{

	private static final int ArrayList = 0;
	public DaoElement() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public boolean Add(Object c) {
		
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		 
		session.beginTransaction();
		session.save((Element)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Delete(Object c) {

		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		 
		session.beginTransaction();
		session.remove((Element)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Update(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.update((Element)c);
		session.getTransaction().commit();
		return false;
	}


	public  java.util.ArrayList<Element> GetAll() {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
	java.util.ArrayList<Element> l = (ArrayList<Element>) session.createQuery("from Element").list();
		session.getTransaction().commit();
return l;
	}
public Element getbyI(Integer i) {
		
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
	    	 session.beginTransaction();
	    	 Element x=	session.load(Element.class, i);
	 		session.getTransaction().commit();
	 		return x;
	     
		}

}
