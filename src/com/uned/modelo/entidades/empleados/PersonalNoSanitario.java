package com.uned.modelo.entidades.empleados;

import com.uned.modelo.entidades.unidades.Administracion;

public abstract class PersonalNoSanitario extends Empleado {

    protected final Administracion unidad;

    public PersonalNoSanitario(String dni,
                               String nombre,
                               String apellido,
                               String correo,
                               String telefono,
                               boolean activo, Administracion unidad) {

        super(dni, nombre, apellido, correo, telefono, activo);
        this.unidad = unidad;
    }
}
