package com.Adriana;

public class Pelicula {

    private String pais;
    private String nombre;
    private String linkReproduccion;

    public Pelicula(String pais, String nombre, String linkReproduccion) {
        this.pais = pais;
        this.nombre = nombre;
        this.linkReproduccion = linkReproduccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLinkReproduccion() {
        return linkReproduccion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "pais='" + pais + '\'' +
                ", nombre='" + nombre + '\'' +
                ", linkReproduccion='" + linkReproduccion + '\'' +
                '}';
    }

    public void setLinkReproduccion(String linkReproduccion) {
        this.linkReproduccion = linkReproduccion;
    }
}
