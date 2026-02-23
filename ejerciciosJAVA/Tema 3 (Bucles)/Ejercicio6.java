/*
AUTOR: JAVIER ALEGRÍA SOBRADOS 1 DAM
 */
package Ejercicios4Bucles;
/*
6. Calcula el cuadrado de los 10 primeros números pares (del 2 al 20)
 */

public class Ejercicio6 {
    public static void conDoWhile() {
        int numero=2;
        do {
            System.out.println("El cuadrado de "+numero+" es "+Math.pow(numero,2));
            numero+=2;
        } while(numero<=20);
    }

    public static void conWhile() {
        int numero=2;
        while (numero <= 20) {
            System.out.println("El cuadrado de "+numero+" es "+Math.pow(numero,2));
            numero+=2;
        }
    }

    public static void conFor() {
        for (int numero=2; numero <= 20; numero+=2) {
            System.out.println("El cuadrado de "+numero+" es "+Math.pow(numero,2)); //Math.pow calcula base/exponente (Math.pow(base,exponente))
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
