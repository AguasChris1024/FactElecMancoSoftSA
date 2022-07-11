package pe.joedayz.clientes.entity;

import java.util.ArrayList;

/**
 * Clase Detalle-Define los atributos detalle para la factura.
 * @author AG10
 *@version 2.0
 *@since 1.0
 */
public class Detalle{
    public String codigoPrincipal;
    public String codigoAuxiliar;
    public String descripcion;
    public double cantidad;
    public double precioUnitario;
    public double descuento;
    public double precioTotalSinImpuesto;
    public ArrayList<DetAdicional> detAdicional;
    public ArrayList<Impuesto> impuesto;
}
