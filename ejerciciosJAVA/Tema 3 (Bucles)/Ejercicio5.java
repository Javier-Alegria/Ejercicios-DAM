/*
AUTOR: JAVIER ALEGRÍA SOBRADOS 1 DAM
 */
package Ejercicios4Bucles;
/*
5. Programa que visualice los caracteres cuyo código ascii se encuentre entre el 32
y el 255. Usar un bucle for.
 */
public class Ejercicio5 {
    public static void conFor() {
        for (int numero = 32; numero < 255; numero++) {
            char caracter_ascii = (char) numero;
            System.out.println("El carácter para el código " + numero + " es: " + caracter_ascii);
        }
    }

    public static void conWhile() {
        int numero = 32;
        while (numero < 255) {
            char caracter_ascii = (char) numero;
            System.out.println("El carácter para el código " + numero + " es: " + caracter_ascii);
            numero++;
        }
    }

    public static void conDoWhile() {
        int numero = 32;
        do {
            char caracter_ascii = (char) numero;
            System.out.println("El carácter para el código " + numero + " es: " + caracter_ascii);
            numero++;
        } while (numero < 255);
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
