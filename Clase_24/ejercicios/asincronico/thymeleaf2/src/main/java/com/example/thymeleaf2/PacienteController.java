package com.example.thymeleaf2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.expression.Lists;

import java.util.Arrays;
import java.util.List;

@Controller
public class PacienteController {

    @RequestMapping("/")
    public String index()
    {
        return"index2";
    }
    private List<String> docs = Arrays.asList("DNI", "Libreta Enrollamiento", "Libreta Civica");

    @RequestMapping(value="/save", method= RequestMethod.POST)
    public ModelAndView save(@ModelAttribute Paciente paciente)
    {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("paciente-data");
        modelAndView.addObject("paciente", paciente);
        return modelAndView;
    }
}
