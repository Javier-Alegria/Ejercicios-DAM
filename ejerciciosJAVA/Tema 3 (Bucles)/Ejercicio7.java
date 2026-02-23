/*
AUTOR: JAVIER ALEGRÍA SOBRADOS 1 DAM
 */
package Ejercicios4Bucles;
/*
7. Hacer un programa que lea una línea y calcule el número de letras y de dígitos
encontrados en ella. El resultado se mostrará por pantalla.
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void conDoWhile() {
        Scanner teclado = new Scanner(System.in);

        String linea;
        int numeroLetras=0;
        int numeroNumeros=0;

        System.out.println("Introduzca una línea: ");
        linea = teclado.nextLine().toLowerCase();

        int i=0;

        do {
            if (linea.charAt(i) >= 'a' && linea.charAt(i) <= 'z') {
                numeroLetras++;
            }
            else if (linea.charAt(i) >= '0' && linea.charAt(i) <= '9') {
                numeroNumeros++;
            }

            i++;
        } while(i < linea.length());
        System.out.println("El numero de letras es " + numeroLetras);
        System.out.println("El numero de números es " + numeroNumeros);
    }

    public static void conWhile() {
        Scanner teclado = new Scanner(System.in);

        String linea;
        int numeroLetras=0;
        int numeroNumeros=0;

        System.out.println("Introduzca una línea: ");
        linea = teclado.nextLine().toLowerCase();

        int i=0;

        while (i < linea.length()) {
            if (linea.charAt(i) >= 'a' && linea.charAt(i) <= 'z') {
                numeroLetras++;
            }
            else if (linea.charAt(i) >= '0' && linea.charAt(i) <= '9') {
                numeroNumeros++;
            }

            i++;
        }
        System.out.println("El numero de letras es " + numeroLetras);
        System.out.println("El numero de números es " + numeroNumeros);
    }

    public static void conFor() {
        Scanner teclado = new Scanner(System.in);

        String linea;
        int numeroLetras=0;
        int numeroNumeros=0;

        System.out.println("Introduzca una línea: ");
        linea = teclado.nextLine().toLowerCase();

        for (int i = 0; i < linea.length(); i++) {
            if (linea.charAt(i) >= 'a' && linea.charAt(i) <= 'z') {
                numeroLetras++;
            }
            else if (linea.charAt(i) >= '0' && linea.charAt(i) <= '9') {
                numeroNumeros++;
            }
        }
        System.out.println("El numero de letras es " + numeroLetras);
        System.out.println("El numero de números es " + numeroNumeros);
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
