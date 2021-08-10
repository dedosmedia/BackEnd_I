package com.company;

import java.util.ArrayList;
import java.util.List;

public class BusquedaVuelo {

    private List<Vuelo> vuelos;

    public BusquedaVuelo() {

        // Simulamos tener unos vuelos registrados en el sistema
        vuelos = new ArrayList<>();

        Vuelo v1 = new Vuelo("BA2490", true);
        Vuelo v2 = new Vuelo("BA2491", true);
        Vuelo v3 = new Vuelo("BA2492", true);
        Vuelo v4 = new Vuelo("NA8888", false);
        vuelos.add(v1);
        vuelos.add(v2);
        vuelos.add(v3);
        vuelos.add(v4);


    }

    public void busqueda(String salida, String regreso, String origen, String destino) {

        // Aquí se supone que se debería llamar al API de la aerolínea, pasandole los datos del vuelo
        // y ella nos regresaría solo los vuelos disponibles para esas fechas/destinos.
        // Sin embargo como no tenemos API real, simulamos eso con un ArraList de vuelos, y omitimos las fechas
        // se supone que los vuelos que tienen disponible = true, están disponibles para la fecha/destino ingresados en la busqueda

        System.out.println("Tenemos disponibles los siguientes vuelos:");
        for (Vuelo vuelo : vuelos) {
            if(vuelo.getDisponible()) {
                System.out.println(vuelo);
            }
        }

    }

}
