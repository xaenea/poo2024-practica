package com.uned.interfaz;

import com.uned.controller.ControladorEmpleados;

import java.util.Scanner;

public class MenuPrincipal extends Menu {
    private final MenuEmpleados menuEmpleados;
    private final MenuPacientes menuPacientes;
    private final MenuEstudiantes menuEstudiantes;
    private final MenuCitas menuCitas;

    public MenuPrincipal(ControladorEmpleados controladorEmpleados){
        this.menuEmpleados = new MenuEmpleados(controladorEmpleados);
        this.menuPacientes = new MenuPacientes();
        this.menuEstudiantes = new MenuEstudiantes();
        this.menuCitas = new MenuCitas();

    }
    @Override
    protected void printCabecera(String titulo){
        // Implementación específica para MenuPrincipal
        System.out.println("\n" + "=".repeat(ANCHURA_MENU));
        System.out.println("|| " + titulo + " ||");
        System.out.println("=".repeat(ANCHURA_MENU));
    }

    @Override
    protected void printPiePag(){
        // Implementación específica para MenuPrincipal
        System.out.println("=".repeat(ANCHURA_MENU));
    }

    @Override
    public void mostrarMenu() {
        int choice;
        do {
            printCabecera("Gestión del Hospital");
            printOpcion(1, "Gestión de Empleados");
            printOpcion(2, "Gestión de Pacientes");
            printOpcion(3, "Gestión de Estudiantes");
            printOpcion(4, "Gestión de Citas");
            printOpcion(5, "Salir");
            printPiePag();
            printSeleccionarOpcion();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt(); //TODO: al meter un string casca REVISAR
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    this.menuEmpleados.mostrarMenu();
                    break;
                case 2:
                    this.menuPacientes.mostrarMenu();
                    break;
                case 3:
                    this.menuEstudiantes.mostrarMenu();
                    break;
                case 4:
                    this.menuCitas.mostrarMenu();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    printOpcionNoValida();
            }
        } while (choice != 5);
        scanner.close();
    }
}
