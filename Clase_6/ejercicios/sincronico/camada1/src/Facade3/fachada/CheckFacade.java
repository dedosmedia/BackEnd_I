package Facade3.fachada;

import Facade.api.Avion;
import Facade.api.Hotel;

public class CheckFacade {
    private Avion avionAPI;
    private Hotel hotelAPI;

    public CheckFacade(){
        avionAPI = new Avion();
        hotelAPI = new Hotel();
    }

    public void buscar(String fechaEntrada, String fechaSalida, String origen, String destino){
        avionAPI.buscarVuelos(fechaEntrada,  fechaSalida,  origen,  destino);
        hotelAPI.buscarHoteles( fechaEntrada, fechaSalida, origen, destino);
    }
}
