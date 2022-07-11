package pe.joedayz.clientes.entity;

import java.util.ArrayList;

/**
 * Clase Información de Factura - Atributos que tendrá la factura respectiva.
 * @author AG10
 *@version 2.0
 *@since 1.0	
 */

public class InfoFactura {
	public String fechaEmision;
    public String dirEstablecimiento;
    public String obligadoContabilidad;
    public String tipoIdentificacionComprador;
    public String razonSocialComprador;
    public String identificacionComprador;
    public String direccionComprador;
    public double totalSinImpuestos;
    public double totalDescuento;
    public ArrayList<TotalImpuesto> totalImpuesto;
    public int propina;
    public double importeTotal;
    public String moneda;
    public double pagos;
}
