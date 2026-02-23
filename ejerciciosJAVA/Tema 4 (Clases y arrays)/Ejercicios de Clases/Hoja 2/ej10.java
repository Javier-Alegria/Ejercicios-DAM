package ejerciciosString;

/*
10. Metodo que reciba una cadena de caracteres e imprima por pantalla todas las
palabras que la forman, cada una en una línea diferente, además debe imprimir
el número total de palabras que tiene la cadena.
 public static void imprimirPalabrasCadena(String cadena);

 */

import java.util.StringTokenizer;

public class ej10 {
    public static void imprimirPalabrasCadena(String cadena){
        StringTokenizer token = new StringTokenizer(cadena);
        int numTotalPalabras = 0, cont = 1;
        if(cadena!=null){
            numTotalPalabras = token.countTokens();

            while(token.hasMoreTokens()){
                System.out.println("Palabra "+ cont +": "+ token.nextToken());
                cont++;
            }

            System.out.println("\n"+"Palabras totales :"+numTotalPalabras);
        }
    }

    public static void main(String[] args) {
        imprimirPalabrasCadena("Hola que tal soy Javier");
    }
}
