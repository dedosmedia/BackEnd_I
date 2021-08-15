package com.Adriana;
import java.util.ArrayList;
import java.util.List;
public class GrillaDePeliculas implements IGrillaDePeliculas{

    private List <Pelicula> listaPeliculas;

    @Override
    public Pelicula getPelicula(String nombre) {

        for (Pelicula pelicula : listaPeliculas) {
            if(pelicula.getNombre().equals(nombre)){
                return pelicula;
            }
        }

        return null;
    }

    public GrillaDePeliculas() {
        this.listaPeliculas = new ArrayList<>();
        Pelicula peli1 = new Pelicula("Argentina", "Buscando a Nemo", "Nemo");
        Pelicula peli2 = new Pelicula("Colombia", "Buscando a Dory", "Dory");
        Pelicula peli3 = new Pelicula("Brasil", "La estrategia del Caracol", "Caracol");

        listaPeliculas.add(peli1);
        listaPeliculas.add(peli2);
        listaPeliculas.add(peli3);

    }


}
