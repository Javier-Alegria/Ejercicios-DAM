package hoja2.ej1;

public class Main {
    static void main() {
        Lampara l1 = new Lampara();
        Lampara l2 = new Lampara("amarillo");

        l2.encender();

        System.out.println(l1.toString() + ", " + l2.toString());
    }
}
