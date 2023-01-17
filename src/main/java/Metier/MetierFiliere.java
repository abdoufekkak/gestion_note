package Metier;


import java.util.ArrayList;


import BEANS.Filiere;

import DAO.DaoFiliere;

public class MetierFiliere {
	
	 DaoFiliere fff=new DaoFiliere();
	public boolean ajouterProf(Filiere tmp) {
		
        fff.Add(tmp);


		return false;
		 
		
	}
	
	public boolean deleteFiliere(int code_fil) {
		
		Filiere xx=	fff.getbyI(code_fil);
//	  System.out.println(xx.getCompte().getLogin());
   
//   System.out.println(c.getId_compte());
		fff.Delete(xx);
		return false;

}
	public boolean UpdatFiliere(int code_fil,Filiere fili) {
		Filiere xx=	fff.getbyI(code_fil);
//		  System.out.println(xx.getCompte().getLogin());
		xx.setNom(fili.getNom());
		xx.setCoordinateur_fil(fili.getCoordinateur_fil());
		xx.setChef_fil(fili.getChef_fil());
		xx.setcode_fil(fili.getCode_fil());
		fff.Update(xx);
		return true;
	}

 public ArrayList<Filiere> getAll(){
	return fff.GetAll();
}
}