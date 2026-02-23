package HojaEjercicios2;
/*
Programa que recoge un carácter introducido a través del teclado y determine
si dicho carácter es una letra mayúscula, minúscula o un dígito.
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void isMayus() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un carácter: ");
        char caracter = teclado.next().charAt(0);

        if (caracter >= 'a' && caracter <= 'z') {
            System.out.println("El caracter " + caracter + " es minúscula");
        }
        else if (caracter >= 'A' && caracter <= 'Z') {
            System.out.println("El caracter " + caracter + " es mayúscula");
        }
        else if (caracter >= '0' && caracter <= '9') {
            System.out.println("El caracter "+caracter+" es un caracter");
        }
        else {
            System.out.println("Caracter invalido");
        }


        /*
        System.out.println(
                Character.isUpperCase(caracter)
                ? "El carácter "+caracter+" es una mayúscula"
                : (Character.isLowerCase(caracter))?"El carácter "+caracter+" es una minúscula"
                        : (Character.isDigit(caracter))?"El carácter "+caracter+" es un dígito"
                                : "El carácter introducido no es válido"
        );

         */
    }

    public static void main(String[] args) {
        isMayus();
    }
}
