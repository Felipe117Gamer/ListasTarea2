package fes.aragon.Pila;

import java.util.Scanner;

public class MainListaPila {
    public static void main(String[] args) {
        ListaPila listaPila = new ListaPila();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ver la lista pila");
            System.out.println("2. Apilar/Agregar dato");
            System.out.println("3. Desapilar/Quitar dato");
            System.out.println("4. Salir");
            

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    listaPila.imprimirPila();
                    break;

                case 2:
                    System.out.println("Dame el dato a apilar/Agregar:");
                    String valorApilar = scanner.next();
                    listaPila.push(valorApilar);
                    break;

                case 3:
                    String datoDesapilado = listaPila.pop();
                    if (datoDesapilado != null) {
                        System.out.println("Se desapilo/Quito el dato: " + datoDesapilado);
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