package h1EjerciciosSobreVectores;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];

        for(int c=0;c<vector.length;c++){
            do {
                System.out.print("ingrese el valor "+(c+1)+" positivo: ");
                vector[c] = sc.nextInt();
                if(vector[c]<=0){
                    System.out.println("valor invalido");
                }
            } while (vector[c]<=0);
        }

        System.out.println("=== VALORES DE LA TABLA ===");

        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+":");
            for(int j=0; j<vector[i] ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
