package com.company;

public abstract class Procesador {

    public void procesarPago(Tarjeta tarjeta, Double monto) {

        if( validarFecha(tarjeta) ) {
            autorizar(tarjeta, monto);
        } else {
            System.out.println("Error: La tarjeta "+ tarjeta.getNombre()+" ya ha expirado con fecha "+tarjeta.getExpiracion());
        }


    }

    private Boolean validarFecha(Tarjeta tarjeta) {

        Integer anioActual = 2021;
        Integer mesActual = 8;
        String[] arr = tarjeta.getExpiracion().split("/");

        // arr[0]: MES
        // arr[1]: AÑO
        Integer mes = Integer.parseInt(arr[0]);
        Integer anio = Integer.parseInt(arr[1]);


        // System.out.println(anio +","+ mes);

        // revisar que no esté vencida
        if(anio > anioActual ) {
            // tarjeta no vencida... ni validamos el mes porq ya sabemos que expira un año posterior
            return true;
        }
        if (anio.equals(anioActual)) {
            // El año es el actual. Revisamos el mes.
            return mes >= mesActual;
        }

        // Es un año anterior al actual
        return false;


    }

    // TODO: ¿QUE PASA SI LE PASO UNA TARJETA CREDITO AL ProcesadorDebito Y AL CONTRARIO?
    // TODO: ¿COMO LIMITAR ESO?

    protected abstract void autorizar(Tarjeta tarjeta, Double monto);
    /*
    // TODO: Pregunta: ¿Es posible tener dos métodos abstractos con el mismo nomrbe, pero diferente firma, y que solo se implemente uno de ellos en la subclase?
    //    protected abstract void autorizar(TarjetaDebito tarjeta, Double monto);
    //    protected abstract void autorizar(TarjetaCredito tarjeta, Double monto);

    */
}
