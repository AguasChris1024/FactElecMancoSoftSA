package pe.joedayz.clientes.entity;

import java.util.ArrayList;

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
    public ArrayList<Pago> pagos;
}
