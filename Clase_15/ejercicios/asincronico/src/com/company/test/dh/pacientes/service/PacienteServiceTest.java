package com.company.test.dh.pacientes.service;

import com.company.dao.ConfiguracionJDBC;
import com.company.dao.impl.PacienteDaoH2;
import com.company.model.Paciente;
import com.company.service.PacienteService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {
     private PacienteService pacienteService = new PacienteService(new PacienteDaoH2(new ConfiguracionJDBC()));

    @Test
    void guardar() {
        Paciente p1 = new Paciente(1234, "Juan", "Perez", "backend@digitalhouse.com");
        Paciente pacienteGuardado = pacienteService.guardar(p1);
        Assert.assertTrue(pacienteGuardado.getId() != null);
    }

    @Test
    void buscarTodos() {
        List<Paciente> pacientes = pacienteService.buscarTodos();
        Assert.assertTrue(pacientes.size() == 0);

    }
}