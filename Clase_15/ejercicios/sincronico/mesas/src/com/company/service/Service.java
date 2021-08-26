package com.company.service;

import com.company.dao.IDao;
import com.company.model.Paciente;

public class Service {


    private IDao<Paciente> dao;


    public Service(IDao dao) {
        this.dao = dao;
    }


    public Paciente guardar(Paciente paciente){

        Paciente nuevo = dao.guardar(paciente);


        return nuevo;
    }



}
