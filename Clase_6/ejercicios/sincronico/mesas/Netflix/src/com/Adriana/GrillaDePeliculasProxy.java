package com.Adriana;

public class GrillaDePeliculasProxy implements IGrillaDePeliculas{

    private GrillaDePeliculas grillaPeliculas;
    private Integer ip;

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    @Override
    public Pelicula getPelicula(String nombre) throws PeliculaNoHabilitadaException {

        Pelicula peliEncontrada = grillaPeliculas.getPelicula(nombre);
        if(peliEncontrada.getPais().equals(paisIp())){
                        return peliEncontrada;
        } else throw new PeliculaNoHabilitadaException("Deja de piratear, cabrón!");
    }

    public String paisIp(){
        if(ip<=49){
            return "Argentina";
        }
        if (ip<=99) {
        return    "Brasil";
        }
        if(ip<=149){
            return "Colombia";
        }
        return "Otro país";
    }

    public GrillaDePeliculasProxy() {
        this.grillaPeliculas=new GrillaDePeliculas();

    }
}
