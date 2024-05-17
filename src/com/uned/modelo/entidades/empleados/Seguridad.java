package com.uned.modelo.entidades.empleados;

public class Seguridad extends PersonalNoSanitario{

    public Seguridad(String dni, String nombre, String apellido, String correo, String telefono, boolean activo) {
        super(dni, nombre, apellido, correo, telefono, activo);
    }
}
