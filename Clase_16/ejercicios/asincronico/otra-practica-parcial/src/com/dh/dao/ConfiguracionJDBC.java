package com.dh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracionJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String nombreUsuario;
    private String contrasena;

    public ConfiguracionJDBC(String jdbcDriver, String dbUrl, String nombreUsuario, String contrasena) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public ConfiguracionJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:tcp://localhost/~/test";
        this.nombreUsuario = "sa";
        this.contrasena = "";
    }

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
