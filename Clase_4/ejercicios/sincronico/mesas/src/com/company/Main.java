package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        CompruebaCalidad prueba = new CompruebaCalidad();

        Articulo articulo1 = new Articulo("Curso DH", 1500, 1250, "casi sano");


        Articulo articulo2 = new Articulo("Salsa de tomate", 1500, 1250, "sano");


        prueba.iniciarPrueba(articulo1);
        prueba.iniciarPrueba(articulo2);


    }
}
