package com.jgranados.pilasycolas.ui;

import com.jgranados.pilasycolas.Cola;
import java.util.Scanner;

/**
 * PilasYColas
 *
 * @author jose - 22.04.2020
 * @Title: FrontendTexto
 * @Description: description
 *
 * Changes History
 */
public class FrontendTexto {

    private Scanner scanner;

    public FrontendTexto() {
        this.scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        int opcion;
        System.out.println("Menu:");
        System.out.println("1. crear cola");
        System.out.println("2. crear pila");
        System.out.println("Ingrese opcion: ");
        opcion = Integer.parseInt(scanner.nextLine());

        if (opcion == 1) {
            crearCola();
        } else {
            crearPila();
        }
    }

    private void crearCola() {
        int tamaño;
        boolean salir = false;
        System.out.println("Tamaño de la cola:");

        tamaño = Integer.parseInt(scanner.nextLine());
        Cola<String> cola = new Cola<>(tamaño);

        int opcion;
        while (!salir) {
            System.out.println("Que desea hacer con la cola");
            System.out.println("1. insertar");
            System.out.println("2. sacar");
            System.out.println("3. salir");
            opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {
                System.out.println("ingrese valor:");
                String valor = scanner.nextLine();
                try {
                    cola.encolar(valor);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Intente de nuevo....Presione enter.");
                    scanner.nextLine();
                }
            } else if (opcion == 2) {
                System.out.println("Elemento sacado:");
                try {
                    System.out.println(cola.desencolar());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Intente de nuevo....Presione enter.");
                    scanner.nextLine();
                }
            } else {
                salir = true;
            }

        }

    }

    private void crearPila() {
        System.out.println("No Hago nada...");
    }
}
