package h1EjerciciosSobreMatrices;

/**
 * En un edificio de oficinas se quiere hacer un estudio del consumo eléctrico para ello se recogen la información  del
 * contador de consumo decada oficina del  edificio. El edificio tiene 10 plantas y en cada planta hay un número
 * variable de oficinas,una como mínimo
 *
 * a) Número total de oficinas en el edificio.
 * b) Cual es el consumo total del edificio y de cada una de las plantas
 * c) Donde se sitúa la oficina que más consume y la que menos.
 */
public class ej2 {
    public static int calcularNumeroOficinas(int[][] edificio){
        int numOficinas = 0;
        if(edificio!=null){
            for(int fila=0;fila<edificio.length;fila++){
                numOficinas += edificio[fila].length;
            }
        }
        return numOficinas;
    }

    public static void calcularConsumoTotal(int[][] edificio) {
        int consumoOficina = 0, consumoPlanta = 0;
        if(edificio!=null){
            for(int planta=0;planta<edificio.length;planta++){
                consumoPlanta = 0;
                for(int columna=0;columna<edificio[planta].length;columna++){
                    consumoPlanta += edificio[planta][columna];
                }
                System.out.println("La planta "+ (planta+1) +" ha consumido "+ consumoPlanta);
                consumoOficina += consumoPlanta;
            }
            System.out.println("El consumo total es "+consumoOficina);
        }
        else { System.out.println("El edificio es nulo"); }
    }

    public static void oficinaMasMenos2(int[][] edificio) {
        int min=Integer.MAX_VALUE, max=0;
        //Obtener el valor mínimo y el valor máximo
        if(edificio!=null){
            for(int planta=0;planta<edificio.length;planta++){
                for(int columna=0;columna<edificio[planta].length;columna++){
                    if(edificio[planta][columna]<min)
                        min = edificio[planta][columna];
                    else if(edificio[planta][columna]>max)
                        max = edificio[planta][columna];
                }
            }
            //Calcular la planta con más y menos consumo
            boolean impresoMin = false, impresoMax = false;
            for(int planta=0;planta<edificio.length;planta++){
                impresoMin = false;
                impresoMax = false;
                for(int columna=0;columna<edificio[planta].length;columna++){
                    if((edificio[planta][columna] == min) && !impresoMin) {
                        System.out.println("La planta " + (planta + 1) + " es la que menos a consumido");
                        impresoMin = true;
                    }
                    else if((edificio[planta][columna] == max) &&  !impresoMax) {
                        System.out.println("la planta " + (planta + 1) + " es la que más a consumido");
                        impresoMax = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] edificio = {
                { 10,4,3,8,5},         // 1º Planta
                {  15, 23 },
                { 90 },
                { 9,34,15,1},
                { 6,45,12,3},
                { 1,34,1,4},
                { 4,4,124},
                { 9,14,10,4},
                { 9,4,10,6},
                { 9,34,10,4,7,4,2}   // 10º Planta
        };
        int numOficinas = calcularNumeroOficinas(edificio);
        System.out.println("El número de oficinas es "+numOficinas);
        calcularConsumoTotal(edificio);
        oficinaMasMenos2(edificio);
    }
}
