package ejerciciosString.ej1;

public class manejoString {
    /**
     * Devuelve la posición en la que aparece el primer carácter 'a' en una cadena de caracteres
     * Metodo 1 (Con metodo de clase string)
     * @param cadena de caracteres
     * @return posicion del caracter a | -1 si no se encuentra el caracter
     */
    public static int posicionCaracterA1(String cadena){
        int pos = -1;
        if(cadena != null)
            return cadena.toLowerCase().indexOf('a');
        return pos;
    }

    /**
     * Devuelve la posición en la que aparece el primer carácter 'a' en una cadena de caracteres
     * Metodo 2 (Manualmente)
     * @param cadena de caracteres
     * @return posicion del caracter a | -1 si no se encuentra el caracter
     */
    public static int posicionCaracterA2(String cadena){
        int pos = -1;

        if(cadena!=null){
            for(int i=0;i<cadena.length() && pos==-1;i++){
                if(cadena.toLowerCase().charAt(i)=='a')
                    pos=i;
            }
        }

        return pos;
    }

    public static void main(String[] args) {
        System.out.println("MANUALMENTE");
        System.out.println(posicionCaracterA2("Hola que tal"));

        System.out.println("MÉTODO DE CLASE STRING");
        System.out.println(posicionCaracterA1("Hola que tal"));
    }
}
