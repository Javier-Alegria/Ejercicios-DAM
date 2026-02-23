package ejerciciosString;

/*
    Metodo que reciba una cadena de caracteres e imprima por pantalla la palabra
    más larga de la cadena, además debe imprimir la longitud de dicha cadena.
 */

import java.util.StringTokenizer;

/**
 * @author Javier
 * @version 2.0
 */
public class ej11 {
    /**
     * Imprime la palabra más larga en una cadena introducida por el usuario al llamar al metodo
     * @param cadena Se refiere a la cadena introducida por el usuario
     */
    public static void imprimirCadenaMasLarga(String cadena){
        StringTokenizer token = new StringTokenizer(cadena);
        String palabra, palabraMasLarga = "";
        if(cadena!=null){
            while(token.hasMoreTokens()){
                palabra = token.nextToken();

                if(palabra.length()>palabraMasLarga.length()){
                    palabraMasLarga = palabra;
                }
            }

            System.out.println("La cadena más larga es \""+palabraMasLarga+'\"');
        }
        /*
        StringTokenizer token = new StringTokenizer(cadena);
        int longitudCadena;
        String cadenaMasLarga = "", cadenaAnterior, cadenaActual;
        if(cadena!=null){
            while(token.hasMoreTokens()){
                cadenaAnterior = token.nextToken();
                cadenaActual = token.nextToken();
                if(cadenaActual.length()>cadenaAnterior.length())
                    cadenaMasLarga = cadenaActual;
                else
                    cadenaMasLarga = cadenaAnterior;
            }
            System.out.println("La cadena más larga es \""+cadenaMasLarga+'\"');
            */
    }

    public static void main(String[] args) {
        imprimirCadenaMasLarga("en esta cadena la mas larga cual será");
    }
}
