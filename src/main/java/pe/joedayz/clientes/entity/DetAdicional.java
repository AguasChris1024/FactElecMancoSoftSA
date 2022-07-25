package pe.joedayz.clientes.entity;

public class DetAdicional{
    public String nombre;
    public String valor;
	public DetAdicional(String nombre, String valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}
	public DetAdicional() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
    
}
