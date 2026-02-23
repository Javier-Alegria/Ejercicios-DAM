package ejercicios.ejercicio9;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private Libro libro1;
    private Libro libro2;
    private Libro libro3;

    public Biblioteca(){
    }

    public Biblioteca(String nombre, String direccion, Libro libro1, Libro libro2, Libro libro3) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libro1 = libro1;
        this.libro2 = libro2;
        this.libro3 = libro3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Libro getLibro1() {
        return libro1;
    }

    public void setLibro1(Libro libro1) {
        if(libro2!=null && !libro1.getTitulo().equals(libro2.getTitulo()) &&
            libro3!=null && !libro1.getTitulo().equals(libro3.getTitulo())
        )
            this.libro1 = libro1;
    }

    public Libro getLibro2() {
        return libro2;
    }

    public void setLibro2(Libro libro2) {
        this.libro2 = libro2;
    }

    public Libro getLibro3() {
        return libro3;
    }

    public void setLibro3(Libro libro3) {
        this.libro3 = libro3;
    }

    public String mostrarCatalogo(){
        String resultado = "";

        if(libro1 != null)
            resultado = libro1.mostrarInformacion();
        if(libro2 != null)
            resultado = libro2.mostrarInformacion();
        if(libro3 != null)
            resultado = libro3.mostrarInformacion();
        if (resultado.equalsIgnoreCase(""))
            resultado = "El catálogo está vacío";

        return resultado;
    }

    public String prestarLibro(String tituloLibro, int cantidad){
        String mensaje = "Ese libro no existe";

        if (libro1!=null && tituloLibro.compareToIgnoreCase(libro1.getTitulo())==0){
            mensaje=libro1.prestarEjemplar(cantidad);
        }
        else if(libro2!=null && tituloLibro.compareToIgnoreCase(libro2.getTitulo())==0){
            mensaje=libro2.prestarEjemplar(cantidad);
        }
        else if(libro3!=null && tituloLibro.compareToIgnoreCase(libro3.getTitulo())==0){
            mensaje=libro3.prestarEjemplar(cantidad);
        }

        return mensaje;
    }
}
