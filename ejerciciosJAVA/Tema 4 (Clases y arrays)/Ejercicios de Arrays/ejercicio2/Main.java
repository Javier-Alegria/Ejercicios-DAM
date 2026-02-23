package ejercicio2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1 ===");
        String[] caso1 = {"Casa","coche","perro","Camino"};
        System.out.println("Cadenas que empiezan por letra indicada: "+ej1.EmpiezanPorLetra(caso1, 'c'));
        String[] caso2 = {"Sol","Luna","Mar"};
        System.out.println("Cadenas que empiezan por letra indicada: "+ej1.EmpiezanPorLetra(caso2, 'p'));
        String[] caso3 = {};
        System.out.println("Cadenas que empiezan por letra indicada: "+ej1.EmpiezanPorLetra(caso3, 'a'));

        System.out.println("=== EJERCICIO 2 ===");
        int[] caso1ej2 = {1,2,7,1,2,5}; // = {5}
        int[] caso2ej2 = {7,1,5,7,2,5,4}; // {}
        int[] caso3ej2 = {5,2,7,7,1}; // {7,7,1}


        System.out.println("Caso 1: "+Arrays.toString(ej2.UltimoPar(caso1ej2)));
        System.out.println("Caso 2: "+Arrays.toString(ej2.UltimoPar(caso2ej2)));
       System.out.println("Caso 3: "+Arrays.toString(ej2.UltimoPar(caso3ej2)));

        System.out.println("\n=== EJERCICIO 3 ===");
        int[][] matriz = {
                {1,2,5},
                {4,3},
                {1,8,2,10}
        };
        System.out.println("Medias de cada columna: "+Arrays.toString(ej3.calcularMedia(matriz)));
    }
}
