package EjerciciosDiapositivas;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int input;
        input = teclado.nextInt();

        if (!(input == 0)) {
            if (input%2 == 0) {
                System.out.println("El número "+input+" es par");
            }
            else {
                System.out.println("El número "+input+" es impar");
            }
        }
    }
}
