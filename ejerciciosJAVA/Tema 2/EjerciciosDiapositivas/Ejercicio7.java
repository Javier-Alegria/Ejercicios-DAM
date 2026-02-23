package EjerciciosDiapositivas;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        System.out.println("1. CUADRADO");
        System.out.println("2. RECTÁNGULO");
        System.out.println("3. TRIÁNGULO");
        System.out.println("4. CIRCULO");

        //Inicializo el scanner en la variable sc
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.print("INTRODUCE UNA OPCIÓN: ");
        opcion = sc.nextInt();

        switch(opcion) {
            case 1 -> System.out.println("OPCIÓN INTRODUCIDA: CUADRADO");
            case 2 -> System.out.println("OPCIÓN INTRODUCIDA: RECTÁNGULO");
            case 3 -> System.out.println("OPCIÓN INTRODUCIDA: TRIÁNGULO");
            case 4 -> System.out.println("OPCIÓN INTRODUCIDA: CIRCULO");
            default -> System.out.println("OPCIÓN INVALIDA");
        }
    }
}
