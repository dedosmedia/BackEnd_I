package com.company;

public class Spotify implements ServicioDescarga {

    @Override
    public void descargar(String cancion) {
        System.out.println("Tu canción <<" + cancion + ">> se decargará en breve.");
    }
}
