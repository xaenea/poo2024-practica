package com.uned.modelo.entidades.empleados;

public class Mantenimiento extends PersonalNoSanitario {

    public Mantenimiento(String dni, String nombre, String apellido, String correo, String telefono, boolean activo) {
        super(dni, nombre, apellido, correo, telefono, activo);
    }
}
