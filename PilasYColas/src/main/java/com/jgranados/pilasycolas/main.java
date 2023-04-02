/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.pilasycolas;

/**
 *
 * @author jose
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<String> pilaStrings = new Pila<>(5);
        try {
            pilaStrings.apilar("Hola,");
            pilaStrings.apilar(" Mundo");
            pilaStrings.apilar("!!");
            pilaStrings.apilar("!!1");
            pilaStrings.apilar("!!2");
            pilaStrings.apilar("!!3");
            pilaStrings.apilar("!!4");

            String elemento = pilaStrings.desapilar();
            System.out.print(elemento);
            elemento = pilaStrings.desapilar();
            System.out.print(elemento);
            elemento = pilaStrings.desapilar();
            System.out.print(elemento);

            //error
            elemento = pilaStrings.desapilar();
            System.out.print(elemento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            // cola
            Cola<String> colaStrings = new Cola<>(5);
            colaStrings.encolar("Hola,");
            colaStrings.encolar(" Mundo");
            colaStrings.encolar("!!");
            colaStrings.encolar("!!");
            colaStrings.encolar("!!");
            colaStrings.encolar("!!1");

            System.out.print(colaStrings.desencolar());
            System.out.print(colaStrings.desencolar());
            System.out.print(colaStrings.desencolar());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
