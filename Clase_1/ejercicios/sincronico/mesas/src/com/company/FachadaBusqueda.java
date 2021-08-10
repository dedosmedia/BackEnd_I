package com.company;

public class FachadaBusqueda {

    BusquedaHotel  hotel;
    BusquedaVuelo  vuelo;

    public FachadaBusqueda() {

        hotel = new BusquedaHotel();
        vuelo = new BusquedaVuelo();
    }

    public void busqueda(String salida, String regreso, String origen, String destino) {

        vuelo.busqueda(salida, regreso, origen, destino);
        hotel.busqueda(salida, regreso, destino);
    }

}
