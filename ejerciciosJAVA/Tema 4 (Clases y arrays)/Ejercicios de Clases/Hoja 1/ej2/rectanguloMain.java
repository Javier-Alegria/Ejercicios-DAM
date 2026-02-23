package ejercicios.ej2;

public class rectanguloMain {
    public static void main(String[] args) {
        rectangulo r1 = new rectangulo(2,3, rectangulo.Color.VERDE);

        r1.setColor(rectangulo.Color.ROJO);

        System.out.println(r1.toString());

        rectangulo r2 = new rectangulo(5,7);

        /*
        switch (r2.getColor()) {
            case VERDE -> System.out.println("soy verde");
            case ROJO -> System.out.println("soy rojo");
            default -> System.out.println("No tengo color");
        }
        */

        if (r2.getColor() == rectangulo.Color.ROJO) {
            System.out.println("soy rojo");
        }
        else if (r2.getColor() == rectangulo.Color.VERDE) {
            System.out.println("soy verde");
        }
        else {
            System.out.println("no tengo color");
        }
    }
}
