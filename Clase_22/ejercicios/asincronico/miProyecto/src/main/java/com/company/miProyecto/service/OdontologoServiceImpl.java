package com.company.miProyecto.service;

import com.company.miProyecto.model.Odontologo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OdontologoServiceImpl implements OdontologoService {
    @Override
    public List<Odontologo> listarOdontologos() {
        return Arrays.asList(new Odontologo("Pedro"),
                new Odontologo("María"),
                new Odontologo("Claudia"));
    }
}
