package com.uned.modelo.entidades.empleados;

public class Gerente extends PersonalNoSanitario {

    public Gerente(String dni, String nombre, String apellido, String correo, String telefono, boolean activo) {
        super(dni, nombre, apellido, correo, telefono, activo);
    }
}
