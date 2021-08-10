package com.company;

import java.util.ArrayList;
import java.util.List;

public class BusquedaHotel {

    private List<Hotel> hoteles;

    public BusquedaHotel() {

        // Simulamos tener unos vuelos registrados en el sistema
        hoteles = new ArrayList<>();

        Hotel h1 = new Hotel("Hotel Lucho", true);
        Hotel h2 = new Hotel("Hotel Rapid-Inn ", true);
        Hotel h3 = new Hotel("Hotel mamá", false);
        Hotel h4 = new Hotel("Hotel hagale pues", true);
        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);


    }

    public void busqueda(String entrada, String salida, String ciudad) {

        // Aquí se supone que se debería llamar al API de los hoteles, pasandole los datos de la reserva
        // y ella nos regresaría solo los hoteles disponibles para esas fechas/destino.
        // Sin embargo como no tenemos API real, simulamos eso con un ArraList de hoteles, y omitimos las fechas
        // se supone que los hoteles que tienen disponible = true, están disponibles para la fecha/destino ingresados en la busqueda

        System.out.println("Tenemos disponibles los siguientes hoteles:");
        for (Hotel hotel : hoteles) {
            if(hotel.getDisponible()) {
                System.out.println(hotel);
            }
        }

    }

}
