package pe.joedayz.clientes.entity;

/**
 * Clase Role = Inicializa la clase role 
 * @author Jess
 * @version 1
 * @since  1.0
 */
import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Entity
@Table(name = "Role")
public class Role  implements Serializable {
	/**
	 * Inicializa los atributos del la clase Role
	 * @param Nom_Role = nombre del rol
	 * */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer Id;

	@Column(name = "Nom_Role")
	private String nombreRole;

	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles")
	private Set<Usuario> usuarios;

//constructor de la clase Role con parametros 
	public Role(Integer id, String nombreRole) {
	
		Id = id;
		this.nombreRole = nombreRole;
	
	} //constructor de la clase role
	public Role() {
	
	}
   //metodo get para obtener el id
	public Integer getId() {
		return Id;
	}
//metodo set para asigna el id
	public void setId(Integer id) {
		Id = id;
	}
// metodo get para obtener el nombre del rol
	public String getNombreRole() {
		return nombreRole;
	}
 //metodo para asignar un nombre al rol
	public void setNombreRole(String nombreRole) {
		this.nombreRole = nombreRole;
	}
 //metodo get para obtener usuarios
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
