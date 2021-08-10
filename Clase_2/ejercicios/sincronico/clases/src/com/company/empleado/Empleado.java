package com.company.empleado;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String cuenta;

    public Empleado(String nombre, String apellido, String cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
    }

    public void liquidacionSueldo(){
        Double importe = calcularSueldo();
        generarRecibo(importe);
        depositar(importe);
    }

    public String getCuenta() {
        return cuenta;
    }
    // TODO: Pueden ser protected en lugar de públicos?

    protected abstract Double calcularSueldo();
    protected abstract void generarRecibo(Double importe);
    protected abstract void depositar(Double importe);

}
