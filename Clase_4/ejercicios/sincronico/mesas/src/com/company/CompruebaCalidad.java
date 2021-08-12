package com.company;

public class CompruebaCalidad {

    private Manejador inicial;

    public CompruebaCalidad() {
        inicial = new ManejadorLote();
        Manejador peso = new ManejadorPeso();
        Manejador envase = new ManejadorEnvase();

        inicial.setSiguienteManejador(peso);
        peso.setSiguienteManejador(envase);
    }

    public void iniciarPrueba(Articulo articulo) {


       inicial.verificarCalidad(articulo);


    }

}
