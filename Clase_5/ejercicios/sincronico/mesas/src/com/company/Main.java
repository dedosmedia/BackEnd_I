package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Usuario user1 = new Usuario("pedro123", Usuario.FREE);
        Usuario user2 = new Usuario("juliana86", Usuario.PREMIUM);


        // TODO: Le podría pasar el Usuario por el constructor del proxy?
        ServicioDescarga proxyUser1 = new SpotifyProxy(user1);
        ServicioDescarga proxyUser2 = new SpotifyProxy(user2);

        proxyUser1.descargar( "Mi canción");
        proxyUser2.descargar( "Mi canción");



    }
}
