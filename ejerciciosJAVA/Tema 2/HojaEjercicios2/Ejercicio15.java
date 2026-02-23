package HojaEjercicios2;
/*
15. Programa que pida por teclado la fecha de nacimiento de una persona (día,
mes, año) y calcule su número de la suerte. El número de la suerte se calcula
sumando el día, mes y año de la fecha de nacimiento y a continuación
sumando las cifras obtenidas en la suma. Por ejemplo: Si la fecha de
nacimiento es 22/03/1980 Calculamos el número de la suerte así:
22+03+1980 = 2005 2+0+0+5 = 7. Número de la suerte: 7
 */
/*
1- pedir la fecha de nacimiento (día, mes, año)
2- ((día + mes + año = resultado) suma cifras de resultado)
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, anyo;
        System.out.print("Ingrese la fecha de su nacimiento (Día mes año): ");

        dia = sc.nextInt();
        mes = sc.nextInt();
        anyo = sc.nextInt();

        int resultado1 = dia + mes + anyo;

        int cifra1 = resultado1 / 1000;
        int cifra2 = (resultado1 / 100)%10;
        int cifra3 = (resultado1 / 10)%10;
        int cifra4 = resultado1 %10;

        System.out.println("Tu número de la suerte es el: " + (cifra1 + cifra2 + cifra3 + cifra4));

        /*Convirtiendo el int a string (NO FUNCIONA COMO ESTÁ AHORA)
        String resultadoSuerte = String.valueOf(resultado1);
        int cifra11 = resultadoSuerte.charAt(0);
        int cifra22 = resultadoSuerte.charAt(1);
        int cifra33 = resultadoSuerte.charAt(2);
        int cifra44 = resultadoSuerte.charAt(3);

        System.out.println("Tu número de la suerte convirtiendo a string es el: "+resultadoSuerte);
        */
    }
}
