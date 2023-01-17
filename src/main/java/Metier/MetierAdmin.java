package Metier;

import java.util.ArrayList;

import BEANS.Admin;
import BEANS.Compte;
import BEANS.Professuer;
import DAO.DaoAdmin;
import DAO.DaoCompte;

public class MetierAdmin {

	 DaoCompte x=new DaoCompte();
	 DaoAdmin fff=new DaoAdmin();
	 
	 
	 public boolean ajouterProf(Admin tmp,Compte cmpt) {
			
			tmp.setCompte_adm(cmpt);
			cmpt.setAdmin(tmp);
			 x.Add(cmpt);
			 tmp.setId_compte(cmpt.getId_compte());
	fff.Add(tmp);


			return false;
			 
			
		}
		
		public boolean deleteProf(int IDadmin) {
			
			Admin xx=	fff.getbyI(IDadmin);
//		  System.out.println(xx.getCompte().getLogin());
	   Compte c=xx.getCompte_adm();
	//   System.out.println(c.getId_compte());
			fff.Delete(xx);
		x.Delete(c);
			return false;

	}
		public boolean Updateprof(int IDadmin,Admin proffff) {
			Admin xx=	fff.getbyI(IDadmin);
//			  System.out.println(xx.getCompte().getLogin());
			xx.setNom(proffff.getNom());
			xx.setPrenom(proffff.getPrenom());
			
			fff.Update(xx);
			return true;
		}

	 public ArrayList<Admin> getAll(){
		return fff.GetAll();
	}
}
