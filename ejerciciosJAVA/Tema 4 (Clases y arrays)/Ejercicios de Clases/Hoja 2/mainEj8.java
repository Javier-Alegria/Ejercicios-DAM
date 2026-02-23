package ejerciciosString.ej8;

/*
8. Metodo que reciba una cadena de caracteres y una palabra y se encargue de
obtener el número de veces que aparece la palabra en la cadena
 public static int buscarVecesPalabra(String palabra, String cadena);
 Para contar la cantidad de veces que aparece la palabra podemos utilizar
de nuevo el metodo indexOf para ver si esta, si la posición que nos
devuelve ese metodo es distinta de -1 (significa que se encuentra la
palabra) entonces debemos sumar uno a la cantidad de veces que aparece
la palabra, y debemos de volver a buscar si hay otra palabra, es
importante cambiar la posición desde la que buscamos en nuestro String
ya que, o si no, estaremos contando siempre y de forma infinita la misma
palabra que encuentre.

 */

/**
 * @author Javier
 * @version 1.0
 */
public class mainEj8 {
    /**
     * Busca la cantidad de veces que se repite una palabra en una cadena.
     * @param palabra palabra a buscar en la cadena
     * @param cadena cadena en la que se busca la palabra
     * @return número de veces que se repite la palabra en la cadena.
     */
    public static int buscarVecesPalabra1(String palabra, String cadena){
        int veces = 0, pos = 0;
        if(palabra!=null && cadena!=null){
            while(pos!=-1){
                pos = cadena.toLowerCase().indexOf(palabra, pos);
                //Si encuentra la palabra
                if(pos!=-1){
                    veces++;
                    pos = pos + palabra.length();
                }
            }
        }
        return veces;
    }
    public static int buscarVecesPalabra2(String palabra, String cadena){
        int veces = 0;
        if(palabra!=null && cadena!=null){

        }
        return veces;
    }

    public static void main(String[] args) {
        System.out.println(buscarVecesPalabra1("hola","Hola que hola tal hola"));
    }
}
