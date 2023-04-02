/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.archivosbinarios;

/**
 *
 * @author jose
 */
public class mainBinaryFilesRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejadorArchivoEstudianteAleatorio archivoEstudiante = new ManejadorArchivoEstudianteAleatorio();
        Estudiante[] estudiantes = new Estudiante[5];
        estudiantes[0] = new Estudiante(1, "Juans Perezz", 25);
        estudiantes[1] = new Estudiante(2, "Maria Hernan", 18);
        estudiantes[2] = new Estudiante(3, "Pedro Peñaso", 17);

        for (Estudiante elemento : estudiantes) {
            if (elemento != null) {
                try {
                    archivoEstudiante.almacenarRegistroEstudiante("estudiantes.dat", elemento);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }

        try {
            Estudiante elemento = archivoEstudiante.recuperarEstudiante("estudiantes.dat", 2);
            System.out.println("Estudiante");
            System.out.println("Nombre: " + elemento.getNombre());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
