package DAO;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BEANS.Admin;
import BEANS.Compte;
import BEANS.Filiere;
import BEANS.Professuer;

public class DaoCompte implements Traitement {
	public DaoCompte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean Add(Object c) {
		


		Connextion.SetConnection();
	Session 	session=Connextion.getSession();


		 
		session.beginTransaction();
		session.save((Compte)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Delete(Object c) {


		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();

		 
		session.beginTransaction();
		session.remove((Compte)c);
		
		session.getTransaction().commit();
		 System.out.print(1);

		return false;
	}

	@Override
	public boolean Update(Object c) {

		Connextion.SetConnection();
	Session 	session=Connextion.getSession();

		 System.out.print(1);
		 
		session.beginTransaction();
		session.update((Compte)c);
		session.getTransaction().commit();
		return false;
	}


	public  java.util.ArrayList<Compte> GetAll() {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();

		 
		session.beginTransaction();
		return	(ArrayList<Compte>) session.createQuery("from Compte").list();
		 
	}
	
	public Compte GetByName(String login,String mdp) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		session.beginTransaction();
		ArrayList<Compte> x = (ArrayList<Compte>) session.createQuery("from Compte where login='"+login+"' and motDePass='"+mdp+"'").list();
		session.getTransaction().commit();

		 if(x.size()==0) {
			 return null;
		 }
		
		
		return (Compte) x.get(0) ;
		
	}

}
