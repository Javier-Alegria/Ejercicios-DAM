/*
AUTOR: JAVIER ALEGRÍA SOBRADOS
FECHA: 12/11/2025

PROPÓSITO:
27. Visualiza por pantalla la suma de los números pares y la suma de los impares
desde 1 hasta 100.
 */
package Ejercicios4Bucles;

public class Ejercicio27 {
    static void main() {
        System.out.println("== SUMAR NÚMEROS PARES E IMPARES DEL 1 AL 100 ==");

        int sumPares = 0;
        int sumImpares = 0;

        for(int i = 1; i<=100; i++){
            if(i%2==0)
                sumPares += i;
            else
                sumImpares += i;
        }
        System.out.println("La suma de los números pares es "+sumPares+"\n");
        System.out.println("La suma de los números impares es "+sumImpares);
    }
}
