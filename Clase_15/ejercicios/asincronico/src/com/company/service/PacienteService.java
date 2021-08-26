package com.company.service;

import com.company.dao.IDao;
import com.company.model.Paciente;

import java.util.List;

public class PacienteService {

    /*
    Creamos una propiedad de tipo IDao (la interfaz creada en el dao) con tipos genéricos, pero
    esta propiedad la definimos de tipo Paciente. En dicha propiedad haré referencia a un tipo
    Paciente.
    */
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    /*
    Método que me retornará un objeto de tipo paciente. Le daremos como parámetro un paciente,
    que será justamente el paciente (objeto) que queremos guardar en la base de datos.
    Llamará al método definido en la interfaz (guardar), mediante la propiedad "pacienteIDao".
    Aquí es donde intermedia el método de la interfaz.
     */
    public Paciente guardar(Paciente paciente) {
        return pacienteIDao.guardar(paciente);
    }

    /*
    Método que me retornará una lista con objetos de tipo paciente. No toma parámetros, ya que
    accede a la base de datos mediante el SQL y llena la lista.
    Llamará al método definido en la interfaz (buscarTodos()), mediante la propiedad "pacienteIDao".
    Aquí es donde intermedia el método de la interfaz.
    */
    public List<Paciente> buscarTodos() {
        return pacienteIDao.buscarTodos();
    }

}
