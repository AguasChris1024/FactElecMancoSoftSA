package pe.joedayz.clientes.entity;

import java.util.ArrayList;

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
