package h1EjerciciosSobreVectores;

import java.util.Scanner;

public class ej1Metodos {
    /**
     * Devuelve la suma de los elementos de un vector entero
     * @param vector vector de los números enteros
     * @return suma de los elementos del vector, si vector es null, devuelve 0
     */
    public static int calcularSuma(int vector[]){
        int suma = 0;
        if(vector!=null){
            //Recorro el vector y calculo la suma de sus elementos
            for (int j = 0; j < vector.length; j++){
                suma += vector[j];
            }
        }
        return suma;
    }

    /**
     * Crea un vector con el tamaño indicado al llamar al metodo
     * @param tamanio tamaño del vector indicado
     * @return vector con la cantidad de números indicados en la variable tamanio
     */
    public static int[] crearVector(int tamanio){
        int vector[] = new int[tamanio];
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        //Pido 10 números y los meto en un vector
        System.out.println("==== Ingrese " +tamanio+" números ==== ");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese el número "+(i+1)+": ");
            vector[i] = sc.nextInt();
        }
        return vector;
    }

    public static void main(String[] args) {
        int vector[] = crearVector(10);
        int suma = calcularSuma(vector);

        System.out.println("\nLa suma es "+suma);
    }
}
