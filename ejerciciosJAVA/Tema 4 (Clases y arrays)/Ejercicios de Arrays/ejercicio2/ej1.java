package ejercicio2;

/**
 * @author Javier
 */
public class ej1 {
    /**
     * Devuelve cuantas cadenas empiezan por una letra determinada
     * @param palabras array de string
     * @param letra letra para la validación
     * @return número de cadenas que cumplen la condición
     */
    public static int EmpiezanPorLetra(String[] palabras, char letra){
        int numPalabras = 0;
        if(palabras!=null && !Character.toString(letra).isEmpty()){
            //Para cada palabra del array
            for (int i=0; i<palabras.length; i++){
                String palabra = palabras[i];
                letra = Character.toLowerCase(letra);
                palabra = palabra.toLowerCase();
                if(palabra.charAt(0)==letra){
                    numPalabras++;
                }
            }
        }
        return numPalabras;
    }
}
