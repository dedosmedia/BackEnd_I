package com.company;


//import java.util.logging.Logger;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {


    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
	// write your code here



        logger.error("Hola estoy corriendo");
        ListaPromedio vacia = null;
        ListaPromedio listaPromedioMayorA5 = null;
        ListaPromedio listaPromedioMayorA10 = null;
        try {
            listaPromedioMayorA5 = new ListaPromedio(Arrays.asList(1, 2, 3, 4, 5, 6));
            listaPromedioMayorA10 = new ListaPromedio(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
            listaPromedioMayorA10.promedio();
            vacia = new ListaPromedio(Arrays.asList());


        } catch (Exception e) {
            logger.error("La lista es igual a cero ", e);
        }


    }
}
