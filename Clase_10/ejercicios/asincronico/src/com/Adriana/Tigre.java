package com.Adriana;

import org.apache.log4j.Logger;

public class Tigre implements Correr {

private String nombre;
private Integer edad;
    private static final Logger logger = Logger.getLogger(Tigre.class);

    public Tigre(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void correr() {
        logger.info("El tigre " + nombre + " está corriendo");

    }
}
