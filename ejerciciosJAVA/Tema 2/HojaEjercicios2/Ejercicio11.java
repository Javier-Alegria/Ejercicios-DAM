package HojaEjercicios2;

import java.util.Scanner;

/*
Haz un programa que nos devuelva cuantas campanadas da un reloj desde la
hora H (introducida por el usuario) hasta las 12 horas. Suponiendo que por
cada hora que pasa da una sola campanada y que la hora que introduce está en
el formato de 0-24 horas. Si introduce un 7 daría desde la 7 hasta las 12 (6
campanadas), y si introduce 18 daría desde las 18 hasta las 0:0 horas 7
campanadas.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Hora introducida por el usuario
        System.out.print("Introduce una hora (formato 24h): ");
        int hora = teclado.nextInt();
        int campanadas;
        int objetivoHoras = 0;

        if (hora >= 0 && hora <= 24) {
            if (hora < 12) {
                objetivoHoras = 12;
            } else {
                objetivoHoras = 24;
            }
            campanadas = objetivoHoras - (hora-1);

            System.out.println("El reloj dará "+campanadas+" campanadas");
        }
        else {
            System.out.println("La hora introducida no es valida"       );
        }
    }
}
