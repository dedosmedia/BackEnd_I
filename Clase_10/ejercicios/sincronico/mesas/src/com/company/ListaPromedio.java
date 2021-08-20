package com.company;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaPromedio {

    private List<Integer> enteros = new ArrayList<>();

    private static final Logger logger = Logger.getLogger(ListaPromedio.class);


    public ListaPromedio(List<Integer> enteros) throws  Exception{
        this.enteros = enteros;

        if(enteros.size() > 5) {
            logger.info("Tengo más de 5 elementos");
        }
        if(enteros.size() > 10) {
			logger.info("Tengo más de 10 elementos");
        }
        if(enteros.size() == 0) {
            throw new Exception();
        }
    }

    public int promedio() {
        int sum = 0;
        for (Integer entero: enteros) {
            sum = sum + entero;
        }
        int promedio = sum / enteros.size();
		logger.info("El promedio es "+promedio);
        return promedio;
    }
}
