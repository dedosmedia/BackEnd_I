package com.company;

public abstract class Vendedor {

    public static String NOVATO = "novato";
    public static String APRENDIZ = "aprendiz";
    public static String BUENO = "bueno";
    public static String MAESTRO = "maestro";
    public static String EXPERIMENTADO = "experimentado";




    private String nombre;
    private Integer ventas;
    private Integer puntos;
    private String categoria;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.ventas = 0;
        this.puntos = 0;
        this.categoria = Vendedor.NOVATO;
    }

    public void mostrarCategoria(){
        Integer puntos = calcularPuntos();
        categoria = recategorizar(puntos);
        System.out.println(nombre + " tiene un total de " + puntos +" puntos, categoriza como " + categoria);
    }

    public void vender(Integer cantidad){
        ventas += cantidad;
    }
    protected abstract Integer calcularPuntos();

    protected String recategorizar(Integer puntos){
        if( puntos < 20) {
            return Vendedor.NOVATO;
        }
        if( puntos <= 30) {
            return Vendedor.APRENDIZ;
        }
        if ( puntos <= 40 ) {
            return Vendedor.BUENO;
        }
        return Vendedor.MAESTRO;
    }

    public Integer getVentas() {
        return ventas;
    }
}
