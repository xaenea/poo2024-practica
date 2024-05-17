package com.uned.interfaz;

import com.uned.controller.ControladorEmpleados;

public class MenuEmpleados extends Menu {

    private ControladorEmpleados controladorEmpleados;

    public MenuEmpleados(ControladorEmpleados controladorEmpleados) {
        super();
        this.controladorEmpleados = controladorEmpleados;
    }

    @Override
    public void mostrarMenu() {
        int choice;
        do {
            printCabecera("Gestión de Empleados");
            printOpcion(1, "Dar de alta a un empleado");
            printOpcion(2, "Buscar un empleado");
            printOpcion(3, "Volver al menú principal");
            printPiePag();
            printSeleccionarOpcion();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    // Lógica para dar de alta a un empleado
                    darDeAltaEmpleado();
                    break;
                case 2:
                    // Lógica for buscar un empleado
                    buscarEmpleadoPorNombre();
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    printOpcionNoValida();
            }
        } while (choice != 3);
    }

    private void darDeAltaEmpleado() {
        System.out.print("Ingrese DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese correo: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();

        // Llamar al controlador para dar de alta al empleado
        this.controladorEmpleados.altaEmpleado(dni, nombre, apellido, correo, telefono);
    }

    private void buscarEmpleadoPorNombre(){

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        var empleadosEncontrados = this.controladorEmpleados.buscarEmpleadosPorNombre(nombre);
        if(empleadosEncontrados.isEmpty()) {
            System.out.println("No existen empleados con ese nombre");
        }else {
            System.out.println("Empleados encontrados:");
            for (var empleado : empleadosEncontrados) {
                System.out.println(empleado.toString());
            }
        }
    }
}
