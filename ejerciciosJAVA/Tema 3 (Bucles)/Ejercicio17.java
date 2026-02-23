package Ejercicios4Bucles;
/*
17. Hacer un programa que muestre los números del 1 al 200 que sean divisibles por
2 y 3.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        for (int i=1; i<=200; i++) {
            if(i%2==0&&i%3==0) {
                System.out.print(i+", ");
            }
        }
    }
}
