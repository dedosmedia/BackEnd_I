package com.company.dao.impl;

import com.company.dao.ConfiguracionJDBC;
import com.company.dao.IDao;
import com.company.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PacienteDaoH2 implements IDao<Paciente> {

    final static Logger log = Logger.getLogger(PacienteDaoH2.class);
    private ConfiguracionJDBC configuracionJDBC;

    public PacienteDaoH2(ConfiguracionJDBC configuracionJDBC) {
        this.configuracionJDBC = configuracionJDBC;
    }

    @Override
    public Paciente guardar(Paciente paciente) {
        log.debug("Registrando un nuevo paciente : "+ paciente.toString());
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        Statement statement = null;
        String query = String.format("INSERT INTO pacientes(documento,nombre, apellido, mail)" +
                        " VALUES('%s','%s','%s','%s')",
                        paciente.getDocumento(),paciente.getNombre(),paciente.getApellido(),paciente.getMail());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next())
                paciente.setId(keys.getInt(1));
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public List<Paciente> buscarTodos() {
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        Statement statement = null;
        String query = String.format("SELECT * FROM pacientes");
        List<Paciente> pacientes = new ArrayList();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                pacientes.add(new Paciente( resultSet.getInt("id"),
                                            resultSet.getInt("documento"),
                                            resultSet.getString("nombre"),
                                            resultSet.getString("apellido"),
                                            resultSet.getString("mail")
                                            ));
                log.debug("Buscando pacientes: " + pacientes);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pacientes;
    }

}
