package com.company.services;

import com.company.Cuenta;

public class CajaService {

    public void entregarDinero(Cuenta c, Double monto){

        if ( c.retirar(monto) ) {
            System.out.println("Pudiste retirar tu monto de "+ monto + " nuevo saldo "+c.getSaldo());
        }
        else {
            System.out.println("Error no tienes el saldo suficiente para retirar");
        }
    }

}
