package com.company;

public class SpotifyProxy implements ServicioDescarga{


    private Usuario usuario;
    private Spotify spotify;
    List

    public SpotifyProxy(Usuario usuario) {
        this.usuario = usuario;
        this.spotify = new Spotify();
    }

    @Override
    public void descargar(String cancion) {

        if( comprobarUsuario(usuario) ) {
            spotify.descargar(cancion);
        } else {
            System.out.println("No puedes descargar esta canción ya que tu suscripción es "+usuario.getTipo());
        }
    }


    private Boolean comprobarUsuario(Usuario usuario) {
        return usuario.getTipo() == Usuario.PREMIUM;
    }
}
