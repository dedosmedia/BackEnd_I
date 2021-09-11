package com.example.clinica.service;

import com.example.clinica.model.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoService {

    List<Odontologo> odontologos = new ArrayList<>();

    public OdontologoService() {

        Odontologo odontologo1 = new Odontologo("Claudia", "Morales", "999");
        Odontologo odontologo2 = new Odontologo("Sergio", "Arias", "888");

        odontologos.add(odontologo1);
        odontologos.add(odontologo2);
    }

    public List<Odontologo> listarOdontologos(){
        return odontologos;
    }

    public Odontologo obtenerOdontologo(Integer id){
        Odontologo odontologoBuscado = null;
        for (Odontologo odontologo : odontologos) {

            if(odontologo.getId() == id){
                odontologoBuscado = odontologo;
                break;
            }
        }

        return odontologoBuscado;
    }

}
