package HojaEjercicios2;
/*
13. Programa que lea un número entero N de 5 cifras y muestre sus cifras igual
que en el ejemplo. Por ejemplo, para un número N = 12345 La salida debe
ser:
1
12
123
1234
12345
 */
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número con 5 valores: ");
        int N = sc.nextInt();

        if (N < 99999 && N > 00000) {
            System.out.println(N/10000);
            System.out.println(N/1000);
            System.out.println(N/100);
            System.out.println(N/10);
            System.out.println(N);
        }
        else {
            System.out.println("Entrada invalida");
            sc.close();
        }
    }
}
