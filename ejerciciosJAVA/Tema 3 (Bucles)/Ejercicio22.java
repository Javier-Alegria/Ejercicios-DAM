/*
AUTOR: JAVIER ALEGRÍA 1 DAM
FECHA: 27/10/2025
PROPÓSITO:
    22. Calcular el sueldo semanal que recibirán un grupo de trabajadores, introduciendo
        por teclado el número de horas trabajadas por cada uno y el precio de cada hora.
        Si trabajan más de 40 horas semanales, las horas extra (por encima de 40) se pagan
        un 50% más del precio normal de la hora.
        El programa finalizará al introducir horas menor que 0.

PASOS:
    1. Introducir el número de horas semanales trabajadas por CADA TRABAJADOR
    2. Introducir el precio de cada hora
    3. IF horasTrabajadas > 40, las horas extra (más de 40) se pagan un 50% más del precioHora
    4. Programa finaliza al introducir horas < 0
 */
package Ejercicios4Bucles;

import java.util.Scanner;

public class Ejercicio22 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int trabajador=1;

        int horasTrabajadas;
        double precioHora;

        double sueldoSemanal;

        do {
            IO.println("\n----- TRABAJADOR "+trabajador+" -----");
            System.out.print("Introduzca el número de horas trabajadas por el trabajador "+trabajador+": ");
            horasTrabajadas = teclado.nextInt();
            if(horasTrabajadas>0) {
                do {
                    System.out.print("Introduce el precio de cada hora: ");
                    precioHora = teclado.nextInt();
                    if (precioHora<=0)
                        System.out.println("Introduce un precio por hora válido");
                } while (precioHora<=0);

                sueldoSemanal = (horasTrabajadas > 40)
                        ? (precioHora*40) + ((horasTrabajadas - 40) * (precioHora * 1.5))
                        : precioHora*horasTrabajadas;

                System.out.println("El sueldo semanal del trabajador "+trabajador+" es "+sueldoSemanal);

                trabajador++;
            }
        } while(horasTrabajadas>0);
        System.out.println("Ha introducido menos de 0 en las horas trabajadas, el programa termina");
    }
}