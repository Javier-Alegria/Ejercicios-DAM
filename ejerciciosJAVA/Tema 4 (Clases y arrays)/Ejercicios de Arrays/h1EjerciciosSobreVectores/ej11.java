package h1EjerciciosSobreVectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Insertar un valor en una tabla ordenada de 10 elementos donde solo hay 9 posiciones ocupadas.
 * Se supone que la última posición tiene un valor que se puede machacar.
 */
public class ej11 {
    private static void llenarArray(int[] vector){
        vector[0] = 3;
        vector[1] = 7;
        vector[2] = 10;
        vector[3] = 15;
        vector[4] = 18;
        vector[5] = 22;
        vector[6] = 30;
        vector[7] = 37;
        vector[8] = 42;
    }

    public static String insertarNumero(int[] vector){
        Scanner sc = new Scanner(System.in);
        String result = "";
        // pido valor
        // para cada elemento i
        // buscar si valor > que i y < que i+1
        // (j = array.length)
        // para cada j, mientras que j sea > i
        // j = j-1
        // si no es así, i++

        // 1 3 5 7 0. Valor = 4 quiero insertar en 2
        // 1 3 5 5 7 j=2

        //PIDO VALOR A INSERTAR EN VECTOR
        System.out.println("Ingrese el valor a insertar: ");
        int valor = sc.nextInt();

        boolean operado = false;
        //PARA CADA i, mientras que no haya insertado el número
        for(int i=0; i<vector.length && !operado;i++){
            //buscar si valor > que i y < que i+1
            if(valor>vector[i] && valor<vector[i+1]){
                //para cada j, j = tamaño max de array
                for(int j=vector.length-1; j>i ;j--){
                    //Muevo 'j-1' a 'j' (subo 1 posición a cada número)
                    vector[j] = vector[j-1];
                }
                vector[i+1] = valor;
                //No hace falta operar más, ya he insertado el número
                operado = true;
            }
        }
        System.out.println("El resulado del vector es: "+ Arrays.toString(vector));
        return result;
    }

    public static void main(String[] args) {
        int[] vector = new int[10];
        llenarArray(vector);

        while(true){
            System.out.println(insertarNumero(vector));
        }
    }
}
