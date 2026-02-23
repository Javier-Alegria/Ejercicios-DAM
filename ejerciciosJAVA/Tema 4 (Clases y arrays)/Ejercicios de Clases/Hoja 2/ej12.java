package ejerciciosString;

/*
Metodo que reciba una cadena de caracteres y se encargue de mostrar sus siglas.
Por ejemplo: si la cadena es “Organización Tratado Atlántico Norte” devuelva
“OTAN”.
 public static void imprimirSiglas(String cadena);
 */

import java.util.StringTokenizer;

public class ej12 {
    public static void imprimirSiglas2(String cadena){

        int num = 0;
        StringTokenizer token = new StringTokenizer(cadena);
        String palabra;
        char mayus;

        if(cadena!=null){
            while(token.hasMoreTokens()){
                palabra = token.nextToken();
                mayus = Character.toUpperCase(palabra.charAt(0));
                System.out.print(mayus);
            }
        }
    }

    public static void main(String[] args) {
        imprimirSiglas2("organización Tratado atlántico Norte");
    }
}