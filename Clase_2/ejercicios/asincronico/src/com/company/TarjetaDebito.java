package com.company;

public class TarjetaDebito extends Tarjeta {

    private Double saldo;

    public TarjetaDebito(String numero, String ccv, String expiracion, Double saldo) {
        super(numero, ccv, expiracion);
        this.saldo = saldo;
        super.nombre = "DEBITO";
    }


    @Override
    public Boolean esAutorizada(Double monto) {
        Boolean respuesta = monto <= saldo;

        if(respuesta) {
            saldo -= monto;
        }

        return respuesta;

    }

    @Override
    public Double getSaldo() {
        return saldo;
    }
}
