package hoja3.ej1;

public class Alumno {
    public static int alumnosTotales = 0;
    public static final int EDAD_MINIMA = 18;
    private String nombre;
    private int edad;
    public static final String NOMBRE_CENTRO = "IES Tetuán de las Victorias";

    public Alumno(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;

        alumnosTotales++;
    }

    public static String getAlumnosCreados(){
        return "El número total de alumnos creados es: " + alumnosTotales;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", centro='" + NOMBRE_CENTRO + '\'' +
                '}';
    }

    public static boolean validarEdad(int edad){
        boolean valido;
        valido = edad>18;

        return valido;
    }

    public static String toStringCentro(){
        return "Centro{" +
                "nombre='" + NOMBRE_CENTRO + '\'' +
                ", edad mínima=" + EDAD_MINIMA +
                '}';
    }

    public static String getEdadMinima() {
        return "La edad mínima permitida es: " + EDAD_MINIMA;
    }
}
