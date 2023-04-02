package com.jgranados.pilasycolas;

/**
 * PilasYColas
 *
 * @author jose - 20.04.2020
 * @Title: Cola
 * @Description: description
 *
 * Changes History
 */
public class Cola<T> {

    private int tamaño;
    private T[] cola;
    private int indiceFin;

    public Cola(int tamaño) {
        this.cola = (T[]) new Object[tamaño];
        this.tamaño = tamaño;
        this.indiceFin = -1;
    }

    public boolean esVacia() {
        return indiceFin == -1;
    }

    public void encolar(T elemento)
            throws Exception {
        if (indiceFin < tamaño - 1) {
            indiceFin++;
            cola[indiceFin] = elemento;
        } else {
            throw new Exception("La cola está llena, no se puede insertar el elemento: " + elemento);
        }
    }

    public T desencolar()
            throws Exception {
        if (!esVacia()) {
            T elemento = cola[0];

            for (int i = 0; i < indiceFin; i++) {
                cola[i] = cola[i + 1];
            }
            indiceFin--;

            return elemento;
        } else {
            throw new Exception("La cola está vacía.");
        }
    }

    public T inspeccionarFrente()
            throws Exception {
        if (esVacia()) {
            throw new Exception("La cola está vacía.");
        }
        return cola[0];
    }

    public T inspeccionarFin()
            throws Exception {
        if (esVacia()) {
            throw new Exception("La cola está vacía.");
        }
        return cola[indiceFin];
    }

    public T verIndice(int indice) {
        return cola[indice];
    }

    public int getTamaño() {
        return tamaño;
    }
}
