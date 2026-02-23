package h1EjerciciosSobreVectores;

import java.util.Arrays;

/**
 * Realizar una función que reciba como parámetros una tabla de N elementos, y me devuelva cual es el número que más
 * veces se repite (la moda).  Ampliar el ejercicio para obtener los dos números que más veces se repiten, en este caso
 * la función devuelve un array de dos posiciones: 1º moda y 2º moda
 *
 * @author Javier
 * @version 1.0
 */
public class ej7 {
    public static String calcularModa(int[] vector){
        int[] numerosUnicos = new int[vector.length];
        int[] frecuencia = new int[vector.length];
        boolean encontrado;
        int posEncontrado, cantUnicos = 0, maximo = 0, posicionMaxima = -1;
        String resultado = "";
        /*
        Busca en el array si el número en la posición i lo hemos encontrado antes, si es así,
        suma 1 al contador de las veces que ha encontrado ese número, almacenado en otro array,
        si no lo hemos encontrado, lo añade al array de números encontrados y le asigna que se ha
        encontrado 1 vez en el otro array
         */
        for(int i = 0; i < vector.length; i++){
            encontrado = false;
            posEncontrado = -1;
            for(int j = 0; j < cantUnicos; j++){
                if(numerosUnicos[j] == vector[i]){
                    encontrado = true;
                    posEncontrado = j;
                }
                // ELSE encontrado = false;
            }

            if(encontrado){
                frecuencia[posEncontrado]++;
            } else {
                numerosUnicos[cantUnicos] = vector[i];
                frecuencia[cantUnicos] = 1;
                cantUnicos++;
            }
        }

        for(int j = 0; j < cantUnicos; j++){
            if(frecuencia[j] > maximo){
                maximo = frecuencia[j];
                posicionMaxima = j;
            }
        }

        int moda = posicionMaxima!=-1 ? numerosUnicos[posicionMaxima] : posicionMaxima;

        resultado = posicionMaxima==-1
                ? "No hay ningún número que se repite"
                : "El número que más se repite (moda) es el "+moda;

        return resultado;
    }

    public static String calcular2primerasModas(int[] vector){
        int[] numerosUnicos = new int[vector.length];
        int[] frecuencia = new int[vector.length];
        boolean encontrado;
        int posEncontrado, cantUnicos = 0, maximo = 0, posicionMaxima = -1;
        String resultado = "";
        /*
        Busca en el array si el número en la posición i lo hemos encontrado antes, si es así,
        suma 1 al contador de las veces que ha encontrado ese número, almacenado en otro array,
        si no lo hemos encontrado, lo añade al array de números encontrados y le asigna que se ha
        encontrado 1 vez en el otro array
         */
        for(int i = 0; i < vector.length; i++){
            encontrado = false;
            posEncontrado = -1;
            for(int j = 0; j < cantUnicos; j++){
                if(numerosUnicos[j] == vector[i]){
                    encontrado = true;
                    posEncontrado = j;
                }
                // ELSE encontrado = false;
            }

            if(encontrado){
                frecuencia[posEncontrado]++;
            } else {
                numerosUnicos[cantUnicos] = vector[i];
                frecuencia[cantUnicos] = 1;
                cantUnicos++;
            }
        }

        for(int j = 0; j < cantUnicos; j++){
            if(frecuencia[j] > maximo){
                maximo = frecuencia[j];
                posicionMaxima = j;
            }
        }

        int moda1 = posicionMaxima!=-1 ? numerosUnicos[posicionMaxima] : posicionMaxima;
        int moda2 = 0;

        resultado = posicionMaxima==-1
                ? "No hay ningún número que se repite"
                : "El número que más se repite (moda) es el "+moda1+", el segundo número más repetido es el "+moda2;

        return resultado;
    }

    public static void main(String[] args) {
        int[] vector = generales.generarArray(20,0,10);
        System.out.println("== EL STRING ==");
        System.out.println(Arrays.toString(vector));

        System.out.println(calcularModa(vector));
    }
}
