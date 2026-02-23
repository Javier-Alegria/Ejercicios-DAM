/*
AUTOR: JAVIER ALEGRÍA 1 DAM
ÚLTIMA MODIFICACIÓN: 04/11/2025

PROPÓSITO:
    24. Escribir un programa que lea una secuencia de datos numéricos de longitud
    indefinida de manera que cuando el número introducido sea el cero cesará la
    entrada de dicha secuencia. El programa debe imprimirnos la media de todos, el
    mayor y el menor.
 */
package Ejercicios4Bucles;

import java.util.Scanner;

public class Ejercicio24 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contador = 0;
        int mayor = 0;
        int menor = 0;
        int numero;
        boolean primero = true;

        System.out.println("Introduce números (0 para terminar):");

        do {
            numero = sc.nextInt();

            if (numero != 0) {
                suma += numero;
                contador++;

                if (primero) {
                    mayor = numero;
                    menor = numero;
                    primero = false;
                } else {
                    if (numero > mayor) {
                        mayor = numero;
                    }

                    if (numero < menor) {
                        menor = numero;
                    }
                }
            }
        } while (numero != 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("\nResultados:");
            System.out.println("Media: " + media);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        } else {
            System.out.println("No se introdujeron números.");
        }

        sc.close();
    }
}
