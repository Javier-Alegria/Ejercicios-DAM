package h1EjerciciosSobreMatrices;

import java.util.Random;

public class ej3 {
    /**
     * Rellena la matriz (la imagen) con números aleatorios
     * @param matriz matriz con la que vamos a operar
     */
    public static void rellenarImagen(boolean[][] matriz){
        // para cada fila
            // rellenar columna 'col' con 0 o 1
        Random aleatorio = new Random();

        for(int fil=0;fil<matriz.length;fil++){
            for(int col=0;col<matriz[fil].length;col++){
                matriz[fil][col]=aleatorio.nextBoolean();
            }
        }
    }

    public static void mostrarImagen(boolean[][] matriz){
        // para cada fila
            // para cada columna de la fila
                // if matriz[fil][col]
                    // result += "X\t"
                // if !matriz[fil][col]
                    // result += " \t"
            // sout()

        System.out.println("==========");
        for(int fil=0;fil<matriz.length;fil++){
            for(int col=0;col<matriz[fil].length;col++){
                if(matriz[fil][col])
                    System.out.print("X\t");
                else
                    System.out.print(" \t");
            }
            System.out.print("\n");
        }
        System.out.println("==========");
    }

    /**
     * Compara si el tamaño de dos matrices es el mismo
     * @param imagen1 imagen 1
     * @param imagen2 imagen 2
     * @return true si el tamaño es el mismo, false si no son del mismo tamaño
     */
    public static boolean compararTamanio(boolean[][] imagen1, boolean[][] imagen2) {
        int contador=0;
        boolean iguales=true;
        if(imagen1!=null&&imagen2!=null && imagen1.length==imagen2.length){
            for(int i=0; i<imagen1.length && iguales ;i++){
                if(imagen1[i].length!=imagen2[i].length){
                    iguales=false;
                }
            }
        }
        return iguales;
    }

    public static int compararImagenes(boolean[][] imagen1, boolean[][] imagen2) {
        //Para cada posición de imagen 1
            //comparar si la misma posición en imagen 2 también tiene el mismo valor
                //TRUE, contador++

        int contador=0;
        if (compararTamanio(imagen1, imagen2)) {
            for(int fil=0;fil<imagen1.length;fil++){
                for(int col=0;col<imagen1[fil].length;col++){
                    if(imagen1[fil][col] == imagen2[fil][col]){
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

    public static boolean[][] generarImagenInterseccion(boolean[][] imagen1, boolean[][] imagen2){
        boolean[][] imagenNueva = null;

        // Si las imágenes tienen el mismo tamaño, genera una imagen con la intersección de las 2
        if(compararTamanio(imagen1, imagen2)){
            //creo la nueva imagen
            imagenNueva = new boolean[imagen1.length][imagen1[0].length];
            //por cada fila
            for(int fil=0;fil<imagen1.length;fil++){
                //por cada columna
                for(int col=0;col<imagen1[fil].length;col++){
                    //compruebo si la posición
                    if(imagen1[fil][col] || imagen2[fil][col])
                        imagenNueva[fil][col]=true;
                    else
                        imagenNueva[fil][col]=false;
                }
            }
        }
        return imagenNueva;
    }

    public static void imprimirImagen(boolean[][] imagen){
        if(imagen!=null){
            for(int fil=0;fil<imagen.length;fil++){
                for(int col=0;col<imagen[fil].length;col++){
                    System.out.print(imagen[fil][col]? "X\t":" \t");
                }
                System.out.println();
            }
        }
    }

    public static double calcularPorcentajeNegro(boolean[][] imagen){
        int contadorNegros=0;
        double porcentaje=0;
        int contadorTotal=0;

        if(imagen != null){
            for(int fil=0;fil<imagen.length;fil++){
                for(int col=0;col<imagen[fil].length;col++){
                    contadorTotal++;
                    if(imagen[fil][col]==false)
                        contadorNegros++;
                }
            }
            porcentaje = ((double) contadorNegros/contadorTotal)*100;
        }
        return porcentaje;
    }



    public static void main(String[] args) {
        boolean[][] imagen1 = new boolean [15][10];
        boolean[][] imagen2 = new boolean [15][10];

        rellenarImagen(imagen1);
        rellenarImagen(imagen2);

        mostrarImagen(imagen1);
        mostrarImagen(imagen2);

        imprimirImagen(generarImagenInterseccion(imagen1,imagen2));
    }
}
