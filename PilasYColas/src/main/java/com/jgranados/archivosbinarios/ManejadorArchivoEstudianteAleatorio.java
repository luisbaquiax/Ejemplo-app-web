package com.jgranados.archivosbinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * PilasYColas
 *
 * @author jose - 14.05.2020
 * @Title: ManejadorArchivoEstudiante
 * @Description: description
 *
 * Changes History
 */
public class ManejadorArchivoEstudianteAleatorio {

    private static final int SIZE = 32;

    public void almacenarRegistroEstudiante(String path,
            Estudiante estudiante)
            throws ArchivoBinarioException {
        // Almacenamiento en archivo binario
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(path, true))) {
            outputStream.writeInt(estudiante.getIdentificador());
            outputStream.writeChars(estudiante.getNombre());
            outputStream.writeInt(estudiante.getEdad());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ArchivoBinarioException("Error al almacenar estudiante en archivo: " + path);
        }
    }

    public Estudiante recuperarEstudiante(String path,
            int index)
            throws ArchivoBinarioException {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(path))) {
            inputStream.skipBytes(index * SIZE);
            int identificador = inputStream.readInt();
            String nombre = "";
            for (int i = 0; i < 12; i++) {
                nombre = nombre + inputStream.readChar();
            }
            int edad = inputStream.readInt();

            return new Estudiante(identificador, nombre, edad);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ArchivoBinarioException("Error al recuperar estudiante en archivo: " + path);
        }
    }
}
