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

    /*
    Creamos una referencia de Tipo Logger (de nombre "log") para loguear nuestra clase.
    De esta manera podremos llamar a este objeto cuantas veces necesitemos desde cualquier
    ubicación de nuestra clase.
     */
    final static Logger log = Logger.getLogger(PacienteDaoH2.class);
    //Creamos una propiedad de tipo ConfiguracionJDBC para acceder a nuestra base de datos
    private ConfiguracionJDBC configuracionJDBC;

    /*
     Constructor al que damos como parámetro la configuración a la base de datos.
     Al guardarla como propiedad, podremos utilizarla desde el objeto cuantas veces la
     necesitemos
     */
    public PacienteDaoH2(ConfiguracionJDBC configuracionJDBC) {

        this.configuracionJDBC = configuracionJDBC;
    }



    /*
    Método sobreescrito que hemos definido en la interfaz IDao. Como esta clase lo implementa
    debemos redefinir los métodos con el código que ejecutará. Aquí agregaremos el código
    referente a la manera en la que GUARDAREMOS UN PACIENTE.
     */
    @Override
    public Paciente guardar(Paciente paciente) {
        log.debug("Registrando un nuevo paciente : "+ paciente.toString());
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        Statement statement = null;
        String query = String.format("INSERT INTO pacientes(documento,nombre, apellido, mail) VALUES('%s','%s','%s','%s')",
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
    /*
     Método sobreescrito que hemos definido en la interfaz IDao. Como esta clase lo implementa
     debemos redefinir los métodos con el código que ejecutará. Aquí agregaremos el código
     referente a la manera en la que GUARDAREMOS TODOS LOS PACIENTES EN UNA LISTA.
     */
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
                pacientes.add(new Paciente(resultSet.getInt("id"), resultSet.getInt("documento"),resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getString("mail")));
                log.debug("Buscando pacientes: " + pacientes);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pacientes;
    }

}
