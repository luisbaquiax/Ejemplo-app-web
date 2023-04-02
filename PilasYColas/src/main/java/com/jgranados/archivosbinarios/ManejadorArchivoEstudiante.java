package com.jgranados.archivosbinarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * PilasYColas
 *
 * @author jose - 14.05.2020
 * @Title: ManejadorArchivoEstudiante
 * @Description: description
 *
 * Changes History
 */
public class ManejadorArchivoEstudiante {

    public void almacenarRegistroEstudiante(String path,
            Estudiante estudiante)
            throws ArchivoBinarioException {
        // Almacenamiento en archivo binario
        /*try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(path))) {
            outputStream.writeInt(estudiante.getIdentificador());
            outputStream.writeUTF(estudiante.getNombre());
            outputStream.writeInt(estudiante.getEdad());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ArchivoBinarioException("Error al almacenar estudiante en archivo: " + path);
        }*/

        // Almacenamiento en archivo binario un objeto
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            outputStream.writeObject(estudiante);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ArchivoBinarioException("Error al almacenar estudiante en archivo: " + path);
        }
    }

    public Estudiante recuperarEstudiante(String path)
            throws ArchivoBinarioException {
        /*try (DataInputStream inputStream = new DataInputStream(new FileInputStream(path))) {
            int identificador = inputStream.readInt();
            String nombre = inputStream.readUTF();
            int edad = inputStream.readInt();

            return new Estudiante(identificador, nombre, edad);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ArchivoBinarioException("Error al recuperar estudiante en archivo: " + path);
        }*/
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))) {
            Object objecto = inputStream.readObject();

            return (Estudiante) objecto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ArchivoBinarioException("Error al recuperar estudiante en archivo: " + path);
        }
    }
}
