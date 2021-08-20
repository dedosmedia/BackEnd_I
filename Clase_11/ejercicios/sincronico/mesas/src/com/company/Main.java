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

        // Realizamos la conexión a la BD
        Connection connection = DriverManager.getConnection("jdbc:h2:~/dh");

        // Creamos el Statement para ejecutar consultas SQL
        Statement stm = connection.createStatement();

        // Ejecutamos la consulta para crear tablas
        String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS FORMAS; CREATE TABLE FORMAS "
                + "("
                + " ID INT PRIMARY KEY,"
                + " FIGURA varchar(100) NOT NULL, "
                + " COLOR varchar(100) NOT NULL "
                + " )";
        stm.execute(SQL_CREATE_TABLE);

        // Ejecutamos consultas parai nsertar datos
        stm.execute("INSERT INTO FORMAS (ID, FIGURA, COLOR) VALUES (1, 'Circulo', 'Rojo')");
        stm.execute("INSERT INTO FORMAS (ID, FIGURA, COLOR) VALUES (2, 'Circulo', 'Negro')");
        stm.execute("INSERT INTO FORMAS (ID, FIGURA, COLOR) VALUES (3, 'Cuadrado', 'Amarillo')");
        stm.execute("INSERT INTO FORMAS (ID, FIGURA, COLOR) VALUES (4, 'Cuadrado', 'Verde')");

        // Ejecutamos consultas para consultar datos
        ResultSet rs = stm.executeQuery("SELECT * FROM FORMAS");

        // Iteramos sobre los resultados
        while( rs.next()) {
            System.out.println(rs.getInt(1) +rs.getString(2) + rs.getString(3));
        }

        // Cerramos la conexión
        connection.close();

    }
}
