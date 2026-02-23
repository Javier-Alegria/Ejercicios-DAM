package ejerciciosString.ej3;

public class mainEj3 {
    /**
     * Cuenta el número de letras minúsculas en una cadena
     * @param cadena cadena introducida por el usuario
     * @return int número de minúsculas
     */
    public static int numMinusculas(String cadena){
        int numMinusculas = 0;
        if(cadena!=null){
            for(int i=0;i<cadena.length();i++){
                if(cadena.charAt(i)>='a' && cadena.charAt(i)<='z')
                    numMinusculas++;
            }
        }
        return numMinusculas;
    }

    public static void main(String[] args) {
        System.out.println("El número de minúsculas en la cadena es de "+numMinusculas("HolA qUe TaL"));
    }
}
