package h1EjerciciosSobreVectores;

import java.util.Arrays;

public class ej17 {
    public static void main(String[] args) {
        char[] cadena = {'a','s','d','j','k','a','a','s','s','d','d','a','k','k','k','d','j','j','a','s'};

        //Ordenar la tabla

        for(int i=0; i<cadena.length - 1; i++){
            for(int j=0; j<cadena.length - i - 1; j++){
                if(cadena[j] > cadena[j+1]){
                    char temp = cadena[j+1];
                    cadena[j+1] = cadena[j];
                    cadena[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(cadena));
    }
}
