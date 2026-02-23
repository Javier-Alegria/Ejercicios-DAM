package h1EjerciciosSobreVectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer 10 números y almacenar en una tabla solo los valores distintos,
 * es decir si un número es introducido varias veces solo se almacena en la tabla una sola vez.
 * El programa terminará cuando la tabla esté completa
 */
public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int valor;
        boolean sePuede, continuar;

        //Leer 10 números y almacenarlos en la tabla
        for(int i=0;i<vector.length;i++){
            continuar=true;
            sePuede=true;
            System.out.print("Ingrese el número a introducir: ");
            valor=sc.nextInt();

            //Si el número se ha introducido antes, no lo almacena
            for(int j=0;j<i && continuar;j++){
                if(valor==vector[j]){
                    continuar=false;
                    sePuede=false;
                }
            }
            if(sePuede)
                vector[i]=valor;
            else {
                System.out.println("El número no se puede introducir porque ya hay otro valor igual");
                i--;
            }
        }
        System.out.println(Arrays.toString(vector));
    }
}
