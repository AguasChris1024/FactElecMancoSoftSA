package pe.joedayz.clientes.entity;

import java.io.Serializable;

import javax.persistence.*;
/**
 * Clase Menu = Inicializa la clase menu 
 * @author Jess
 * @version 1
 * @since  1.0
 */
@Entity
@Table(name = "Menus")
@NamedQueries({
		@NamedQuery(name = "Menu.findAll", query = "SELECT t FROM Menu t")})
public class Menu implements Serializable {

	/**
	 * Inicializa los atributos del la clase Menu
	 * @param cod_Menu = codigo del menu
	 * @param  Descripcion = descripcion del menu
	 * @param Orden = orden que tendra el menu
	 * @param activo = activo del menu
	 * */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Cod_Menu")
	private Integer codMenu;
	@Column(name = "Descripcion")
	private String descripcion;
	@Column(name = "Padre")
	private Integer padre;
	@Column(name = "Orden")
	private Integer orden;
	@Column(name = "Activo")
	private Integer activo;
	
	//construnctor de la clase menu

	public Menu() {
	}

	// contructor de la clase menu con parametros
	public Menu(Integer codMenu) {
		this.codMenu = codMenu;
	}
	//metodo para obetener el docigo del menu

	public Integer getCodMenu() {
		return codMenu;
	}
	//metodo para asignar el codigo del menu

	public void setCodMenu(Integer codMenu) {
		this.codMenu = codMenu;
	}

	//metodo para obtener la descripcion del menu
	public String getDescripcion() {
		return descripcion;
	}
    //metodo para asignar la descripcion  del menu
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
	public Integer getPadre() {
		return padre;
	}
    
	public void setPadre(Integer padre) {
		this.padre = padre;
	}
    //metodo para obtener la orden del menu
	public Integer getOrden() {
		return orden;
	}
// metodo para asignar la orden del menu
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	//metodo para obtener el estado del menu

	public Integer getActivo() {
		return activo;
	}
	//metodo para asignar el estado del menu

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codMenu != null ? codMenu.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Menu)) {
			return false;
		}
		Menu other = (Menu) object;
		if ((this.codMenu == null && other.codMenu != null) || (this.codMenu != null && !this.codMenu.equals(other.codMenu))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "pe.com.siacoopapp.entity.Menu[ codMenu=" + codMenu + " ]";
	}

}
