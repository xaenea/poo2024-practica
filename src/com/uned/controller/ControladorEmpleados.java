package com.uned.controller;

import com.uned.modelo.ContenedorDatos;
import com.uned.modelo.entidades.empleados.Empleado;
import com.uned.modelo.entidades.Paciente;
import com.uned.modelo.entidades.empleados.Medico;

import java.util.ArrayList;
import java.util.List;

public class ControladorEmpleados {

    public ControladorEmpleados() {
    }

    public List<Empleado> buscarEmpleadosPorNombre(String nombre) {
        List<Empleado> resultado = new ArrayList<>();

        for(int i = 0; i < ContenedorDatos.empleados.size(); i++){
            if(ContenedorDatos.empleados.get(i).getNombre().equals(nombre)){
                resultado.add(ContenedorDatos.empleados.get(i));
            }
        }
        return resultado;
    }

    public void altaEmpleado(String dni, String nombre, String apellido, String correo, String telefono) {
        Empleado medico = new Medico(dni, nombre, apellido, correo, telefono, true);
        ContenedorDatos.empleados.add(medico);

    }


    public void bajaEmpleado(Empleado empleado) {

    }

    public void altaPaciente(Paciente paciente) {

    }


    public void bajaPaciente(Paciente paciente) {

    }

}
