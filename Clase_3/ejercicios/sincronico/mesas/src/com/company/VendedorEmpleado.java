package com.company;

public class VendedorEmpleado extends Vendedor {

    private Integer aniosDeAntiguedad;
    private Integer afiliados;

    public VendedorEmpleado(String nombre, Integer aniosDeAntiguedad, Integer afiliados) {
        super(nombre);
        this.aniosDeAntiguedad = aniosDeAntiguedad;
        this.afiliados = afiliados;
    }

    @Override
    protected Integer calcularPuntos() {
        return afiliados * 10 + getVentas() * 5 + aniosDeAntiguedad * 5;
    }

    public void conseguirAfiliado(Integer cantidad){
        afiliados += cantidad;
    }
}
