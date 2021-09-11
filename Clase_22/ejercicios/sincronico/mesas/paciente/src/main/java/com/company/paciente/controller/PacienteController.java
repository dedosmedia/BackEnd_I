package com.company.paciente.controller;

import com.company.paciente.model.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {

    @GetMapping("/index")
    public String welcome(Model model) {
        model.addAttribute("nombre", "diez");
        model.addAttribute("numero", 100);
        return "index";
    }

}
