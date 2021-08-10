package com.company;

public class ProcesadorCredito extends Procesador {

    @Override
    protected void autorizar(Tarjeta tarjeta, Double monto) {

        if( tarjeta.esAutorizada(monto)) {
            System.out.println("La tarjeta CREDITO ha sido autorizada. Su saldo de crédito disponible ahora es: "+tarjeta.getSaldo());
        } else {
            System.out.println("La tarjeta CREDITO NO ha sido autorizada. Su saldo de crédito disponible es:"+tarjeta.getSaldo()+ ". No puedes gastar "+monto);
        }

    }
}
