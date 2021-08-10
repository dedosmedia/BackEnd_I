package com.company;

public class Hotel {

    private String nombre;
    private Boolean disponible;

    public Hotel(String nombre, Boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String disponibilidad = disponible ? "disponible" : "no disponible";
        return "Hotel: " + nombre + " "+disponibilidad;
    }
}
