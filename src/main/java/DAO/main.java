package DAO;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.cfg.Configuration;
import org.jvnet.staxex.util.XMLStreamReaderToXMLStreamWriter;

import BEANS.*;
import Metier.MetieModalite;
import Metier.MetierElement;
import Metier.MetierProf;
import Metier.Metiervalider;
import Metier.showElmentProf;
public class main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//    	DaoEtudiant x=new DaoEtudiant();
//    	  ArrayList<Etudiant> z = x.GetAll();
//      System.out.print(z.get(1).getElet().size());
// Etudiant y=new Etudiant("l204","sam" ,"rai" );
//	x.Add(y);
////		
//   Note y1=new Note();
//   y1.setCne("l11");
//   y1.setId(12);
//   y1.setValue( (float) 23);
//   y1.setNmr(2);
//	x1.Add(y1);
//ArrayList<Note> f = x1.GetAll();
//ArrayList<Etudiant>g=new ArrayList<Etudiant>();
//for(int i=0;i<f.size();i++) {
//
//	if(f.get(i).getElement().getLibele().equals("ihm")) {
//
//		g.add(f.get(i).getEtudiant());
//	}
//	
//}
//for(int i=0;i<g.size();i++) {
//	System.out.println(g.get(i).getNom());
//}
//		DaoModule x1=new DaoModule();
//       Modulee x2 = new Modulee("abdou","nom","5");
//	x1.Add(x2);
//	DaoElement x11=new DaoElement();
//	     yyy=      x11.GetAll();
//    Element x22 = new Element(2,"libele",2,"10",1);
//	DaoProf x11=new DaoProf();
//	System.out.print(x11.GetAll().get(0).getElemnt_prof().size());
		
// y.getElet().add(y1);
// y1.getEtd().add(y);
//		Livre c1 = null;
//		DaoProf x=new DaoProf();
//         
//		 c1=new Livre();
//		 c1.setID(1);
//		 c1.setName("aze");
//		 c1.setId_c(0);
//		  
//		   x.Add(c1);
//		Filiere y = new Filiere();
//		DaoFiliere x=new DaoFiliere();
//		y.setNom("abd");
//		y.setId("5");
//		Modulee s=new Modulee("10","nom","5","codeee");
//		DaoModule c=new DaoModule();
//		c.Add(s);
//	 DaoCompte ff=new DaoCompte();
//
	MetierProf f=new MetierProf();
//	f.getAll();
//	f.deleteProf(447);
	
//		Professuer X=new Professuer("salma","afik","abdou");
//		Compte yy = new Compte();
//		yy.setLogin("12");
//		yy.setMotDePass("12a");
//		x.ajouterProf(X,yy);
////   	X.setId_compte(25);
//	DaoProf f=new DaoProf();
	
//		f.GetByName("salma","rafik");

//DaoCompte xx=new DaoCompte();
//xx.Add(yy);
//		Modulee tmp = new Modulee(nomModule);
//		tmp.setCodee("1");
//		tmp.se
//		
//DaoModule daoModule=new DaoModule();
//		//		daoModule.Add(tmp);
//		Integer IDmodul=daoModule.GetByName("web").getCode();
//		System.out.print(IDmodul);
//	
//     	 Element toto = new Element();
//      	 Element e= new Element(1,"ORACLE",(Double)2.0);
//   		 toto.setCoeff(e.getCoeff());
//		 toto.setLibele(e.getLibele());
//		 toto.setId_mod(IDmodul);
//		 toto.setModule(daoModule.GetByName("1"));
//		 toto.setId_prof(prof.getCode());
//		 toto.setProf(prof);
//		 DaoElement daoElement=new DaoElement();
//		daoElement.Add(toto);

//	MetierElement x=new MetierElement();
//	DaoElement y=new DaoElement();
//	/y.Add(	new Element(6,"ORACLE",(Double)2.0,1,30));
//		Semestre ss=daoSemestre.GetByName("1");
//		tmp.setSemestr(ss);
//		tmp.setCodee("1");
//		DaoModule daoModule=new DaoModule();
//		daoModule.Add(new Modulee("web"));

//x.AjouterElement(e,"web" ,"nom","1",X);


//	X.setCode(5);
//	X.setId_compte(16);
//	ff.Delete(X);
//Compte zz = new Compte("abdou","abdou");

//zz.setId_compte(16);
//ff.Delete(zz);

////	x.Delete(zz);
////	X.setCompte(zz);
////
//DaoProf z = new DaoProf();

//ArrayList<Professuer> l = z.GetAll();
//System.out.print(l.get(0).getCompte().getLogin());
//	MetierProf ff1=new	MetierProf();
//	ff1.ajouterProf(X, zz);
		
//MetierProf ff1=new MetierProf();
//
//ff1.getAll();
// 	ff1.ajouterProf(new Professuer("salma","rafik","bi"), new Compte("ss","23"));
//	ff1.deleteProf(435);
//		zz.setProf(X);
//		 x.Add(zz);
//			X.setId_compte(zz.getId_compte());
//
//			
//			 ff1.Add(X);

//	     Semestre g = new Semestre("Fffff","nom");
//		 DaoSemestre f = new DaoSemestre();
//		 f.Delete(g);
//	Element e = new Element(4,"ORACLE",(Double)2.0,1,30);	
//	
//	 Element toto = new Element();
//	 
//	 toto.setCoeff(e.getCoeff());
//	 toto.setLibele(e.getLibele());
//	 toto.setId_mod(3);
//		System.out.println(111111);
//
//	 toto.setId_prof(30);
//	// toto.setProf(prof);
//	 DaoElement	 daoElement=new DaoElement();
//	daoElement.Add(toto);
//		for(int i=0;i<100;i++) {
//			MetierProf Y=new MetierProf();
//		
//			Professuer x = new Professuer("salma","rafik","bi");
//			Y.ajouterProf(x, new Compte)
//		}
		
//	MetieModalite MetieModalite=new MetieModalite();
//	Modalite x = new Modalite("cd",30);
//	Modalite y = new Modalite("ce",30);
//	Modalite z = new Modalite("ca",40);
////
	MetierElement e=new MetierElement();
	ArrayList<Element>l=e.getAll();
	System.out.print(l.get(0).getModule().getNom());
//
//	MetieModalite.ajouterModalitel(1,l);
//		ArrayList<Double> cc=new 	ArrayList<Double>();
//		cc.add((double) 9);
//		cc.add((double) 12);
//		cc.add((double) 20);
//		ArrayList<Double> tp=new 	ArrayList<Double>();
//		tp.add((double) 10);
//		tp.add((double) 20);
//		tp.add((double) 20);
//		ArrayList<Double> proje=new 	ArrayList<Double>();
//		proje.add((double) 12);
//		proje.add((double) 5);
//		proje.add((double) 15);
//		Metiervalider x = new Metiervalider ();
//		x.valider(1, cc,null, proje);
//		List<Element> e = x.GETElementPROF(new Compte("abdou","abdou"));
		
		}

	

}
