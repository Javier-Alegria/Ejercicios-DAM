package EjerciciosDiapositivas;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Byte nota;

        System.out.println("Introduce una nota: ");
        nota = sc.nextByte();

        if (nota < 0 || nota > 10)
            System.out.println("Error");
        else
            System.out.println("La nota introducida es "+nota);
    }
}
