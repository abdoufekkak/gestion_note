package Metier;

import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import BEANS.Cc;
import BEANS.Element;
import BEANS.Modalite;
import BEANS.ModeEvaluation;
import BEANS.Note;
import BEANS.Projet;
import BEANS.Tp;
import DAO.DaoElement;
import DAO.DaoNote;

public class Metiervalider {
DaoElement daoElement=new DaoElement();
DaoNote  daoNote=new DaoNote();
	public void  valider(Integer e,ArrayList<Double>cc,ArrayList<Double>tp,ArrayList<Double>projt) {
		ModeEvaluation l1=null;
		ModeEvaluation l2=null;
		ModeEvaluation l3=null;

		Element element = daoElement.getbyI(e);
		List<Modalite> mod=element.getModalte();
		for(int i=0;i<mod.size();i++) {
         if(mod.get(i).getLebele().equals("c1")) {
				
           l1=new Cc();         }
         else if(mod.get(i).getLebele().equals("c2")) {
        	 l2=new Projet();
         }
         else if(mod.get(i).getLebele().equals("c3")) {
           l3=new Tp();
         }
		}
		int k=0;
		int j=1;
		int f=2;
if (mod.size()==1) {
	k=0;
	j=0;
	f=0;
}
else if(mod.size()==2) {
	if (mod.get(0).getLebele().equals("c1") && mod.get(1).getLebele().equals("c2")) {
		k=0;
		j=1;
	}
	else if(mod.get(0).getLebele().equals("c1") && mod.get(1).getLebele().equals("c3")) {
		k=0;
		f=1;
	}
	else if(mod.get(0).getLebele().equals("c2") && mod.get(1).getLebele().equals("c3")) {
		j=0;
		f=1;
	}
}

		List<Note> notes=element.getNote();
		if(cc!=null) {
		for(int i=0;i<cc.size();i++) {
			double notc1 =0;	
			if(l1!=null) {
				System.out.print("abdou");
				notc1 +=l1.calculerNote((double)mod.get(k).getPortentage(),cc.get(i));	
			}
			notes.get(i).setValue(notes.get(i).getValue()+(float)notc1);
		}}
	
		if(tp!=null  ) {
			for(int i=0;i<tp.size();i++) {
				double notc1 =0;
				if(l2!=null) {
					System.out.print("abdou");
					notc1 +=l1.calculerNote((double)mod.get(j).getPortentage(),tp.get(i));	
				}
				notes.get(i).setValue(notes.get(i).getValue()+(float)notc1);
			}
		}
		
		
		if(projt!=null) {

		
		for(int i=0;i<projt.size();i++) {
			double notc1 =0;
			if(l3!=null) {
				System.out.print("abdou");
				notc1 +=l1.calculerNote((double)mod.get(f).getPortentage(),projt.get(i));	
			}
			notes.get(i).setValue(notes.get(i).getValue()+(float)notc1);
		} }
		for(int i=0;i<notes.size();i++) {
			notes.get(i).setValue(notes.get(i).getValue()/100);
			daoNote.Update(notes.get(i));
		}
		
		}
		
	
}
