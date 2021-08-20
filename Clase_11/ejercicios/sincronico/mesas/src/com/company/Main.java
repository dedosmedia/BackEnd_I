package com.company;

import org.apache.log4j.Logger;

public class Main {


    // Creamos el logger y los configuramos con esta clase
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {


        // Verificamos que la clase "org.h2.Driver" esté disponible en el ClassPath
        try {
            Class a = Class.forName("org.h2.Driver");

            logger.info("La clase " + a + " sí exsite en el ClassPath");
            logger.info("1");
            logger.trace("1");
            logger.debug("1");
            logger.error("1");
            logger.warn("1");
            logger.fatal("1");
        }
        catch (Exception e) {
            logger.fatal("No se encuentra la clase org.h2.Driver ",e);
        }





    }
}
