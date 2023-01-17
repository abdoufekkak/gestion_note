package BEANS;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="modalite")
public class Modalite{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer	Id_moda ;
	@Column

private String	lebele ;
	@Column

private Integer	portentage ;
	@Column

private Integer Id;
	 @ManyToOne(fetch =FetchType.EAGER,cascade =CascadeType.ALL)
	 @JoinColumn(name="Id",referencedColumnName="Id",insertable = false,updatable = false)
private Element e;
	 
	public Modalite() {
		super();
		// TODO Auto-generated constructor stub
	this.portentage=0;
	}
	public Modalite(String lebele, Integer portentage) {
		super();
		this.lebele = lebele;
		this.portentage = portentage;

	}
	public Integer getId_moda() {
		return Id_moda;
	}
	public void setId_moda(Integer id_moda) {
		Id_moda = id_moda;
	}
	public String getLebele() {
		return lebele;
	}
	public void setLebele(String lebele) {
		this.lebele = lebele;
	}
	public Integer getPortentage() {
		return portentage;
	}
	public void setPortentage(Integer portentage) {
		this.portentage = portentage;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Element getE() {
		return e;
	}
	public void setE(Element e) {
		this.e = e;
	}


}
