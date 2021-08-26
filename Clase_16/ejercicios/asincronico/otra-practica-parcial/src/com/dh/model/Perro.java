package com.dh.model;

public class Perro {
    private Integer id;
    private String nombre;
    private String raza;

    public Perro(int id, String nombre, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
