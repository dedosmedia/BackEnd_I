package com.company.services;

import com.company.Cuenta;
import com.company.Main;

public class CuentaService {



    public Cuenta getCuenta(Integer DNI){
        for (Cuenta cuenta : Main.cuentas) {
            if( cuenta.getDNI() == DNI){
                System.out.println("Encontramos una cuenta para DNI "+DNI);
                return cuenta;
            }
        }
        return null;
    }

}
