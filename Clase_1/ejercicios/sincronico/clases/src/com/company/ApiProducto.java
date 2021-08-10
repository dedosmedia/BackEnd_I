package com.company;

public class ApiProducto {

    public int descuento(Producto unProducto){
        if(unProducto.getTipo().equals("lata")){
            return 10;
        } else {
            return 0;
        }

    }


}
