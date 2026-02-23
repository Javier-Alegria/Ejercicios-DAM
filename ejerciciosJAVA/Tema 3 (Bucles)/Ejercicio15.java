/*
AUTOR: JAVIER ALEGRÍA 1 DAM
ÚLTIMA MODIFICACIÓN: 02/11/2025
 */
package Ejercicios4Bucles;

import java.util.Scanner;
/*
15. Se desea una estadística de los pesos de los alumnos de un colegio de acuerdo con
los siguientes criterios:
 Alumnos de menos de 40 Kg.
 Alumnos de entre 40 y 50 Kg.
 Alumnos de más de 60 Kg.
La entrada de los pesos de los alumnos se terminará cuando al preguntar al usuario
si desea introducir más pesos, este, responde que no.
 */
public class Ejercicio15 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int peso;
        char opcion;

        int menos40 = 0;
        int entre40y50 = 0;
        int mas60 = 0;

        do {
            do { //Pedir el peso del alumno (Se repite si el peso es negativo)
                System.out.print("Introduzca el peso del alumno: ");
                peso = teclado.nextInt();
                if(peso < 0){
                    System.out.println("El peso no puede ser negativo");
                }
            } while (peso < 0);

            if(peso<40)
                menos40++;

            else if(peso>40&&peso<60)
                entre40y50++;

            else
                mas60++;

            do { //Pedir otro al usuario si quiere introducir otro peso
                System.out.print("¿Quiere introducir otro peso? (s/n): ");
                opcion = teclado.next().toLowerCase().charAt(0);
                if(opcion != 's' && opcion != 'n'){
                    System.out.println("Responda 's' o 'n'");
                }
            } while (opcion != 's' && opcion != 'n');
        } while (opcion == 's');

        float totalP = menos40+entre40y50+mas60; //Total de alumnos

        System.out.println("Alumnos de menos de 40kg: "+menos40+" ("+(menos40/totalP*100)+"%)"); //alumnos y porcentaje
        System.out.println("Alumnos entre 40kg y 60kg: "+entre40y50+" ("+(entre40y50/totalP*100)+"%)");
        System.out.println("Alumnos de más de 60kg: "+mas60+" ("+(mas60/totalP*100)+"%)");
    }
}