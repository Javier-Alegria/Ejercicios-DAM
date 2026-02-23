package h1EjerciciosSobreVectores;

// Leer 10 números , almacenarlos en una tabla y
// mostrar primero las posiciones pares y después la impares.

public class ej3 {
    public static void imprimirParesImpares(int[] v){
        if(v!=null){
            //Imprimir pares
            for(int i=0;i<v.length;i+=2){
                System.out.println(v[i] + " ");
            }
            //Imprimir impares
            for(int j = 1; j<v.length;j+=2){
                System.out.println(v[j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int v[] = ej1Metodos.crearVector(10);
        imprimirParesImpares(v);

    }
}
