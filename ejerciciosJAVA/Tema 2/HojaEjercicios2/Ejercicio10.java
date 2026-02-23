package HojaEjercicios2;

import java.util.Scanner;
/*
Hacer un programa que pida al usuario 3 números reales y muestre en pantalla
el menor de los 3 números.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        double numero1, numero2, numero3;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número real 1: ");
        numero1 = teclado.nextDouble();

        System.out.print("Introduce el número real 2: ");
        numero2 = teclado.nextDouble();

        System.out.print("Introduce el número real 3: ");
        numero3 = teclado.nextDouble();

        System.out.println(
                (numero1 < numero2 && numero1 < numero3)
                        ?"El número más pequeño es: "+numero1
                        :(numero2 < numero1 && numero2 < numero3)
                            ?"El número más pequeño es: "+numero2
                            :"El número más pequeño es: "+numero3
        );
    }
}