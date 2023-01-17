package DAO;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import BEANS.Etudiant;
import BEANS.Professuer;

public class DaoEtudiant  implements Traitement {
	
	public DaoEtudiant() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public boolean Add(Object c) {
		
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();		 System.out.print(1);
		 
		session.beginTransaction();
		session.save((Etudiant)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Delete(Object c) {

		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.remove((Etudiant)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Update(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		session.beginTransaction();
		session.update((Etudiant)c);
		session.getTransaction().commit();
		return false;
	}


	public  java.util.ArrayList<Etudiant> GetAll() {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		return	(ArrayList<Etudiant>) session.createQuery("from Etudiant").list();
		 
	}

}


