package h1EjerciciosSobreVectores;

//Leer 20 número, y calcular el porcentaje de valores que supera el valor de la media

import java.util.Random;

public class ej5 {
    /**
     * Devuelve la media de valores de un array
     * @param vector vector a calcular la media
     * @return media de los valores
     */
    public static int media(int[] vector){
        int media;
        int max=0;
        for(int i = 0; i < vector.length; i++){
            max += vector[i];
        }
        media = max/vector.length;
        return media;
    }

    public static double porcentajeSuperiorMedia(int[] vector, int media){
        int num=0;
        for(int i = 0; i < vector.length; i++){
            if(vector[i]>media){
                num++;
            }
        }
        double porcentaje = (num * 100.0) / vector.length;
        return porcentaje;
    }

    public static void main(String[] args) {
        int[] v1 = generales.generarArray(100,1,500);

        for(int i=0; i<v1.length; i++){
            System.out.print(v1[i] + " ");
        }
        System.out.println("\n MEDIA: "+media(v1));
        System.out.println("\n PORCENTAJE DE NÚMEROS MAYORES QUE LA MEDIA: "+porcentajeSuperiorMedia(v1, media(v1))+"%");
    }
}