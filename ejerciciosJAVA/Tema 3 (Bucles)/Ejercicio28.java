/*
AUTOR: JAVIER ALEGRÍA
FECHA: 15/11/2025

PROPÓSITO:
28 Hacer un programa que muestre todos los resultados posibles que se pueden dar al lanzar dos dados.
 */
package Ejercicios4Bucles;

public class Ejercicio28 {
    static void main() {
        System.out.println("=== RESULTADOS POSIBLES AL LANZAR DOS DADO ===");

        for(int dado1 = 1 ; dado1<=6; dado1++) {
            for (int dado2 = 1; dado2<=6; dado2++) {
                System.out.println("Dado 1: "+dado1 + ", Dado 2: " + dado2);
            }
        }
    }
}
