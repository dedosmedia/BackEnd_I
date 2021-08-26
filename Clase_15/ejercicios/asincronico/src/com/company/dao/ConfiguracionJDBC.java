package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Creamos la clase que se encargará de generar la conexión con la base de datos (indistintamente
de el motor, o tipo, creamos una clase que toma como parámetro todas las propiedades, por lo que
podremos setearla para conectarse a una base de datos Mysql, Oracle, H2, etc...)
 */
public class ConfiguracionJDBC {
    /*Creamos las propiedades generales que necesitaremos para configurar la base de datos

     */
    private String jdbcDriver;
    private String dbUrl;
    private String nombreUsuario;
    private String contrasena;

    /*Cramos un constructor donde daremos como parámetros las propiedades básicas para la conexión
    como el Driver, la url, el nombre de usuario y la contraseña. De esta manera, podremos crear
    un objeto que se podrá conectar a cualquier base de datos, de practicamente cualquier tipo.
     */
    public ConfiguracionJDBC(String jdbcDriver, String dbUrl, String nombreUsuario, String contrasena) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    /*Cramos un constructor vacío, que no toma como parámetro ninguna propiedad. Si creamos un
    objeto de este tipo, va a tomar por defecto los valores que necesitamos para conectarnos a
    la base de datos por defevto H2 que utilizamos en nuestros ejemplos. Podemos modificar
    la url (this.dbUrl) por el string que apunte a nuestra base de datos local. Como está seteada
    ahora, se conectará a una base de datos en memoria, no a nuestra base de datos local.
    Tener en cuenta que se deben cambiar los valores "nombreUsuario" y "contrasena" por los
    valores reales de nuestra base de datos, si no... no conectará
     */
    public ConfiguracionJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        //this.dbUrl = "jdbc:h2:mem:clinica;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.dbUrl = "jdbc:h2:tcp://localhost/~/test;INIT=RUNSCRIPT FROM 'classpath:/create.sql'";
        this.nombreUsuario = "sa";
        this.contrasena = "";
    }

    /*Creamos un método que RETORNARÁ un objeto de tipo Connection, que hará referencia a nuestra
    base de datos. De esta manera tendremos un objeto que apuntará a dicha base de datos y podremos
    manipularla a nuestra necesidad.
     */
    public Connection conectarConBaseDeDatos() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, nombreUsuario, contrasena);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return connection;
    }
}