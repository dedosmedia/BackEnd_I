package com.dh.service;

import com.dh.dao.IDao;
import com.dh.model.Perro;

import java.util.List;

public class PerroService {
    private IDao<Perro> perroIDao;

    public PerroService(IDao<Perro> perroIDao) {
        this.perroIDao = perroIDao;
    }

    public Perro guardar(Perro perro) {
        return perroIDao.guardar(perro);
    }

    public List<Perro> buscarTodos() {
        return perroIDao.buscarTodos();
    }
}
