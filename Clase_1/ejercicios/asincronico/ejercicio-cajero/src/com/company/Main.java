package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Cuenta> cuentas = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here

        Cuenta cuenta1 = new Cuenta(123, "123", 50.0);
        Cuenta cuenta2 = new Cuenta(124, "124", 500.0);
        Cuenta cuenta3 = new Cuenta(125, "125", 5000.0);
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);


        ICajeroFacade cajero = new Cajero();

        cajero.retirarDinero(123,"124", 20.0);


    }
}
