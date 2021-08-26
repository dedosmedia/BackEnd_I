package com.company.dao.impl;

import com.company.dao.ConfigJDBC;
import com.company.dao.IDao;
import com.company.dao.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    ConfigJDBC config = null;
    private static final Logger logger = Logger.getLogger(OdontologoDaoH2.class);

    public OdontologoDaoH2(ConfigJDBC config) {
        this.config = config;
    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {

        Connection connection = null;
        PreparedStatement pstm = null;
        String SQL_GUARDAR = "INSERT INTO ODONTOLOGO (matricula, nombre, apellido) VALUES (?,?,?)";

        try {
            connection                  = config.getConnection();
            pstm                        = connection.prepareStatement(SQL_GUARDAR, PreparedStatement.RETURN_GENERATED_KEYS);
            Integer matricula           = odontologo.getMatricula() ;
            String nombre               = odontologo.getNombre();
            String apellido             = odontologo.getApellido();

            pstm.setInt(1, matricula);
            pstm.setString(2, nombre);
            pstm.setString(3, apellido);

            pstm.executeUpdate();
            ResultSet rs = pstm.getGeneratedKeys();

            while(rs.next()) {
                Integer index = rs.getInt(1);
                odontologo.setId(index);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                pstm.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        logger.debug("Se ha registrado un objeto "+odontologo);

        return odontologo;
    }

    @Override
    public List<Odontologo> listar() {
        Connection connection = null;
        PreparedStatement pstm = null;
        String SQL_QUERY = "SELECT id, matricula, nombre, apellido FROM ODONTOLOGO";
        List<Odontologo> lista = new ArrayList<>();

        try {
            connection                  = config.getConnection();
            pstm                        = connection.prepareStatement(SQL_QUERY);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                Integer index = rs.getInt(1);
                Integer matricula = rs.getInt(2);
                String nombre = rs.getString(3);
                String apellido = rs.getString(4);
                Odontologo nuevo = new Odontologo(index, matricula, nombre, apellido);
                lista.add(nuevo);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {

            try {
                pstm.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        logger.debug("Se ha obtenido la lista de objetos "+lista);
        return lista;
    }
}
