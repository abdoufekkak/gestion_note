package BEANS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="etudiant")
public class Etudiant implements Serializable{
	@Id
	
	private String cne;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	
//	@ManyToMany(mappedBy="etd")
//	
//	 private List<Element> elet=new ArrayList<Element>();
	
	@OneToMany(mappedBy ="etudiant",fetch =FetchType.EAGER,cascade =CascadeType.PERSIST)

    List<Note> l=new ArrayList<Note>();

//	public List<Element> getElet() {
//		return elet;
//	}
//
//	public void setElet(List<Element> elet) {
//		this.elet = elet;
//	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String cne, String nom, String prenom) {
		super();
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
//		this.elet=new ArrayList<Element>();
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
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




}
