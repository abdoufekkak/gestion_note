package DAO;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BEANS.Etudiant;
import BEANS.Modulee;
import BEANS.Professuer;


public class DaoModule implements Traitement{
	
	@Override
	public boolean Add(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.save((Modulee)c);
		 System.out.print(1);

		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Delete(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		 
		session.beginTransaction();
		session.remove((Modulee)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Update(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.update((Modulee)c);
		session.getTransaction().commit();
		return false;
	}
	
	
	public ArrayList<Modulee> GetAll() {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		 
		session.beginTransaction();
		return	(ArrayList<Modulee>) session.createQuery("from Modulee").list();
	}
	public Modulee GetByName(String nom) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		session.beginTransaction();
		 ArrayList<Modulee> x =(ArrayList<Modulee>) session.createQuery("from Modulee where Nom='"+nom+"'").list();
		session.getTransaction().commit();

		 if(x.size()==0) {
			 return null;
		 }

		return (Modulee)x.get(0) ;
		
	}

}