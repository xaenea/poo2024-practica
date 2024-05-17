package com.uned.interfaz;

public class MenuCitas extends Menu {

    public MenuCitas() {
        super();
    }

    @Override
    public void mostrarMenu() {
        int choice;
        do {
            printCabecera("Gestión de Citas");
            printOpcion(1, "Dar una cita a un paciente");
            printOpcion(2,"Consultar el calendario");
            printOpcion(3, "Volver al menú principal");
            printPiePag();
            printSeleccionarOpcion();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    // Lógica para dar una cita a un paciente
                    System.out.println("Dar una cita a un paciente");
                    break;
                case 2:
                    // Lógica para consultar el calendario de un especialista
                    System.out.println("Consultar el calendario de un especialista");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    printOpcionNoValida();
            }
        } while (choice != 3);
    }
}
