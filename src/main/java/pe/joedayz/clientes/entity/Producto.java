package pe.joedayz.clientes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "ProductoServ")

public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@NotEmpty
	@Column(name = "codinec")
	private String codinec;
	@NotEmpty
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "valor")
	@Digits(integer=10, fraction=3)
	private float valor;
	@NotEmpty
	@Column(name = "infoadi")
	private String infoadi;
	
	@Column(name = "iva")
	@Digits(integer=10, fraction=3)
	private float iva;
	
	@Column(name = "ice")
	@Digits(integer=10, fraction=3)
	private float ice;
	public Producto() {
		
	}
	public Producto(Integer id, String codinec, String nombre, float valor, String infoadi, float iva, float ice) {
		this.id = id;
		this.codinec = codinec;
		this.nombre = nombre;
		this.valor = valor;
		this.infoadi = infoadi;
		this.iva = iva;
		this.ice = ice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodinec() {
		return codinec;
	}
	public void setCodinec(String codinec) {
		this.codinec = codinec;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getInfoadi() {
		return infoadi;
	}
	public void setInfoadi(String infoadi) {
		this.infoadi = infoadi;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float getIce() {
		return ice;
	}
	public void setIce(float ice) {
		this.ice = ice;
	}
	
	
	
	
	
	
	
	
}
