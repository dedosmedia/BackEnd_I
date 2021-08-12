package com.company;


public class ManejadorPeso extends Manejador{

    @Override
    public void verificarCalidad(Articulo articulo) {
        if(articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            // Aprobamos...
            // llamamos la siguiente cadena
            if( getSiguienteManejador() != null){
                getSiguienteManejador().verificarCalidad(articulo);
            }


        } else {
            // rechazado...
            System.out.println( articulo + " fue rechazado por su peso");
        }

    }
}
