package Ejercicios4Bucles;

import java.util.Scanner;

/*
12. Hacer un programa que pida la edad, el sexo y estado civil de los empleados de
una empresa, hasta pulsar una edad igual a 0. El programa mostrará el número de
varones mayores de 30 años y el número de personas mayores de 60.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        char sexo;
        char estadoCivil;

        int nEmpleado=1;

        int varonesMayores30=0;
        int mayores60=0;

        do {
            System.out.println("\n----- EMPLEADO "+nEmpleado+" -----");

            do { //LEO LA EDAD DEL EMPLEADO
                System.out.print("Introduzca la edad: ");
                edad = sc.nextInt();
                sc.nextLine();
            } while (edad<0); //SI LA EDAD ES MENOR DE 0, REPITO EL BUCLE AL SER UNA EDAD INCORRECTA

            if (edad!=0){
                do { //LEO EL SEXO DEL EMPLEADO Y REPITO EL BUCLE HASTA QUE SEA UN VALOR h O m
                    System.out.print("Introduzca el sexo de el empleado "+nEmpleado+" [h,m]: ");
                    sexo = sc.nextLine().toLowerCase().charAt(0);
                } while(sexo != 'h' && sexo != 'm');

                do { //LEO EL ESTADO CIVIL DE LA PERSONA Y REPITO EL BUCLE HASTA QUE LA ENTRADA SEA s,c,v O d
                    System.out.print("Introduzca el estado civil [s,c,v,d]: ");
                    estadoCivil = sc.nextLine().charAt(0);
                } while(estadoCivil !='s'&&estadoCivil!='c'&&estadoCivil!='v'&&estadoCivil!='d');

                if (sexo == 'h' && edad > 30) varonesMayores30++;
                if (edad > 60) mayores60++;
            }

            nEmpleado++;
        } while(edad != 0);

        System.out.println("\n----- RESULTADOS DE EMPLEADOS -----");
        System.out.println("El número de varones mayores de 30 es "+varonesMayores30);
        System.out.println("El número de personas mayores de 60 es "+mayores60);
    }
}
