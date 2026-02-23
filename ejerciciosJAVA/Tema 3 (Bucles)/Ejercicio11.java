package Ejercicios4Bucles;

import java.util.Scanner;

/*
11. Escribe un programa que lea constantemente parejas de números insertados por
teclado, y los escriba en pantalla, hasta que los dos números insertados en una
pareja sean iguales.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        do {
            System.out.println("--------------------------------------------");
            System.out.print("Introduce una pareja de números (numero1 numero2): ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.println("Pareja de números: " + num1 + ", " + num2);

        } while (num1 != num2);

        System.out.println("Los dos números son iguales, fin del programa");
        sc.close();
    }
}