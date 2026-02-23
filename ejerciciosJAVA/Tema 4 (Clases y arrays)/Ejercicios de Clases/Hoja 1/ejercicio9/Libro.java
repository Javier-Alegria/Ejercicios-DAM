package ejercicios.ejercicio9;

public class Libro {
    private String titulo;
    private String autor;
    private Integer anioPublicacion;
    private Integer cantidadDisponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer anioPublicacion, Integer cantidadDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.cantidadDisponible = cantidadDisponible;
    }

    // GET & SET

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String prestarEjemplar(int cantidad){
        String respuesta;

        if (cantidad<=cantidadDisponible){
            cantidadDisponible -= cantidad;
            respuesta = "El préstamo se ha realizado correctamente";
        }
        else
            respuesta = "No se ha podido realizar el préstamo";

        return respuesta;
    }

    public String mostrarInformacion(){
        return "Libro { "+
                "Título: "+titulo+
                ", Autor: "+autor+
                ", Año: "+anioPublicacion+
                ", Disponibles: "+cantidadDisponible+
                '}';
    }
}