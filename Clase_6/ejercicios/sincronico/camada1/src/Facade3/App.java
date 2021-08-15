package Facade3;

import Facade3.fachada.CheckFacade;

public class App {
    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("2/7/2021","20/7/2021","México","Buenos Aires");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("20/7/2021","5/8/2021","Bogotá","Miami");
    }
}
