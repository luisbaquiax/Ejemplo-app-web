package com.jgranados.archivosbinarios;

/**
 *
 * @author jose
 */
public class mainBinaryFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejadorArchivoEstudiante archivoEstudiante = new ManejadorArchivoEstudiante();

        /*Estudiante estudiante = new Estudiante("Jose Granados", 32);

        try {
            archivoEstudiante.almacenarRegistroEstudiante("josegranados.dat", estudiante);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Estudiante recuperado = archivoEstudiante.recuperarEstudiante("josegranados.dat");
            System.out.println("Recuperado:");
            System.out.println("Nombre:" + recuperado.getNombre());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }*/
        Estudiante[] estudiantes = new Estudiante[5];
        estudiantes[0] = new Estudiante(1, "Juan Perez", 25);
        estudiantes[1] = new Estudiante(2, "Maria Hernandez", 18);
        estudiantes[2] = new Estudiante(3, "Pedro Peña", 17);

        int[] arregloInt = new int[5];

        for (Estudiante elemento : estudiantes) {
            if (elemento != null) {
                try {
                    archivoEstudiante.almacenarRegistroEstudiante(elemento.getIdentificador() + ".dat", elemento);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }

        Estudiante[] estudiantesLeidos = new Estudiante[5];
        try {
            estudiantesLeidos[0] = archivoEstudiante.recuperarEstudiante("1.dat");
            estudiantesLeidos[1] = archivoEstudiante.recuperarEstudiante("2.dat");

            for (Estudiante leido : estudiantesLeidos) {
                if (leido != null) {
                    System.out.println("Estudiante:");
                    System.out.println("Id:" + leido.getIdentificador());
                    System.out.println("Nombre:" + leido.getNombre());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
