package com.company;

public class Cuenta {

    private Integer DNI;
    private String contrasenia;
    private Double  saldo;


    public Cuenta(Integer DNI, String contrasenia, Double saldo) {
        this.DNI = DNI;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
    }

    public Integer getDNI() {
        return DNI;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Boolean retirar(Double monto) {
        if( saldo >= monto){
            this.saldo = saldo - monto;
            return true;
        }
        return false;
    }
}
