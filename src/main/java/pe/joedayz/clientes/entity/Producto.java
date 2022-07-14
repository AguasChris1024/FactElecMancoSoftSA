package pe.joedayz.clientes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Inicializa los atributos del la clase Prnoducto
 * @param id = id del Producto
 * @param  Nombre = Nombre  del Producto
 * @param valor = valor el Producto
 * @param infoadi=  informacion del producto
 * @param iva  = iva del producto
 * */
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
	//Constructor de la clase producto con parametros
	public Producto(Integer id, String codinec, String nombre, float valor, String infoadi, float iva, float ice) {
		this.id = id;
		this.codinec = codinec;
		this.nombre = nombre;
		this.valor = valor;
		this.infoadi = infoadi;
		this.iva = iva;
		this.ice = ice;
	}
	// metodo para obtener un id
	public Integer getId() {
		return id;
	}
	//metodo para asignar un id
	public void setId(Integer id) {
		this.id = id;
	}
	//metodo para obtener un codinec
	public String getCodinec() {
		return codinec;
	}
	//metodo para asignar un codinec
	public void setCodinec(String codinec) {
		this.codinec = codinec;
	}
	//metodo para obtner un nombre 
	public String getNombre() {
		return nombre;
	}//metodo para asignar un nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//metodo para obtener un valor
	public float getValor() {
		return valor;
	}
	// metodo para asignar un valor
	public void setValor(float valor) {
		this.valor = valor;
	}
	//metodo para obtener un Infoadi
	public String getInfoadi() {
		return infoadi;
	}
	//metodo para asignar un infoadi
	public void setInfoadi(String infoadi) {
		this.infoadi = infoadi;
	}
	//metodo para obtner el valor del IVA
	public float getIva() {
		return iva;
	}
	//metodo para asignar el valor del IVA
	public void setIva(float iva) {
		this.iva = iva;
	}
	//metodo para obtener el valor de ICE
	public float getIce() {
		return ice;
	}
	//metodo ara asignar el valor de ICE
	public void setIce(float ice) {
		this.ice = ice;
	}
	
	
	
	
	
	
	
	
}
