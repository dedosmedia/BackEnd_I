package com.Adriana;

import org.apache.log4j.Logger;

public class Leon implements Correr{
    private String nombre;
    private Integer edad;
    private Boolean esAlfa;
    private static final Logger logger = Logger.getLogger(Leon.class);

    public Leon(String nombre, Integer edad, Boolean esAlfa) throws Exception{
        this.nombre = nombre;
        this.esAlfa = esAlfa;

        if(edad<0){

            logger.error("La edad no puede ser negativa");
            throw new Exception("La edad no puede ser menor a 0");
        }
        this.edad = edad;
    }
    @Override
    public void correr() {
        logger.info("El leon " + nombre + " está corriendo");

    }
    public Boolean esMayorADiez(){

        if(this.edad>10&&esAlfa){
            logger.info("El león " + nombre + " es mayor a 10 y es macho alfa");
            return true;
        }
        return false;
    }
}
