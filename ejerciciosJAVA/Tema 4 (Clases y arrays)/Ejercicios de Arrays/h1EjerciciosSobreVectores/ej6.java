package h1EjerciciosSobreVectores;

/**
 * Realizar una función que reciba como parámetros un número y una tabla de enteros,
 * y que deberá devolver cuantas veces aparece el número en la tabla.
 * Utilizar este metodo para ampliar el ejercicio 4 para que me indique
 * cuantos números aparecen como mínimo dos veces en la tabla de 100 elementos
 *
 * @author Javier
 * @version 1.0
 */
public class ej6 {
    public static int contarApariciones(int num, int[] vector){
        int contador = 0;
        for(int i = 0; i < vector.length; i++) {
            if(vector[i] == num) {
                contador++;
            }
        }
        return contador;
    }

    public static String numerosRepetidos(int[] vector){
        int[] numerosRecorridos = new int[vector.length];
        String resultado = "";
        boolean yaRecorrido;

        for(int x = 0; x < vector.length; x++){
            yaRecorrido = false;
            for(int j = 0; j < numerosRecorridos.length; j++) {
                if(vector[x] == numerosRecorridos[j]) {
                    yaRecorrido = true;
                }
            }

            if(!yaRecorrido) {
                if(contarApariciones(vector[x], vector)>=2){
                    resultado += vector[x] + ", ";
                    numerosRecorridos[x] = vector[x];
                }
            } else {
                yaRecorrido = false;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] v1 = ej4.almacenarNumeros();
        System.out.println("=== NÚMEROS REPETIDOS 2 O MÁS VECES ===");
        System.out.println(numerosRepetidos(v1));
    }
}