package com.company.empleado;

public class EmpleadoEfectivo extends Empleado {

    private Double sueldoBasico;
    private Double descuento;
    private Double premios;


    public EmpleadoEfectivo(String nombre, String apellido, String cuenta, Double sueldoBasico, Double descuento, Double premios) {
        super(nombre, apellido, cuenta);
        this.sueldoBasico = sueldoBasico;
        this.descuento = descuento;
        this.premios = premios;
    }

    @Override
    protected Double calcularSueldo() {
        return sueldoBasico - descuento + premios;
    }

    @Override
    protected void generarRecibo(Double importe) {
        System.out.println("Impresión de recibo en papel por valor de "+importe);
    }

    @Override
    protected void depositar(Double importe) {
        System.out.println("Deposito bancario a la cuenta "+ getCuenta()+" por un importe de "+importe);
    }
}
