package com.company.model;

public class Paciente {
    /* Creamos las propiedades de la clase Paciente. Por defecto las seteamos como private
    */
    private Integer id;
    private int documento;
    private String nombre;
    private String apellido;
    private String mail;

    /* Cramos el constructor que usaremos por defecto que no toma el ID, ya que lo administrará
    la base de datos
     */
    public Paciente(int documento, String nombre, String apellido, String mail) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
    }
    /* Creamos el constructor que toma todos los parámetros referentes a las propiedades
    de la clase
     */
    public Paciente(Integer id, int documento, String nombre, String apellido, String mail) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
    }

    public Paciente() {
    }

    /* Creamos todos los getters y setters referentes a todas las propiedades de la clase.

     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
