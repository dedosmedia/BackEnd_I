package com.company;

public class ApiTarjeta {

    public int descuento(Tarjeta unaTarjeta){
        if( unaTarjeta.getBanco().equals("Star Bank")){
            return 20;
        } else {
            return 0;
        }

    }


}
