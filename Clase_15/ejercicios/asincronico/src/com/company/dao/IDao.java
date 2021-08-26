package com.company.dao;

import java.util.List;

/*
Creamos una interface que tomará una clase genérica, no sabemos que tipo de parámetro
 daremos a los métodos que implementemos en la interfaz (Paciente?... Cliente?... alguna clase
 que podremos crear en un futuro?... por eso lo definimos con <T>
 */

public interface IDao <T> {

    /*
    definimos un método guardar que tomará como parámetro una clase de tipo... NO LO SABEMOS!
    por eso damos como parámetro un tipo T y hasta retornamos un tipo T.
     */

    public T guardar(T t);

    /*
    definimos un método buscarTodos que DEVOLVERÁ una lista con objetos de tipo... NO LO SABEMOS!
    por eso damos seteamos la lista con tipo T.
     */
    public List<T> buscarTodos();


}
