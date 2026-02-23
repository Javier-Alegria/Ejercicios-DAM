package HojaEjercicios2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int canal;

        String[] canales = {
                "1: TV1", "2: TV2", "3: ANTENA 3", "4: CUATRO", "5: TELECINCO", "6: LA SEXTA"
        };

        for (int i = 0; i < canales.length; i++) {
            System.out.println(" " + canales[i]);
        }
        System.out.println("-------------");

        System.out.print("Ingrese el numero de canal: ");
        canal = sc.nextInt();

        switch (canal) {
            case 1-> System.out.println("TV1");
            case 2-> System.out.println("TV2");
            case 3-> System.out.println("ANTENA 3");
            case 4-> System.out.println("CUATRO");
            case 5-> System.out.println("TELECINCO");
            case 6-> System.out.println("LA SEXTA");
            default-> System.out.println("NÚMERO DE CANAL INVÁLIDO");
        }
    }
}
