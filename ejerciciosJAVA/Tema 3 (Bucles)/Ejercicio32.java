package Ejercicios4Bucles;

import java.util.Scanner;

/*
AUTOR: JAVIER ALEGRÍA SOBRADOS
FECHA: 07/11/2025

PROPÓSITO:
32. Hacer el ejercicio 14, pero teniendo en cuenta ahora que, si mete el número
340023, tiene 2 ceros.
 */
public class Ejercicio32 {
    static void conString() {
        System.out.println("== DETECTAR CUANTOS 0 HAY EN UNA SECUENCIA DE NÚMEROS ==\n");

        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        int num;
        int contadorCeros = 0;

        do {
            IO.println("Introduce el número "+contador);
            num = teclado.nextInt();

            String numString = String.valueOf(num); //CONVIERTO EL NÚMERO A TEXTO

            for(int i=0; i<numString.length(); i++){
                if(numString.charAt(i)=='0'){
                    contadorCeros++;
                }
            }
            contador++;
        } while (num>=0);

        IO.println("El número de 0 en la secuencia es de: "+contadorCeros);
    }

    static void conDividir() {
        System.out.println("== DETECTAR CUANTOS 0 HAY EN UNA SECUENCIA DE NÚMEROS ==\n");

        Scanner teclado = new Scanner(System.in);

        int num;
        int contadorCeros = 0;

        do {
            System.out.println("Introduce un número (negativo para terminar: ");
            num = teclado.nextInt();

            //COMPROBAR SI EL NÚMERO TIENE 0
            //RECORREMOS LOS DÍGITOS DEL NÚMERO
            int aux = num;

            while(aux>10) {
                int digito = aux%10; //Declaramos que digito es el resto de aux/10
                if(digito==0) //Si el digito es 0, sumamos 1 al contador
                    contadorCeros++;
                aux=aux/10;
            }
        } while(num>=0);

        System.out.println("El número de 0 en la secuencia es de: "+contadorCeros);
    }

    static void main() {
        System.out.println("== CON STRING ==");
        conString();
        System.out.println("== CON DIVIDIR ==");
        conDividir();
    }
}
