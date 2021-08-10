package com.company;

public class Vuelo {

    private String vuelo;
    private Boolean disponible;

    public Vuelo(String vuelo, Boolean disponible) {
        this.vuelo = vuelo;
        this.disponible = disponible;
    }


    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
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
        return "Vuelo: " + vuelo + " "+disponibilidad;
    }
}
