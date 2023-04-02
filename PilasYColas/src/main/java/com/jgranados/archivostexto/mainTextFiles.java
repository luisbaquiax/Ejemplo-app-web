/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.archivostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author jose
 */
public class mainTextFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File primerArchivo = new File("/home/jose/primerArchivo.txt");
        //File primerArchivo = new File("/home/jose/CUNOC");
        System.out.println("exite? " + primerArchivo.exists());
        System.out.println("padre " + primerArchivo.getParent());
        System.out.println("carpeta? " + primerArchivo.isDirectory());

        // escribiendo a bajo nivel
        try {
            FileOutputStream flujosalida = new FileOutputStream(primerArchivo);
            flujosalida.write("HOLA MUNDO!!!".getBytes());
            flujosalida.write(105);

        } catch (Exception e) {
            System.out.println("Excepcion con archivo " + primerArchivo);
            e.printStackTrace();
        }

        try (FileOutputStream flujosalida = new FileOutputStream(primerArchivo)) {
            flujosalida.write("HOLA MUNDO!!!".getBytes());
            flujosalida.write(105);
        } catch (Exception e) {
            System.out.println("Excepcion con archivo " + primerArchivo);
            e.printStackTrace();
        }

        // lectura a bajo nivel
        try (FileInputStream flujoEntrada = new FileInputStream(primerArchivo)) {
            String contenido = "";
            int unByte = flujoEntrada.read();
            while (unByte > -1) {
                contenido = contenido + (char) unByte;
                System.out.println("byte leido int:" + unByte + " char: " + (char) unByte);
                unByte = flujoEntrada.read();
            }
            System.out.println("Contenido: " + contenido);

        } catch (IOException e) {
            System.out.println("Excepcion con archivo " + primerArchivo);
            e.printStackTrace();
        }

        // escritura de alto nivel para texto
        File altoNivel = new File("textAltoNivel.txt");
        try (PrintStream impresoraTexto = new PrintStream(new FileOutputStream(altoNivel, true))) {
            impresoraTexto.println("HOLA MUNDO LINEA 1");
            impresoraTexto.println("HOLA MUNDO LINEA 2");
            impresoraTexto.println("HOLA MUNDO LINEA 3");
            impresoraTexto.format("HOLA MUNDO CON FORMATO %d Y MAS TEXTO: %s\n", 1, "TEXTO");
            impresoraTexto.println(1598);
            impresoraTexto.println(true);
        } catch (Exception e) {
            System.out.println("Excepcion con archivo " + primerArchivo);
            e.printStackTrace();
        }

        // lectura de alto nivel para texto
        try (FileReader fileReader = new FileReader(altoNivel);
                BufferedReader reader = new BufferedReader(fileReader)) {
            String contenido = "";
            String linea = reader.readLine();
            while (linea != null) {
                contenido = contenido + linea + "\n";
                linea = reader.readLine();
            }
            System.out.println("contenido del archivo:");
            System.out.println(contenido);
        } catch (Exception e) {
            System.out.println("Excepcion con archivo " + primerArchivo);
            e.printStackTrace();
        }

    }

}
