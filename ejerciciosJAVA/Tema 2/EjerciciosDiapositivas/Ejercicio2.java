package EjerciciosDiapositivas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Byte nota;

        System.out.println("Introduce una nota: ");
        nota = sc.nextByte();

        if (nota < 0 || nota > 10)
            System.out.println("Error");
        else if (nota < 5)
            System.out.println("Suspenso");
        else
            System.out.println("Aprobado");
    }
}
