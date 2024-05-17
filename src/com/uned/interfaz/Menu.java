package com.uned.interfaz;

import java.util.Scanner;

public abstract class Menu {
    protected Scanner scanner;
    protected final int ANCHURA_MENU = 50;
    private final int PADDING = 4;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    protected void printCabecera(String titulo){
        int asteriscosTotal = ANCHURA_MENU - titulo.length() - PADDING; // Calcula los asteriscos totales necesarios teniendo en cuenta el tamaño del título
        int asteriscosIzquierda = asteriscosTotal / 2;
        int asteriscosDerecha = asteriscosTotal - asteriscosIzquierda;

        String cabecera = "\n" + "*".repeat(asteriscosIzquierda) + " ".repeat(PADDING/2) + titulo + " ".repeat(PADDING/2) + "*".repeat(asteriscosDerecha);
        System.out.println(cabecera);
    }

    protected void printPiePag() {
        System.out.println("*".repeat(ANCHURA_MENU));
    }

    protected void printOpcion(int numeroOpcion, String descripcion){
        int espaciosDerecha = ANCHURA_MENU - descripcion.length() - 6;
        System.out.printf("* %d. " + descripcion + " ".repeat(espaciosDerecha) + "*\n", numeroOpcion);
    }

    protected void printSeleccionarOpcion(){
        System.out.print("Seleccione una opción: ");
    }

    protected void printOpcionNoValida(){
        System.out.println("Opción no valida: ");
    }
    public abstract void mostrarMenu();
}
