package ejerciciosString.ej5;

public class mainEj5 {
    /**
     * Rota una cadena introducida por el usuario
     * @param cadena
     * @return
     */
    public static String rotarCadena(String cadena){
        String reverse ="";
        if(cadena!=null){
            for(int i=cadena.length()-1;i>=0;i--){
                reverse += cadena.charAt(i);
            }
        }
        return reverse;
    }

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

    public static void main(String[] args) {
        System.out.println(rotarCadena("Hola que tal"));
    }
}
