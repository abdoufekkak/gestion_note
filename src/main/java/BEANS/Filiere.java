package BEANS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="filiere")
public class Filiere {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer code_fil;
	@Column
	private String nom_fil;
	@Column
	private String  coordinateur_fil;
	@Column
	private String  chef_fil ;
	@OneToMany(mappedBy ="filiere",fetch =FetchType.EAGER,cascade =CascadeType.PERSIST)
    List<Modulee> l=new ArrayList<Modulee>();
	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Filiere(String nomFiliere) {
		super();
//		l=new ArrayList<Modulee>();
	}
	


	public Filiere(String nom_fil, String coordinateur_fil, String chef_fil) {
		super();
		this.nom_fil = nom_fil;
		this.coordinateur_fil = coordinateur_fil;
		this.chef_fil = chef_fil;
	}

	public Filiere(Integer code_fil, String nom_fil) {
		super();
		this.code_fil = code_fil;
		this.nom_fil = nom_fil;
	}
	
	public Integer getcode_fil() {
		return code_fil;
	}
	public void setcode_fil(Integer code_fil) {
		this.code_fil = code_fil;
	}
	public String getNom() {
		return nom_fil;
	}
	public void setNom(String nom) {
		this.nom_fil = nom;
	}
	

	public Integer getCode_fil() {
		return code_fil;
	}

	public void setCode_fil(Integer code_fil) {
		this.code_fil = code_fil;
	}

	public String getNom_fil() {
		return nom_fil;
	}

	public void setNom_fil(String nom_fil) {
		this.nom_fil = nom_fil;
	}

	public String getCoordinateur_fil() {
		return coordinateur_fil;
	}

	public void setCoordinateur_fil(String coordinateur_fil) {
		this.coordinateur_fil = coordinateur_fil;
	}

	public String getChef_fil() {
		return chef_fil;
	}

	public void setChef_fil(String chef_fil) {
		this.chef_fil = chef_fil;
	}


	
}