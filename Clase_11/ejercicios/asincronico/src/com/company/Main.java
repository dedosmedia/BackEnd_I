package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        // Revisamos que dispongamos del Driver de H2
        try {
            Class.forName("org.h2.Driver");
        } catch (Exception e) {
            System.out.println("Error no has vinculado el paquete h2"+e);;
            System.exit(0);
        }

        // Creamos la conexión a la BD
        Connection connection = DriverManager.getConnection("jdbc:h2:~/dh");

        // Creamos el Statement que nos permitirá ejecutar consultas SQL
        Statement stm = connection.createStatement();

        // Ejecutamos la consulta para crear la tabla
        String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADO; CREATE TABLE EMPLEADO "
                + "("
                + " ID INT PRIMARY KEY,"
                + " NOMBRE varchar(100) NULL, "
                + " EDAD INT NULL, "
                + " EMPRESA varchar(100) NOT NULL "
                + " )";
        stm.execute(SQL_CREATE_TABLE);

        // Ejecutamos las consultas para insertar datos
        stm.execute("INSERT INTO EMPLEADO (ID, EMPRESA) VALUES (1, 'Digital')");
        stm.execute("INSERT INTO EMPLEADO (ID, EMPRESA) VALUES (2, 'Google')");
        stm.execute("INSERT INTO EMPLEADO (ID, EMPRESA) VALUES (3, 'Facebook')");

        // Ejecutamos la consulta SELECT
        ResultSet rs = stm.executeQuery("SELECT * FROM EMPLEADO");

        // Iteramos sobre los registros resultantes
        while( rs.next()) {
            System.out.println(rs.getInt(1) +rs.getString(4));
        }

        // Cerrar la conexión a la BD
        connection.close();
    }
}
