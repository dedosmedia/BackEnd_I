package com.company;

import com.company.empleado.Empleado;
import com.company.empleado.EmpleadoContratado;
import com.company.empleado.EmpleadoEfectivo;

public class Main {

    public static void main(String[] args) {


        Empleado empleadoEfectivo1 = new EmpleadoEfectivo("Alberto","Pérez", "15689",1500.00, 150.00, 250.00);
        Empleado empleadoContratado1 = new EmpleadoContratado("Andrea", "Bernal",  "15983", 60.0, 500.0 );

        empleadoContratado1.liquidacionSueldo();
        empleadoEfectivo1.liquidacionSueldo();


    }
}
