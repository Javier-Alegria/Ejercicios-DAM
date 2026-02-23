package h1EjerciciosSobreVectores;

/*
Leer una serie de números hasta que el usuario introduzca un 0.
Mostrar a continuación los números divisibles entre 3 que se han almacenado.
Como máximo podremos almacenar un máximo de 10 números divisibles entre 3 (Capacidad de la tabla)
 */

import java.util.Scanner;

public class ej19 {
    public static void leerAlmacenar(){
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int num, ocupados = 0, cont = 0, cont2 = 0;
        do {
            System.out.println("Ingrese un valor positivo (0 para terminar): ");
            num = sc.nextInt();
            if(num>=0){
                if(num!=0){
                    System.out.println("número almacenado");
                    cont++;
                    //Almaceno el número en un array si es divisible entre 3
                    if(num%3==0){
                        while(ocupados < vector.length && vector[ocupados]!=0){
                            ocupados++;
                        }
                        //Añadir elemento
                        vector[ocupados] = num;
                        cont2++;
                    }
                } else
                    System.out.println("Saliendo...");
            } else
                System.out.println("Valor invalido");
        } while(num!=0);

        System.out.println("Números introducidos (sin contar el 0): "+cont);
        System.out.println("Números divisibles entre 3: "+cont2);
        System.out.println("Valores:");

        //Imprimir números
        boolean primero = true;
        for (int i = 0; i < cont2; i++) {
            if(!primero)
                System.out.print(", "+vector[i]);
            else {
                System.out.print(vector[i]);
                primero = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("7 21 9 25 13 30 2 1 24 0");
        leerAlmacenar();
    }
}
