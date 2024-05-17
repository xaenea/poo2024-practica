package com.uned.modelo.entidades.unidades;

import com.uned.modelo.entidades.Habitacion;
import com.uned.modelo.entidades.empleados.PersonalSanitario;

import java.util.List;

public class Hospitalizacion extends Unidad {
    private List<Habitacion> habitaciones;

    protected Hospitalizacion(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
}
