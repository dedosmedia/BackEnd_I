package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private String apellido;
    private LocalDate date;
    private String mail;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public String calcularNombreCompleto(){
        return nombre+" "+apellido;
    }

    public boolean eaMayorDeEdad(){
        return Period.between(LocalDate.now(), date).getYears() >= 18;
    }




}



