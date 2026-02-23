package ejercicio2;

public class ej2 {
    /**
     * Crea otro array con elementos que tiene el array original desde el último par
     * @param nums array de enteros
     * @return array con elementos que tiene el array original desde el último par
     */
    public static int[] UltimoPar(int[] nums){
        int[] vector = null;
        int ocupados;
        if(nums != null){
            //PASO 1: encontrar la posición del último par en el array
            int posicionDelPar = nums.length-1;
            boolean hecho = false;
            for(int p=nums.length-1;p>=0 && !hecho;p--){
                if(nums[p]%2==0){
                    posicionDelPar = p;
                    hecho = true;
                }
            }
            //{1,2,7,1,2,5}; // = {5}
            int logVect = nums.length-(posicionDelPar+1);

            if (logVect != 0) {
                vector = new int[logVect];
                int posicionGrabarNuevoVector = 0; // 0,1,2,3...
                int posicionLeerAntiguoVector = posicionDelPar + 1;

                //PASO 2: recorro el array desde la siguiente posicion al ultimo numero par hasta el final
                // la longuitud de vector es logVect

                do {
                    //Añadir elemento en vector
                    vector[posicionGrabarNuevoVector] = nums[posicionLeerAntiguoVector];
                    posicionLeerAntiguoVector++;
                    posicionGrabarNuevoVector++;
                } while (posicionLeerAntiguoVector < nums.length);
            }
        }
        return vector;
    }
}