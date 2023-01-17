package Metier;

import java.util.ArrayList;

import BEANS.Element;
import BEANS.Filiere;
import BEANS.Modulee;
import BEANS.Professuer;
import BEANS.Semestre;
import DAO.DaoElement;
import DAO.DaoFiliere;
import DAO.DaoModule;
import DAO.DaoProf;
import DAO.DaoSemestre;

public class MetierElement {
public  DaoElement daoElement= new DaoElement();
public  DaoModule daoModule= new DaoModule();
public  DaoFiliere daoFilier= new DaoFiliere();
public DaoProf daoProf =new DaoProf();
public DaoSemestre daoSemestre =new DaoSemestre();


public boolean AjouterElement(Element e,String nomModule,String nomFiliere,String id,Professuer professeur) {
	if(daoProf.GetByName(professeur.getNom(),professeur.getPrenom())==null) {
		return false;
	}
	Professuer prof=daoProf.GetByName(professeur.getNom(), professeur.getPrenom());
//	

	if(daoFilier.GetByName(nomFiliere)==null) {
return false;}

	
Filiere fFilier=daoFilier.GetByName(nomFiliere);

	if(daoModule.GetByName(nomModule)==(null)) {
	Modulee tmp = new Modulee(nomModule);
	tmp.setFiliere(fFilier);
	System.out.println(fFilier.getcode_fil());
	tmp.setId_fil(fFilier.getcode_fil());
	Semestre ss=daoSemestre.GetByName(id);
	tmp.setSemestr(ss);
	tmp.setCodee(id);

		daoModule.Add(tmp);
		
	}

//	
//	
Integer IDmodul=daoModule.GetByName(nomModule).getCode();
 Element toto = new Element();
 toto.setId(e.getId());
 toto.setCoeff(e.getCoeff());
 toto.setLibele(e.getLibele());
 toto.setId_mod(IDmodul);
 toto.setModule(daoModule.GetByName(nomFiliere));
 toto.setId_prof(prof.getCode());
 toto.setProf(prof);
daoElement.Add(toto);


	return false;
	
}
public boolean SupprimerElement(Integer id) {
Element tmp = new Element();
tmp.setId(id);
	daoElement.Delete(tmp);
	
	return false;
}
public ArrayList<Element> getAll() {
	return daoElement.GetAll();}


public boolean UpdateElemnt(Element tmp) {
	daoElement.Update(tmp);
	return true;
	
}

}