package Ejercicios4Bucles;
/*
18. Programa que calcule el precio final a pagar por varias unidades de un mismo
artículo, introduciendo por teclado el número de unidades, el precio de cada
unidad y el tanto por ciento de IVA. El programa finaliza cuando el precio sea 0
o negativo.

1. Pedir número de unidades
2. Precio por cada unidad (Multiplicar precio/unidad por unidades)
3. Sumar el IVA al precio final introducido por el usuario
4. Println(Precio final + IVA)

Repetir el bucle hasta que el precio introducido sea 0
 */
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int unidadesTotales;
        float precio1producto;
        float precioTotal;

        float pIva;

        float precioFinal;

        do {
            System.out.print("Introduzca el número de unidades totales: ");
            unidadesTotales = teclado.nextInt();

            System.out.print("Introduzca el iva del producto (ej: 21): ");
            pIva = teclado.nextFloat();

            System.out.print("Introduzca el precio por 1 producto: ");
            precio1producto = teclado.nextFloat();

            if(precio1producto>0){
                precioTotal=unidadesTotales*precio1producto;

                precioFinal = precioTotal+(precioTotal*(pIva/100));

                System.out.printf("El precio es: %.2f\n", precioFinal);
            }
        } while(precio1producto>0);
        System.out.println("El precio del producto es 0 o negativo, programa finalizado");
    }
}
