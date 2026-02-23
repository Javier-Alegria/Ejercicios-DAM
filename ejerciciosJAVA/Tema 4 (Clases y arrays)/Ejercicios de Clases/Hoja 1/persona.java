package ejercicios;

public class persona {
    private String nombre;
    private int edad;
    private String genero;
    private String ocupacion;

    /**
     * imprime por pantalla un saludo
     */
    public void saludar() {
        System.out.println("Hola, soy "+nombre+" y trabajo en "+ocupacion);
    }

    /**
     * comprueba si la persona es mayor de edad
     * @return true si la persona es mayor de edad, false si es menor de edad
     */
    public boolean esMayorEdad() {
        return edad>18; //Return true if edad > 18
    }

    public persona(String nombre, int edad, String genero, String ocupacion) {
        if (edad>=0)
            this.edad = edad;

        this.nombre = nombre;


        if(genero.equalsIgnoreCase("hombre") || genero.equalsIgnoreCase("mujer"))
            this.genero = genero;

        this.ocupacion = ocupacion;
    }

    /**
     * devuelve el nombre de la persona
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * cambia el nombre de la persona
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * devuelve la edad
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * cambia la edad
     * @param edad la edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * devuelve el genero
     * @return genero: hombre o mujer
     */
    public String getGenero() {
        return genero;
    }

    /**
     * modificar genero
     * @param genero nuevo genero: hombre o mujer
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * devuelve la ocupacion
     * @return ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * cambia la ocupacion de la persona
     * @param ocupacion nueva ocupación
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "persona{";
    }
}
