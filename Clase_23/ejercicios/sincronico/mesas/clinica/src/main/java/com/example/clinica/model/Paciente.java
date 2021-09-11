package com.example.clinica.model;

public class Paciente {

    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String dni;
    private String fechaIngreso;
    private Odontologo odontologo;

    public Paciente(Integer id, String apellido, String email, String dni, String fechaIngreso, Odontologo odontologo) {
        this.id = id;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.odontologo = odontologo;
    }

    public Paciente(String nombre, String apellido, String email, String dni, String fechaIngreso, Odontologo odontologo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.odontologo = odontologo;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }
}
