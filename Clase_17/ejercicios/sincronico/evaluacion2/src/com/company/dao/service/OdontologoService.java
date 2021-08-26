package com.company.dao.service;

import com.company.dao.IDao;
import com.company.dao.model.Odontologo;

import java.util.List;

public class OdontologoService {


    private IDao<Odontologo> odontologoDao;


    public OdontologoService(IDao<Odontologo> odontologoDao) {
        this.odontologoDao = odontologoDao;
    }

    public Odontologo guardar(Odontologo odontologo) {
        return odontologoDao.guardar(odontologo);
    }

    public List<Odontologo> listar(){
        return odontologoDao.listar();
    }



}
