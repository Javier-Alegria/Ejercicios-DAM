package Ejercicios4Bucles;

import java.util.Scanner;
/*
21. De un conjunto de N números (N se introducirá por teclado), determina:
 Cuantos son menores que 15.
 Cuantos están entre 15 y 50 (ambos inclusive).
 Cuantos son mayores de 50.
 */
public class Ejercicio21 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        char respuesta;

        int menor15=0;
        int entre15y50=0;
        int mayor50=0;

        do {
            IO.println("Introduce un número");
            int numero=teclado.nextInt();

            do {
                IO.println("¿Quiere introducir otro número? (s/n): ");
                respuesta = teclado.next().toLowerCase().charAt(0);
            } while(respuesta != 's' && respuesta != 'n');

            if(numero < 15)
                menor15++;
            else if(numero >= 15 && numero <=50)
                entre15y50++;
            else
                mayor50++;

        } while(respuesta == 's');

        IO.println("Hay "+menor15+" personas menores de 15 años, "+entre15y50+" personas entre 15 y 50 años" +
                " y "+mayor50+" personas mayores de 50");
    }
}