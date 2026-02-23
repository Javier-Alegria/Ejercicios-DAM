package HojaEjercicios2;
/*
Escribe un programa que recoja dos números y una operación ('+', '-', '*', '/', '^')
y devuelva el resultado de aplicar la operación a los dos números
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void operation() {
        System.out.print("Introduce el número 1: ");
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el número 2: ");
        int numero2 = teclado.nextInt();

        System.out.println("Introduce el operando (+, -, *, /, ^): ");
        switch(teclado.next()) {
            case "+":
                System.out.println(numero1 + numero2);
                break;
            case "-":
                System.out.println(numero1 - numero2);
                break;
            case "*":
                System.out.println(numero1 * numero2);
                break;
            case "/":
                System.out.println(numero1 / numero2);
                break;
            case "^":
                double decimal = Math.pow(numero1, numero2);;
                int entero = (int) decimal;
                System.out.println(entero);
                break;
            default:
                System.out.println("Simbolo no posible");
        }
    }

    public static void main(String[] args) {
        operation();
    }
}
