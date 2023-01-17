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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Generated;
@Entity
@Table(name="semestre")
public class Semestre implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
//	@Column(name="code_sem",nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private String code_sem;
	@Column(name = "libelle_sem")
   private String Nom;
	
	
	@OneToMany(mappedBy ="semestr",fetch =FetchType.EAGER,cascade =CascadeType.PERSIST)
	@Fetch(value=FetchMode.SUBSELECT)

	private List<Modulee>modules=new ArrayList<Modulee>();
public Semestre() {
	super();
	// TODO Auto-generated constructor stub
}
//public void  ajouterModule(Module m) {
//	modules.add(m);
//	
//}

public Semestre(String code, String nom) {
	super();
	this.code_sem = code;
	Nom = nom;
}
public String getCode() {
	return code_sem;
}
public void setCode(String code) {
	this.code_sem = code;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
    
}
