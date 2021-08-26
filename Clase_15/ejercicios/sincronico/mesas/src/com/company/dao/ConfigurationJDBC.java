package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigurationJDBC {

    private String url;
    private String user;
    private String pass;


    public ConfigurationJDBC(String url, String user, String pass) {
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    public ConfigurationJDBC() {
        this.url = "jdbc:h2:tcp://localhost/~/test";
        this.user = "sa";
        this.pass = "";
    }


    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url,user,pass);
        return connection;
    }

}
