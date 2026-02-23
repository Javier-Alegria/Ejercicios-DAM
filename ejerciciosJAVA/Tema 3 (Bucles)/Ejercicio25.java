/*
AUTOR: JAVIER ALEGRÍA 1 DAM
MODIFICACIÓN: 5/11/2025

PROPÓSITO:
    25. Escribir un programa que lea un carácter y un número por teclado y que imprima
    una línea con N veces ese carácter, donde N es un número leído por teclado. Por
    ejemplo, después de teclear ‘*’ y 3 el programa imprimirá ‘***’. Además, el
    programa verificará si el número introducido es correcto (mayor que cero e
    inferior a la longitud de una línea).

    PASOS:

    1. leer un carácter y un número "N"
    2. verificar si N es correcto (Mayor de 0 y menor que una línea)
    3. imprimir N veces ese carácter
 */
package Ejercicios4Bucles;

import java.util.Scanner;

public class Ejercicio25 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char x;

        do {
            int multiplicador;
            char caracter;

            System.out.print("Ingrese un carácter: "); //LEER UN CARÁCTER A MULTIPLICAR
            caracter = sc.nextLine().charAt(0);

            do { //LEEMOS EL NÚMERO MULTIPLICADOR
                System.out.print("Ingrese un número mayor de 0: ");
                multiplicador = sc.nextInt();
                if(multiplicador<0) //SI EL NÚMERO INTRODUCIDO ES MENOR DE 0, MOSTRAR MENSAJE DE ERROR
                    System.out.println("Entrada invalida");
            } while(multiplicador<0);

            System.out.println("\n\n");

            for(int i=0; i<multiplicador; i++){
                System.out.print(caracter);
            }

            sc.nextLine();

            do {
                System.out.println("\n¿Quiere repetir? (s/n): ");
                x = sc.nextLine().toLowerCase().charAt(0);
                if(x != 's' && x != 'n')
                    System.out.println("Entrada invalida");
            } while(x != 's' && x != 'n');
        } while(x=='s');
    }
}
