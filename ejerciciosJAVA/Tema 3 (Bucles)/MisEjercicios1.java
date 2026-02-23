/*
Programa que al ingresar un número por teclado, sume todos sus números por separado y los imprima
 */
package Ejercicios4Bucles;

import java.util.Scanner;

public class MisEjercicios1 {
    static void main() {
        //VARIABLES
        Scanner teclado = new Scanner(System.in);

        int num;
        int suma = 0;

        System.out.println("=== SUMAR NÚMEROS DE UN NÚMERO ===");

        System.out.print("\nIngrese un número: ");
        num = teclado.nextInt();

        System.out.print("La suma de los dígitos de "+num+" es: ");

        int numTemp = 0;

        while (num != 0) {
            int digito2 = num % 10;       // último dígito
            numTemp = numTemp * 10 + digito2;
            num /= 10;                   // quitar el último dígito
        }

        while(numTemp != 0) {
            int digito = numTemp % 10;

            suma += digito;

            numTemp /= 10;

            if(numTemp == 0)
                System.out.print(digito);
            else
                System.out.print(digito + " + ");
        }
        System.out.print(" = "+suma);
    }
}
