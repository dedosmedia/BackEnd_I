package com.Adriana;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Tigre tigre1 = new Tigre("Tigre1", 2);
        Tigre tigre2 = new Tigre("Otro Tigre", 3);
        tigre1.correr();
        tigre2.correr();

        try {
            Leon leon1 = new Leon("Simba", 12, true);
            leon1.correr();
            leon1.esMayorADiez();
            Leon leon2 = new Leon("Otro Simba", -1, false);
            leon2.correr();
        }
        catch (Exception e){
            logger.error(e);
        }
    }
}
