package HojaEjercicios2;

import java.util.Scanner;

/*
Escribe un programa que pida un año por teclado y determine si es bisiesto.
Un año es bisiesto si es divisible por 4 excepto los principios de año (los
divisibles por 100), que para ser bisiestos deben de ser divisibles también por
400.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int anyo = teclado.nextInt();

        System.out.println(
                ((anyo%4==0 && anyo%100!=0)||(anyo%400==0))
                        ? "El "+anyo+" es bisiesto"
                        : "El "+anyo+" no es bisiesto"
        );
    }
}
