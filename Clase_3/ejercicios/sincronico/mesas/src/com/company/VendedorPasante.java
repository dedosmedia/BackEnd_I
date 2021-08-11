package com.company;

public class VendedorPasante extends Vendedor {


    public VendedorPasante(String nombre) {
        super(nombre);
    }



    @Override
    protected Integer calcularPuntos() {
        return 5 * getVentas();
    }

    @Override
    protected String recategorizar(Integer puntos){
        if( puntos < 50) {
            return "pasante " + Vendedor.NOVATO;
        }
        return "pasante " + Vendedor.EXPERIMENTADO;
    }





}
