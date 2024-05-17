package com.uned.interfaz;

public class MenuPacientes extends Menu {

    public MenuPacientes() {
        super();
    }

    @Override
    public void mostrarMenu() {
        int choice;
        do {
            printCabecera("Gestión de Pacientes");
            printOpcion(1, "Dar de alta a un paciente");
            printOpcion(2, "Buscar un paciente");
            printOpcion(3, "Dar el alta a un paciente ingresado");
            printOpcion(4, "Dar la baja a un paciente ingresado");
            printOpcion(5, "Actualizar expediente de un paciente");
            printOpcion(6, "Buscar expediente de un paciente");
            printOpcion(7, "Volver al menú principal");
            printPiePag();
            printSeleccionarOpcion();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    // Lógica para dar de alta a un paciente
                    System.out.println("Dar de alta a un paciente");
                    break;
                case 2:
                    // Lógica para buscar un paciente
                    System.out.println("Buscar un paciente");
                    break;
                case 3:
                    // Lógica para dar de alta a un paciente ingresado
                    System.out.println("Dar de alta a un paciente ingresado");
                    break;
                case 4:
                    // Lógica para dar de baja a un paciente ingresado
                    System.out.println("Dar de baja a un paciente ingresado");
                    break;
                case 5:
                    // Lógica para actualizar expediente de un paciente
                    System.out.println("Actualizar expediente de un paciente");
                    break;
                case 6:
                    // Lógica para buscar expediente de un paciente
                    System.out.println("Buscar expediente de un paciente");
                    break;
                case 7:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    printOpcionNoValida();
            }
        } while (choice != 7);
    }
}
