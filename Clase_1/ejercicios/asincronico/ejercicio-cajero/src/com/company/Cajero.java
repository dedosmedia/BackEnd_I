package com.company;

import com.company.services.AuthenticationService;
import com.company.services.CajaService;
import com.company.services.CuentaService;

public class Cajero implements ICajeroFacade {

    AuthenticationService authService;
    CuentaService cuentaService;
    CajaService cajaService;

    public Cajero() {
        authService = new AuthenticationService();
        cuentaService = new CuentaService();
        cajaService = new CajaService();
    }

    @Override
    public void retirarDinero( Integer DNI, String contrasenia, Double monto ) {

        System.out.println("Retirar Dinero");
        // 1. Servicio de autenticación

        if( authService.validarUsuarioYContrasenia( DNI, contrasenia ) ) {
            // 2. Tenemos un usuario autenticado.
            Cuenta cuenta = cuentaService.getCuenta(DNI);

            // 3. verificar si el saldo es superior al monto que quiere retirar
            if( cuenta.getSaldo() >= monto) {
                cajaService.entregarDinero(cuenta, monto);
            }
            else {
                System.out.println("No tienes suficiente dinero para retirar");
            }
        }
        else {
            System.out.println("No existe una cuenta con los datos proporcionados");
        }
    }
}
