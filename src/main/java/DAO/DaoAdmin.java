package DAO;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BEANS.Admin;
import BEANS.Professuer;

public class DaoAdmin  implements Traitement {
	public DaoAdmin() {
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
		 System.out.print(1);
		 
		session.beginTransaction();
		session.save((Admin)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Delete(Object c) {

		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 System.out.print(1);
		 
		session.beginTransaction();
		session.remove((Admin)c);
		
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean Update(Object c) {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		session.update((Admin)c);
		session.getTransaction().commit();
		return false;
	}


	public  java.util.ArrayList<Admin> GetAll() {
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
		 
		session.beginTransaction();
		ArrayList<Admin> l = (ArrayList<Admin>) session.createQuery("from Admin").list();
		session.getTransaction().commit();
return l;
	}
	public Admin getbyI(Integer i) {
		
		Connextion.SetConnection();
	    Session 	session=Connextion.getSession();
	    	 session.beginTransaction();
	 		Admin x=	session.load(Admin.class, i);
	 		session.getTransaction().commit();
	 		return x;
	     
		}
	
	public Admin GetByName(String nom,String prenom) {
		Connextion.SetConnection();
		Session 	session=Connextion.getSession();
		session.beginTransaction();
		
		 ArrayList<Admin> x = (ArrayList<Admin>) session.createQuery("from admin where nom='"+nom+"' and prenom='"+prenom+"'").list();
	 		session.getTransaction().commit();

		 if(x.size()==0) {
			 return null;
		 }

		return (Admin)x.get(0) ;
		
	}

}
