package com.company;

public class ProcesadorDebito extends Procesador {


    @Override
    protected void autorizar(Tarjeta tarjeta, Double monto) {

        if( tarjeta.esAutorizada(monto)) {
            System.out.println("La tarjeta DEBITO ha sido autorizada. Su saldo de debito ahora es: "+tarjeta.getSaldo());
        } else {
            System.out.println("La tarjeta DEBITO NO ha sido autorizada. Su saldo de debito disponible es:"+tarjeta.getSaldo()+". No puedes gastar "+monto);
        }

    }
}
