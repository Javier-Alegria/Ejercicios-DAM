/*
AUTOR: JAVIER ALEGRÍA 1 DAM
FECHA: 03/11/2025
PROPÓSITO:
    23. Hacer un programa que lea una serie de números por teclado de manera que
    cuando el número leído sea el cero ya no se introduzcan más. El programa debe
    calcular y escribir la suma de los números de la serie que son múltiplos de 5 y
    cuántos se han introducido en total (independientemente de que sean o no
    múltiplos de 5)
 */
package Ejercicios4Bucles;

import java.util.Scanner;

public class Ejercicio23 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num;
        int numTotalMultiplos = 0;
        int numTotales = 0;

        do {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();

            if(num%5==0) {
                numTotalMultiplos += num;
            }
            numTotales++;
        } while (num != 0);
        System.out.println("La suma de los números introducidos múltiplos de 25 es "+numTotalMultiplos);
        System.out.println("La cantidad de números totales introducidos es "+(numTotales -1));
    }
}
