package com.dh.test;

import com.dh.dao.ConfiguracionJDBC;
import com.dh.dao.impl.PerroDaoH2;
import com.dh.model.Perro;
import com.dh.service.PerroService;

import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

@TestMethodOrder(OrderAnnotation.class)
class PerroServiceTest {
    private PerroService perroService = new PerroService(new PerroDaoH2(new ConfiguracionJDBC()));

    @Test
    void guardar() {
        Perro p1 = new Perro("Dolmancé", "French Bulldog");
        Perro perroGuardado = perroService.guardar(p1);
        Assert.assertTrue(perroGuardado.getId() != null);


    }

    @Test
    void buscarTodos() {
        List<Perro> perros = perroService.buscarTodos();
        Assert.assertTrue(perros.size() != 0);
    }
}