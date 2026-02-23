package ejerciciosString.ej9;

/*
Metodo que reciba una cadena de caracteres y se encargue de devolver cuántas
palabras tiene, suponiendo que cada palabra puede estar separada por espacios o
tabuladores.
 Este metodo se puede programar manualmente recorriendo el string
carácter a carácter, o se puede utilizar los métodos de la clase
StringTokenizer. Programa el metodo de las dos formas posibles
 public static int numPalabrasForma1(String cadena);
 public static int numPalabrasForma2(String cadena);

La clase StringTokenizer descompone una cadena de caracteres en
palabras (tokens). Sus principales métodos son:
i. countTokens: Devuelve el número de palabras contenidas en una
cadena
ii. hasMoreTokens: Devuelve si existen más palabras en la cadena
que se está descomponiendo.
iii. nextToken: Devuelve la siguiente palabra de una cadena
 */

import java.util.StringTokenizer;

public class mainEj9 {
    public static int numPalabrasForma1(String cadena){
        StringTokenizer token = new StringTokenizer(cadena);
        int numPalabras = 0;
        if(cadena!=null){
            numPalabras = token.countTokens();
        }
        return numPalabras;
    }

    public static void main(String[] args) {
        System.out.println(numPalabrasForma1(""));
    }
}
