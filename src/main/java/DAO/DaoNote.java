package DAO;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BEANS.Element;
import BEANS.Etudiant;
import BEANS.Note;

public class DaoNote implements Traitement {
     

	
	
	public DaoNote() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public boolean Add(Object c) {
		
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		 
		session.beginTransaction();
		session.save((Note)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Delete(Object c) {


		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.remove((Note)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Update(Object c) {

		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		 
		session.beginTransaction();
		session.update((Note)c);
		session.getTransaction().commit();
		return false;
	}


	public  java.util.ArrayList<Note> GetAll() {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		return	(ArrayList<Note>) session.createQuery("from Note").list();
		 
	}
	
}
