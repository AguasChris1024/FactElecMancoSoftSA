package pe.joedayz.clientes.entity;

/**
 * Clase Usuario = Inicializa los atribuitos del usuario 
 * @author Jess
 * @version 1
 * @since  1.0
 */
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Past;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Inicializa los atributos del la clase Usuarios
	 * @param id = id del usuario
	 * @param  Cod_Usuario = codigo del usuario
	 * @param Nom_Usuario = nombre del usuario
	 * @param Password_Usuario =  contrasena del  usuario 
	 * @param fecha_ingreso = fecha de ingreso
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Integer id;
	@Column(name = "Cod_Usuario")
	private String codUsuario;
	@Column(name = "Nom_Usuario")
	private String nomUsuario;
	@Column(name = "Password_Usuario")
	private String passwordUsuario;
	
	@Past
	@Column(name = "Fecha_Ingreso")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaIngreso;
	
	
	@Column(name = "Grupo_Menus")
	private String grupoMenus;
	@Basic(optional = false)
	@Column(name = "Active")
	private boolean active;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Usuario_Role",
			joinColumns = @JoinColumn(name = "User_Id"),
			inverseJoinColumns = @JoinColumn(name = "Role_Id"))
	private Set<Role> roles;


	//metodo get para obtener el id
	public Integer getId() {
		return id;
	}
	//metodo ser para asignar un id


	public void setId(Integer id) {
		this.id = id;
	}

	//metodo get para obtener el codigo del usuario
	public String getCodUsuario() {
		return codUsuario;
	}
//metodo ser para asignar un codigo de usuario
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	//metodo get para asignar el nombre del usuario
	public String getNomUsuario() {
		return nomUsuario;
	}
	 //metodo get para obtener el nombre del usuario 

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	//metodo get para obtener la contrasena del usuario
	public String getPasswordUsuario() {
		return passwordUsuario;
	}
	//metodo get para asignar  la contrasena  del usuario
	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}
	//metodo get para obtner  la fecha de ingreso  del usuario
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	//metodo get para asignar la fecha de ingreso  del usuario

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getGrupoMenus() {
		return grupoMenus;
	}

	public void setGrupoMenus(String grupoMenus) {
		this.grupoMenus = grupoMenus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Usuario usuario = (Usuario) o;
		return Objects.equals(id, usuario.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}