/*
AUTOR: JAVIER ALEGRÍA SOBRADOS
FECHA: 12/11/2025

PROPÓSITO:

26. Dado un número N entero positivo que se introducirá por teclado, genera una tabla
formada por los cuadrados y los cubos de los números desde 1 hasta N.

Ejemplo para N = 5:
Número      Cuadrado    Cubo
1           1           1
2           4           8
3           9           27
4           16          64
5           25          125

*/

package Ejercicios4Bucles;

import java.util.Scanner;

public class Ejercicio26 {
    static void main() {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        if(num>0){
            // GENERAR LA TABLA
            System.out.println("Numero\t\t\tCuadrado\t\t\tCubo");
            for (int i = 1; i <= num; i++) {
                System.out.println(i+"\t\t\t"+Math.pow(i,2)+"\t\t\t"+Math.pow(i,3));
            }

            System.out.printf("Hola");
        }
    }
}
