package Ejercicios4Bucles;
/*
13. Escribe un programa que lea dos números por teclado y escriba por pantalla todos
los números comprendidos entre ellos, empezando por el número primero
insertado.
 */
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;

        do { //DETECTAMOS SI EL NÚMERO 1 ES MENOR QUE EL NÚMERO 2, Y SI LO ES, SE REPITE HASTA QUE SE CUMPLA
            System.out.print("Introduce el número 1: ");
            num1 = teclado.nextInt();
            System.out.print("Introduce el número 2: ");
            num2 = teclado.nextInt();

            if (num1>num2){System.out.println("El número 1 debe ser menor que el número 2");}
        } while(num1>num2);

        while(num1<=num2){ //IMPRIME EL NÚMERO MÁS 1 HASTA QUE num1 SEA MAYOR QUE num2
            if(num1<num2){
                System.out.print(num1+", ");
                num1++;
            }
            else {
                System.out.print(num1);
                num1++;
            }
        }
    }
}
