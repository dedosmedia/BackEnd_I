package com.company;

public class VendedorAfiliado extends Vendedor {

    public VendedorAfiliado(String nombre) {
        super(nombre);
    }


    @Override
    protected Integer calcularPuntos() {
        return 15 * getVentas();
    }

}
