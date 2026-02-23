package h1EjerciciosSobreMatrices;

/**
 * @author Javier
 * @version 1.0
 */
public class ej1 {
    /**
     * Imprime por pantalla cual es el producto que más se vende y cual es el que menos a lo largo
     * de todo el año de la matriz de ventas
     *
     * @param ventas matriz con la información de ventas de todos los productos en un año
     */
    public static String imprimirProductoMasVendidoMenosVendido(int[][] ventas, String[] productos){
        String resultado="";
        if(ventas!=null && productos!=null){
            int ventasTotales=0, maxVentas=0, minVentas=Integer.MAX_VALUE, productoMasVendido=0, productoMenosVendido=0;
            for(int fila=0;fila<ventas.length;fila++){
                ventasTotales = 0;
                for(int columna=0;columna<ventas[fila].length;columna++){
                    ventasTotales += ventas[fila][columna];
                }
                if(ventasTotales>maxVentas){
                    maxVentas=ventasTotales;
                    productoMasVendido=fila;
                } else if(ventasTotales<minVentas){
                    minVentas=ventasTotales;
                    productoMenosVendido=fila;
                }
            }
            resultado = "El producto más vendido es el "+productos[productoMasVendido]+ " con un total de " + maxVentas +','
                    + "\nel menos vendido ha sido el "+productos[productoMenosVendido]+" con un total de " + minVentas;
        }
        else
            resultado = "Los vectores no pueden ser nulos";

        return resultado;
    }

    public static void main(String[] args) {
        int[][] ventas = { //Columnas = mes, 12 columnas, 12 meses; 5 filas, 5 productos
                { 9,0,3,4,6,7,0,4,1,3,10,0 },
                { 9,2,3,4,6,1,0,4,1,3,100,0 },
                { 1,0,3,4,6,7,0,4,1,3,6,7 },
                { 1,0,3,4,6,0,0,0,0,0,6,0 },
                { 1,0,3,4,6,7,0,4,1,3,6,0 }
        };

        String[] productos={"Jamón","Morcilla","Chorizo","Salchichón","Paté"};

        System.out.println(imprimirProductoMasVendidoMenosVendido(ventas, productos));
    }
}
