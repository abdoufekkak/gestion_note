package DAO;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BEANS.Etudiant;
import BEANS.Filiere;
import BEANS.Modulee;
import BEANS.Professuer;
import BEANS.Semestre;

public class DaoSemestre implements Traitement {
	
	public DaoSemestre() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public boolean Add(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.save((Semestre)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Delete(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		 
		session.beginTransaction();
		session.remove((Semestre)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Update(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.update((Semestre)c);
		session.getTransaction().commit();
		return false;
	}
	public  java.util.ArrayList<Semestre> GetAll() {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		return	(ArrayList<Semestre>) session.createQuery("from Semestre").list();
}
	public Semestre GetByName(String nom) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		session.beginTransaction();
		ArrayList<Semestre>  x = (ArrayList<Semestre>) session.createQuery("from Semestre where Nom='"+nom+"'").list();
			session.getTransaction().commit();

		 if(x.size()==0) {
			 return null;
		 }

		return (Semestre)x.get(0) ;
		
	}

}
