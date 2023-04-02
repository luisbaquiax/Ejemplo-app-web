package com.jgranados.archivosbinarios;

import java.io.Serializable;

/**
 * PilasYColas
 * @author jose - 14.05.2020 
 * @Title: Estudiante
 * @Description: description
 *
 * Changes History
 */
public class Estudiante implements Serializable {

    // tamaño registro
    // 4 + 4 + 24
    private String nombre;
    private int edad;
    private int identificador;

    public Estudiante(int identificador,
            String nombre,
            int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;

        // validacion para evitar nombres de mas de 12 caracteres
        // rellenar el nombre si es menor a 12 caracteres
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificador() {
        return identificador;
    }
    
}