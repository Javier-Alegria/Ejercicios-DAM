package Ejercicios4Bucles;

import java.util.Scanner;

/*
2. Escribe un programa que escriba la palabra "hola" tantas veces como sea
especificado por un número introducido por el teclado
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("introduce un número: ");
        int numeroHola = teclado.nextInt();

        int i = 0;

        while(i < numeroHola){
            System.out.println((i+1)+": Hola");
            i++;
        }
    }
}
