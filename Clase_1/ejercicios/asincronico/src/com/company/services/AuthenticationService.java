package com.company.services;

import com.company.Cuenta;
import com.company.Main;

public class AuthenticationService {

    public Boolean validarUsuarioYContrasenia(Integer DNI, String contrasenia){
        for (Cuenta cuenta : Main.cuentas) {
            if( cuenta.getDNI() == DNI && contrasenia.equals(cuenta.getContrasenia()))
            {
                System.out.println("Usuario con DNI " + DNI + " autenticado correctamente");
                return true;
            }
        }
        return false;
    }
}
