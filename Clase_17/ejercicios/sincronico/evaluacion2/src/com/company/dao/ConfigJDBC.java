package com.company.dao;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConfigJDBC {

    private String driver;
    private String url;
    private String user;
    private String pass;


    public static final Logger logger = Logger.getLogger(ConfigJDBC.class);

    public ConfigJDBC(String driver, String url, String user, String pass) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    public ConfigJDBC() {
        this.driver = "org.h2.Driver";
        this.url = "jdbc:h2:tcp://localhost/~/test";
        this.user = "sa";
        this.pass = "";
    }

    public Connection getConnection(){

        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e){
            logger.error("No se pudo realizar la conexión ",e);
        }
        catch (ClassNotFoundException e){
            logger.fatal("No se encuentra el driver ",e);

        }
        return connection;
    }

}
