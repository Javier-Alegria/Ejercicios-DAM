package EjerciciosDiapositivas;

/*
Programa que visualice el número de días dado un mes y un
año.
 Si el mes es febrero el mensaje a visualizar será “El mes número 2 tiene 28 días
si el año no es bisiesto y 29 si lo es”.
 Para ello debe pedir por pantalla el mes y el año.
 Realiza el ejercicio utilizando la estructura switch y sin switch.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int mes;
        int anyo;
        int numDias;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el mes: ");
        mes = sc.nextInt();

        numDias = switch(mes){
            case 1,3,5,7,8,10,12-> {
                yield 31;
            }

            case 2-> {
                System.out.println("Ingrese el año: ");
                anyo = sc.nextInt();

                if((anyo%4==0 && anyo%100!=0) || anyo%400==0) {
                    yield 29;
                }
                else {
                    yield 28;
                }
            }

            case 4,6,9,11-> {
                yield 30;
            }

            default-> {
                yield -1;
            }
        };

        System.out.println(numDias == -1 ? "Mes inválido" : "El mes " + mes + " tiene " + numDias + " días");

        sc.close();
    }
}