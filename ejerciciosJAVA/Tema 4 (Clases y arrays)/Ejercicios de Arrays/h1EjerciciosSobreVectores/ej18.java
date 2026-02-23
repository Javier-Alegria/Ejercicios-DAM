package h1EjerciciosSobreVectores;

/*
Hacer el mismo ejercicio pero almacenado en la tabla sólo las letras no repetidas,
ordenado la tabla y mostrando el resultado.  Antes de introduciruna letra en la tabla
debemos mirar sin no ha sido previamente almacenada.
Sólo tenemos que ordenar y mostrar la parte de la tabla que se ha rellenado.
Diseñar el algoritmo de tal forma la tabla ordenado tenga el tamaño exacto del número de letras no repetidas
 */

public class ej18 {
    public static void ordenarImprimirTabla(char[] tabla1){
        char[] tabla2 = new char[tabla1.length];
        int ocupados = 0;
        int contador = 0;
        boolean encontrado;

        //para cada elemento de tabla1
        for(int i = 0; i < tabla1.length; i++){
            int num = tabla1[i];
            encontrado = false;
            for(int j = 0; j < contador && !encontrado; j++){
                if(num == tabla2[j]){
                    encontrado = true;
                }
            }
            if(!encontrado){
                //buscar proxima posición disponible en tabla2
                while(ocupados < tabla2.length && tabla2[ocupados]!=0)
                    ocupados++;
                //añadir elemento en tabla2
                tabla2[ocupados] = tabla1[i];
                contador++;
            }
        }

        //ordenar la tabla 2
        for(int i=0; i<contador -1; i++){
            for(int j=0; j<contador - i - 1; j++){
                if(tabla2[j]>tabla2[j+1]) {
                    char temp = tabla2[j+1];
                    tabla2[j+1] = tabla2[j];
                    tabla2[j] = temp;
                }
            }
        }
        //PASO 3: IMPRIMIR TABLA
        boolean primero = true;
        for (int i = 0; i < contador; i++) {
            if(!primero)
                System.out.print(", "+tabla2[i]);
            else {
                System.out.print(tabla2[i]);
                primero = false;
            }
        }
    }

    public static void main(String[] args) {
        char[] cadena = {'a','s','d','j','k','a','a','s','s','d','d','a','k','k','k','d','j','j','a','s'};

        ordenarImprimirTabla(cadena);
    }
}
