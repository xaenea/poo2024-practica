package com.uned.modelo.entidades.unidades;

import com.uned.modelo.entidades.empleados.PersonalSanitario;
import com.uned.modelo.enums.TipoPruebaMedica;

import java.util.List;

public class PruebasMedicas extends Unidad {

    private TipoPruebaMedica tipoPruebaMedica;

    protected PruebasMedicas(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
}
