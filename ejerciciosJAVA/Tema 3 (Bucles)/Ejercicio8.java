/*
AUTOR: JAVIER ALEGRÍA SOBRADOS 1 DAM
 */
package Ejercicios4Bucles;

import java.util.Scanner;

/*
8. Escribe un programa que lea cinco valores naturales y calcule su producto. El
número máximo de variables que se pueden utilizar es 3.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anterior=1;
        int numero;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el número " + i + ": ");
            numero = sc.nextInt();
            anterior *= numero;
        }

        System.out.println("El producto de los cinco números es: " + anterior);
    }
}
