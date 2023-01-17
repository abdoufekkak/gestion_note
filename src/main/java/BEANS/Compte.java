package BEANS;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="compte")

public class Compte{
 /**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	 private Integer id_compte;
	@Column(name = "login")
private  String login;
	@Column(name = "mdp")
 private String motDePass;
	
	@OneToOne(mappedBy = "compte")
	private Professuer prof;
	
	
	@OneToOne(mappedBy = "compte_adm")
	
	private Admin admin;
	
	public Compte() {
	super();
	// TODO Auto-generated constructor stub
}
public Compte(String login, String motDePass) {
	super();
	this.login = login;
	this.motDePass = motDePass;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getMotDePass() {
	return motDePass;
}
public void setMotDePass(String motDePass) {
	this.motDePass = motDePass;
}
public Integer getId_compte() {
	return id_compte;
}
public void setId_compte(Integer id_compte) {
	this.id_compte = id_compte;
}
public Professuer getProf() {
	return prof;
}
public void setProf(Professuer prof) {
	this.prof = prof;
}
public Admin getAdmin() {
	return admin;
}
public void setAdmin(Admin admin) {
	this.admin = admin;
}

  
}
