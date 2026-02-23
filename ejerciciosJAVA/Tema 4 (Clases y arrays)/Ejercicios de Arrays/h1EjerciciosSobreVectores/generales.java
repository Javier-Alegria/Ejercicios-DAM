package h1EjerciciosSobreVectores;

import java.lang.annotation.Target;
import java.util.Random;

/**
 * @author Javier
 * @version 1.2
 */
public class generales {
    /**
     * Devuelve un array con x números aleatorios en su interior
     * @param tamanioArray tamaño deseado del array
     * @param numerosAleatoriosMax rango maximo de números aleatorios
     * @param numerosAleatoriosMin rango mínimo de números aleatorios
     * @return array de números aleatorios con el tamaño y rango deseado
     */
    public static int[] generarArray(int tamanioArray, int numerosAleatoriosMin,  int numerosAleatoriosMax){
        int[] vector = new int[tamanioArray];
        Random random = new Random();
        for(int i=0; i<vector.length; i++){
            vector[i] = random.nextInt(numerosAleatoriosMin,(numerosAleatoriosMax+1));
        }
        return vector;
    }

    /**
     * Devuelve un array con x números aleatorios en su interior (rango por defecto: 1-20)
     * @param tamanioArray tamaño deseado del array
     * @return array de números aleatorios con el tamaño deseado y rango 1-20
     */
    public static int[] generarArray(int tamanioArray){
        return generarArray(tamanioArray,1,51);
    }

    /**
     * Devuelve un array con 10 números aleatorios en su interior (rango por defecto: tamaño array -> 10, rango de números -> 1-20)
     * @return array de números aleatorios con el tamaño deseado y rango 20
     */
    public static int[] generarArray(){
        return generarArray(10,1,51);
    }
}
