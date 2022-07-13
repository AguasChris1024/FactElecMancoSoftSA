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
	//contructor clase clientes
	public Clientes() {
	}
	//metodo para obetener el id del cliente
	public Integer getId() {
		return id;
	}
	// metodo para asignar un id
	public void setId(Integer id) {
		this.id = id;
	}
	//metodo para obtener un nombre
	public String getNombre() {
		return nombre;
	}//metodo para asignar un nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//metodo para obtener el apellido
	public String getApellido() {
		return apellido;
	}
	//metodo para asignar un apellido
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	//metodo para obetener el identificador
	public String getIdentificacionComprador() {
		return identificacionComprador;
	}
	//metodo para asignar un identificador
	public void setIdentificacionComprador(String identificacionComprador) {
		this.identificacionComprador = identificacionComprador;
	}
	//metodo para obtener la direccion
	public String getDireccion() {
		return direccion;
	}
	//metodo para asignar una direccion
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
}
