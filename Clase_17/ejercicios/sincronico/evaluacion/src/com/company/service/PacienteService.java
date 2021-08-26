package com.company.service;

import com.company.dao.IDao;
import com.company.model.Paciente;

import java.util.List;

public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {

        this.pacienteIDao = pacienteIDao;
    }

    public Paciente guardar(Paciente paciente) {
        return pacienteIDao.guardar(paciente);
    }

    public List<Paciente> buscarTodos() {

        return pacienteIDao.buscarTodos();
    }

}
