package Metier;

import java.util.ArrayList;
import java.util.List;

import BEANS.Modalite;
import DAO.DaoElement;
import DAO.DaoModalite;

public class MetieModalite {
DaoModalite  daoModalite=new  DaoModalite();
DaoElement daoElement =new DaoElement();

 public boolean ajouterModalitel(Integer idElment,ArrayList<Modalite> mod){
	 int s=0;
     s =daoElement.getbyI(idElment).getModalte().size();
	if(s==0){
		for(int i=0;i<mod.size();i++) {
			Modalite e = mod.get(i);
			e.setId(idElment);
			daoModalite.Add(e);

	}}	
	else if(s>0){
		System.out.print(2);
	List<Modalite> dm = daoElement.getbyI(idElment).getModalte();
		for(int i=0;i<mod.size();i++) {
			Modalite e = dm.get(i);
			e.setId(idElment);
			e.setLebele(mod.get(i).getLebele());
			e.setPortentage(mod.get(i).getPortentage());
			daoModalite.Update(e);

	}
		return true;
	}
	else
		return false;
	return false;

}

}