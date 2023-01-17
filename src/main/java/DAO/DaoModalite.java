package DAO;

import java.util.ArrayList;

import org.hibernate.Session;

import BEANS.Modalite;

public class DaoModalite implements Traitement
{
	@Override
	public boolean Add(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.save((Modalite)c);
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
		session.remove((Modalite)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Update(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.update((Modalite)c);
		session.getTransaction().commit();
		return false;
	}
	
	
	public ArrayList<Modalite> GetAll() {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		 
		session.beginTransaction();
	ArrayList<Modalite> x = (ArrayList<Modalite>) session.createQuery("from Modalite").list();
	session.getTransaction().commit();
	return x;
	}
	public Modalite GetByName(String nom) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		session.beginTransaction();
		 ArrayList<Modalite> x =(ArrayList<Modalite>) session.createQuery("from Modalite where lebele='"+nom+"'").list();
		session.getTransaction().commit();

		 if(x.size()==0) {
			 return null;
		 }

		return (Modalite)x.get(0) ;
}
}
