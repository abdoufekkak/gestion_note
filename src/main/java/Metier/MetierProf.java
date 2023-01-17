package Metier;

import java.util.ArrayList;

import BEANS.Compte;
import BEANS.Professuer;
import DAO.DaoCompte;
import DAO.DaoProf;

public class MetierProf {

	 DaoCompte x=new DaoCompte();
	 DaoProf fff=new DaoProf();
	public boolean ajouterProf(Professuer tmp,Compte cmpt) {
		
 		tmp.setCompte(cmpt);
  		cmpt.setProf(tmp);
		 x.Add(cmpt);
		 tmp.setId_compte(cmpt.getId_compte());
         fff.Add(tmp);
		return false;
		 
		
	}
	
	public boolean deleteProf(int IDprof) {
		
	Professuer xx=	fff.getbyI(IDprof);
//	  System.out.println(xx.getCompte().getLogin());
   Compte c=xx.getCompte();
//   System.out.println(c.getId_compte());
		fff.Delete(xx);
Compte fo = new Compte();
fo.setId_compte(c.getId_compte());;
		x.Delete(fo);
		return false;

}
	public boolean Updateprof(int IDprof,Professuer proffff) {
		Professuer xx=	fff.getbyI(IDprof);
//		  System.out.println(xx.getCompte().getLogin());
		xx.setNom(proffff.getNom());
		xx.setPrenom(proffff.getPrenom());
		xx.setSpecialite(proffff.getSpecialite());
		fff.Update(xx);
		return true;
	}

 public ArrayList<Professuer> getAll(){
	return fff.GetAll();
}
}