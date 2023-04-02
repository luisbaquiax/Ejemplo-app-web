package com.jgranados.pilasycolas;

/**
 * PilasYColas
 *
 * @author jose - 20.04.2020
 * @Title: Pila
 * @Description: description
 *
 * Changes History
 */
public class Pila<T> {

    private int tamaño;
    private T[] pila;
    private int indiceTope;

    public Pila(int tamaño) {
        this.tamaño = tamaño;
        pila = (T[]) new Object[tamaño];
        indiceTope = -1;
    }

    public boolean esVacia() {
        /*if (indiceTope == -1) {
            return true;
        } else {
            return false;
        }*/
 /*boolean comp = indiceTope == -1;
        return comp;*/
        return indiceTope == -1;
    }

    public T desapilar()
            throws Exception {
        if (!esVacia()) {
            T elementoTope = pila[indiceTope];
            indiceTope--;
            return elementoTope;
        } else {
            throw new Exception("La pila está vacia");
        }
    }

    public void apilar(T elemento)
            throws Exception {
        if (indiceTope < tamaño - 1) {
            indiceTope++;
            pila[indiceTope] = elemento;
        } else {
            throw new Exception("La pila está llena, no se puede insertar el elemento: " + elemento);
        }

    }

    public T inspeccionarTope()
            throws Exception {
        if (esVacia()) {
            throw new Exception("La pila está vacia");
        }

        //T elemtoTope = pila[indiceTope];
        //return elemtoTope;
        return pila[indiceTope];
    }
}
