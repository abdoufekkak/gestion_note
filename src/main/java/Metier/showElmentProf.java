package Metier;

import java.util.ArrayList;
import java.util.List;

import BEANS.Compte;
import BEANS.Element;
import BEANS.Etudiant;
import BEANS.Note;
import DAO.DaoCompte;
import DAO.DaoElement;

public class showElmentProf {
  DaoCompte daoCompte =new DaoCompte();
  DaoElement daoElement=new DaoElement();

	public List<Element> GETElementPROF(Compte c){
		c=daoCompte.GetByName(c.getLogin(), c.getMotDePass());
		return  c.getProf().getElemnt_prof();
	}
		
public List<Note> GETetudaint( Integer idelemnt){
	{
		Element element = daoElement.getbyI(idelemnt);
		
	List<Note> F = element.getNote();
	for(int i=0;i<F.size();i++) {
		System.out.println(F.get(i).getEtudiant().getCne());
	}
	return F;
	}
		
		
	}

}
