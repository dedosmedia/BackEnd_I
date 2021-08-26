package com.company.test.dh.pacientes.service;

import com.company.dao.ConfiguracionJDBC;
import com.company.dao.impl.PacienteDaoH2;
import com.company.model.Paciente;
import com.company.service.PacienteService;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;


class PacienteServiceTest {
     private PacienteService pacienteService = new PacienteService(new PacienteDaoH2(new ConfiguracionJDBC()));

     @BeforeAll
     static void crearTabla() {
         ConfiguracionJDBC nuevaConfiguracion = new ConfiguracionJDBC();
         Connection conexion = null;

         try {
             conexion = nuevaConfiguracion.conectarConBaseDeDatos();
             Statement statement = conexion.createStatement();
             statement.execute("DROP TABLE PACIENTES IF EXISTS; " +
                                    "CREATE TABLE PACIENTES (id int auto_increment primary key, " +
                                                            "documento int, nombre varchar(255), " +
                                                            "apellido varchar(255), mail varchar(255))");
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             try {
                 conexion.close();
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
     }
    @Test
    void generarIdParaNuevoOdontologo() {
        Paciente p1 = new Paciente(1234, "Juan", "Perez", "backend@digitalhouse.com");
        Paciente pacienteGuardado = pacienteService.guardar(p1);
        Assert.assertTrue(pacienteGuardado.getId() != null);
    }

    @Test
    void buscarTodos() {
        List<Paciente> pacientes = pacienteService.buscarTodos();
        Assert.assertFalse(pacientes.size() == 0);

    }
}