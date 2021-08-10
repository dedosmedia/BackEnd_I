package com.company;

public abstract class Tarjeta {

    private String numero;
    private String ccv;
    private String expiracion;
    protected String nombre;

    public Tarjeta(String numero, String ccv, String expiracion) {

        this.numero = numero;
        this.ccv = ccv;
        this.expiracion = expiracion;
    }

    public String getExpiracion() {
        return expiracion;
    }

    public String getNombre() {
        return nombre;
    }


    public abstract  Double getSaldo();
    public abstract  Boolean esAutorizada(Double monto);
}
