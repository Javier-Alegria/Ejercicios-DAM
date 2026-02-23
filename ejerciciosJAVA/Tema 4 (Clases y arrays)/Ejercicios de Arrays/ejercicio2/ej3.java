package ejercicio2;

public class ej3 {
    public static double[] calcularMedia(int[][] tabla){
        double[] medias = new double[tabla.length];
        //por cada fila
        for(int fil=0;fil<tabla.length;fil++){
            double suma=0;
            //por cada columna
            for(int col=0;col<tabla[fil].length;col++){
                suma+=tabla[fil][col];
            }
            double media = suma/tabla[fil].length;
            medias[fil]=media;
        }
        return medias;
    }
}
