package com.uned.modelo.entidades;

import java.io.Serializable;
import java.util.List;

public class Paciente implements Serializable {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private boolean ingresado;
    private List<Expediente> historialMedico;


    public Paciente(String nombre, String primerApellido, String segundoApellido, boolean ingresado) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.ingresado = ingresado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public boolean isIngresado() {
        return ingresado;
    }

    public void setIngresado(boolean ingresado) {
        this.ingresado = ingresado;
    }
}
