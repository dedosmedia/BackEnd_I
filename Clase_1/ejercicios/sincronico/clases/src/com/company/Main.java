package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Producto producto = new Producto("arvejas", "lata");
        Tarjeta tarjeta = new Tarjeta("12345", "Star Bank");


        FacadeDescuento fachada = new FacadeDescuento();

        System.out.println("El descuento producto "+fachada.descuento(tarjeta, producto, 15));

    }
}
