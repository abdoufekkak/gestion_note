package DAO;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BEANS.Admin;
import BEANS.Filiere;
import BEANS.Professuer;
import antlr.collections.List;
public class DaoProf implements Traitement  {


	public DaoProf() {
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
		
		session.save((Professuer)c);
		
		session.getTransaction().commit();

		return false;
	}

	@Override
	public boolean Delete(Object c) {

		Connextion.SetConnection();
		Session 	session=Connextion.getSession();
			  
				session.beginTransaction();
				try {
					session.remove((Professuer)c);

				}catch(Exception e) {
					
				}
				finally {
					System.out.println(1);
					session.getTransaction().commit();

				}
				
				
				 System.out.print(1);
		  
		
		 
	
		return false;
	}

	@Override
	public boolean Update(Object c) {
		
		Connextion.SetConnection();
		Session 	session=Connextion.getSession();
			 session.beginTransaction();
				session.update((Professuer)c);
				session.getTransaction().commit();
			return	false;
		 
	}


	public  java.util.ArrayList<Professuer> GetAll() {
		Connextion.SetConnection();
		Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		ArrayList<Professuer> l = (ArrayList<Professuer>) session.createQuery("from Professuer").list();
 		session.getTransaction().commit();

		return l;
	}
	public Professuer getbyI(Integer i) {
		
		Connextion.SetConnection();
		Session 	session=Connextion.getSession();
    	 session.beginTransaction();
 		Professuer x=	session.load(Professuer.class, i);
 		session.getTransaction().commit();
 		return x;
     }
	
	
	public Professuer GetByName(String nom,String prenom) {
		Connextion.SetConnection();
		Session 	session=Connextion.getSession();
		session.beginTransaction();
		
		 ArrayList<Professuer> x = (ArrayList<Professuer>) session.createQuery("from Professuer where nom='"+nom+"' and prenom='"+prenom+"'").list();
	 		session.getTransaction().commit();

		 if(x.size()==0) {
			 return null;
		 }

		return (Professuer)x.get(0) ;
		
	}

}
