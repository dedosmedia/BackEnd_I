package com.Adriana;

public interface IGrillaDePeliculas {
    public Pelicula getPelicula(String nombre) throws PeliculaNoHabilitadaException;
}
