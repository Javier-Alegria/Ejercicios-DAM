package h1EjerciciosSobreVectores;

import java.util.Arrays;
import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];

        int valor;
        int c=1;
        do {
            System.out.print("Introduce el valor positivo "+c+": ");
            valor = sc.nextInt();
            if(valor>=0){
                tabla1[c-1]=valor;
                c++;
            } else {
                System.out.println("Valor invalido");
            }
        } while(c<=10);

        //para cada elemento de tabla1
            // if valor %2 == 0 (si es par)
                //buscar próximo valor disponible en tabla2

        int ocupados = 0;
        String numeros = "";
        //para cada elemento de tabla1
        for(int i=0;i<tabla1.length;i++){
            if(tabla1[i]%2 == 0){ //si es par
                // busco la proxima posición disponible en tabla2
                // introduzco el elemento de tabla1 par en tabla2
                while(ocupados < tabla2.length && tabla2[ocupados]!=0){
                    ocupados++;
                }
                tabla2[ocupados]=tabla1[i];
                numeros+=tabla1[i] + " ";
            }
        }

        //imprimir los números almacenados

        System.out.println(numeros);
    }
}
