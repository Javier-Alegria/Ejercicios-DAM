package HojaEjercicios2;
/*
14. Programa Java que lea un número entero N de 5 cifras y muestre sus cifras
igual que en el ejemplo. Por ejemplo, para un número N = 12345 La salida
debe ser:
5
45
345
2345
12345
 */
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce");
        int N = sc.nextInt();

        if (N <= 99999 && N >= 00000) {
            System.out.println(N%10);
            System.out.println(N%100);
            System.out.println(N%1000);
            System.out.println(N%10000);
            System.out.println(N);
        }
        else {
            System.out.println("Entrada invalida");
            sc.close();
        }
    }
}
