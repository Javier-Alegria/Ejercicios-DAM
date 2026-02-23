package h1EjerciciosSobreVectores;

public class ej12 {
    /**
     * Devuelve verdadero si ambas tablas tienen el mismo tamaño
     * y todos los elementos de ta tienen el mismo valor y posición en la tabla tb
     * @param ta tabla 1
     * @param tb tabla 2
     * @return true si se cumplen las condiciones, false si no se cumplen
     */
    public static boolean iguales(int[] ta, int[] tb){
        boolean iguales = false;
        if(ta!=null && tb!=null){
            if(ta.length==tb.length){
                for (int i=0; i<ta.length; i++){
                    if(ta[i]==tb[i]){
                        iguales = true;
                    } else {
                        iguales = false;
                    }
                }
            }
            return iguales;
        }
        return iguales;
    }

    /**
     * Devuelve verdadero, si todos los elementos de ta, aparecen en la tabla tb, aunque estén en otras posiciones
     * @param ta tabla 1
     * @param tb tabla 2
     * @return true si se cumplen las condiciones, false si no se cumplen
     */
    public static boolean incluido(int[] ta, int[] tb){
        boolean encontrado; //Para cada número
        boolean todoEncontrado = true; //Para el total

        //Validamos si los vectores tienen la misma longitud y no son nulos
        if(ta!=null && tb!=null){
            //para cada elemento de ta
            for(int i=0; i<ta.length && todoEncontrado; i++){
                encontrado = false;

                //para cada elemento de tb
                for(int x=0; x<tb.length && !encontrado; x++){
                    if(ta[i]==tb[x]){
                        encontrado = true;
                    }
                }
                //Si no está, el resultado pasa a ser directamente falso
                if(!encontrado){
                    todoEncontrado = false;
                }
                //Si he llegado aquí, el resultado sigue siendo verdadero, pues, el número ha sido encontrado
            }
            return todoEncontrado;
        } else //Si no cumplen estas 2 condiciones, directamente retornamos false
            return false;
    }

    /**
     * Comprueba que todos los elementos de ta están en tb y todos los de tb están en ta (Equivalentes)
     * @param ta tabla 1
     * @param tb tabla 2
     * @return true si se cumple la condición (Las tablas son equivalentes), false si no se cumple (Las 2 tablas no son equivalentes)
     */
    public static boolean equivalentes (int[] ta, int[] tb){
        // comprobar si no son nulos
        // para cada elemento de ta
            //

        return (incluido(ta,tb)&&incluido(tb,ta));
    }

    public static void main(String[] args) {
        int[] ta  = {0,2,4,1,3,5};
        int[] tb = {1,3,5,0,2,4,2,5};
        int[] tc = new int[ta.length];

        System.out.println("Equivalentes?: "+equivalentes(ta,tb));
    }
}
