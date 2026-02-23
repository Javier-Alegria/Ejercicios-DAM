package HojaEjercicios2;
/*
Escribe un programa que pida cod. postal e inicial de su nombre
Si el código es 19000, devuelve "Enhorabuena" y la inicial de la persona.
 */

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void codInicial() /*throws IOException*/ {
        int codPostal;
        char inicial;
        //char inicial2;

        Scanner teclado  = new Scanner(System.in);

        System.out.print("Ingrese el código postal: ");
        codPostal = teclado.nextInt();

        //Forma 1 de leer un char
        System.out.print("Introduce tu nombre: ");
        inicial = teclado.next().charAt(0);

        /*Forma 2 de leer un char
        System.out.println("Inicial");
        inicial2 =  (char) System.in.read();
        */

        if (codPostal == 19000)
            System.out.println("Enhorabuena " +inicial);
    }

    public static void main(String[]args) {
        codInicial();
    }
}
