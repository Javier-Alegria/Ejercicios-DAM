package hoja3.ej1;

public class Main {
    static void main() {
        Alumno a1 = new Alumno("Javier",18);
        Alumno a2 = new Alumno("Maria",19);

        System.out.println(Alumno.getAlumnosCreados());

        System.out.println(a1.toString()+"\n"+a2.toString()+"\n"+Alumno.toStringCentro());

        System.out.println(Alumno.validarEdad(12));
        System.out.println(Alumno.validarEdad(19));

        System.out.println(Alumno.getEdadMinima());
    }
}
