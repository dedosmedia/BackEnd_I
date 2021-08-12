package com.company;

public class Usuario {


    public final static String FREE = "free";
    public final static String PREMIUM = "premiun";

    private String id;
    private String tipo;

    public Usuario(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void descargarCancion(String cancion){


    }
}
