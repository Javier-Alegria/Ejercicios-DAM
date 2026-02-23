package Ejercicios4Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HalloweenCorregido {
    static void main() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("¿Cuantas casas has visitado?: ");
			int numeroCasas = Integer.valueOf(sc.nextLine());
			
			
			int caramelosPorCasa = 0, casa = 0, caramelosTotales = 0;
			List<Integer> list = new ArrayList<Integer>();
			do {
				if (numeroCasas > 0) {
					System.out.print("Introduce el numero de caramelos que te han dado la casa "+(casa+1)+": ");
					caramelosPorCasa = Integer.valueOf(sc.nextLine());
					list.add(caramelosPorCasa);
					casa++;
					caramelosTotales += caramelosPorCasa;
				}
				numeroCasas--;
			} while (numeroCasas > 0);

            System.out.println("\n\n---- Caramelos ----");
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println("Caramelos en la casa "+ (i+1) + ": "+list.get(i));
			}
			
			System.out.println("Has conseguido un total de "+ caramelosTotales + " caramelos");
			
			if(caramelosTotales < 15) {
				System.out.println("¡Oh no! ¡Un fantasma se ha llevado tus dulces!");
			}
			
			if(caramelosTotales >= 15 && caramelosTotales <= 29) {
				System.out.println("Nada mal..... pero podrías asustar a mas vecinos.");
			}
			
			if(caramelosTotales >= 30) {
				System.out.println("¡Eres el rey del Halloween!");
			}
			
		} catch (NumberFormatException e){
			System.out.println("Formato numérico incorrecto");
			throw e;
		}
	}
}