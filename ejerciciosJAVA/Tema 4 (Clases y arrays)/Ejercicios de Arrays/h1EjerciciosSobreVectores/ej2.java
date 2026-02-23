package h1EjerciciosSobreVectores;

//Leer 10 números, almacenarlos en una tabla y mostrarlos en orden inverso

public class ej2 {

    /**
     * Devuelve un String con el string al revés
     * @param vector vector con el que el metodo va a operar
     * @return string de vector invertido
     */
    public static String resultadoInverso(int vector[]){
        int[] vectorInverso = new int[vector.length];
        int indice = 0;
        String resultado = "";
        boolean primero = true;

        if(vector!=null){
            for(int i = vector.length-1; i >= 0; i--){
                vectorInverso[indice] = vector[i];
                indice++;
            }

            //Recorro el vector y concateno el resultado para imprimirlo al revés
            for (int j = 0; j < vector.length; j++){
                resultado += resultado.isEmpty()
                        ? vectorInverso[j]
                        : ", " + vectorInverso[j];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int v[] = ej1Metodos.crearVector(10);
        System.out.println(resultadoInverso(v));
    }
}
