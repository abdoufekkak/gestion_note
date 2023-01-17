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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.NotFound;
@Entity
@Table(name="professeur")
public class Professuer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

private  Integer code;
	@Column(name = "nom")
 private String nom;
	@Column(name = "prenom")
 private String prenom;
	@Column(name = "specialite")
 private String specialite;
	
	@Column(name="id_compte")
private Integer id_compte;
	
	
	@OneToOne()
    @JoinColumn(name = "id_compte", referencedColumnName = "id_compte",insertable = false,updatable = false)
 private Compte compte;
	
	
	public List<Element> getElemnt_prof() {
		return elemnt_prof;
	}

	public void setElemnt_prof(List<Element> elemnt_prof) {
		this.elemnt_prof = elemnt_prof;
	}
	@OneToMany(mappedBy ="prof",fetch =FetchType.EAGER,cascade =CascadeType.PERSIST)
   List<Element> elemnt_prof=new ArrayList<Element>();
	
	public Integer getId_compte() {
	return id_compte;
}

public void setId_compte(Integer id_compte) {
	this.id_compte = id_compte;
}
	
 
public Professuer() {
	super();
	// TODO Auto-generated constructor stub
}

public Professuer(String nom, String prenom, String specialite) {
	super();
	
	this.nom = nom;
	this.prenom = prenom;
	this.specialite = specialite;
}

public Professuer(Integer code, String nom, String prenom, String specialite, Integer id_compte) {
	super();
	this.code = code;
	this.nom = nom;
	this.prenom = prenom;
	this.specialite = specialite;
	this.id_compte=id_compte;
	
}
public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}
public Compte getCompte() {
	return compte;
}
public void setCompte(Compte compte) {
	this.compte = compte;
}
 


}
