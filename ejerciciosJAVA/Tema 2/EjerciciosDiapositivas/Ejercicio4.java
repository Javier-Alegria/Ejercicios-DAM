package EjerciciosDiapositivas;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del artículo:");
        float precio_articulo = sc.nextFloat();

        System.out.println("Ingrese las unidades a comprar:");
        int unidades_compradas = sc.nextInt();

        float descuento = 0;

        if (unidades_compradas > 100)
            descuento = 40;  // 40% de descuento
        else if (unidades_compradas > 25)
            descuento = 20;  // 20% de descuento
        else if (unidades_compradas > 10)
            descuento = 10;  // 10% de descuento

        float importe_final = (precio_articulo * unidades_compradas) - unidades_compradas * (precio_articulo * descuento/100);

        System.out.println("El importe final es de " + importe_final+" €");
    }
}