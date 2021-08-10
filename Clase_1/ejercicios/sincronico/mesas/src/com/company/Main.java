package com.company;

public class Main {

    public static void main(String[] args) {

        FachadaBusqueda fachada = new FachadaBusqueda();

        // Invocamos el método de la fachada, que internamente estará haciendo la consulta a los dos subsistemas
        fachada.busqueda("20-08-2021", "28-08-2021", "Bogotá", "Argentina");
    }
}
