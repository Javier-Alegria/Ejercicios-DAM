/*
AUTOR: JAVIER ALEGRÍA SOBRADOS 1 DAM
 */
package Ejercicios4Bucles;

import java.util.Scanner;

/*
9. Escribe un programa que lea constantemente números por teclado, y muestre cada
número por pantalla, hasta que el usuario teclee el número 0.
 */
public class Ejercicio9 {
    public static void conDoWhile() {
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduzca un número: ");
            num = teclado.nextInt();
            if (num!=0)
                System.out.println(num);
        } while (num != 0);
    }
    public static void conWhile() {
        Scanner teclado = new Scanner(System.in);
        int num=1;
        while (num != 0){
            System.out.print("Introduzca un número: ");
            num = teclado.nextInt();
            if (num!=0)
                System.out.println(num);
        }
    }
    public static void conFor() {
        Scanner teclado = new Scanner(System.in);

        for(int num=1;num!=0;num++){
            System.out.print("Introduzca un número: ");
            num = teclado.nextInt();
            if (num!=0)
                System.out.println(num);
        }
    }
    public static void main(String[] args) {
        System.out.println("----- CON DO WHILE -----");
        conDoWhile();
        System.out.println("----- CON FOR -----");
        conFor();
        System.out.println("----- CON WHILE -----");
        conWhile();
    }
}
