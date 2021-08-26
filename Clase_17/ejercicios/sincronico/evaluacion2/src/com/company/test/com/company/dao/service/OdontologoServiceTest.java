package com.company.test.com.company.dao.service;

import com.company.dao.ConfigJDBC;
import com.company.dao.IDao;
import com.company.dao.impl.OdontologoDaoH2;
import com.company.dao.model.Odontologo;
import com.company.dao.service.OdontologoService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OdontologoServiceTest {

    private IDao<Odontologo> odontologoDao;
    private OdontologoService service;
    ConfigJDBC config;

    @BeforeAll
    public void crearTabla(){

        config = new ConfigJDBC();
        odontologoDao = new OdontologoDaoH2(config);
        service = new OdontologoService(odontologoDao);

        PreparedStatement pstm = null;
        Connection connection = null;

        String SQL_CREATE_TABLE = "DROP TABLE ODONTOLOGO IF EXISTS; CREATE TABLE ODONTOLOGO (id int AUTO_INCREMENT primary key, matricula number(10), nombre varchar(255), apellido varchar(255))";
        try {
            connection                  = config.getConnection();
            pstm                        = connection.prepareStatement(SQL_CREATE_TABLE);
            pstm.execute();
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
    }



    @Test
    void listarTresOdontologos(){

        Odontologo odontologo1 = new Odontologo(123, "Andrés","Pérez");
        Odontologo odontologo2 = new Odontologo(124, "Marina","Jaramillo");
        Odontologo odontologo3 = new Odontologo(125, "Ramón","Díaz");

        service.guardar(odontologo1);
        service.guardar(odontologo2);
        service.guardar(odontologo3);

        assertTrue(service.listar().size() == 3);
    }



}
