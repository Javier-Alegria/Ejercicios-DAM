package Ejercicios4Bucles;

import java.util.Scanner;

/*
AUTOR: JAVIER ALEGRÍA
FECHA: 26/11/2025
 */
public class Ejercicio31 {
    static void main() {
        System.out.println("=== CONTADOR DE DÍGITOS PARES ===\n");
        Scanner sc = new Scanner(System.in);

        int pares = 0, entrada, contador = 1;

        do {
            System.out.println("-- Dígito "+contador+" --\n");
            System.out.print("Introduce un dígito (0 para terminar): ");
            entrada  = sc.nextInt();

            if (entrada != 0) {
                int temp = entrada;

                while (temp != 0) {
                    int digito = temp % 10;
                    temp = temp / 10;

                    if (digito % 2 == 0) {
                        pares++;
                    }
                }
                System.out.println("El número de dígitos pares en " + entrada + " es de " + pares);
                pares = 0;
            }
        } while(entrada!=0);
        System.out.println("=== FIN DEL PROGRAMA ===");
    }
}
