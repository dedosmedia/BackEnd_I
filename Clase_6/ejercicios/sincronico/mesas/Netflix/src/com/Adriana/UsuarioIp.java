package com.Adriana;

public class UsuarioIp {


    public static void main(String[] args) {

        GrillaDePeliculasProxy proxy1= new GrillaDePeliculasProxy();
        proxy1.setIp(49);
        try {
            Pelicula peliculaPrueba = proxy1.getPelicula("Buscando a Dory");
            System.out.println("La pelicula que estamos intentando ver es");
            System.out.println(peliculaPrueba);

        }
        catch (PeliculaNoHabilitadaException e) {
            System.out.println("Pelicula no habilitada "+ e.getMessage());
        };

    }
}
