package fes.aragon.Pila;

import fes.aragon.Pila.NodoPila;

public class ListaPila {
    NodoPila encima;

    public ListaPila() {
        encima = null;
    }

    public boolean estaVacia() {
        return encima == null;
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void push(String dato) {
        NodoPila nuevoNodo = new NodoPila(dato);
        if (estaVacia()) {
        	encima = nuevoNodo;
        } 
        
        else {
            nuevoNodo.siguiente = encima;
            encima = nuevoNodo;
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public String pop() {
        if (!estaVacia()) {
            String datoDesapilado = encima.dato;
            encima = encima.siguiente;
            return datoDesapilado;  
        }
        
        else {
            System.out.println("La lista pila esta vacia. No se puede quitar nada");
            return null;
        }
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    public void imprimirPila() {
        if (estaVacia()) {
            System.out.println("La lista pila esta vacia.");
            return;
        } 
        
        else {
            int elementos = contarElementos();
            NodoPila actual = encima;

            for (int i = elementos; i >= 1; i--) {
                System.out.println("Elemento " + i + ": " + actual.dato);
                actual = actual.siguiente;
            }
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public int contarElementos() {
        NodoPila actual = encima;
        int contador = 0;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
    }
    
}