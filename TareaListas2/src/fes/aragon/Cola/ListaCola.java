package fes.aragon.Cola;

public class ListaCola {
    NodoCola frente;
    NodoCola fin;

    public ListaCola() {
        frente = null;
        fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public void encolar(String dato) {
    	
        NodoCola nuevoNodo = new NodoCola(dato);

        if (estaVacia()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } 
        
        else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public String desencolar() {
    	
        if (estaVacia()) {
            System.out.println("La lista tipo cola esta vacia.");
            return null;
        } 
        
        else {
            String datoDesencolado = frente.dato;
            frente = frente.siguiente;
            if (frente == null) {
                fin = null;
            }
            return datoDesencolado;
        }
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    public void imprimirCola() {
    	
        if (estaVacia()) {
            System.out.println("La lista tipo cola esta vacia.");
        } 
        
        else {
            NodoCola actual = frente;
            int contador = 1;

            while (actual != null) {
                System.out.println("Elemento " + contador + ": " + actual.dato);
                actual = actual.siguiente;
                contador++;
            }
        }
    }
}
