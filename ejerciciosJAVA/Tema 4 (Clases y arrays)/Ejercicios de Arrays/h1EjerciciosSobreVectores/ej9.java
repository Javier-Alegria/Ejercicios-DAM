package h1EjerciciosSobreVectores;

import java.util.Scanner;

/**
 * Leer 10 números, almacenarlos en una tabla e indicar si la tabla está ordenada.
 */
public class ej9 {
    public static boolean ordenada(int[]vector){
        int anterior=0, actual;
        boolean ordenada=true, continuar=true;
        if(vector!=null){
            for(int i = 0; i<vector.length-1; i++){
                if((i!=0)&&continuar){
                    actual = vector[i];
                    if(anterior<actual){
                        ordenada=true;
                        anterior=actual;
                    } else {
                        ordenada = false;
                        continuar = false;
                    }
                } else
                    anterior = vector[i];
            }
        }
        return ordenada;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];

        //Leer 10 números y almacenarlos en la tabla
        for(int i=0;i<vector.length;i++){
            System.out.print("Ingrese número "+(i+1)+": ");
            vector[i] = sc.nextInt();
        }

        System.out.println("¿La tabla está ordenada? "+ordenada(vector));
    }
}
