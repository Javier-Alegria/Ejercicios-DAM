package EjerciciosDiapositivas;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18){
            System.out.println("Soy mayor de 18");
        }
        else if (edad >= 6){
            System.out.println("Soy menor de 18");
            System.out.println("Soy mayor de 6");
        }
        else{
            System.out.println("Soy menor de 6");
        }
    }
}
