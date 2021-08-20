package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS FORMAS; CREATE TABLE FORMAS "
                + "("
                + " ID INT PRIMARY KEY,"
                + " FIGURA varchar(100) NOT NULL, "
                + " COLOR varchar(100) NOT NULL "
                + " )";

        Connection connection = DriverManager.getConnection("jdbc:h2:~/dh");
        Statement stm = connection.createStatement();

        stm.execute(SQL_CREATE_TABLE);

        stm.execute("INSERT INTO FORMAS (ID, FIGURA, COLOR) VALUES (1, 'Circulo', 'Rojo')");
        stm.execute("INSERT INTO FORMAS (ID, FIGURA, COLOR) VALUES (2, 'Circulo', 'Negro')");
        stm.execute("INSERT INTO FORMAS (ID, FIGURA, COLOR) VALUES (3, 'Cuadrado', 'Amarillo')");
        stm.execute("INSERT INTO FORMAS (ID, FIGURA, COLOR) VALUES (4, 'Cuadrado', 'Verde')");


        ResultSet rs = stm.executeQuery("SELECT * FROM FORMAS");


        while( rs.next()) {
            System.out.println(rs.getInt(1) +rs.getString(2) + rs.getString(3));
        }

        connection.close();

    }
}
