package Ejercicios4Bucles;
/*
14. Escribe un programa que cuente el número de ceros aparecidos en una secuencia
de números enteros terminada en un número negativo. Solo cuenta ceros cuando
aparece el número 0.
 */
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
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
}