/*
AUTOR: JAVIER ALEGRÍA 1 DAM
ÚLTIMA MODIFICACIÓN: 02/11/2025
 */
package Ejercicios4Bucles;
/*16. Visualiza por pantalla todos los divisores de un número entero introducido por
teclado.
 */
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num;

        do {
            System.out.print("Introduzca un número entero: ");
            num = teclado.nextDouble();
            if (num%1!=0) {
                System.out.println("El número no es entero");
            }
        } while (num%1!=0);

        System.out.println("Los divisores del "+num+" son:");
        for(int i=1; i<num; i++){
            if(num%i==0){
                System.out.print(i+", ");
            }
        }
        System.out.println(num);
    }
}