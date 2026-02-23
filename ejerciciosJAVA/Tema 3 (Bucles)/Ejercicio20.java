package Ejercicios4Bucles;
//20. Calcula la suma de los cuadrados de los números del 1 al 100
public class Ejercicio20 {
    static void main() {
        double suma=0;
        for (int i = 1; i <= 100; i++) {
            suma += Math.pow(i,2);  // se suma el cuadrado de cada número
            System.out.println(suma);
        }
        System.out.println("La suma de los cuadrados del 1 al 100 es: "+suma);
    }
}