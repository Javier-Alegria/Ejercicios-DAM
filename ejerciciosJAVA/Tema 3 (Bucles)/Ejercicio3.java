package Ejercicios4Bucles;

import java.util.Scanner;

/*
3. Haz un programa que pida la edad de 10 alumnos y muestre en pantalla el número
de alumnos que son mayores de edad y la edad del mayor.
 */
public class Ejercicio3 {
    public static void conUnDoWhile() {
        Scanner teclado = new Scanner(System.in);

        int contadorMayores=0;
        int contadorFinal=1;
        int edadMayor=0;

        do {
            System.out.print("Ingrese la edad del alumno "+contadorFinal+": ");
            int edad = teclado.nextInt();

            if (edad>=18)
                contadorMayores++;

            if (edad > edadMayor) {
                edadMayor = edad;
            }

            contadorFinal++;

        } while (contadorFinal <= 10);

        System.out.println("El número de mayores de edad es "+contadorMayores+", y el mas mayor tiene "+edadMayor+" años");
        teclado.close();
    }

    public static void conUnFor(){
        Scanner teclado = new Scanner(System.in);

        int contadorMayores2=0;
        int edadMayor2=0;

        for (int contFinal = 1; contFinal <= 10; contFinal++) {
            System.out.print("Ingrese la edad del alumno "+contFinal+": ");
            int edad2 = teclado.nextInt();

            if (edad2>=18)
                contadorMayores2++;

            if (edad2 > edadMayor2) {
                edadMayor2 = edad2;
            }
        }

        System.out.println("El número de mayores de edad es "+contadorMayores2+", y el mas mayor tiene "+edadMayor2+" años");
        teclado.close();
    }

    public static void conUnWhile(){
        Scanner teclado = new Scanner(System.in);

        int contadorMayores3=0;
        int edadMayor3=0;
        int contFin=1;

        while (contFin<=10) {
            System.out.print("Ingrese la edad del alumno "+contFin+": ");
            int edad3 = teclado.nextInt();

            if (edad3>=18)
                contadorMayores3++;

            if (edad3 > edadMayor3) {
                edadMayor3 = edad3;
            }

            contFin++;
        }

        System.out.println("El número de mayores de edad es "+contadorMayores3+", y el mas mayor tiene "+edadMayor3+" años");
        teclado.close();

    }

    public static void main(String[] args) {
        System.out.println("¿Con que método quiere hacer el cálculo de los alumnos?");

        String[] opciones = {
                "1: Con un Do For", "2: Con un For", "3: Con un While"
        };

        for (String N : opciones) {
            System.out.println(N);
        }
        System.out.println("-------------");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt) {
            case 1->conUnDoWhile();
            case 2->conUnFor();
            case 3->conUnWhile();
            default -> System.out.println("Opción incorrecta");
        }
    }
}
