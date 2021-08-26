package com.company;

public class Test {

    public static void main(String[] args) {


        String animal = "perro";
        String color = "amarillo";
        String texto = "Hola soy un "+ animal +" de color "+ color;
        // Hola soy un perro de color amarillo
        System.out.println(texto);



        texto = String.format("Hola soy un de %s color %s ", animal, color, 5 );
        // Hola soy un de perro color amarillo
        System.out.println(texto);





    }
}
