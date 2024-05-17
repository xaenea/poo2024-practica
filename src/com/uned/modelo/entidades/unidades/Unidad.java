package com.uned.modelo.entidades.unidades;

public abstract class Unidad {

    private final String nombre;
    private final String descripcion;

    protected Unidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }

}
