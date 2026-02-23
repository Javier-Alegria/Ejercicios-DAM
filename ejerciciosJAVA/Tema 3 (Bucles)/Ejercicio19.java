//AUTOR JAVIER ALEGRÍA SOBRADOS 1 DAM
package Ejercicios4Bucles;

import java.util.Scanner;

/*
19. Calcula el cuadrado de los X primeros números pares (Donde X es un valor que
se le pide al usuario).
 */
public class Ejercicio19 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int numero=2; //Primer número par
        int entrada; // número de veces que el programa calcula el par de "número"

        IO.print("Introduzca un número: ");
        entrada=teclado.nextInt(); //leemos número

        do {
            IO.println("El cuadrado de "+numero+" es "+Math.pow(numero,2));
            numero+=2;
        } while (numero<=entrada);
    }
}