package ejercicios;

public class personaMain {
    static void main() {
        persona p1 = new persona("Javier",18,"hombre","desempleado");

        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        System.out.println(p1.getGenero());
        System.out.println(p1.getOcupacion());
    }
}
