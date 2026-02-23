package EjerciciosDiapositivas;

/*
Calcula el salario neto que percibirá un trabajador
teniendo en cuenta que:

- Al salario bruto tenemos que descontarle las retenciones
- Estas retenciones dependerán del número de hijos de acuerdo con la siguiente tabla:
    NÚMERO DE HIJOS -> RETENCIONES %
    2 o menos -> 20%
    Entre 3 y 5 (incluido) -> 15%
    Entre 5 y 7 (incluido) -> 10%
    Entre 7 y 9 (incluido) -> 5%
    10 o más -> 0%

- Datos de entrada: salario bruto de tipo float y número de hijos de tipo int.
- Visualizar: salario bruto, descuento en euros y salario neto.
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Iniciamos el scanner

        // SALARIO BRUTO
        System.out.println("Ingrese el salario en bruto: ");
        float salario_bruto = sc.nextFloat();

        // SALARIO NETO
        System.out.println("Ingrese el número de hijos: ");
        int numero_hijos = sc.nextInt();

        // OTRAS VARIABLES
        float descuento = 0f;
        float salario_neto;

        // CALCULAMOS EL DESCUENTO EN FUNCIÓN DEL NÚMERO DE HIJOS
        if (numero_hijos <= 2)
            descuento = 20; // Retención del 20%
        else if (numero_hijos >= 3 && numero_hijos <= 5)
            descuento = 15; // Retención del 15%
        else if (numero_hijos >= 6 && numero_hijos <= 7)
            descuento = 10; // Retención del 10%
        else if (numero_hijos >= 8 && numero_hijos <= 9)
            descuento = 5; // Retención del 5%
        else
            descuento = 0; // Retención del 0%

        // CALCULAMOS EL SALARIO NETO
        salario_neto = salario_bruto - (salario_bruto*(descuento/100));

        // IMPRIMIMOS EL SALARIO EN BRUTO, LA RETENCIÓN Y EL SALARIO NETO
        System.out.println("El salario en bruto son "+salario_bruto+" €, se te aplicará la retención del "+descuento+"% " +
                "y el salario neto se quedará en "+salario_neto);
    }
}