package ejerciciosString.ej6;

/*
Metodo que reciba una cadena de caracteres y devuelva un boolean que se
encargue de comprobar si la cadena de caracteres es o no palíndromo
(Es decir, se lee igual hacia adelante o hacia detrás),
por ejemplo la palabra “ala” es un palíndromo.

public static boolean esPalindromo(String cadena);
 */

public class mainEj6 {
    public static String rotar(String cadena) {
        StringBuilder cad, inv = null;
        String rotada = null;

        if (cadena != null) {
            cad = new StringBuilder(cadena);
            inv = cad.reverse();
            rotada = inv.toString();
        }
        return rotada;
    }

    public static boolean esPalindromo(String cadena){
        boolean resultado = false;
        if(cadena!=null){
            String cadenaInversa = rotar(cadena);

            if(cadena.equalsIgnoreCase(cadenaInversa)){
                resultado = true;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo("Hola que tal"));
        System.out.println(esPalindromo("Ala"));
    }
}
