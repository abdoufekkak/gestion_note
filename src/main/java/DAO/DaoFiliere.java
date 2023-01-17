package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BEANS.Filiere;
import BEANS.Professuer;
import BEANS.Semestre;


public class DaoFiliere implements Traitement{
	

	@Override
	public boolean Add(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		 
		session.beginTransaction();
		session.save((Filiere)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Delete(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		  
		session.beginTransaction();
		session.remove((Filiere)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Update(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		 
		session.beginTransaction();
		session.update((Filiere)c);
		session.getTransaction().commit();
		return false;
	}


	public ArrayList<Filiere> GetAll() {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		session.beginTransaction();
		ArrayList<Filiere> l = (ArrayList<Filiere>) session.createQuery("from Filiere").list();
 		session.getTransaction().commit();
return l;
	}
	public Filiere getbyI(Integer i) {
		
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
	    	 session.beginTransaction();
	    	 Filiere x=	session.load(Filiere.class, i);
	 		session.getTransaction().commit();
	 		return x;
	     }
		
	public Filiere GetByName(String nom) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		session.beginTransaction();
		ArrayList<Filiere> x = (ArrayList<Filiere>) session.createQuery("from Filiere where nom_fil='"+nom+"'").list();
		session.getTransaction().commit();

		 if(x.size()==0) {
			 return null;
		 }
		
		
		return (Filiere) x.get(0) ;
		
	}

}