package com.uned.modelo.entidades.empleados;

import java.io.Serializable;

public abstract class Empleado implements Serializable {

    private String dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private boolean activo;

    public Empleado() {}

    public Empleado(String dni, String nombre, String apellido, String correo, String telefono, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = activo;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "------------------------------\n" +
                "- DNI: " + getDni() + "\n" +
                "- Nombre: " + getNombre() + "\n" +
                "- Apellido: " + getApellido() + "\n" +
                "- Correo: " + getCorreo() + "\n" +
                "- Teléfono: " + getTelefono() + "\n" +
                "------------------------------";
    }
}
