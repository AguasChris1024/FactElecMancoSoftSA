package pe.joedayz.clientes.entity;

/**
 * Clase de Detalle adicional-Inicializa los atributos del Detalle Adicional.
 * @author AG10
 *@version 1.0
 */
public class DetAdicional{
    public String nombre;
    public String valor;
    
    /**
     * Inicializar los parámetros del detalle adicional de la factura.
     * @param nombre nombre del detalle adicional de la factura.
     * @param valor valor del detalle adicional de la factura.
     */
	public DetAdicional(String nombre, String valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	/**
	 * Constructor vacío de detalle adicional de factura.
	 */
	public DetAdicional() {
		
	}
	
	/**
	 * Método get para obtener el nombre del detalle adicional de la factura.
	 * @return Devuelve el nombre del detalle adicional.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método set para el nombre del detalle adicional de la factura.
	 * @param nombre nombre del detalle adicional.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 *Método get para obtener el valor del detalle adicional de la factura.
	 * @return Devuelve el valor del detalle adicional.
	 */
	public String getValor() {
		return valor;
	}
	
	/**
	 * Método set para el valor del detalle adicional de la factura.
	 * @param nombre valor del detalle adicional.
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
    
}
