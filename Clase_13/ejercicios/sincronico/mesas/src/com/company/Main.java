package com.company;

import java.sql.*;

public class Main {


    public static String SQL_CREATE_TABLE = "DROP TABLE ODONTOLOGO IF EXISTS; CREATE TABLE ODONTOLOGO ( "+
            "ID INT PRIMARY KEY, " +
            "APELLIDO VARCHAR (250), " +
            "NOMBRE VARCHAR (250), " +
            "MATRICULA VARCHAR (250) )";

    public static String SQL_INSERT = "INSERT INTO ODONTOLOGO (ID, APELLIDO, NOMBRE, MATRICULA) VALUES (?,?,?,?)";
    public static String SQL_UPDATE = "UPDATE ODONTOLOGO SET MATRICULA=? WHERE ID=?";
    public static String SQL_QUERY = "SELECT * FROM ODONTOLOGO";



    public static void main(String[] args) {
	// write your code here

        Odontologo odontologo = new Odontologo("Díaz", "Diego", "ninguna");
        Connection connection = null;

        try {
            connection = getConnection();
            Statement stm = connection.createStatement();
            stm.execute(SQL_CREATE_TABLE);

            PreparedStatement pstm = connection.prepareStatement(SQL_INSERT);
            pstm.setInt(1, 1);
            pstm.setString(2, "Aristizabal");
            pstm.setString(3, "Ariana");
            pstm.setString(4, "123");
            int n = pstm.executeUpdate();

            System.out.println("insertadas "+n);

            PreparedStatement pstm2 = connection.prepareStatement(SQL_UPDATE);
            pstm2.setString(1, "MAT123");
            pstm2.setInt(2, 1);
            n = pstm2.executeUpdate();
            System.out.println("actualizadas "+n);


            PreparedStatement pstm3 = connection.prepareStatement(SQL_QUERY);
            ResultSet rs = pstm3.executeQuery();

            while( rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }


        }
        catch (Exception e) {
            System.out.println("Catch "+e);
        }
        finally {

            try {
                connection.close();
            }
            catch(Exception e) {
                System.out.println("E: "+e);
            }

        }





    }




    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/odontologo");
    }
}
