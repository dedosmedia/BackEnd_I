package Facade2;

import Facade2.facade.CheckFacade;

public class App {
    public static void main(String[] arg){
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("2/8/2021","8/8//2021","Buenos Aires","Montevideo");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("1/8/2021","8/8//2021","Buenos Aires","Bogotá");
    }
}
