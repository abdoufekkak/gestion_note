package BEANS;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="module")
public class Modulee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	 private Integer code;
	@Column(name = "nom_mod")
	 public  String nom;
	
	@Column(name = "id_fil")
	 private Integer id_fil;
	
	@Column(name = "code_sem")
	  private String codee;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "code_sem", referencedColumnName = "code_sem",insertable = false,updatable = false)
	Semestre semestr;
	
	@OneToMany(mappedBy ="mode",fetch =FetchType.EAGER,cascade =CascadeType.PERSIST)
	List<Element> l=new ArrayList<Element>();


	
public Modulee(String nom) {
		super();
		this.nom = nom;
	}

public Modulee(Integer code, String nom, Integer id_fil,String codee) {
		super();
		this.code = code;
		this.nom = nom;
		this.id_fil = id_fil;
		this.codee=codee;
	}


//	 ArrayList<Element> etudiant=new ArrayList<Element>();
	 
	 @ManyToOne(fetch =FetchType.EAGER,cascade =CascadeType.ALL)
	 @JoinColumn(name="id_fil",referencedColumnName="code_fil",insertable = false,updatable = false)
	 private Filiere filiere;
	 
	 
	 
	 public String getCodee() {
		return codee;
	}

	public void setCodee(String codee) {
		this.codee = codee;
	}

	public Semestre getSemestr() {
		return semestr;
	}

	public void setSemestr(Semestre semestr) {
		this.semestr = semestr;
	}

	public List<Element> getL() {
		return l;
	}

	public void setL(List<Element> l) {
		this.l = l;
	}

	public Integer getId_fil() {
		return id_fil;
	}

	public void setId_fil(Integer idFilier) {
		this.id_fil = idFilier;
	} 
	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	
//	public ArrayList<Element> getL() {
//		return l;
//	}
//
//	public void setL(ArrayList<Element> l) {
//		this.l = l;
//	}
//	
//
//	public ArrayList<Element> getEtudiant() {
//		return etudiant;
//	}
//
//	public void setEtudiant(ArrayList<Element> etudiant) {
//		this.etudiant = etudiant;
//	}

	public Modulee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	   
	   
}