package BEANS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name="element")
public class Element {
	/**
	 * 
	 */
	@Id
 private Integer id;
	@Column(name = "libelle")

 private String libele;
	@Column(name = "coeff")

 private Double coeff;
	@Column(name = "id_mod")
private Integer id_mod;
	@Column(name = "id_prof")
   private Integer id_prof;
	
	
	
	
	@OneToMany(mappedBy ="element",fetch =FetchType.EAGER,cascade =CascadeType.PERSIST)
@Fetch(value=FetchMode.SUBSELECT)
    List<Note> note=new ArrayList<Note>();
	
	
	
	 @ManyToOne(fetch =FetchType.EAGER,cascade =CascadeType.ALL)
	 @JoinColumn(name="id_mod",referencedColumnName="code",insertable = false,updatable = false)
	
      public Modulee mode;
	 

	
	public Modulee getMode() {
		return mode;
	}

	public void setMode(Modulee mode) {
		this.mode = mode;
	}

	@ManyToOne(fetch =FetchType.EAGER,cascade =CascadeType.ALL)
	 @JoinColumn(name="id_prof",referencedColumnName="code",insertable = false,updatable = false)
	 public Professuer prof;
	 
	  
		
	 @OneToMany(mappedBy ="e",fetch =FetchType.EAGER,cascade =CascadeType.PERSIST)
	 @Fetch(value=FetchMode.SUBSELECT)

	    List<Modalite> Modalte=new ArrayList<Modalite>();

	 

	public Element() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Element(Integer id, String libele, double coeff,Integer id_mod,Integer id_prof) {
		super();
		this.id = id;
		this.libele = libele;
		this.coeff = coeff;
		this.id_mod=id_mod;
		this.id_prof=id_prof;
//		this.etd=new ArrayList<Etudiant>();
	}
	public Element(Integer id, String libele, Double coeff) {
		super();
		this.id = id;
		this.libele = libele;
		this.coeff = coeff;
	}

	
 
// private ArrayList<ModeEvaluation> evalue=new ArrayList<ModeEvaluation>();
 
//	@ManyToMany(cascade = CascadeType.ALL)
//	 @JoinTable(name = "note", 
//	 joinColumns= @JoinColumn(name = "id"),
//	 inverseJoinColumns=@JoinColumn(name = "cne")
//	 )
//	
// private List<Etudiant> etd=new ArrayList<Etudiant>();

 
 


//public Professuer getProfPreEncharge() {
//	return profPreEncharge;
//}
//
//public void setProfPreEncharge(Professuer profPreEncharge) {
//	this.profPreEncharge = profPreEncharge;
//}


public Integer getId_mod() {
		return id_mod;
	}
	public void setId_mod(Integer id_mod) {
		this.id_mod = id_mod;
	}
	public Integer getId_prof() {
		return id_prof;
	}
	public void setId_prof(Integer id_prof) {
		this.id_prof = id_prof;
	}
	public List<Note> getNote() {
		return note;
	}
	public void setNote(List<Note> note) {
		this.note = note;
	}
	public Modulee getModule() {
		return this.mode;
	}
	public void setModule(Modulee module) {
		this.mode = module;
	}
	public Professuer getProf() {
		return prof;
	}
	public void setProf(Professuer prof) {
		this.prof = prof;
	}
public Double getCoeff() {
		return coeff;
	}
	public void setCoeff(Double coeff) {
		this.coeff = coeff;
	}
//	public List<Etudiant> getEtd() {
//		return etd;
//	}
//	public void setEtd(List<Etudiant> etd) {
//		this.etd = etd;
//	}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getLibele() {
	return libele;
}
public void setLibele(String libele) {
	this.libele = libele;
}

public List<Modalite> getModalte() {
	return Modalte;
}

public void setModalte(List<Modalite> modalte) {
	Modalte = modalte;
}

 
}
