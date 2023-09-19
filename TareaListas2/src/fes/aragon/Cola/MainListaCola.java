package fes.aragon.Cola;

import java.util.Scanner;

public class MainListaCola {

    public static void main(String[] args) {
        ListaCola listaCola = new ListaCola();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ver la cola");
            System.out.println("2. Encolar/Agregar dato");
            System.out.println("3. Desencolar/Eliminar dato");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (listaCola.estaVacia()) {
                        System.out.println("La cola esta vacia.");
                    } 
                    
                    else {
                        System.out.println("Esta es la cola:");
                        listaCola.imprimirCola();
                    }
                    break;

                case 2:
                    System.out.println("Dame el dato a encolar/agregar:");
                    String datoEncolar = scanner.next();
                    listaCola.encolar(datoEncolar);
                    break;

                case 3:
                    String datoDesencolado = listaCola.desencolar();
                    if (datoDesencolado != null) {
                        System.out.println("Se desencolo el dato: " + datoDesencolado);
                    }
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);

                default:
                	System.out.println("Eh? Que royo eso ni existe bro, porfavor lee bien");
            }
        }
    }
}