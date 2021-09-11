package com.example.clinica.controller;


import com.example.clinica.model.Paciente;
import com.example.clinica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {

    private PacienteService pacienteService = new PacienteService();




    @GetMapping("/pacientes")
    public String getPacientes(Model model){

        Paciente paciente = pacienteService.obtenerPaciente("andres@hotmail.com");

        System.out.println(paciente.getNombre()+" - "+paciente.getApellido());

        model.addAttribute("nombre", paciente.getNombre());
        model.addAttribute("apellido", paciente.getApellido());
        model.addAttribute("matricula", paciente.getOdontologo().getMatricula());
        return "index";
    }
}
