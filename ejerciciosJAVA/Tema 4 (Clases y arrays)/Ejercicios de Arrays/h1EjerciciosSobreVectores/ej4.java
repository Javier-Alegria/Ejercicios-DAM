package h1EjerciciosSobreVectores;

import java.util.Random;
import java.util.Scanner;

/**
 * Almacenar en una tabla de 100 elementos números aleatorios entre 1 y 500.
 * Mostrar el máximo, el mínimo y la media.  Realizar otra versión donde
 * no puedan almacenarse números repetidos
 *
 * @author Javier
 * @version 1.2
 */
public class ej4 {
    /**
     * Genera números aleatorios del 1 al 500 y los almacena en un array
     * @return array de números aleatorios con el rango indicado
     */
    public static int[] almacenarNumeros(){
        int[] vector = new int[100]; //crear array de 100 números
        Random random = new Random();
        for(int i=0; i<vector.length; i++){
            vector[i] = random.nextInt(500)+1;
        }
        return vector;
    }

    /**
     * Calcula la media, el número maximo y mínimo del array proporcionado
     * @param vector array con el que se va a operar
     * @return String con el número maximo, mínimo y la media.
     */
    public static String calcMaxMinMed(int[] vector){
        int maximo= 0, minimo = 0, media = 0, sum = 0;
        String resultado = "";
        boolean primero = true;

        for(int i=0; i < vector.length; i++){
            sum += vector[i];
            if(!primero){
                if(vector[i]>maximo){ maximo = vector[i];}
                if(vector[i]<minimo){ minimo = vector[i];}
            } else {
                maximo = vector[i];
                minimo = vector[i];
                primero = false;
            }
        }
        media = sum/100;

        resultado = "El número maximo es el "+maximo+", el número mínimo es el "+minimo+" y la media es "+media;

        return resultado;
    }

    public static int[] crearVectorNumerosAleatorios(int tam, int inicio, int fin){
        int[] vector = null;
        boolean repetido = true; //Para que entre la primera vez en el bucle

        if(tam>0 && fin>=inicio) {
            vector = new int[tam];
            int num = 0;
            Random random = new Random();

            //Pido 10 números y los meto en un vector
            for(int i=0; i<vector.length; i++){
                num = random.nextInt(fin-inicio+1)+inicio;
                while(repetido){
                    repetido = false;
                    for(int j=0; j<i && !repetido; j++){
                        if(num==vector[j])
                            repetido = true;
                    }
                }
                vector[i] = num;
                repetido = true;
            }
        }
        return vector;
    }

    public static void main(String[] args) {
        int[] vector = almacenarNumeros();
        System.out.println(calcMaxMinMed(vector));
    }
}
