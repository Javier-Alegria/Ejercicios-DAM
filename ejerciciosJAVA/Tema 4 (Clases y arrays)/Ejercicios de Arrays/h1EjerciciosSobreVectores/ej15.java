package h1EjerciciosSobreVectores;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] frecuencias = new int[100];
        int contador = 0;
        int valor;

        // do
            // usuario introduce un valor (1-100)
            // if valor es >= 1 && <= 100 ?
                // lo almacena en frecuencias
            // else valor invalido, no se ha introducido
        // while valor != 0

        //Introducir valores hasta el 0
        do {
            System.out.print("Introduce un valor (1-100): ");
            valor = sc.nextInt();

            // si el valor no es 0, validar si está entre 1 y 100
            if(valor!=0) {
                // si esta, lo almacenamos
                if(valor >= 1 && valor <= 100){
                    System.out.println("número almacenado");
                    frecuencias[contador] = valor;
                    contador++;
                } else {
                    System.out.println("valor invalido");
                }
            } else {
                System.out.println("Fin de introducción de números");
            }
        } while(valor != 0);

        //PARTE 2: REPRESENTAR HISTOGRAMA

        // para cada valor de frecuencias
            // contar cuantas veces aparece
            // * x veces que aparece
        int apariciones;
        int[] hechos = new int[100];
        int ocupados = 0;
        boolean hecho;

        // para cada número de frecuencias
        for(int i=0;i<contador;i++){
            apariciones = 0;
            hecho = false;
            //compruebo si no lo he impreso ya
            for(int y=0;y<hechos.length && !hecho;y++){
                if(hechos[y]==frecuencias[i]){
                    hecho=true;
                }
            }
            if(!hecho){
                for(int j=0;j<contador;j++){
                    if(frecuencias[j]==frecuencias[i]){
                        apariciones++;
                    }
                }
                System.out.print(frecuencias[i]+":");
                for(int j=0;j<apariciones;j++){
                    System.out.print("*");
                }
                //almacenar frecuencias[i] en tabla hechos
                //buscar la próxima posición libre en hechos
                while(ocupados < hechos.length && hechos[ocupados]!=0){
                    ocupados++;
                }
                hechos[ocupados]=frecuencias[i];
            }
            System.out.println();
        }
    }
}
