package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADO; CREATE TABLE EMPLEADO "
                + "("
                + " ID INT PRIMARY KEY,"
                + " NOMBRE varchar(100) NULL, "
                + " EDAD INT NULL, "
                + " EMPRESA varchar(100) NOT NULL "
                + " )";

        Connection connection = DriverManager.getConnection("jdbc:h2:~/dh");
        Statement stm = connection.createStatement();

        stm.execute(SQL_CREATE_TABLE);

        stm.execute("INSERT INTO EMPLEADO (ID, EMPRESA) VALUES (1, 'Digital')");
        stm.execute("INSERT INTO EMPLEADO (ID, EMPRESA) VALUES (2, 'Google')");
        stm.execute("INSERT INTO EMPLEADO (ID, EMPRESA) VALUES (3, 'Facebook')");


        ResultSet rs = stm.executeQuery("SELECT * FROM EMPLEADO");


        while( rs.next()) {
            System.out.println(rs.getInt(1) +rs.getString(4));
        }

        connection.close();

    }
}
