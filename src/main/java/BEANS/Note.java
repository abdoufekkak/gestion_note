package BEANS;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="note")
public class Note {
	@Id
	private Integer nmr;
	@Column(name = "id")

    private Integer id;
	@Column(name = "cne")

private String cne;
	@Column(name = "value")
private Float value;
	 @ManyToOne(fetch =FetchType.EAGER,cascade =CascadeType.ALL)
	 @JoinColumn(name="cne",referencedColumnName="cne",insertable = false,updatable = false)
		private  Etudiant etudiant;
	 @ManyToOne(fetch =FetchType.EAGER,cascade =CascadeType.ALL)
	 @JoinColumn(name="id",referencedColumnName="id",insertable = false,updatable = false)
	private  Element element;
	

public Note() {
	super();
	// TODO Auto-generated constructor stub
}
public Note(Integer id, String cne, Float value,Integer nmr) {
	super();
	this.id = id;
	this.cne = cne;
	this.value = value;
	this.nmr=nmr;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCne() {
	return cne;
}
public void setCne(String cne) {
	this.cne = cne;
}
public Float getValue() {
	return value;
}
public void setValue(Float value) {
	this.value = value;
}
public Integer getNmr() {
	return nmr;
}
public void setNmr(Integer nmr) {
	this.nmr = nmr;
}
public Etudiant getEtudiant() {
	return etudiant;
}
public void setEtudiant(Etudiant etudiant) {
	this.etudiant = etudiant;
}
public Element getElement() {
	return element;
}
public void setElement(Element element) {
	this.element = element;
}


}
