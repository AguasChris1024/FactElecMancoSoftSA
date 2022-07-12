package pe.joedayz.clientes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase clientes = Inicializa los atribuitos de clientes 
 * @author Jess
 * @version 2
 * @since  1.0
 */
@Entity
@Table(name = "Cliente")
public class Clientes {

	/**
	 * Inicializa los atributos del la clase clientes
	 * @param id = id del cliente
	 * @param  Nombre = Nombre  del cliente
	 * @param apeliido = apellido el cliente
	 * @param identificacion comprador=  la identificacion del comprador
	 * @param direccion = direccion exacta del cliente
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "identificacionComprador")
	private String identificacionComprador;
	@Column(name = "direccion")
	private String direccion;
	public Clientes(Integer id, String nombre, String apellido, String identificacionComprador, String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacionComprador = identificacionComprador;
		this.direccion = direccion;
	}
	//hola mundo
	public Clientes() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificacionComprador() {
		return identificacionComprador;
	}
	public void setIdentificacionComprador(String identificacionComprador) {
		this.identificacionComprador = identificacionComprador;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
}
