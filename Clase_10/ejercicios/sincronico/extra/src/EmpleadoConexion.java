

import java.sql.*;

public class EmpleadoConexion {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADO; CREATE TABLE EMPLEADO "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL, "
            + " EMPRESA varchar(100) NOT NULL, "
            + " EDAD INT NOT NULL,"
            + " FECHA_INICIO varchar(100) NOT NULL"
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO EMPLEADO (ID, NOMBRE, EMPRESA, EDAD, FECHA_INICIO) VALUES (1,'Juan','Juan', 22,'Juan')";
    private static final String SQL_INSERT2 =  "INSERT INTO EMPLEADO (ID, NOMBRE, EMPRESA, EDAD, FECHA_INICIO) VALUES (2,'Juan','Juan', 25,'Juan')";
    private static final String SQL_INSERT3 =  "INSERT INTO EMPLEADO (ID, NOMBRE, EMPRESA, EDAD, FECHA_INICIO) VALUES (3,'Juan','Juan', 33,'Juan')";


    public static void main(String[] args) throws Exception {

        Connection connection = null;

        try {
            connection= getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement statementIns = connection.createStatement();
            statementIns.execute(SQL_INSERT);

            Statement statementIns2 = connection.createStatement();
            statementIns2.execute(SQL_INSERT2);

            Statement statementIns3 = connection.createStatement();
            statementIns3.execute(SQL_INSERT3);

            String sql = "SELECT * FROM EMPLEADO";
            Statement sqlSmt = connection.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + rs.getString(2) + rs.getInt(3) + rs.getString(4) + rs.getString(5));
            }
        } catch (Exception e) {
        } finally {
            connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa", "" );
    }
}

