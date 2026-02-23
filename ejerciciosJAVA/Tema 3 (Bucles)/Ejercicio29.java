package Ejercicios4Bucles;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        int num;
        double factorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número positivo: ");
        do {
            num = sc.nextInt();
            if(num<=0)
                System.out.print("Introduce un número mayor de 0: ");
        } while(num<=0);


        System.out.print(num+"!= ");
        for (int i = num; i >= 1; i--) {
            if (i>1)
                System.out.print(i+"*");
            else
                System.out.print(i);

            factorial *= i;
        }
        System.out.print(" = "+factorial);
    }
}
