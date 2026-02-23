package Ejercicios4Bucles;

import java.util.Scanner;

/*
4. Realizar un programa que lea un número y devuelve la suma desde 1 hasta el
número leído.
 */
public class Ejercicio4 {
    public static void conDoWhile() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroIntroducido = teclado.nextInt();

        int operando=1;

        do {
            System.out.print(operando+" ");
        } while (operando < numeroIntroducido);
        teclado.close();
    }

    public static void conWhile() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroIntroducido = teclado.nextInt();

        int operandoAnterior=0;
        int operando=0;

        while (operando < numeroIntroducido){
            operandoAnterior = operando;
            operando++;
            System.out.println(operandoAnterior+" + 1 = "+operando);
        }
        teclado.close();
    }

    public static void conFor() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroIntroducido = teclado.nextInt();

        int resultado=0;

        if (numeroIntroducido>0){
            for(int i=1;i<=numeroIntroducido;i++){
                resultado += i;
            }
            System.out.println("La suma es de "+resultado);
        }
        else {
            System.out.println("No puedes meter números negativos");
            conFor();
        }
    }

    public static void main(String[] args) {
        conFor();
    }
}
