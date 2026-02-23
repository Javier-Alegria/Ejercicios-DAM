package HojaEjercicios2;

/*
(Continuación del ejercicio anterior). El mismo programa, pero
independientemente del código postal, que escriba "Final del programa" por la
pantalla antes de acabar.
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void codInicial() {
        Scanner teclado  = new Scanner(System.in);

        System.out.print("Ingrese el código postal: ");
        int codPostal = teclado.nextInt();

        //Forma 1 de leer un char
        System.out.print("Introduce tu nombre: ");
        char inicial = teclado.next().charAt(0);

        if (codPostal == 19000)
            System.out.println("Enhorabuena " +inicial);

        System.out.println("Final del programa");
    }

    public static void main(String[]args) {
        codInicial();
    }
}
