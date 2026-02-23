package HojaEjercicios2;

import java.util.Scanner;

/*
Obtiene la edad de una persona
si edad < 35 responde "joven"
si edad >= 30 responde "Viejo"
 */
public class Ejercicio5 {
    public static void viejoJoven() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = teclado.nextInt();

        if (edad < 35)
            System.out.println("Joven");
        if (edad >= 30)
            System.out.println("Viejo");
    }
    public static void main(String[] args) {
        viejoJoven();
    }
}
