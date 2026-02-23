package ejercicios.coche;

public class mainCoche {
    static void main() {
        coche c1 = new coche("Mitsubishi","Lancer", TipoCoche.SEDAN);

        System.out.println(c1.mostrarInformacion());
    }
}
