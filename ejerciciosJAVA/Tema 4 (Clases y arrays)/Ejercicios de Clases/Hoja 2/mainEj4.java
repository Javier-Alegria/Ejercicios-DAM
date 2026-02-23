package ejerciciosString.ej4;

public class mainEj4 {
    /**
     * Cuenta el número de letras mayúsculas en una cadena
     * @param cadena cadena introducida por el usuario
     * @return int número de mayúsculas
     */
    public static int numMayusculas(String cadena){
        int numMayusculas = 0;
        if(cadena!=null){
            for(int i=0;i<cadena.length();i++){
                if(cadena.charAt(i)>='A' && cadena.charAt(i)<='Z')
                    numMayusculas++;
            }
        }
        return numMayusculas;
    }

    public static void main(String[]args){
        System.out.println("El número de mayúsculas en la cadena es de "+numMayusculas("Hola qUe TaL"));
    }
}
