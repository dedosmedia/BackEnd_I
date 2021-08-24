import java.sql.*;
import org.h2.Driver;
public class TestDB {
    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        Connection connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa", "");
        Statement stmt = connection.createStatement();

        String createTable= "DROP TABLE IF EXISTS TEST; CREATE TABLE TEST (ID INT PRIMARY KEY, NAME VARCHAR(255))";
        stmt.execute(createTable);

        String insertarFila = "INSERT INTO TEST VALUES(1, 'HOLA')";
        String insertarFila2 = "INSERT INTO TEST VALUES(2, 'HOLA')";

        stmt.execute(insertarFila);
        stmt.execute(insertarFila2);

        String sql ="SELECT * FROM TEST";
        ResultSet rd = stmt.executeQuery(sql);
        while (rd.next()){
            System.out.println(rd.getInt(1)+rd.getString(2));
        }


    }

}
