package com.company;

public class FacadeDescuento {

    private ApiCantidad apiCantidad;
    private ApiProducto apiProducto;
    private ApiTarjeta apiTarjeta;

    public FacadeDescuento() {
        apiCantidad = new ApiCantidad();
        apiProducto = new ApiProducto();
        apiTarjeta = new ApiTarjeta();
    }

    public int descuento(Tarjeta t, Producto p, int cantidad) {
        int descuento = 0;

        descuento += apiProducto.descuento(p);
        descuento += apiTarjeta.descuento(t);
        descuento += apiCantidad.descuento(cantidad);


        return descuento;
    }
}
