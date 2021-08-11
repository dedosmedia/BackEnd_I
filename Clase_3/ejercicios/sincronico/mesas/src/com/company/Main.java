package com.company;

public class Main {

    public static void main(String[] args) {

        VendedorEmpleado empleado1 = new VendedorEmpleado("Pedro", 0, 5);
        VendedorEmpleado empleado2 = new VendedorEmpleado("Martina", 0, 3);
        Vendedor afiliado1 = new VendedorAfiliado("Juan");
        Vendedor afiliado2 = new VendedorAfiliado("Juana");
        Vendedor pasante1 = new VendedorPasante("Lucas");
        Vendedor pasante2 = new VendedorPasante("Gloria");


        empleado1.conseguirAfiliado(0);
        empleado1.vender(0);
        empleado1.mostrarCategoria();

        empleado2.conseguirAfiliado(0);
        empleado2.vender(0);
        empleado2.mostrarCategoria();


        afiliado1.vender(0);
        afiliado1.mostrarCategoria();

        afiliado2.vender(0);
        afiliado2.mostrarCategoria();


        pasante1.vender(0);
        pasante1.mostrarCategoria();

        pasante2.vender(0);
        pasante2.mostrarCategoria();

    }
}
