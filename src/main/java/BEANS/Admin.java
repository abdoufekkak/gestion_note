package BEANS;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	
	
	public Admin(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	private Integer id_compte;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_compte", referencedColumnName = "id_compte",insertable = false,updatable = false)
	private Compte compte_adm;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer id, String nom, String prenom, Integer id_compte) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.id_compte = id_compte;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getId_compte() {
		return id_compte;
	}

	public void setId_compte(Integer id_compte) {
		this.id_compte = id_compte;
	}

	public Compte getCompte_adm() {
		return compte_adm;
	}

	public void setCompte_adm(Compte compte_adm) {
		this.compte_adm = compte_adm;
	}
	

	
	
	
}
