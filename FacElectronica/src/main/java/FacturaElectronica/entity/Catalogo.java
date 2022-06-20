package FacturaElectronica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CATALOGO_INEC")
public class Catalogo {
	@Id
	@GeneratedValue
	@Column(name = "cod_inec", nullable = false)
	private int codinec;
	
	@Column(name = "nivel_inec", nullable = false)
	private int nivelinec;
	
	@Column(name = "desc_inec")
	private String descinec;
	

	public int getCodinec() {
		return codinec;
	}

	public void setCodinec(int codinec) {
		this.codinec = codinec;
	}

	public int getNivelinec() {
		return nivelinec;
	}

	public void setNivelinec(int nivelinec) {
		this.nivelinec = nivelinec;
	}

	public String getDescinec() {
		return descinec;
	}

	public void setDescinec(String descinec) {
		this.descinec = descinec;
	}

	
	
}
