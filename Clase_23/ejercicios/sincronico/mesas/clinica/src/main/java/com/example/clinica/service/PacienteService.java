package com.example.clinica.service;

import com.example.clinica.model.Odontologo;
import com.example.clinica.model.Paciente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacienteService {

    private List<Paciente> pacientes;

    public PacienteService() {
        System.out.println("Paciente Service Construido");

        Odontologo odontologo = new Odontologo("Pedro", "Molina","4356");

        Paciente paciente1 = new Paciente("Andrés","Martinez","andres@hotmail.com", "123", "2020-05-03", odontologo);
        Paciente paciente2 = new Paciente("Mariana","Pajón","mariana@hotmail.com", "124", "2020-05-04", odontologo);
        Paciente paciente3 = new Paciente("Camila","Cardenas","camila@hotmail.com", "125", "2020-05-05", odontologo);

        pacientes = new ArrayList<>();
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
    }

    public List<Paciente> listarPacientes(){
            return pacientes;
    }

    public Paciente obtenerPaciente(String email){
        Paciente pacienteBuscado = null;
        for (Paciente paciente : pacientes) {
            if( paciente.getEmail().equals(email))
            {
                pacienteBuscado = paciente;
                break;
            }
        }
        return pacienteBuscado;
    }


}



