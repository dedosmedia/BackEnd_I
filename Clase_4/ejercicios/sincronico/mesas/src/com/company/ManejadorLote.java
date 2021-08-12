package com.company;

public class ManejadorLote extends Manejador {

    @Override
    public void verificarCalidad(Articulo articulo) {

        if(articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            // Aprobamos...
            // llamamos la siguiente cadena
            if( getSiguienteManejador() != null){
                getSiguienteManejador().verificarCalidad(articulo);
            }
        } else {
            // rechazado...
            System.out.println( articulo + " fue rechazado por su lote");
        }


    }
}
