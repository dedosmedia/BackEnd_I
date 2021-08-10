package com.company;

public class Main {

    public static void main(String[] args) {


        Tarjeta tc1 = new TarjetaCredito("1234","456","08/2021", 5000.0, 100.0);
        Tarjeta tc2 = new TarjetaCredito("1234","456","11/2020", 5000.0, 100.0);
        Tarjeta tc3 = new TarjetaCredito("1234","456","07/2021", 5000.0, 100.0);
        Tarjeta tc4 = new TarjetaCredito("1234","456","11/2022", 5000.0, 100.0);

        Procesador procesadorTC = new ProcesadorCredito();
        procesadorTC.procesarPago(tc1, 3500.0);
        procesadorTC.procesarPago(tc2, 3000.0);
        procesadorTC.procesarPago(tc3, 3000.0);
        procesadorTC.procesarPago(tc4, 5001.0);


        Tarjeta td1 = new TarjetaDebito("1234","456","08/2021", 5000.0);
        Tarjeta td2 = new TarjetaDebito("1234","456","11/2020", 5000.0);
        Tarjeta td3 = new TarjetaDebito("1234","456","07/2021", 5000.0);
        Tarjeta td4 = new TarjetaDebito("1234","456","11/2022", 5000.0);

        Procesador procesadorTD = new ProcesadorDebito();
        procesadorTD.procesarPago(td1, 2000.0);
        procesadorTD.procesarPago(td2, 3000.0);
        procesadorTD.procesarPago(td3, 3000.0);
        procesadorTD.procesarPago(td4, 5001.0);



    }
}
