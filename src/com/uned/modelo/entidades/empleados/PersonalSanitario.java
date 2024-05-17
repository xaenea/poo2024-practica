package com.uned.modelo.entidades.empleados;

import com.uned.modelo.entidades.unidades.Unidad;

import java.util.List;

public abstract class PersonalSanitario extends Empleado {

    protected List<Estudiante> estudiantes;
    protected Unidad unidad;

    public PersonalSanitario(String dni, String nombre, String apellido, String correo, String telefono, boolean activo, Unidad unidad){
        super(dni, nombre, apellido, correo, telefono, activo);
        this.unidad = unidad;
    }
}
