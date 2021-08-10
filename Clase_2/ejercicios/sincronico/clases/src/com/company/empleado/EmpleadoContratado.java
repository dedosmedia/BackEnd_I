package com.company.empleado;

public class EmpleadoContratado extends Empleado {

    private Double cantidadHorasTrabajadas;
    private Double valorHora;

    public EmpleadoContratado(String nombre, String apellido, String cuenta, Double cantidadHorasTrabajadas, Double valorHora) {
        super(nombre, apellido, cuenta);
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    protected Double calcularSueldo() {
        return cantidadHorasTrabajadas * valorHora;
    }

    @Override
    protected void generarRecibo(Double importe) {
        System.out.println("Impresión de recibo digital por valor de "+ importe);
    }

    @Override
    protected void depositar(Double importe) {
        System.out.println("Deposito bancario a la cuenta "+ getCuenta()+ " por un importe de "+importe);
    }
}
