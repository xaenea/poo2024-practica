package com.uned.interfaz;

public class MenuEstudiantes extends Menu {

    public MenuEstudiantes() {
        super();
    }

    @Override
    public void mostrarMenu() {
        int choice;
        do {
            printCabecera("Gestión de Estudiantes");
            printOpcion(1, "Dar de alta a un estudiante");
            printOpcion(2, "Buscar un estudiante");
            printOpcion(3, "Volver al menú principal");
            printPiePag();
            printSeleccionarOpcion();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    // Lógica para dar de alta a un estudiante
                    System.out.println("Dar de alta a un estudiante");
                    break;
                case 2:
                    // Lógica para buscar un estudiante
                    System.out.println("Buscar un estudiante");
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
