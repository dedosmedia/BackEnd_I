package com.company;

public class TarjetaCredito extends Tarjeta {

    private Double limite;
    private Double saldoUtilizado;


    public TarjetaCredito(String numero, String ccv, String expiracion, Double limite, Double saldoUtilizado) {
        super(numero, ccv, expiracion);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
        super.nombre = "CREDITO";
    }

    @Override
    public Boolean esAutorizada(Double monto) {
        Boolean respuesta = saldoUtilizado + monto <= limite;

        if(respuesta) {
            saldoUtilizado += monto;
        }

        return respuesta;
    }

    @Override
    public Double getSaldo() {
        return limite - saldoUtilizado;
    }
}
