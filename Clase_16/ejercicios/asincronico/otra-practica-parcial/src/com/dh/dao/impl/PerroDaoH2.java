package com.dh.dao.impl;

import com.dh.dao.ConfiguracionJDBC;
import com.dh.dao.IDao;
import com.dh.model.Perro;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PerroDaoH2 implements IDao<Perro> {
    final static Logger log = Logger.getLogger(PerroDaoH2.class);
    private ConfiguracionJDBC configuracionJDBC;

    public PerroDaoH2(ConfiguracionJDBC configuracionJDBC) {
        this.configuracionJDBC = configuracionJDBC;
    }
    
    @Override
    public Perro guardar(Perro perro) {
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        Statement statement = null;
        String query = String.format("INSERT INTO perros(nombre, raza) VALUES('%s','%s')",
                perro.getNombre(),perro.getRaza());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next())
                perro.setId(keys.getInt(1));
            log.debug("Ingresando un nuevo perro: " + perro.toString());
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return perro;
    }

    @Override
    public List<Perro> buscarTodos() {
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        Statement statement = null;
        String query = String.format("SELECT * FROM perros");
        List<Perro> perros = new ArrayList();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                perros.add(new Perro(resultSet.getInt("id"), resultSet.getString("nombre"),resultSet.getString("raza")));
            }
            log.debug("Tenemos a los perros: " + perros);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return perros;
    }
}
