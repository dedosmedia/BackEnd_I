package com.company;

public class ManejadorEnvase extends Manejador {

    @Override
    public void verificarCalidad(Articulo articulo) {

        if(articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")) {
            // Aprobamos...
            // llamamos la siguiente cadena

            if( getSiguienteManejador() != null){
                getSiguienteManejador().verificarCalidad(articulo);
            } else {
                System.out.println( articulo + "fue aprobado");
            }


        } else {
            // rechazado...
            System.out.println( articulo + " fue rechazado por su envase");
        }

    }
}
