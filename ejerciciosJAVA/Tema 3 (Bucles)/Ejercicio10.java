package Ejercicios4Bucles;

import java.util.Scanner;

/*
10. Escribe un programa que lea constantemente números por teclado, y determine
para cada número tecleado si es positivo y par. El programa debe terminar cuando
el usuario teclea el número 0.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduzca un número: ");
            num = teclado.nextInt();
            if (num%2==0 && num>0)
                System.out.println("El número es positivo & par");
        } while(num != 0);
    }
}
