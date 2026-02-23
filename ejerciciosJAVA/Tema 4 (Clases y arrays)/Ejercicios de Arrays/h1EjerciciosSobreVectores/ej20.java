package h1EjerciciosSobreVectores;

import java.util.Arrays;

public class ej20 {
    public static int[] obtenerDistintosOrdenados(int[] Tmogollon) {
        int[] Tdistintos = new int[Tmogollon.length];
        int contador = 0;
        boolean existe;

        // por cada elemento de Tmogollon
        for (int i = 0; i < Tmogollon.length; i++) {
            // número con el que operamos
            int num = Tmogollon[i];

            // comprobar que el número no esté repetido
            existe = false;
            for(int j = 0; j < contador && !existe; j++) {
                if(num == Tdistintos[j]) {
                    existe = true;
                }
            }
            if(!existe) {
                Tdistintos[contador] = num;
                contador++;
            }
        }

        //PASO 2: ORDENAR LOS ELEMENTOS

        for (int i = 0; i < contador -1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if(Tdistintos[j] > Tdistintos[j+1]) {
                    int temp = Tdistintos[j+1];
                    Tdistintos[j+1] = Tdistintos[j];
                    Tdistintos[j] = temp;
                }
            }
        }
        return Tdistintos;
    }

    public static void main(String[] args) {
        int[] Tmogollon = {8, 9, 9, 2, 8, 5, 10, 12, 5, 5, 8, 9};

        int[] Tdistintos = obtenerDistintosOrdenados(Tmogollon);

        System.out.println("La tabla Tdistintos después de ordenarse:");
        System.out.println(Arrays.toString(Tdistintos));
    }
}
